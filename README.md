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
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Pagination](#pagination)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
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
implementation 'com.gr4vy:sdk:2.8.18'
```

Maven:
```xml
<dependency>
    <groupId>com.gr4vy</groupId>
    <artifactId>sdk</artifactId>
    <version>2.8.18</version>
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

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [accountUpdater()](docs/sdks/accountupdater/README.md)


#### [accountUpdater().jobs()](docs/sdks/jobs/README.md)

* [create](docs/sdks/jobs/README.md#create) - Create account updater job

### [auditLogs()](docs/sdks/auditlogs/README.md)

* [list](docs/sdks/auditlogs/README.md#list) - List audit log entries

### [buyers()](docs/sdks/buyers/README.md)

* [list](docs/sdks/buyers/README.md#list) - List all buyers
* [create](docs/sdks/buyers/README.md#create) - Add a buyer
* [get](docs/sdks/buyers/README.md#get) - Get a buyer
* [update](docs/sdks/buyers/README.md#update) - Update a buyer
* [delete](docs/sdks/buyers/README.md#delete) - Delete a buyer

#### [buyers().giftCards()](docs/sdks/buyersgiftcards/README.md)

* [list](docs/sdks/buyersgiftcards/README.md#list) - List gift cards for a buyer

#### [buyers().paymentMethods()](docs/sdks/buyerspaymentmethods/README.md)

* [list](docs/sdks/buyerspaymentmethods/README.md#list) - List payment methods for a buyer

#### [buyers().shippingDetails()](docs/sdks/shippingdetails/README.md)

* [create](docs/sdks/shippingdetails/README.md#create) - Add buyer shipping details
* [list](docs/sdks/shippingdetails/README.md#list) - List a buyer's shipping details
* [get](docs/sdks/shippingdetails/README.md#get) - Get buyer shipping details
* [update](docs/sdks/shippingdetails/README.md#update) - Update a buyer's shipping details
* [delete](docs/sdks/shippingdetails/README.md#delete) - Delete a buyer's shipping details

### [cardSchemeDefinitions()](docs/sdks/cardschemedefinitions/README.md)

* [list](docs/sdks/cardschemedefinitions/README.md#list) - List card scheme definitions

### [checkoutSessions()](docs/sdks/checkoutsessions/README.md)

* [create](docs/sdks/checkoutsessions/README.md#create) - Create checkout session
* [update](docs/sdks/checkoutsessions/README.md#update) - Update checkout session
* [get](docs/sdks/checkoutsessions/README.md#get) - Get checkout session
* [delete](docs/sdks/checkoutsessions/README.md#delete) - Delete checkout session

### [digitalWallets()](docs/sdks/digitalwallets/README.md)

* [create](docs/sdks/digitalwallets/README.md#create) - Register digital wallet
* [list](docs/sdks/digitalwallets/README.md#list) - List digital wallets
* [get](docs/sdks/digitalwallets/README.md#get) - Get digital wallet
* [delete](docs/sdks/digitalwallets/README.md#delete) - Delete digital wallet
* [update](docs/sdks/digitalwallets/README.md#update) - Update digital wallet

#### [digitalWallets().domains()](docs/sdks/domains/README.md)

* [create](docs/sdks/domains/README.md#create) - Register a digital wallet domain
* [delete](docs/sdks/domains/README.md#delete) - Remove a digital wallet domain

#### [digitalWallets().sessions()](docs/sdks/sessions/README.md)

* [googlePay](docs/sdks/sessions/README.md#googlepay) - Create a Google Pay session
* [applePay](docs/sdks/sessions/README.md#applepay) - Create a Apple Pay session
* [clickToPay](docs/sdks/sessions/README.md#clicktopay) - Create a Click to Pay session

### [giftCards()](docs/sdks/giftcards/README.md)

* [get](docs/sdks/giftcards/README.md#get) - Get gift card
* [delete](docs/sdks/giftcards/README.md#delete) - Delete a gift card
* [create](docs/sdks/giftcards/README.md#create) - Create gift card
* [list](docs/sdks/giftcards/README.md#list) - List gift cards

#### [giftCards().balances()](docs/sdks/balances/README.md)

* [list](docs/sdks/balances/README.md#list) - List gift card balances


### [merchantAccounts()](docs/sdks/merchantaccounts/README.md)

* [list](docs/sdks/merchantaccounts/README.md#list) - List all merchant accounts
* [create](docs/sdks/merchantaccounts/README.md#create) - Create a merchant account
* [get](docs/sdks/merchantaccounts/README.md#get) - Get a merchant account
* [update](docs/sdks/merchantaccounts/README.md#update) - Update a merchant account

### [paymentLinks()](docs/sdks/paymentlinks/README.md)

* [create](docs/sdks/paymentlinks/README.md#create) - Add a payment link
* [list](docs/sdks/paymentlinks/README.md#list) - List all payment links
* [expire](docs/sdks/paymentlinks/README.md#expire) - Expire a payment link
* [get](docs/sdks/paymentlinks/README.md#get) - Get payment link

### [paymentMethods()](docs/sdks/paymentmethods/README.md)

* [list](docs/sdks/paymentmethods/README.md#list) - List all payment methods
* [create](docs/sdks/paymentmethods/README.md#create) - Create payment method
* [get](docs/sdks/paymentmethods/README.md#get) - Get payment method
* [delete](docs/sdks/paymentmethods/README.md#delete) - Delete payment method

#### [paymentMethods().networkTokens()](docs/sdks/networktokens/README.md)

* [list](docs/sdks/networktokens/README.md#list) - List network tokens
* [create](docs/sdks/networktokens/README.md#create) - Provision network token
* [suspend](docs/sdks/networktokens/README.md#suspend) - Suspend network token
* [resume](docs/sdks/networktokens/README.md#resume) - Resume network token
* [delete](docs/sdks/networktokens/README.md#delete) - Delete network token

#### [paymentMethods().networkTokens().cryptogram()](docs/sdks/cryptogram/README.md)

* [create](docs/sdks/cryptogram/README.md#create) - Provision network token cryptogram

#### [paymentMethods().paymentServiceTokens()](docs/sdks/paymentservicetokens/README.md)

* [list](docs/sdks/paymentservicetokens/README.md#list) - List payment service tokens
* [create](docs/sdks/paymentservicetokens/README.md#create) - Create payment service token
* [delete](docs/sdks/paymentservicetokens/README.md#delete) - Delete payment service token

### [paymentOptions()](docs/sdks/paymentoptions/README.md)

* [list](docs/sdks/paymentoptions/README.md#list) - List payment options

### [paymentServiceDefinitions()](docs/sdks/paymentservicedefinitions/README.md)

* [list](docs/sdks/paymentservicedefinitions/README.md#list) - List payment service definitions
* [get](docs/sdks/paymentservicedefinitions/README.md#get) - Get a payment service definition
* [session](docs/sdks/paymentservicedefinitions/README.md#session) - Create a session for a payment service definition

### [paymentServices()](docs/sdks/paymentservices/README.md)

* [list](docs/sdks/paymentservices/README.md#list) - List payment services
* [create](docs/sdks/paymentservices/README.md#create) - Update a configured payment service
* [get](docs/sdks/paymentservices/README.md#get) - Get payment service
* [update](docs/sdks/paymentservices/README.md#update) - Configure a payment service
* [delete](docs/sdks/paymentservices/README.md#delete) - Delete a configured payment service
* [verify](docs/sdks/paymentservices/README.md#verify) - Verify payment service credentials
* [session](docs/sdks/paymentservices/README.md#session) - Create a session for a payment service definition

### [payouts()](docs/sdks/payouts/README.md)

* [list](docs/sdks/payouts/README.md#list) - List payouts created
* [create](docs/sdks/payouts/README.md#create) - Create a payout
* [get](docs/sdks/payouts/README.md#get) - Get a payout

### [refunds()](docs/sdks/refunds/README.md)

* [get](docs/sdks/refunds/README.md#get) - Get refund

### [reportExecutions()](docs/sdks/reportexecutions/README.md)

* [list](docs/sdks/reportexecutions/README.md#list) - List executed reports

### [reports()](docs/sdks/reports/README.md)

* [list](docs/sdks/reports/README.md#list) - List configured reports
* [create](docs/sdks/reports/README.md#create) - Add a report
* [get](docs/sdks/reports/README.md#get) - Get a report
* [put](docs/sdks/reports/README.md#put) - Update a report

#### [reports().executions()](docs/sdks/executions/README.md)

* [list](docs/sdks/executions/README.md#list) - List executions for report
* [url](docs/sdks/executions/README.md#url) - Create URL for executed report
* [get](docs/sdks/executions/README.md#get) - Get executed report

### [transactions()](docs/sdks/transactions/README.md)

* [list](docs/sdks/transactions/README.md#list) - List transactions
* [create](docs/sdks/transactions/README.md#create) - Create transaction
* [get](docs/sdks/transactions/README.md#get) - Get transaction
* [update](docs/sdks/transactions/README.md#update) - Manually update a transaction
* [capture](docs/sdks/transactions/README.md#capture) - Capture transaction
* [void_](docs/sdks/transactions/README.md#void_) - Void transaction
* [sync](docs/sdks/transactions/README.md#sync) - Sync transaction

#### [transactions().events()](docs/sdks/events/README.md)

* [list](docs/sdks/events/README.md#list) - List transaction events

#### [transactions().refunds()](docs/sdks/transactionsrefunds/README.md)

* [list](docs/sdks/transactionsrefunds/README.md#list) - List transaction refunds
* [create](docs/sdks/transactionsrefunds/README.md#create) - Create transaction refund
* [get](docs/sdks/transactionsrefunds/README.md#get) - Get transaction refund

#### [transactions().refunds().all()](docs/sdks/all/README.md)

* [create](docs/sdks/all/README.md#create) - Create batch transaction refund

#### [transactions().settlements()](docs/sdks/settlements/README.md)

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

        var b = sdk.buyers().list()
                .request(req);

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
                .request(req)
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
                .request(req)
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

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `create` method throws the following exceptions:

| Error Type                        | Status Code | Content Type     |
| --------------------------------- | ----------- | ---------------- |
| models/errors/Error400            | 400         | application/json |
| models/errors/Error401            | 401         | application/json |
| models/errors/Error403            | 403         | application/json |
| models/errors/Error404            | 404         | application/json |
| models/errors/Error405            | 405         | application/json |
| models/errors/Error409            | 409         | application/json |
| models/errors/HTTPValidationError | 422         | application/json |
| models/errors/Error425            | 425         | application/json |
| models/errors/Error429            | 429         | application/json |
| models/errors/Error500            | 500         | application/json |
| models/errors/Error502            | 502         | application/json |
| models/errors/Error504            | 504         | application/json |
| models/errors/APIException        | 4XX, 5XX    | \*/\*            |

### Example

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
                .server(Gr4vy.AvailableServers.PRODUCTION)
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
__WARNING__: This should only used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

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
