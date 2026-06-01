package com.gr4vy.sdk.util;

import static org.junit.jupiter.api.Assertions.fail;

import com.gr4vy.sdk.models.errors.AuthException;
import com.gr4vy.sdk.models.errors.Gr4vyError;

/**
 * Asserts that an operation <em>reaches</em> its endpoint, without requiring the
 * sandbox to fully support it.
 *
 * <p>Many operations cannot return a real 2xx against the deterministic mock
 * environment (no live acquirer, no real network token, etc.). For those we only
 * care that the SDK built a correct request and the API routed it: a 4xx means
 * the endpoint exists and rejected our input — that is success. A 5xx or a
 * non-HTTP failure (connection, deserialization) is a real failure.
 */
public final class Reaches {

    private Reaches() {}

    @FunctionalInterface
    public interface Call {
        void run() throws Exception;
    }

    /**
     * Runs {@code fn} and asserts the endpoint was reached.
     *
     * <ul>
     *   <li>no exception (2xx/3xx) → reached</li>
     *   <li>4xx → reached (endpoint exists, rejected our input)</li>
     *   <li>5xx → failure (server error)</li>
     *   <li>non-HTTP error → failure (request never reached the endpoint)</li>
     * </ul>
     */
    public static void reaches(String description, Call fn) {
        try {
            fn.run();
        } catch (Exception e) {
            int status = statusOf(e);
            if (status >= 400 && status < 500) {
                return; // reached and cleanly rejected
            }
            if (status >= 500) {
                fail(description + ": server error " + status + " (" + e.getMessage() + ")");
            }
            fail(description + ": did not reach endpoint (" + e + ")");
        }
    }

    /** HTTP status carried by a thrown SDK error, or -1 for a non-HTTP error. */
    static int statusOf(Throwable e) {
        if (e instanceof Gr4vyError) {
            return ((Gr4vyError) e).code();
        }
        if (e instanceof AuthException) {
            return ((AuthException) e).statusCode().orElse(-1);
        }
        return -1;
    }
}
