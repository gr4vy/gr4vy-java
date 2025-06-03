# All
(*transactions().refunds().all()*)

## Overview

### Available Operations

* [create](#create) - Create batch transaction refund

## create

Create a refund for all instruments on a transaction.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateFullTransactionRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateFullTransactionRefundResponse res = sdk.transactions().refunds().all().create()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .call();

        if (res.refunds().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `transactionId`                                                                                    | *String*                                                                                           | :heavy_check_mark:                                                                                 | N/A                                                                                                | 7099948d-7286-47e4-aad8-b68f7eb44591                                                               |
| `merchantAccountId`                                                                                | *JsonNullable\<String>*                                                                            | :heavy_minus_sign:                                                                                 | The ID of the merchant account to use for this request.                                            |                                                                                                    |
| `transactionRefundAllCreate`                                                                       | [JsonNullable\<TransactionRefundAllCreate>](../../models/components/TransactionRefundAllCreate.md) | :heavy_minus_sign:                                                                                 | N/A                                                                                                |                                                                                                    |

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