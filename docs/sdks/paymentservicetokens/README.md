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

<!-- UsageSnippet language="java" operationID="list_payment_method_payment_service_tokens" method="get" path="/payment-methods/{payment_method_id}/payment-service-tokens" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListPaymentMethodPaymentServiceTokensResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListPaymentMethodPaymentServiceTokensResponse res = sdk.paymentMethods().paymentServiceTokens().list()
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
                .call();

        if (res.paymentServiceTokens().isPresent()) {
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
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

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

<!-- UsageSnippet language="java" operationID="create_payment_method_payment_service_token" method="post" path="/payment-methods/{payment_method_id}/payment-service-tokens" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.PaymentServiceTokenCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreatePaymentMethodPaymentServiceTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreatePaymentMethodPaymentServiceTokenResponse res = sdk.paymentMethods().paymentServiceTokens().create()
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .paymentServiceTokenCreate(PaymentServiceTokenCreate.builder()
                    .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
                    .redirectUrl("https://dual-futon.biz")
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
| `merchantAccountId`                                                               | *JsonNullable\<String>*                                                           | :heavy_minus_sign:                                                                | The ID of the merchant account to use for this request.                           |                                                                                   |
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

<!-- UsageSnippet language="java" operationID="delete_payment_method_payment_service_token" method="delete" path="/payment-methods/{payment_method_id}/payment-service-tokens/{payment_service_token_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.DeletePaymentMethodPaymentServiceTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        DeletePaymentMethodPaymentServiceTokenResponse res = sdk.paymentMethods().paymentServiceTokens().delete()
                .paymentMethodId("ef9496d8-53a5-4aad-8ca2-00eb68334389")
                .paymentServiceTokenId("703f2d99-3fd1-44bc-9cbd-a25a2d597886")
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
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

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