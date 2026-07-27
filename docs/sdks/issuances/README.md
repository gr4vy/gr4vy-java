# GiftCards.Issuances

## Overview

### Available Operations

* [create](#create) - Issue a gift card

## create

Issue a new virtual gift card through the primary gift card service.

### Example Usage

<!-- UsageSnippet language="java" operationID="issue_gift_card" method="post" path="/gift-cards/issuances" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.GiftCardIssuanceCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.IssueGiftCardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        IssueGiftCardResponse res = sdk.giftCards().issuances().create()
                .giftCardIssuanceCreate(GiftCardIssuanceCreate.builder()
                    .theme("031111372")
                    .amount(5000L)
                    .currency("EUR")
                    .build())
                .call();

        if (res.giftCardIssuance().isPresent()) {
            System.out.println(res.giftCardIssuance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `idempotencyKey`                                                                 | *JsonNullable\<String>*                                                          | :heavy_minus_sign:                                                               | A unique key forwarded to the gift card service to make the issuance idempotent. |
| `merchantAccountId`                                                              | *JsonNullable\<String>*                                                          | :heavy_minus_sign:                                                               | The ID of the merchant account to use for this request.                          |
| `giftCardIssuanceCreate`                                                         | [GiftCardIssuanceCreate](../../models/components/GiftCardIssuanceCreate.md)      | :heavy_check_mark:                                                               | N/A                                                                              |

### Response

**[IssueGiftCardResponse](../../models/operations/IssueGiftCardResponse.md)**

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