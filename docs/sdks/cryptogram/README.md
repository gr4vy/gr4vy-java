# Cryptogram
(*paymentMethods().networkTokens().cryptogram()*)

## Overview

### Available Operations

* [create](#create) - Provision network token cryptogram

## create

Provision a cryptogram for a network token.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CryptogramCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreatePaymentMethodNetworkTokenCryptogramResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreatePaymentMethodNetworkTokenCryptogramResponse res = sdk.paymentMethods().networkTokens().cryptogram().create()
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .networkTokenId("f8dd5cfc-7834-4847-95dc-f75a360e2298")
                .cryptogramCreate(CryptogramCreate.builder()
                    .merchantInitiated(false)
                    .build())
                .call();

        if (res.cryptogram().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `paymentMethodId`                                               | *String*                                                        | :heavy_check_mark:                                              | The ID of the payment method                                    | ef9496d8-53a5-4aad-8ca2-00eb68334389                            |
| `networkTokenId`                                                | *String*                                                        | :heavy_check_mark:                                              | The ID of the network token                                     | f8dd5cfc-7834-4847-95dc-f75a360e2298                            |
| `merchantAccountId`                                             | *JsonNullable\<String>*                                         | :heavy_minus_sign:                                              | The ID of the merchant account to use for this request.         |                                                                 |
| `cryptogramCreate`                                              | [CryptogramCreate](../../models/components/CryptogramCreate.md) | :heavy_check_mark:                                              | N/A                                                             |                                                                 |

### Response

**[CreatePaymentMethodNetworkTokenCryptogramResponse](../../models/operations/CreatePaymentMethodNetworkTokenCryptogramResponse.md)**

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