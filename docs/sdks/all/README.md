# Transactions.Refunds.All

## Overview

### Available Operations

* [create](#create) - Create batch transaction refund

## create

Create a refund for all instruments on a transaction.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_full_transaction_refund" method="post" path="/transactions/{transaction_id}/refunds/all" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.TransactionRefundAllCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateFullTransactionRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreateFullTransactionRefundResponse res = sdk.transactions().refunds().all().create()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .transactionRefundAllCreate(TransactionRefundAllCreate.builder()
                    .reason("Refund due to user request.")
                    .externalIdentifier("refund-12345")
                    .build())
                .call();

        if (res.refunds().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                             | Type                                                                                                                                                                                                  | Required                                                                                                                                                                                              | Description                                                                                                                                                                                           | Example                                                                                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `transactionId`                                                                                                                                                                                       | *String*                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                    | The ID of the transaction                                                                                                                                                                             | 7099948d-7286-47e4-aad8-b68f7eb44591                                                                                                                                                                  |
| `merchantAccountId`                                                                                                                                                                                   | *JsonNullable\<String>*                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                    | The ID of the merchant account to use for this request.                                                                                                                                               |                                                                                                                                                                                                       |
| `idempotencyKey`                                                                                                                                                                                      | *JsonNullable\<String>*                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                    | A unique key that identifies this request. Providing this header will make this an idempotent request. We recommend using V4 UUIDs, or another random string with enough entropy to avoid collisions. | request-12345                                                                                                                                                                                         |
| `transactionRefundAllCreate`                                                                                                                                                                          | [JsonNullable\<TransactionRefundAllCreate>](../../models/components/TransactionRefundAllCreate.md)                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                    | N/A                                                                                                                                                                                                   |                                                                                                                                                                                                       |

### Response

**[CreateFullTransactionRefundResponse](../../models/operations/CreateFullTransactionRefundResponse.md)**

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