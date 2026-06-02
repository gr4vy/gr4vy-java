# Testing

This SDK ships a live end-to-end suite that runs against the Gr4vy **sandbox**,
plus a pair of dependency-light offline unit tests. The goals are:

- exercise every SDK operation against a real API (forward-compatibility,
  serialization, auth, URL building), and
- prove the SDK tolerates unknown response fields it was not generated for.

## Layout

```
src/test/java/com/gr4vy/sdk/
  AuthTest.java            # offline: JWT/token generation
  WebhooksTest.java        # offline: webhook signature verification
  util/                    # the shared harness (not tests)
    Harness.java           # one isolated merchant per JVM (= per shard)
    Reaches.java           # "endpoint was reached" assertion
    Fixtures.java          # cards, addresses, ids, sample bodies
    Checkout.java          # raw checkout-session field PUT helpers
    Gen.java               # seedable generators for property-style tests
    JsonInterceptorHttpClient.java  # forward-compat injector + reach recorder
  flows/                   # happy-path, multi-step lifecycles
  processing/              # per-resource processing endpoints
  backoffice/              # per-resource backoffice endpoints
scripts/endpoint_coverage/
  EndpointCoverage.java    # endpoint-reach coverage report (run via java <file>)
```

## Running locally

The live suite is gated on the `E2E` environment variable and a signing key.
Without them, every live test is **skipped** (a JUnit assumption), so a plain
`./gradlew test` on a laptop runs only the offline tests.

```bash
# offline only (no key needed)
./gradlew test --tests "com.gr4vy.sdk.AuthTest" --tests "com.gr4vy.sdk.WebhooksTest"

# full live suite (needs a sandbox private key)
export E2E=true
export PRIVATE_KEY="$(cat /path/to/private_key.pem)"   # or drop private_key.pem at the repo root
./gradlew test

# a single shard
./gradlew test --tests "com.gr4vy.sdk.processing.*"
```

The key is read from `PRIVATE_KEY`, falling back to a `private_key.pem` at the
repo root. `*.pem` is gitignored — never commit a key.

## How it works

### One merchant per shard

`Harness.merchant()` provisions a fresh, randomly-named merchant account and a
deterministic `mock-card` payment service on first use, then caches it in a
static holder. In CI each shard is a **separate** `./gradlew test` invocation
(one per package, see `.github/workflows/ci.yaml`), so each runs in its own JVM
and gets exactly one isolated merchant with no cross-shard sharing. A single
local `./gradlew test` runs every package in one JVM and so shares one merchant
across all of them — fine for local use. `Harness.client()` returns a client
already bound to that merchant, so tests never pass a merchant-account id
explicitly.

### `Reaches` — reach without full support

Many operations cannot return a real `2xx` against a deterministic mock
environment (no live acquirer, no real network token, no payouts). For those we
only assert the endpoint was **reached**:

```java
Reaches.reaches("network_tokens.create", () ->
    client.paymentMethods().networkTokens().create()...call());
```

- no exception (`2xx`/`3xx`) → reached
- `4xx` → reached (the endpoint exists and rejected our input)
- `5xx` → failure (server error)
- non-HTTP error (connection, deserialization) → failure

CRUD that the mock fully supports (transactions, payment methods, buyers,
checkout sessions, merchant accounts, payment services, reports) is asserted as
real success with non-empty ids instead.

### Forward-compatibility injection

`JsonInterceptorHttpClient` wraps the real HTTP client and injects an unknown
`unexpected_field_*` key into every JSON object response, so the SDK's
deserializers are continuously exercised against fields they were not generated
for. Set `GR4VY_NO_INJECT=1` to disable.

### Endpoint-reach coverage

When `GR4VY_TRACK_HTTP=1`, the same client appends each request's method+path to
`$GR4VY_COVERAGE_DIR/calls-<pid>.jsonl` (one file per JVM, so shards never
clash). `scripts/endpoint_coverage/EndpointCoverage.java` builds the operation
catalogue from the generated SDK source and reports how many operations a real
request reached. The script uses `record` types, so running it needs **Java 17+**
(CI runs it on Java 21); the test suite itself still builds and runs on Java 11.

```bash
GR4VY_TRACK_HTTP=1 GR4VY_COVERAGE_DIR="$PWD/coverage/http" ./gradlew test
java scripts/endpoint_coverage/EndpointCoverage.java .   # needs Java 17+
```

It writes `coverage/endpoint-coverage.md` and prints the same report. It is a
report, not a gate (it always exits 0). In CI it runs after the shards and posts
a sticky PR comment.

## CI

`.github/workflows/ci.yaml` runs:

- **build** — compiles main + test sources on Java 11/17/21 (no key; protects
  fork PRs and catches generation drift).
- **offline** — the JWT/webhook unit tests on Java 11/17/21.
- **e2e** — the live suite sharded across `flows`/`processing`/`backoffice`,
  each recording reached endpoints.
- **coverage** — combines the shards' records and posts the coverage comment.
- **ci-complete** — a single stable check that branch protection / automerge
  depends on, so the required check name does not change as shards are added or
  removed.

Fork PRs have no `PRIVATE_KEY`, so the live shards skip rather than fail.
