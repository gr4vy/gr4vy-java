package com.gr4vy.sdk.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.gr4vy.sdk.utils.Blob;
import com.gr4vy.sdk.utils.HTTPClient;
import com.gr4vy.sdk.utils.ResponseWithBody;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;

/**
 * Test HTTP client that wraps the real client to do two things the E2E suite
 * relies on:
 *
 * <ol>
 *   <li><b>Forward-compatibility check</b> — injects an unknown
 *       {@code unexpected_field_*} key into every JSON object response so the
 *       SDK's deserializers are exercised against fields they were not generated
 *       for. Disabled by setting {@code GR4VY_NO_INJECT=1}.</li>
 *   <li><b>Endpoint-reach recording</b> — when {@code GR4VY_TRACK_HTTP=1}, every
 *       request's method and path is appended to
 *       {@code <GR4VY_COVERAGE_DIR>/calls-<pid>-<rand>.jsonl}. The random suffix
 *       keeps records from different shards/runners distinct even when PIDs
 *       collide (container PIDs are often low and identical), so merging every
 *       shard's artifact into one directory never overwrites. The
 *       endpoint-coverage script reads all of them.</li>
 * </ol>
 *
 * <p>Forward-compat injection is applied on both the synchronous {@link #send}
 * and asynchronous {@link #sendAsync} paths.
 */
class JsonInterceptorHttpClient implements HTTPClient {

    private final HttpClient delegate;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final boolean inject = !"1".equals(System.getenv("GR4VY_NO_INJECT"));
    private final boolean track = "1".equals(System.getenv("GR4VY_TRACK_HTTP"));
    private final Path callsFile = resolveCallsFile();
    private static final AtomicLong COUNTER = new AtomicLong();

    public JsonInterceptorHttpClient(HttpClient delegate) {
        this.delegate = delegate;
    }

    private static Path resolveCallsFile() {
        String dir = System.getenv("GR4VY_COVERAGE_DIR");
        if (dir == null || dir.isEmpty()) {
            dir = Paths.get("").toAbsolutePath().resolve("coverage").resolve("http").toString();
        }
        long pid = ProcessHandle.current().pid();
        // A random suffix so records from different shards/runners never collide
        // on a shared PID when their artifacts are merged into one directory.
        String rand = Long.toHexString(new SecureRandom().nextLong() & 0xffffffffL);
        return Paths.get(dir, "calls-" + pid + "-" + rand + ".jsonl");
    }

    /** Best-effort append of {"method","path"} for the coverage report. Never throws. */
    private void record(HttpRequest request) {
        if (!track) {
            return;
        }
        try {
            String method = request.method();
            String path = request.uri().getPath();
            String line = "{\"method\":" + quote(method) + ",\"path\":" + quote(path) + "}\n";
            synchronized (JsonInterceptorHttpClient.class) {
                Files.createDirectories(callsFile.getParent());
                Files.writeString(callsFile, line, StandardCharsets.UTF_8,
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (Exception ignored) {
            // Coverage recording must never affect the request under test.
        }
    }

    private static String quote(String s) {
        return "\"" + s.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

    /**
     * Returns {@code body} with an unknown field injected when it is a JSON
     * object, otherwise the body unchanged. Best-effort and silent: a body that
     * is not the JSON object we expected (a null, array, scalar, empty, or
     * non-JSON despite the header) is passed through untouched.
     */
    private byte[] maybeInject(byte[] body, Optional<String> contentType) {
        if (!inject || contentType.isEmpty() || !contentType.get().contains("application/json")) {
            return body;
        }
        try {
            JsonNode rootNode = objectMapper.readTree(body);
            if (rootNode != null && rootNode.isObject()) {
                ObjectNode objectNode = (ObjectNode) rootNode;
                objectNode.put("unexpected_field_" + COUNTER.incrementAndGet(), "this is an injected test value");
                return objectMapper.writeValueAsBytes(objectNode);
            }
        } catch (IOException ignored) {
            // Best-effort: leave the body untouched.
        }
        return body;
    }

    @Override
    public HttpResponse<InputStream> send(HttpRequest request) throws IOException, InterruptedException {
        record(request);
        HttpResponse<byte[]> originalResponse = delegate.send(request, HttpResponse.BodyHandlers.ofByteArray());
        byte[] body = maybeInject(originalResponse.body(), originalResponse.headers().firstValue("Content-Type"));
        return new ModifiedHttpResponse(originalResponse, body);
    }

    @Override
    public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
        record(request);
        return delegate.sendAsync(request, HttpResponse.BodyHandlers.ofByteArray())
                .thenApply(resp -> {
                    byte[] body = maybeInject(resp.body(), resp.headers().firstValue("Content-Type"));
                    return new ResponseWithBody<byte[], Blob>(resp, Blob.from(body));
                });
    }

    /**
     * A wrapper around an HttpResponse that allows us to substitute the response body.
     */
    private static class ModifiedHttpResponse implements HttpResponse<InputStream> {
        private final HttpResponse<byte[]> originalResponse;
        private final byte[] body;

        ModifiedHttpResponse(HttpResponse<byte[]> originalResponse, byte[] body) {
            this.originalResponse = originalResponse;
            this.body = body;
        }

        @Override
        public InputStream body() {
            return new ByteArrayInputStream(body);
        }

        @Override
        public HttpHeaders headers() {
            var originalHeadersMap = originalResponse.headers().map();
            var newHeadersMap = new java.util.HashMap<String, java.util.List<String>>();
            for (var entry : originalHeadersMap.entrySet()) {
                if (!entry.getKey().equalsIgnoreCase("content-length")) {
                    newHeadersMap.put(entry.getKey(), entry.getValue());
                }
            }
            // Length comes from the (possibly modified) byte[], not the stream's
            // remaining bytes, so it stays correct regardless of read state.
            newHeadersMap.put("Content-Length", java.util.List.of(String.valueOf(body.length)));
            return HttpHeaders.of(newHeadersMap, (k, v) -> true);
        }

        @Override
        public int statusCode() { return originalResponse.statusCode(); }
        @Override
        public HttpRequest request() { return originalResponse.request(); }
        @Override
        public Optional<HttpResponse<InputStream>> previousResponse() { return Optional.empty(); }
        @Override
        public Optional<SSLSession> sslSession() { return originalResponse.sslSession(); }
        @Override
        public URI uri() { return originalResponse.uri(); }
        @Override
        public HttpClient.Version version() { return originalResponse.version(); }
    }
}
