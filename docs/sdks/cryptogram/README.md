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

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.CryptogramCreate;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.CreatePaymentMethodNetworkTokenCryptogramRequest;
import com.github.gr4vy.gr4vy_java.models.operations.CreatePaymentMethodNetworkTokenCryptogramResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        CreatePaymentMethodNetworkTokenCryptogramRequest req = CreatePaymentMethodNetworkTokenCryptogramRequest.builder()
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .networkTokenId("f8dd5cfc-7834-4847-95dc-f75a360e2298")
                .cryptogramCreate(CryptogramCreate.builder()
                    .merchantInitiated(false)
                    .build())
                .xGr4vyMerchantAccountId("default")
                .build();

        CreatePaymentMethodNetworkTokenCryptogramResponse res = sdk.paymentMethods().networkTokens().cryptogram().create()
                .request(req)
                .call();

        if (res.cryptogram().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [CreatePaymentMethodNetworkTokenCryptogramRequest](../../models/operations/CreatePaymentMethodNetworkTokenCryptogramRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |

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