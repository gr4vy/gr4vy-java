package com.gr4vy.sdk.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * A small, seedable generator for light property-style tests: a handful of
 * randomized-but-reproducible amounts, currencies and metadata maps. Seed via
 * {@code FC_SEED} so a CI failure can be replayed.
 */
public final class Gen {

    /** Number of iterations a property test runs by default. */
    public static final int RUNS = 6;

    private final Random rnd;

    public Gen() {
        String seed = System.getenv("FC_SEED");
        long s = 0;
        if (seed != null && !seed.isEmpty()) {
            try {
                s = Long.parseLong(seed);
            } catch (NumberFormatException e) {
                s = seed.hashCode();
            }
        } else {
            // Fixed default so a run is reproducible without an explicit seed.
            s = 0x5DEECE66DL;
        }
        this.rnd = new Random(s);
    }

    /** A valid minor-units amount in [100, 99999]. */
    public long amount() {
        return 100 + rnd.nextInt(99900);
    }

    /** One of the currencies the mock-card service accepts. */
    public String currency() {
        String[] currencies = {"USD", "EUR", "GBP"};
        return currencies[rnd.nextInt(currencies.length)];
    }

    /** A small metadata map. */
    public Map<String, String> metadata() {
        Map<String, String> m = new LinkedHashMap<>();
        m.put("e2e", "1");
        m.put("run", Integer.toString(rnd.nextInt(1_000_000)));
        return m;
    }
}
