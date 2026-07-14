# Transactions.RefundSettlements

## Overview

### Available Operations

* [get](#get) - Get transaction refund settlement
* [list](#list) - List transaction refund settlements

## get

Retrieve a specific refund settlement for a transaction by its unique identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="get_transaction_refund_settlement" method="get" path="/transactions/{transaction_id}/refund-settlements/{settlement_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetTransactionRefundSettlementResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        GetTransactionRefundSettlementResponse res = sdk.transactions().refundSettlements().get()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .settlementId("b1e2c3d4-5678-1234-9abc-1234567890ab")
                .call();

        if (res.refundSettlement().isPresent()) {
            System.out.println(res.refundSettlement().get());
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `transactionId`                                         | *String*                                                | :heavy_check_mark:                                      | The unique identifier of the transaction.               | 7099948d-7286-47e4-aad8-b68f7eb44591                    |
| `settlementId`                                          | *String*                                                | :heavy_check_mark:                                      | The unique identifier of the refund settlement.         | b1e2c3d4-5678-1234-9abc-1234567890ab                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetTransactionRefundSettlementResponse](../../models/operations/GetTransactionRefundSettlementResponse.md)**

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

## list

List all refund settlements for a specific transaction.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_transaction_refund_settlements" method="get" path="/transactions/{transaction_id}/refund-settlements" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListTransactionRefundSettlementsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListTransactionRefundSettlementsResponse res = sdk.transactions().refundSettlements().list()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .call();

        if (res.refundSettlements().isPresent()) {
            System.out.println(res.refundSettlements().get());
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `transactionId`                                         | *String*                                                | :heavy_check_mark:                                      | The unique identifier of the transaction.               | 7099948d-7286-47e4-aad8-b68f7eb44591                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[ListTransactionRefundSettlementsResponse](../../models/operations/ListTransactionRefundSettlementsResponse.md)**

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