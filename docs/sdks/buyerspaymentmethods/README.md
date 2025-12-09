# Buyers.PaymentMethods

## Overview

### Available Operations

* [list](#list) - List payment methods for a buyer

## list

List all the stored payment methods for a specific buyer.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_buyer_payment_methods" method="get" path="/buyers/payment-methods" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListBuyerPaymentMethodsRequest;
import com.gr4vy.sdk.models.operations.ListBuyerPaymentMethodsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListBuyerPaymentMethodsRequest req = ListBuyerPaymentMethodsRequest.builder()
                .buyerId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .buyerExternalIdentifier("buyer-12345")
                .country("US")
                .currency("USD")
                .build();

        ListBuyerPaymentMethodsResponse res = sdk.buyers().paymentMethods().list()
                .request(req)
                .call();

        if (res.paymentMethodSummaries().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListBuyerPaymentMethodsRequest](../../models/operations/ListBuyerPaymentMethodsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListBuyerPaymentMethodsResponse](../../models/operations/ListBuyerPaymentMethodsResponse.md)**

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