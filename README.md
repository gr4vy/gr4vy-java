# Gr4vy Java SDK

Developer-friendly & type-safe Java SDK specifically catered to leverage *Gr4vy* API.

<div align="left">
    <img alt="Maven Central Version" src="https://img.shields.io/maven-central/v/com.gr4vy/sdk?style=for-the-badge">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
</div>

## Summary

Gr4vy Java SDK

The official Gr4vy SDK for Java provides a convenient way to interact with the Gr4vy API from your server-side application. This SDK allows you to seamlessly integrate Gr4vy's powerful payment orchestration capabilities, including:

* Creating Transactions: Initiate and process payments with various payment methods and services.
* Managing Buyers: Store and manage buyer information securely.
* Storing Payment Methods: Securely store and tokenize payment methods for future use.
* Handling Webhooks: Easily process and respond to webhook events from Gr4vy.
* And much more: Access the full suite of Gr4vy API payment features.

This SDK is designed to simplify development, reduce boilerplate code, and help you get up and running with Gr4vy quickly and efficiently. It handles authentication, request signing, and provides easy-to-use methods for most API endpoints.

<!-- No Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [Gr4vy Java SDK](#gr4vy-java-sdk)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Bearer token generation](#bearer-token-generation)
  * [Embed token generation](#embed-token-generation)
  * [Merchant account ID selection](#merchant-account-id-selection)
  * [Webhooks verification](#webhooks-verification)
  * [Asynchronous Support](#asynchronous-support)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Pagination](#pagination)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)
* [Development](#development)
  * [Testing](#testing)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.gr4vy:sdk:2.16.13'
```

Maven:
```xml
<dependency>
    <groupId>com.gr4vy</groupId>
    <artifactId>sdk</artifactId>
    <version>2.16.13</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

## SDK Example Usage

### Example

```java
package hello.world;

import com.gr4vy.sdk.BearerSecuritySource;
import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.Gr4vy.AvailableServers;
import com.gr4vy.sdk.models.components.AccountUpdaterJobCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListTransactionsRequest;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        String privateKey = "-----BEGIN PRIVATE KEY-----\n...."; // a valid private key

        Gr4vy sdk = Gr4vy.builder()
                .id("example")
                .server(AvailableServers.SANDBOX)
                .merchantAccountId("default")
                .securitySource(new BearerSecuritySource.Builder(privateKey).build())
            .build();

        ListTransactionsRequest req = ListTransactionsRequest.builder()          
            .build();

        sdk.transactions().list()
            .request(req)
            .callAsStream()
            .forEach(item -> {
                // handle item
            });
    }
}
```

## Bearer token generation

Alternatively, you can create a token for use with the SDK or with your own client library.

```java
import com.gr4vy.sdk.Auth;

Auth.getToken(privateKey, Arrays.asList(JWTScope.READ_ALL, JWTScope.WRITE_ALL), 3600);
```

> **Note:** This will only create a token once. Use `securitySource` when initializing the SDK 
> to dynamically generate a token for every request.


## Embed token generation

Alternatively, you can create a token for use with Embed as follows.

```java
import com.gr4vy.sdk.Auth;

Map<String, Object> embedParams = new HashMap<>(); // a map of extra params to use with Embed
embedParams.put("environment", "sandbox");
embedParams.put("amount", 1000);
embedParams.put("currency", "USD");
embedParams.put("buyer_external_identifier", "user-1234");

String privateKey = "-----BEGIN PRIVATE KEY-----\n...."; // a valid private key
String checkoutSessionId = ""; // a valid ID for a checkout session
String token = Auth.getEmbedToken(privateKey, embedParams, checkoutSessionId);
```

> **Note:** This will only create a token once. Use `securitySource` when initializing the SDK 
> to dynamically generate a token for every request.

## Merchant account ID selection

Depending on the key used, you might need to explicitly define a merchant account ID to use. In our API, 
this uses the `X-GR4VY-MERCHANT-ACCOUNT-ID` header. When using the SDK, you can set the `merchantAccountId`
on every request.

```java
sdk.transactions().list()
    .request(request)
    .merchantAccountId("my-merchant-account-id")
    .callAsStream()
    .forEach(item -> {
        // handle item
    });
```

Alternatively, the merchant account ID can also be set when initializing the SDK.

```java
Gr4vy sdk = Gr4vy.builder()
        .id("example")
        .server(AvailableServers.SANDBOX)
        .merchantAccountId("my-merchant-account-id")
        .securitySource(new BearerSecuritySource.Builder(privateKey).build())
    .build()
```

## Webhooks verification

The SDK provides a `verifyWebhook` method to validate incoming webhook requests from Gr4vy. This ensures that the webhook payload is authentic and has not been tampered with.

```java
import com.gr4vy.sdk.Webhooks;

String payload = 'your-webhook-payload';
String secret = 'your-webhook-secret';
String signatureHeader = 'signatures-from-header';
String timestampHeader = 'timestamp-from-header';
String timestampTolerance = 300; // optional, in seconds (default: 0)

try {
    Webhooks.verifyWebhook(payload, secret, wrongSignatureHeader, timestampTolerance, timestampHeader);
    System.out.println("Webhook verified successfully.");
} catch (IllegalArgumentException e) {
    System.err.println("Invalid input: " + e.getMessage());
}
```

### Parameters

- **`payload`**: The raw payload string received in the webhook request.
- **`secret`**: The secret used to sign the webhook. This is provided in your Gr4vy dashboard.
- **`signatureHeader`**: The `X-Gr4vy-Signature` header from the webhook request.
- **`timestampHeader`**: The `X-Gr4vy-Timestamp` header from the webhook request.
- **`timestampTolerance`**: _(Optional)_ The maximum allowed difference (in seconds) between the current time and the timestamp in the webhook. Defaults to `0` (no tolerance).

<!-- No SDK Example Usage [usage] -->
<!-- No Authentication [security] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [AccountUpdater.Jobs](docs/sdks/jobs/README.md)

* [create](docs/sdks/jobs/README.md#create) - Create account updater job

### [AuditLogs](docs/sdks/auditlogs/README.md)

* [list](docs/sdks/auditlogs/README.md#list) - List audit log entries

### [Buyers](docs/sdks/buyers/README.md)

* [list](docs/sdks/buyers/README.md#list) - List all buyers
* [create](docs/sdks/buyers/README.md#create) - Add a buyer
* [get](docs/sdks/buyers/README.md#get) - Get a buyer
* [update](docs/sdks/buyers/README.md#update) - Update a buyer
* [delete](docs/sdks/buyers/README.md#delete) - Delete a buyer

#### [Buyers.GiftCards](docs/sdks/buyersgiftcards/README.md)

* [list](docs/sdks/buyersgiftcards/README.md#list) - List gift cards for a buyer

#### [Buyers.PaymentMethods](docs/sdks/buyerspaymentmethods/README.md)

* [list](docs/sdks/buyerspaymentmethods/README.md#list) - List payment methods for a buyer

#### [Buyers.ShippingDetails](docs/sdks/shippingdetails/README.md)

* [create](docs/sdks/shippingdetails/README.md#create) - Add buyer shipping details
* [list](docs/sdks/shippingdetails/README.md#list) - List a buyer's shipping details
* [get](docs/sdks/shippingdetails/README.md#get) - Get buyer shipping details
* [update](docs/sdks/shippingdetails/README.md#update) - Update a buyer's shipping details
* [delete](docs/sdks/shippingdetails/README.md#delete) - Delete a buyer's shipping details

### [CardSchemeDefinitions](docs/sdks/cardschemedefinitions/README.md)

* [list](docs/sdks/cardschemedefinitions/README.md#list) - List card scheme definitions

### [CheckoutSessions](docs/sdks/checkoutsessions/README.md)

* [create](docs/sdks/checkoutsessions/README.md#create) - Create checkout session
* [update](docs/sdks/checkoutsessions/README.md#update) - Update checkout session
* [get](docs/sdks/checkoutsessions/README.md#get) - Get checkout session
* [delete](docs/sdks/checkoutsessions/README.md#delete) - Delete checkout session

### [DigitalWallets](docs/sdks/digitalwallets/README.md)

* [create](docs/sdks/digitalwallets/README.md#create) - Register digital wallet
* [list](docs/sdks/digitalwallets/README.md#list) - List digital wallets
* [get](docs/sdks/digitalwallets/README.md#get) - Get digital wallet
* [delete](docs/sdks/digitalwallets/README.md#delete) - Delete digital wallet
* [update](docs/sdks/digitalwallets/README.md#update) - Update digital wallet

#### [DigitalWallets.Domains](docs/sdks/domains/README.md)

* [create](docs/sdks/domains/README.md#create) - Register a digital wallet domain
* [delete](docs/sdks/domains/README.md#delete) - Remove a digital wallet domain

#### [DigitalWallets.Sessions](docs/sdks/sessions/README.md)

* [googlePay](docs/sdks/sessions/README.md#googlepay) - Create a Google Pay session
* [applePay](docs/sdks/sessions/README.md#applepay) - Create a Apple Pay session
* [clickToPay](docs/sdks/sessions/README.md#clicktopay) - Create a Click to Pay session

### [GiftCards](docs/sdks/giftcards/README.md)

* [get](docs/sdks/giftcards/README.md#get) - Get gift card
* [delete](docs/sdks/giftcards/README.md#delete) - Delete a gift card
* [create](docs/sdks/giftcards/README.md#create) - Create gift card
* [list](docs/sdks/giftcards/README.md#list) - List gift cards

#### [GiftCards.Balances](docs/sdks/balances/README.md)

* [list](docs/sdks/balances/README.md#list) - List gift card balances

### [MerchantAccounts](docs/sdks/merchantaccounts/README.md)

* [list](docs/sdks/merchantaccounts/README.md#list) - List all merchant accounts
* [create](docs/sdks/merchantaccounts/README.md#create) - Create a merchant account
* [get](docs/sdks/merchantaccounts/README.md#get) - Get a merchant account
* [update](docs/sdks/merchantaccounts/README.md#update) - Update a merchant account

### [PaymentLinks](docs/sdks/paymentlinks/README.md)

* [create](docs/sdks/paymentlinks/README.md#create) - Add a payment link
* [list](docs/sdks/paymentlinks/README.md#list) - List all payment links
* [expire](docs/sdks/paymentlinks/README.md#expire) - Expire a payment link
* [get](docs/sdks/paymentlinks/README.md#get) - Get payment link

### [PaymentMethods](docs/sdks/paymentmethods/README.md)

* [list](docs/sdks/paymentmethods/README.md#list) - List all payment methods
* [create](docs/sdks/paymentmethods/README.md#create) - Create payment method
* [get](docs/sdks/paymentmethods/README.md#get) - Get payment method
* [delete](docs/sdks/paymentmethods/README.md#delete) - Delete payment method

#### [PaymentMethods.NetworkTokens](docs/sdks/networktokens/README.md)

* [list](docs/sdks/networktokens/README.md#list) - List network tokens
* [create](docs/sdks/networktokens/README.md#create) - Provision network token
* [suspend](docs/sdks/networktokens/README.md#suspend) - Suspend network token
* [resume](docs/sdks/networktokens/README.md#resume) - Resume network token
* [delete](docs/sdks/networktokens/README.md#delete) - Delete network token

##### [PaymentMethods.NetworkTokens.Cryptogram](docs/sdks/cryptogram/README.md)

* [create](docs/sdks/cryptogram/README.md#create) - Provision network token cryptogram

#### [PaymentMethods.PaymentServiceTokens](docs/sdks/paymentservicetokens/README.md)

* [list](docs/sdks/paymentservicetokens/README.md#list) - List payment service tokens
* [create](docs/sdks/paymentservicetokens/README.md#create) - Create payment service token
* [delete](docs/sdks/paymentservicetokens/README.md#delete) - Delete payment service token

### [PaymentOptions](docs/sdks/paymentoptions/README.md)

* [list](docs/sdks/paymentoptions/README.md#list) - List payment options

### [PaymentServiceDefinitions](docs/sdks/paymentservicedefinitions/README.md)

* [list](docs/sdks/paymentservicedefinitions/README.md#list) - List payment service definitions
* [get](docs/sdks/paymentservicedefinitions/README.md#get) - Get a payment service definition
* [session](docs/sdks/paymentservicedefinitions/README.md#session) - Create a session for a payment service definition

### [PaymentServices](docs/sdks/paymentservices/README.md)

* [list](docs/sdks/paymentservices/README.md#list) - List payment services
* [create](docs/sdks/paymentservices/README.md#create) - Update a configured payment service
* [get](docs/sdks/paymentservices/README.md#get) - Get payment service
* [update](docs/sdks/paymentservices/README.md#update) - Configure a payment service
* [delete](docs/sdks/paymentservices/README.md#delete) - Delete a configured payment service
* [verify](docs/sdks/paymentservices/README.md#verify) - Verify payment service credentials
* [session](docs/sdks/paymentservices/README.md#session) - Create a session for a payment service definition

### [Payouts](docs/sdks/payouts/README.md)

* [list](docs/sdks/payouts/README.md#list) - List payouts created
* [create](docs/sdks/payouts/README.md#create) - Create a payout
* [get](docs/sdks/payouts/README.md#get) - Get a payout

### [Refunds](docs/sdks/refunds/README.md)

* [get](docs/sdks/refunds/README.md#get) - Get refund

### [ReportExecutions](docs/sdks/reportexecutions/README.md)

* [list](docs/sdks/reportexecutions/README.md#list) - List executed reports

### [Reports](docs/sdks/reports/README.md)

* [list](docs/sdks/reports/README.md#list) - List configured reports
* [create](docs/sdks/reports/README.md#create) - Add a report
* [get](docs/sdks/reports/README.md#get) - Get a report
* [put](docs/sdks/reports/README.md#put) - Update a report

#### [Reports.Executions](docs/sdks/executions/README.md)

* [list](docs/sdks/executions/README.md#list) - List executions for report
* [url](docs/sdks/executions/README.md#url) - Create URL for executed report
* [get](docs/sdks/executions/README.md#get) - Get executed report

### [ThreeDsScenarios](docs/sdks/threedsscenarios/README.md)

* [create](docs/sdks/threedsscenarios/README.md#create) - Create a 3DS scenario
* [list](docs/sdks/threedsscenarios/README.md#list) - List 3DS scenario
* [update](docs/sdks/threedsscenarios/README.md#update) - Update a 3DS scenario
* [delete](docs/sdks/threedsscenarios/README.md#delete) - Delete a 3DS scenario

### [Transactions](docs/sdks/transactions/README.md)

* [list](docs/sdks/transactions/README.md#list) - List transactions
* [create](docs/sdks/transactions/README.md#create) - Create transaction
* [get](docs/sdks/transactions/README.md#get) - Get transaction
* [update](docs/sdks/transactions/README.md#update) - Manually update a transaction
* [capture](docs/sdks/transactions/README.md#capture) - Capture transaction
* [void_](docs/sdks/transactions/README.md#void_) - Void transaction
* [cancel](docs/sdks/transactions/README.md#cancel) - Cancel transaction
* [sync](docs/sdks/transactions/README.md#sync) - Sync transaction

#### [Transactions.Actions](docs/sdks/actions/README.md)

* [list](docs/sdks/actions/README.md#list) - List transaction Flow rules

#### [Transactions.Events](docs/sdks/events/README.md)

* [list](docs/sdks/events/README.md#list) - List transaction events

#### [Transactions.Refunds](docs/sdks/transactionsrefunds/README.md)

* [list](docs/sdks/transactionsrefunds/README.md#list) - List transaction refunds
* [create](docs/sdks/transactionsrefunds/README.md#create) - Create transaction refund
* [get](docs/sdks/transactionsrefunds/README.md#get) - Get transaction refund

##### [Transactions.Refunds.All](docs/sdks/all/README.md)

* [create](docs/sdks/all/README.md#create) - Create batch transaction refund

#### [Transactions.Settlements](docs/sdks/settlements/README.md)

* [get](docs/sdks/settlements/README.md#get) - Get transaction settlement
* [list](docs/sdks/settlements/README.md#list) - List transaction settlements

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you can make your SDK calls using the `callAsIterable` or `callAsStream` methods.
For certain operations, you can also use the `callAsStreamUnwrapped` method that streams individual page items directly.

Here's an example depicting the different ways to use pagination:

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListBuyersRequest;
import com.gr4vy.sdk.models.operations.ListBuyersResponse;
import java.lang.Exception;
import java.lang.Iterable;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListBuyersRequest req = ListBuyersRequest.builder()
                .cursor("ZXhhbXBsZTE")
                .search("John")
                .externalIdentifier("buyer-12345")
                .build();


        var b = sdk.buyers().list();

        // Iterate through all pages using a traditional for-each loop
        // Each iteration returns a complete page response
        Iterable<ListBuyersResponse> iterable = b.callAsIterable();
        for (ListBuyersResponse page : iterable) {
            // handle page
        }

        // Stream through all pages and process individual items
        // callAsStreamUnwrapped() flattens pages into individual items

        // Stream through pages without unwrapping (each item is a complete page)
        b.callAsStream()
            .forEach((ListBuyersResponse page) -> {
                // handle page
            });

    }
}
```
#### Asynchronous Pagination
An asynchronous SDK client is also available for pagination that returns a [`Flow.Publisher<T>`][flow-pub]. For async pagination, you can use `callAsPublisher()` to get pages as a publisher, or `callAsPublisherUnwrapped()` to get individual items directly. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import com.gr4vy.sdk.AsyncGr4vy;
import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.operations.ListBuyersRequest;
import com.gr4vy.sdk.models.operations.async.ListBuyersResponse;
import reactor.core.publisher.Flux;

public class Application {

    public static void main(String[] args) {

        AsyncGr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build()
            .async();

        ListBuyersRequest req = ListBuyersRequest.builder()
                .cursor("ZXhhbXBsZTE")
                .search("John")
                .externalIdentifier("buyer-12345")
                .build();


        var b = sdk.buyers().list();

        // Example using Project Reactor (illustrative) - pages
        Flux<ListBuyersResponse> pageFlux = Flux.from(b.callAsPublisher());
        pageFlux.subscribe(
            page -> System.out.println(page),
            error -> error.printStackTrace(),
            () -> System.out.println("Pagination completed")
        );

    }
}
```

[flow-pub]: https://docs.oracle.com/javase/9/docs/api/java/util/concurrent/Flow.Publisher.html
<!-- End Pagination [pagination] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListBuyersRequest;
import com.gr4vy.sdk.models.operations.ListBuyersResponse;
import com.gr4vy.sdk.utils.BackoffStrategy;
import com.gr4vy.sdk.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListBuyersRequest req = ListBuyersRequest.builder()
                .cursor("ZXhhbXBsZTE")
                .search("John")
                .externalIdentifier("buyer-12345")
                .build();


        sdk.buyers().list()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .callAsStream()
                .forEach((ListBuyersResponse item) -> {
                   // handle page
                });

    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListBuyersRequest;
import com.gr4vy.sdk.models.operations.ListBuyersResponse;
import com.gr4vy.sdk.utils.BackoffStrategy;
import com.gr4vy.sdk.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListBuyersRequest req = ListBuyersRequest.builder()
                .cursor("ZXhhbXBsZTE")
                .search("John")
                .externalIdentifier("buyer-12345")
                .build();


        sdk.buyers().list()
                .callAsStream()
                .forEach((ListBuyersResponse item) -> {
                   // handle page
                });

    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.


[`Gr4vyError`](./src/main/java/models/errors/Gr4vyError.java) is the base class for all HTTP error responses. It has the following properties:

| Method           | Type                        | Description                                                              |
| ---------------- | --------------------------- | ------------------------------------------------------------------------ |
| `message()`      | `String`                    | Error message                                                            |
| `code()`         | `int`                       | HTTP response status code eg `404`                                       |
| `headers`        | `Map<String, List<String>>` | HTTP response headers                                                    |
| `body()`         | `byte[]`                    | HTTP body as a byte array. Can be empty array if no body is returned.    |
| `bodyAsString()` | `String`                    | HTTP body as a UTF-8 string. Can be empty string if no body is returned. |
| `rawResponse()`  | `HttpResponse<?>`           | Raw HTTP response (body already read and not available for re-read)      |

### Example
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.AccountUpdaterJobCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateAccountUpdaterJobResponse;
import java.io.UncheckedIOException;
import java.lang.Exception;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();
        try {

            CreateAccountUpdaterJobResponse res = sdk.accountUpdater().jobs().create()
                    .accountUpdaterJobCreate(AccountUpdaterJobCreate.builder()
                        .paymentMethodIds(List.of(
                            "ef9496d8-53a5-4aad-8ca2-00eb68334389",
                            "f29e886e-93cc-4714-b4a3-12b7a718e595"))
                        .build())
                    .call();

            if (res.accountUpdaterJob().isPresent()) {
                // handle response
            }
        } catch (Gr4vyError ex) { // all SDK exceptions inherit from Gr4vyError

            // ex.ToString() provides a detailed error message including
            // HTTP status code, headers, and error payload (if any)
            System.out.println(ex);

            // Base exception fields
            var rawResponse = ex.rawResponse();
            var headers = ex.headers();
            var contentType = headers.first("Content-Type");
            int statusCode = ex.code();
            Optional<byte[]> responseBody = ex.body();

            // different error subclasses may be thrown 
            // depending on the service call
            if (ex instanceof Error400) {
                var e = (Error400) ex;
                // Check error data fields
                e.data().ifPresent(payload -> {
                      Optional<String> type = payload.type();
                      Optional<String> code = payload.code();
                      // ...
                });
            }

            // An underlying cause may be provided. If the error payload 
            // cannot be deserialized then the deserialization exception 
            // will be set as the cause.
            if (ex.getCause() != null) {
                var cause = ex.getCause();
            }
        } catch (UncheckedIOException ex) {
            // handle IO error (connection, timeout, etc)
        }    }
}
```

### Error Classes
**Primary errors:**
* [`Gr4vyError`](./src/main/java/models/errors/Gr4vyError.java): The base class for HTTP error responses.
  * [`com.gr4vy.sdk.models.errors.Error400`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error400.java): The request was invalid. Status code `400`.
  * [`com.gr4vy.sdk.models.errors.Error401`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error401.java): The request was unauthorized. Status code `401`.
  * [`com.gr4vy.sdk.models.errors.Error403`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error403.java): The credentials were invalid or the caller did not have permission to act on the resource. Status code `403`.
  * [`com.gr4vy.sdk.models.errors.Error404`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error404.java): The resource was not found. Status code `404`.
  * [`com.gr4vy.sdk.models.errors.Error405`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error405.java): The request method was not allowed. Status code `405`.
  * [`com.gr4vy.sdk.models.errors.Error409`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error409.java): A duplicate record was found. Status code `409`.
  * [`com.gr4vy.sdk.models.errors.Error425`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error425.java): The request was too early. Status code `425`.
  * [`com.gr4vy.sdk.models.errors.Error429`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error429.java): Too many requests were made. Status code `429`.
  * [`com.gr4vy.sdk.models.errors.Error500`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error500.java): The server encountered an error. Status code `500`.
  * [`com.gr4vy.sdk.models.errors.Error502`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error502.java): The server encountered an error. Status code `502`.
  * [`com.gr4vy.sdk.models.errors.Error504`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.Error504.java): The server encountered an error. Status code `504`.
  * [`com.gr4vy.sdk.models.errors.HTTPValidationError`](./src/main/java/models/errors/com.gr4vy.sdk.models.errors.HTTPValidationError.java): Validation Error. Status code `422`. *

<details><summary>Less common errors (6)</summary>

<br />

**Network errors:**
* `java.io.IOException` (always wrapped by `java.io.UncheckedIOException`). Commonly encountered subclasses of
`IOException` include `java.net.ConnectException`, `java.net.SocketTimeoutException`, `EOFException` (there are
many more subclasses in the JDK platform).

**Inherit from [`Gr4vyError`](./src/main/java/models/errors/Gr4vyError.java)**:


</details>

\* Check [the method documentation](#available-resources-and-operations) to see if the error is applicable.
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Name

You can override the default server globally using the `.server(AvailableServers server)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the names associated with the available servers:

| Name         | Server                               | Variables | Description |
| ------------ | ------------------------------------ | --------- | ----------- |
| `sandbox`    | `https://api.sandbox.{id}.gr4vy.app` | `id`      |             |
| `production` | `https://api.{id}.gr4vy.app`         | `id`      |             |

If the selected server has variables, you may override its default values using the associated builder method(s):

| Variable | BuilderMethod   | Default     | Description                            |
| -------- | --------------- | ----------- | -------------------------------------- |
| `id`     | `id(String id)` | `"example"` | The subdomain for your Gr4vy instance. |

#### Example

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.AccountUpdaterJobCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateAccountUpdaterJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .server(Gr4vy.AvailableServers.SANDBOX)
                .id("<id>")
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreateAccountUpdaterJobResponse res = sdk.accountUpdater().jobs().create()
                .accountUpdaterJobCreate(AccountUpdaterJobCreate.builder()
                    .paymentMethodIds(List.of(
                        "ef9496d8-53a5-4aad-8ca2-00eb68334389",
                        "f29e886e-93cc-4714-b4a3-12b7a718e595"))
                    .build())
                .call();

        if (res.accountUpdaterJob().isPresent()) {
            // handle response
        }
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.AccountUpdaterJobCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateAccountUpdaterJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .serverURL("https://api.sandbox.example.gr4vy.app")
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreateAccountUpdaterJobResponse res = sdk.accountUpdater().jobs().create()
                .accountUpdaterJobCreate(AccountUpdaterJobCreate.builder()
                    .paymentMethodIds(List.of(
                        "ef9496d8-53a5-4aad-8ca2-00eb68334389",
                        "f29e886e-93cc-4714-b4a3-12b7a718e595"))
                    .build())
                .call();

        if (res.accountUpdaterJob().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods and asynchronous (`sendAsync`) methods. The `sendAsync` method
is used to power the async SDK methods and returns a `CompletableFuture<HttpResponse<Blob>>` for non-blocking operations.

The following example shows how to add a custom header and handle errors:

```java
import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.utils.HTTPClient;
import com.gr4vy.sdk.utils.SpeakeasyHTTPClient;
import com.gr4vy.sdk.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        Gr4vy sdk = Gr4vy.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.utils.HTTPClient;
import com.gr4vy.sdk.utils.Blob;
import com.gr4vy.sdk.utils.ResponseWithBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }

            @Override
            public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
                // Convert response to HttpResponse<Blob> for async operations
                return client.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                    .thenApply(resp -> new ResponseWithBody<>(resp, Blob::from));
            }
        };

        Gr4vy sdk = Gr4vy.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        Gr4vy sdk = Gr4vy.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug

You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:

```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This logging should only be used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.


Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Testing

To run the tests, install Java, ensure to download the `private_key.pem` for the test environment, and run the following.

```sh
E2E=true ./gradlew clean test
 ```

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
