# PaymentOptions
(*paymentOptions()*)

## Overview

### Available Operations

* [list](#list) - List payment options

## list

List the payment options available at checkout. filtering by country, currency, and additional fields passed to Flow rules.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.PaymentOptionRequest;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListPaymentOptionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListPaymentOptionsResponse res = sdk.paymentOptions().list()
                .paymentOptionRequest(PaymentOptionRequest.builder()
                    .build())
                .call();

        if (res.paymentOptions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `merchantAccountId`                                                     | *JsonNullable\<String>*                                                 | :heavy_minus_sign:                                                      | The ID of the merchant account to use for this request.                 |
| `paymentOptionRequest`                                                  | [PaymentOptionRequest](../../models/components/PaymentOptionRequest.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[ListPaymentOptionsResponse](../../models/operations/ListPaymentOptionsResponse.md)**

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