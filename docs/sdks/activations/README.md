# GiftCards.Activations

## Overview

### Available Operations

* [create](#create) - Activate a gift card

## create

Activate a physical gift card through the primary gift card service.

### Example Usage

<!-- UsageSnippet language="java" operationID="activate_gift_card" method="post" path="/gift-cards/activations" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.GiftCardActivationCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ActivateGiftCardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ActivateGiftCardResponse res = sdk.giftCards().activations().create()
                .giftCardActivationCreate(GiftCardActivationCreate.builder()
                    .number("4123455541234561234")
                    .build())
                .call();

        if (res.giftCard().isPresent()) {
            System.out.println(res.giftCard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                       | Type                                                                                                                                                                                                                                            | Required                                                                                                                                                                                                                                        | Description                                                                                                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `idempotencyKey`                                                                                                                                                                                                                                | *JsonNullable\<String>*                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                              | A unique key that identifies this request. If supported by the gift card service, the value will be forwarded to make the activation idempotent. We recommend using V4 UUIDs, or another random string with enough entropy to avoid collisions. |
| `merchantAccountId`                                                                                                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                              | The ID of the merchant account to use for this request.                                                                                                                                                                                         |
| `giftCardActivationCreate`                                                                                                                                                                                                                      | [GiftCardActivationCreate](../../models/components/GiftCardActivationCreate.md)                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                                                              | N/A                                                                                                                                                                                                                                             |

### Response

**[ActivateGiftCardResponse](../../models/operations/ActivateGiftCardResponse.md)**

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