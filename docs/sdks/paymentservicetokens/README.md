# PaymentServiceTokens
(*paymentMethods().paymentServiceTokens()*)

## Overview

### Available Operations

* [list](#list) - List payment service tokens
* [create](#create) - Create payment service token
* [delete](#delete) - Delete payment service token

## list

List all gateway tokens stored for a payment method.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.ListPaymentMethodPaymentServiceTokensResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        ListPaymentMethodPaymentServiceTokensResponse res = sdk.paymentMethods().paymentServiceTokens().list()
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
                .xGr4vyMerchantAccountId("default")
                .call();

        if (res.collectionNoCursorPaymentServiceToken().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `paymentMethodId`                                       | *String*                                                | :heavy_check_mark:                                      | The ID of the payment method                            | ef9496d8-53a5-4aad-8ca2-00eb68334389                    |
| `paymentServiceId`                                      | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the payment service                           | fffd152a-9532-4087-9a4f-de58754210f0                    |
| `xGr4vyMerchantAccountId`                               | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. | default                                                 |

### Response

**[ListPaymentMethodPaymentServiceTokensResponse](../../models/operations/ListPaymentMethodPaymentServiceTokensResponse.md)**

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

Create a gateway tokens for a payment method.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.PaymentServiceTokenCreate;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.CreatePaymentMethodPaymentServiceTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        CreatePaymentMethodPaymentServiceTokenResponse res = sdk.paymentMethods().paymentServiceTokens().create()
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .xGr4vyMerchantAccountId("default")
                .paymentServiceTokenCreate(PaymentServiceTokenCreate.builder()
                    .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
                    .redirectUrl("https://dual-futon.biz")
                    .securityCode("123")
                    .build())
                .call();

        if (res.paymentServiceToken().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       | Example                                                                           |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `paymentMethodId`                                                                 | *String*                                                                          | :heavy_check_mark:                                                                | The ID of the payment method                                                      | ef9496d8-53a5-4aad-8ca2-00eb68334389                                              |
| `timeoutInSeconds`                                                                | *Optional\<Double>*                                                               | :heavy_minus_sign:                                                                | N/A                                                                               |                                                                                   |
| `xGr4vyMerchantAccountId`                                                         | *JsonNullable\<String>*                                                           | :heavy_minus_sign:                                                                | The ID of the merchant account to use for this request.                           | default                                                                           |
| `paymentServiceTokenCreate`                                                       | [PaymentServiceTokenCreate](../../models/components/PaymentServiceTokenCreate.md) | :heavy_check_mark:                                                                | N/A                                                                               |                                                                                   |

### Response

**[CreatePaymentMethodPaymentServiceTokenResponse](../../models/operations/CreatePaymentMethodPaymentServiceTokenResponse.md)**

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

## delete

Delete a gateway tokens for a payment method.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.DeletePaymentMethodPaymentServiceTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        DeletePaymentMethodPaymentServiceTokenResponse res = sdk.paymentMethods().paymentServiceTokens().delete()
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .paymentServiceTokenId("703f2d99-3fd1-44bc-9cbd-a25a2d597886")
                .xGr4vyMerchantAccountId("default")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `paymentMethodId`                                       | *String*                                                | :heavy_check_mark:                                      | The ID of the payment method                            | ef9496d8-53a5-4aad-8ca2-00eb68334389                    |
| `paymentServiceTokenId`                                 | *String*                                                | :heavy_check_mark:                                      | The ID of the payment service token                     | 703f2d99-3fd1-44bc-9cbd-a25a2d597886                    |
| `timeoutInSeconds`                                      | *Optional\<Double>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
| `xGr4vyMerchantAccountId`                               | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. | default                                                 |

### Response

**[DeletePaymentMethodPaymentServiceTokenResponse](../../models/operations/DeletePaymentMethodPaymentServiceTokenResponse.md)**

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