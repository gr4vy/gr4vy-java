# Events
(*transactions().events()*)

## Overview

### Available Operations

* [list](#list) - List transaction events

## list

Retrieve a paginated list of events related to processing a transaction, including status changes, API requests, and webhook delivery attempts. Events are listed in chronological order, with the most recent events first.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_transaction_events" method="get" path="/transactions/{transaction_id}/events" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListTransactionEventsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();


        sdk.transactions().events().list()
                .transactionId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .cursor("ZXhhbXBsZTE")
                .limit(100L)
                .callAsStream()
                .forEach((ListTransactionEventsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `transactionId`                                         | *String*                                                | :heavy_check_mark:                                      | The ID of the transaction                               | 7099948d-7286-47e4-aad8-b68f7eb44591                    |
| `cursor`                                                | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | A pointer to the page of results to return.             | ZXhhbXBsZTE                                             |
| `limit`                                                 | *Optional\<Long>*                                       | :heavy_minus_sign:                                      | The maximum number of items that are at returned.       | 100                                                     |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[ListTransactionEventsResponse](../../models/operations/ListTransactionEventsResponse.md)**

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