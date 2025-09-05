package com.gr4vy.sdk.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.gr4vy.sdk.utils.Blob;
import com.gr4vy.sdk.utils.HTTPClient;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import javax.net.ssl.SSLSession;

class JsonInterceptorHttpClient implements HTTPClient {

    private final HttpClient delegate;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public JsonInterceptorHttpClient(HttpClient delegate) {
        this.delegate = delegate;
    }

    @Override
    public HttpResponse<InputStream> send(HttpRequest request) throws IOException, InterruptedException {
        // 1. Let the delegate client handle the actual network request.
        // We ask for the body as a byte array to make it easy to read and replace.
        HttpResponse<byte[]> originalResponse = delegate.send(request, HttpResponse.BodyHandlers.ofByteArray());

        // 2. Check if the response is JSON. If not, return it as is.
        Optional<String> contentType = originalResponse.headers().firstValue("Content-Type");
        if (contentType.isEmpty() || !contentType.get().contains("application/json")) {
            // Re-wrap the byte[] body into an InputStream for the SDK.
            return new ModifiedHttpResponse(originalResponse, new ByteArrayInputStream(originalResponse.body()));
        }

        try {
            // 3. Parse the JSON body.
            JsonNode rootNode = objectMapper.readTree(originalResponse.body());

            if (rootNode.isObject()) {
                ObjectNode objectNode = (ObjectNode) rootNode;
                String randomKey = "unexpected_field_" + new Random().nextInt(1000);
                objectNode.put(randomKey, "this is an injected test value");
                System.out.println("Intercepted response and added key: " + randomKey);

                // 4. Serialize the modified JSON back to a byte array.
                byte[] modifiedBody = objectMapper.writeValueAsBytes(objectNode);

                // 5. Create a new response with the modified body.
                // We also update the Content-Length header to match the new body size.
                return new ModifiedHttpResponse(originalResponse, new ByteArrayInputStream(modifiedBody));
            }
        } catch (IOException e) {
            // If parsing fails, fall back to returning the original response.
            System.err.println("Failed to parse or modify JSON body: " + e.getMessage());
        }

        // Return the original response if modification failed.
        return new ModifiedHttpResponse(originalResponse, new ByteArrayInputStream(originalResponse.body()));
    }

    /**
     * A wrapper around an HttpResponse that allows us to substitute the response body.
     */
    private static class ModifiedHttpResponse implements HttpResponse<InputStream> {
        private final HttpResponse<byte[]> originalResponse;
        private final InputStream body;

        ModifiedHttpResponse(HttpResponse<byte[]> originalResponse, InputStream body) {
            this.originalResponse = originalResponse;
            this.body = body;
        }

        @Override
        public InputStream body() {
            return body;
        }

        @Override
        public HttpHeaders headers() {
            // Create a modified header map to update the content-length
            var originalHeadersMap = originalResponse.headers().map();
            var newHeadersMap = new java.util.HashMap<String, java.util.List<String>>();
            for (var entry : originalHeadersMap.entrySet()) {
                if (!entry.getKey().equalsIgnoreCase("content-length")) {
                    newHeadersMap.put(entry.getKey(), entry.getValue());
                }
            }
            // Compute the new content length from the body
            int contentLength = 0;
            try {
                contentLength = body.available();
            } catch (IOException e) {
                // Fallback: do not set content-length if error
            }
            newHeadersMap.put("Content-Length", java.util.List.of(String.valueOf(contentLength)));
            return HttpHeaders.of(newHeadersMap, (k, v) -> true);
        }

        // --- Delegate methods to the original response ---
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
