# Buyers.GiftCards

## Overview

### Available Operations

* [list](#list) - List gift cards for a buyer

## list

List all the stored gift cards for a specific buyer.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_buyer_gift_cards" method="get" path="/buyers/gift-cards" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListBuyerGiftCardsRequest;
import com.gr4vy.sdk.models.operations.ListBuyerGiftCardsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListBuyerGiftCardsRequest req = ListBuyerGiftCardsRequest.builder()
                .build();

        ListBuyerGiftCardsResponse res = sdk.buyers().giftCards().list()
                .request(req)
                .call();

        if (res.giftCardSummaries().isPresent()) {
            System.out.println(res.giftCardSummaries().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListBuyerGiftCardsRequest](../../models/operations/ListBuyerGiftCardsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListBuyerGiftCardsResponse](../../models/operations/ListBuyerGiftCardsResponse.md)**

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