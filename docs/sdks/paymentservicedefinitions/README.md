# PaymentServiceDefinitions
(*paymentServiceDefinitions()*)

## Overview

### Available Operations

* [list](#list) - List payment service definitions
* [get](#get) - Get a payment service definition
* [session](#session) - Create a session for a payment service definition

## list

List the definitions of each payment service that can be configured.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_payment_service_definitions" method="get" path="/payment-service-definitions" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListPaymentServiceDefinitionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        sdk.paymentServiceDefinitions().list()
                .cursor("ZXhhbXBsZTE")
                .limit(20L)
                .callAsStream()
                .forEach((ListPaymentServiceDefinitionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `cursor`                                          | *JsonNullable\<String>*                           | :heavy_minus_sign:                                | A pointer to the page of results to return.       | ZXhhbXBsZTE                                       |
| `limit`                                           | *Optional\<Long>*                                 | :heavy_minus_sign:                                | The maximum number of items that are at returned. | 20                                                |

### Response

**[ListPaymentServiceDefinitionsResponse](../../models/operations/ListPaymentServiceDefinitionsResponse.md)**

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

## get

Get the definition of a payment service that can be configured.

### Example Usage

<!-- UsageSnippet language="java" operationID="get_payment_service_definition" method="get" path="/payment-service-definitions/{payment_service_definition_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetPaymentServiceDefinitionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        GetPaymentServiceDefinitionResponse res = sdk.paymentServiceDefinitions().get()
                .paymentServiceDefinitionId("adyen-ideal")
                .call();

        if (res.paymentServiceDefinition().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  | Example                      |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `paymentServiceDefinitionId` | *String*                     | :heavy_check_mark:           | N/A                          | adyen-ideal                  |

### Response

**[GetPaymentServiceDefinitionResponse](../../models/operations/GetPaymentServiceDefinitionResponse.md)**

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

## session

Creates a session for a payment service that supports sessions.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_payment_service_definition_session" method="post" path="/payment-service-definitions/{payment_service_definition_id}/sessions" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreatePaymentServiceDefinitionSessionResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreatePaymentServiceDefinitionSessionResponse res = sdk.paymentServiceDefinitions().session()
                .paymentServiceDefinitionId("adyen-ideal")
                .requestBody(Map.ofEntries(
                ))
                .call();

        if (res.createSession().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  | Example                      |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `paymentServiceDefinitionId` | *String*                     | :heavy_check_mark:           | N/A                          | adyen-ideal                  |
| `requestBody`                | Map\<String, *Object*>       | :heavy_check_mark:           | N/A                          |                              |

### Response

**[CreatePaymentServiceDefinitionSessionResponse](../../models/operations/CreatePaymentServiceDefinitionSessionResponse.md)**

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