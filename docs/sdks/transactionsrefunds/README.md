# TransactionsRefunds
(*transactions().refunds()*)

## Overview

### Available Operations

* [list](#list) - List transaction refunds
* [create](#create) - Create transaction refund
* [get](#get) - Get transaction refund

## list

List refunds for a transaction.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListTransactionRefundsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListTransactionRefundsResponse res = sdk.transactions().refunds().list()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .call();

        if (res.collectionRefund().isPresent()) {
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

**[ListTransactionRefundsResponse](../../models/operations/ListTransactionRefundsResponse.md)**

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

Create a refund for a transaction.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.TransactionRefundCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateTransactionRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateTransactionRefundResponse res = sdk.transactions().refunds().create()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .transactionRefundCreate(TransactionRefundCreate.builder()
                    .amount(1299L)
                    .targetId("7a6c366d-9205-45ab-8021-0d9ee37f20f2")
                    .reason("Refund due to user request.")
                    .externalIdentifier("refund-12345")
                    .build())
                .call();

        if (res.refund().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `transactionId`                                                               | *String*                                                                      | :heavy_check_mark:                                                            | N/A                                                                           | 7099948d-7286-47e4-aad8-b68f7eb44591                                          |
| `timeoutInSeconds`                                                            | *Optional\<Double>*                                                           | :heavy_minus_sign:                                                            | N/A                                                                           |                                                                               |
| `merchantAccountId`                                                           | *JsonNullable\<String>*                                                       | :heavy_minus_sign:                                                            | The ID of the merchant account to use for this request.                       |                                                                               |
| `transactionRefundCreate`                                                     | [TransactionRefundCreate](../../models/components/TransactionRefundCreate.md) | :heavy_check_mark:                                                            | N/A                                                                           |                                                                               |

### Response

**[CreateTransactionRefundResponse](../../models/operations/CreateTransactionRefundResponse.md)**

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

Fetch refund for a transaction.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetTransactionRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetTransactionRefundResponse res = sdk.transactions().refunds().get()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .refundId("6a1d4e46-14ed-4fe1-a45f-eff4e025d211")
                .call();

        if (res.refund().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `transactionId`                                         | *String*                                                | :heavy_check_mark:                                      | N/A                                                     | 7099948d-7286-47e4-aad8-b68f7eb44591                    |
| `refundId`                                              | *String*                                                | :heavy_check_mark:                                      | N/A                                                     | 6a1d4e46-14ed-4fe1-a45f-eff4e025d211                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetTransactionRefundResponse](../../models/operations/GetTransactionRefundResponse.md)**

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