# Balances
(*giftCards().balances()*)

## Overview

### Available Operations

* [list](#list) - List gift card balances

## list

Fetch the balances for one or more gift cards.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.*;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListGiftCardBalancesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListGiftCardBalancesResponse res = sdk.giftCards().balances().list()
                .giftCardBalanceRequest(GiftCardBalanceRequest.builder()
                    .items(List.of(
                        Item.of(GiftCardStoredRequest.builder()
                            .id("356d56e5-fe16-42ae-97ee-8d55d846ae2e")
                            .build()),
                        Item.of(GiftCardStoredRequest.builder()
                            .id("356d56e5-fe16-42ae-97ee-8d55d846ae2e")
                            .build()),
                        Item.of(GiftCardRequest.builder()
                            .number("4123455541234561234")
                            .pin("1234")
                            .build())))
                    .build())
                .call();

        if (res.collectionNoCursorGiftCardSummary().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `timeoutInSeconds`                                                          | *Optional\<Double>*                                                         | :heavy_minus_sign:                                                          | N/A                                                                         |
| `merchantAccountId`                                                         | *JsonNullable\<String>*                                                     | :heavy_minus_sign:                                                          | The ID of the merchant account to use for this request.                     |
| `giftCardBalanceRequest`                                                    | [GiftCardBalanceRequest](../../models/components/GiftCardBalanceRequest.md) | :heavy_check_mark:                                                          | N/A                                                                         |

### Response

**[ListGiftCardBalancesResponse](../../models/operations/ListGiftCardBalancesResponse.md)**

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