# Refunds
(*refunds()*)

## Overview

### Available Operations

* [get](#get) - Get refund

## get

Fetch a refund.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.GetRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        GetRefundResponse res = sdk.refunds().get()
                .refundId("6a1d4e46-14ed-4fe1-a45f-eff4e025d211")
                .xGr4vyMerchantAccountId("default")
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
| `refundId`                                              | *String*                                                | :heavy_check_mark:                                      | N/A                                                     | 6a1d4e46-14ed-4fe1-a45f-eff4e025d211                    |
| `xGr4vyMerchantAccountId`                               | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. | default                                                 |

### Response

**[GetRefundResponse](../../models/operations/GetRefundResponse.md)**

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