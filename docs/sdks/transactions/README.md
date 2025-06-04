# Transactions
(*transactions()*)

## Overview

### Available Operations

* [list](#list) - List transactions
* [create](#create) - Create transaction
* [get](#get) - Get transaction
* [capture](#capture) - Capture transaction
* [void_](#void_) - Void transaction
* [sync](#sync) - Sync transaction

## list

List all transactions for a specific merchant account sorted by most recently created.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.*;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListTransactionsRequest;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListTransactionsRequest req = ListTransactionsRequest.builder()
                .cursor("ZXhhbXBsZTE")
                .createdAtLte(OffsetDateTime.parse("2022-01-01T12:00:00+08:00"))
                .createdAtGte(OffsetDateTime.parse("2022-01-01T12:00:00+08:00"))
                .updatedAtLte(OffsetDateTime.parse("2022-01-01T12:00:00+08:00"))
                .updatedAtGte(OffsetDateTime.parse("2022-01-01T12:00:00+08:00"))
                .search("transaction-12345")
                .buyerExternalIdentifier("buyer-12345")
                .buyerId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .buyerEmailAddress("john@example.com")
                .buyerSearch("John")
                .ipAddress("8.214.133.47")
                .status(List.of(
                    TransactionStatus.AUTHORIZATION_SUCCEEDED))
                .id("7099948d-7286-47e4-aad8-b68f7eb44591")
                .paymentServiceTransactionId("tx-12345")
                .externalIdentifier("transaction-12345")
                .metadata(List.of(
                    "{\"first_key\":\"first_value\",\"second_key\":\"second_value\"}"))
                .amountEq(1299L)
                .amountLte(1299L)
                .amountGte(1299L)
                .currency(List.of(
                    "USD"))
                .country(List.of(
                    "US"))
                .paymentServiceId(List.of(
                    "fffd152a-9532-4087-9a4f-de58754210f0"))
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .paymentMethodLabel("1234")
                .paymentMethodScheme("[\"visa\"]")
                .paymentMethodCountry("[\"US\"]")
                .paymentMethodFingerprint("a50b85c200ee0795d6fd33a5c66f37a4564f554355c5b46a756aac485dd168a4")
                .method(List.of(
                    Method.CARD))
                .errorCode(List.of(
                    "insufficient_funds"))
                .hasRefunds(true)
                .pendingReview(true)
                .checkoutSessionId("4137b1cf-39ac-42a8-bad6-1c680d5dab6b")
                .reconciliationId("7jZXl4gBUNl0CnaLEnfXbt")
                .hasGiftCardRedemptions(true)
                .giftCardId("356d56e5-fe16-42ae-97ee-8d55d846ae2e")
                .giftCardLast4("7890")
                .hasSettlements(true)
                .paymentMethodBin("411111")
                .paymentSource(List.of(
                    TransactionPaymentSource.RECURRING))
                .isSubsequentPayment(true)
                .merchantInitiated(true)
                .used3ds(true)
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

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListTransactionsRequest](../../models/operations/ListTransactionsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListTransactionsResponse](../../models/operations/ListTransactionsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/Error400            | 400                               | application/json                  |
| models/errors/Error401            | 401                               | application/json                  |
| models/errors/Error403            | 403                               | application/json                  |
| models/errors/Error404            | 404                               | application/json                  |
| models/errors/Error405            | 405                               | application/json                  |
| models/errors/Error409            | 409                               | application/json                  |
| models/errors/HTTPValidationError | 422                               | application/json                  |
| models/errors/Error425            | 425                               | application/json                  |
| models/errors/Error429            | 429                               | application/json                  |
| models/errors/Error500            | 500                               | application/json                  |
| models/errors/Error502            | 502                               | application/json                  |
| models/errors/Error504            | 504                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## create

Create a transaction.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.TransactionCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateTransactionResponse res = sdk.transactions().create()
                .idempotencyKey("request-12345")
                .transactionCreate(TransactionCreate.builder()
                    .amount(1299L)
                    .currency("EUR")
                    .store(true)
                    .isSubsequentPayment(true)
                    .merchantInitiated(true)
                    .asyncCapture(true)
                    .accountFundingTransaction(true)
                    .build())
                .call();

        if (res.transaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                             | Type                                                                                                                                                                                                  | Required                                                                                                                                                                                              | Description                                                                                                                                                                                           | Example                                                                                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `merchantAccountId`                                                                                                                                                                                   | *JsonNullable\<String>*                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                    | The ID of the merchant account to use for this request.                                                                                                                                               |                                                                                                                                                                                                       |
| `idempotencyKey`                                                                                                                                                                                      | *JsonNullable\<String>*                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                    | A unique key that identifies this request. Providing this header will make this an idempotent request. We recommend using V4 UUIDs, or another random string with enough entropy to avoid collisions. | request-12345                                                                                                                                                                                         |
| `transactionCreate`                                                                                                                                                                                   | [TransactionCreate](../../models/components/TransactionCreate.md)                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                    | N/A                                                                                                                                                                                                   |                                                                                                                                                                                                       |

### Response

**[CreateTransactionResponse](../../models/operations/CreateTransactionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/Error400            | 400                               | application/json                  |
| models/errors/Error401            | 401                               | application/json                  |
| models/errors/Error403            | 403                               | application/json                  |
| models/errors/Error404            | 404                               | application/json                  |
| models/errors/Error405            | 405                               | application/json                  |
| models/errors/Error409            | 409                               | application/json                  |
| models/errors/HTTPValidationError | 422                               | application/json                  |
| models/errors/Error425            | 425                               | application/json                  |
| models/errors/Error429            | 429                               | application/json                  |
| models/errors/Error500            | 500                               | application/json                  |
| models/errors/Error502            | 502                               | application/json                  |
| models/errors/Error504            | 504                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## get

Fetch a single transaction by its ID.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetTransactionResponse res = sdk.transactions().get()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .call();

        if (res.transaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `transactionId`                                         | *String*                                                | :heavy_check_mark:                                      | N/A                                                     | 7099948d-7286-47e4-aad8-b68f7eb44591                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetTransactionResponse](../../models/operations/GetTransactionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/Error400            | 400                               | application/json                  |
| models/errors/Error401            | 401                               | application/json                  |
| models/errors/Error403            | 403                               | application/json                  |
| models/errors/Error404            | 404                               | application/json                  |
| models/errors/Error405            | 405                               | application/json                  |
| models/errors/Error409            | 409                               | application/json                  |
| models/errors/HTTPValidationError | 422                               | application/json                  |
| models/errors/Error425            | 425                               | application/json                  |
| models/errors/Error429            | 429                               | application/json                  |
| models/errors/Error500            | 500                               | application/json                  |
| models/errors/Error502            | 502                               | application/json                  |
| models/errors/Error504            | 504                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## capture

Capture a previously authorized transaction.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.TransactionCapture;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CaptureTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CaptureTransactionResponse res = sdk.transactions().capture()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .transactionCapture(TransactionCapture.builder()
                    .build())
                .call();

        if (res.transaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `transactionId`                                                     | *String*                                                            | :heavy_check_mark:                                                  | N/A                                                                 | 7099948d-7286-47e4-aad8-b68f7eb44591                                |
| `merchantAccountId`                                                 | *JsonNullable\<String>*                                             | :heavy_minus_sign:                                                  | The ID of the merchant account to use for this request.             |                                                                     |
| `transactionCapture`                                                | [TransactionCapture](../../models/components/TransactionCapture.md) | :heavy_check_mark:                                                  | N/A                                                                 |                                                                     |

### Response

**[CaptureTransactionResponse](../../models/operations/CaptureTransactionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/Error400            | 400                               | application/json                  |
| models/errors/Error401            | 401                               | application/json                  |
| models/errors/Error403            | 403                               | application/json                  |
| models/errors/Error404            | 404                               | application/json                  |
| models/errors/Error405            | 405                               | application/json                  |
| models/errors/Error409            | 409                               | application/json                  |
| models/errors/HTTPValidationError | 422                               | application/json                  |
| models/errors/Error425            | 425                               | application/json                  |
| models/errors/Error429            | 429                               | application/json                  |
| models/errors/Error500            | 500                               | application/json                  |
| models/errors/Error502            | 502                               | application/json                  |
| models/errors/Error504            | 504                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## void_

Void a previously authorized transaction.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.VoidTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        VoidTransactionResponse res = sdk.transactions().void_()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .call();

        if (res.transaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `transactionId`                                         | *String*                                                | :heavy_check_mark:                                      | N/A                                                     | 7099948d-7286-47e4-aad8-b68f7eb44591                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[VoidTransactionResponse](../../models/operations/VoidTransactionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/Error400            | 400                               | application/json                  |
| models/errors/Error401            | 401                               | application/json                  |
| models/errors/Error403            | 403                               | application/json                  |
| models/errors/Error404            | 404                               | application/json                  |
| models/errors/Error405            | 405                               | application/json                  |
| models/errors/Error409            | 409                               | application/json                  |
| models/errors/HTTPValidationError | 422                               | application/json                  |
| models/errors/Error425            | 425                               | application/json                  |
| models/errors/Error429            | 429                               | application/json                  |
| models/errors/Error500            | 500                               | application/json                  |
| models/errors/Error502            | 502                               | application/json                  |
| models/errors/Error504            | 504                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## sync

Fetch the latest status for a transaction.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.SyncTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        SyncTransactionResponse res = sdk.transactions().sync()
                .transactionId("2ee546e0-3b11-478e-afec-fdb362611e22")
                .call();

        if (res.transaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `transactionId`                                         | *String*                                                | :heavy_check_mark:                                      | N/A                                                     |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |

### Response

**[SyncTransactionResponse](../../models/operations/SyncTransactionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/Error400            | 400                               | application/json                  |
| models/errors/Error401            | 401                               | application/json                  |
| models/errors/Error403            | 403                               | application/json                  |
| models/errors/Error404            | 404                               | application/json                  |
| models/errors/Error405            | 405                               | application/json                  |
| models/errors/Error409            | 409                               | application/json                  |
| models/errors/HTTPValidationError | 422                               | application/json                  |
| models/errors/Error425            | 425                               | application/json                  |
| models/errors/Error429            | 429                               | application/json                  |
| models/errors/Error500            | 500                               | application/json                  |
| models/errors/Error502            | 502                               | application/json                  |
| models/errors/Error504            | 504                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |