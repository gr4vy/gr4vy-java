# Gr4vy SDK

## Overview

Gr4vy: The Gr4vy API.

### Available Operations

* [browsePaymentMethodDefinitionsGet](#browsepaymentmethoddefinitionsget) - Browse

## browsePaymentMethodDefinitionsGet

Browse

### Example Usage

<!-- UsageSnippet language="java" operationID="browse_payment_method_definitions_get" method="get" path="/payment-method-definitions" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.HTTPValidationError;
import com.gr4vy.sdk.models.operations.BrowsePaymentMethodDefinitionsGetResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws HTTPValidationError, Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        BrowsePaymentMethodDefinitionsGetResponse res = sdk.browsePaymentMethodDefinitionsGet()
                .call();

        if (res.any().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |

### Response

**[BrowsePaymentMethodDefinitionsGetResponse](../../models/operations/BrowsePaymentMethodDefinitionsGetResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/HTTPValidationError | 422                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |