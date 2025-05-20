# Gr4vy Java SDK (Beta)

Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>

<br /><br />
> [!IMPORTANT]
> This is a Beta release of our latest SDK. Please refer to the [legacy Java SDK](https://github.com/gr4vy/gr4vy-java/tree/legacy) for the latest stable build.

<!-- Start Summary [summary] -->
## Summary

Gr4vy: The Gr4vy API.
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [Gr4vy Java SDK (Beta)](#gr4vy-java-sdk-beta)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Pagination](#pagination)
  * [Error Handling](#error-handling)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.github.gr4vy:gr4vy-java:0.0.2'
```

Maven:
```xml
<dependency>
    <groupId>com.github.gr4vy</groupId>
    <artifactId>gr4vy-java</artifactId>
    <version>0.0.2</version>
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

### Logging
A logging framework/facade has not yet been adopted but is under consideration.

For request and response logging (especially json bodies) use:
```java
SpeakeasyHTTPClient.setDebugLogging(true); // experimental API only (may change without warning)
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
WARNING: This should only used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.AccountUpdaterJobCreate;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.CreateAccountUpdaterJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        CreateAccountUpdaterJobResponse res = sdk.accountUpdater().jobs().create()
                .xGr4vyMerchantAccountId("default")
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
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                   | Type   | Scheme       |
| ---------------------- | ------ | ------------ |
| `oAuth2PasswordBearer` | oauth2 | OAuth2 token |

To authenticate with the API the `oAuth2PasswordBearer` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.AccountUpdaterJobCreate;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.CreateAccountUpdaterJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        CreateAccountUpdaterJobResponse res = sdk.accountUpdater().jobs().create()
                .xGr4vyMerchantAccountId("default")
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
<!-- End Authentication [security] -->

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
* [session](docs/sdks/paymentservicedefinitions/README.md#session) - Create a session for apayment service definition

### [paymentServices()](docs/sdks/paymentservices/README.md)

* [list](docs/sdks/paymentservices/README.md#list) - List payment services
* [create](docs/sdks/paymentservices/README.md#create) - Update a configured payment service
* [get](docs/sdks/paymentservices/README.md#get) - Get payment service
* [update](docs/sdks/paymentservices/README.md#update) - Configure a payment service
* [delete](docs/sdks/paymentservices/README.md#delete) - Delete a configured payment service
* [verify](docs/sdks/paymentservices/README.md#verify) - Verify payment service credentials
* [session](docs/sdks/paymentservices/README.md#session) - Create a session for apayment service definition

### [payouts()](docs/sdks/payouts/README.md)

* [list](docs/sdks/payouts/README.md#list) - List payouts created.
* [create](docs/sdks/payouts/README.md#create) - Create a payout.
* [get](docs/sdks/payouts/README.md#get) - Get a payout.

### [refunds()](docs/sdks/refunds/README.md)

* [get](docs/sdks/refunds/README.md#get) - Get refund

### [transactions()](docs/sdks/transactions/README.md)

* [list](docs/sdks/transactions/README.md#list) - List transactions
* [create](docs/sdks/transactions/README.md#create) - Create transaction
* [get](docs/sdks/transactions/README.md#get) - Get transaction
* [capture](docs/sdks/transactions/README.md#capture) - Capture transaction
* [void_](docs/sdks/transactions/README.md#void_) - Void transaction
* [summary](docs/sdks/transactions/README.md#summary) - Get transaction summary
* [sync](docs/sdks/transactions/README.md#sync) - Sync transaction

#### [transactions().refunds()](docs/sdks/transactionsrefunds/README.md)

* [list](docs/sdks/transactionsrefunds/README.md#list) - List transaction refunds
* [create](docs/sdks/transactionsrefunds/README.md#create) - Create transaction refund
* [get](docs/sdks/transactionsrefunds/README.md#get) - Get transaction refund

#### [transactions().refunds().all()](docs/sdks/all/README.md)

* [create](docs/sdks/all/README.md#create) - Create batch transaction refund

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `next` method that can be called to pull down the next group of results. The `next`
function returns an `Optional` value, which `isPresent` until there are no more pages to be fetched.

Here's an example of one such pagination call:
```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.ListBuyersRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        ListBuyersRequest req = ListBuyersRequest.builder()
                .cursor("ZXhhbXBsZTE")
                .search("John")
                .externalIdentifier("buyer-12345")
                .xGr4vyMerchantAccountId("default")
                .build();

        sdk.buyers().list()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```
<!-- End Pagination [pagination] -->

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

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.AccountUpdaterJobCreate;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.CreateAccountUpdaterJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        CreateAccountUpdaterJobResponse res = sdk.accountUpdater().jobs().create()
                .xGr4vyMerchantAccountId("default")
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

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
