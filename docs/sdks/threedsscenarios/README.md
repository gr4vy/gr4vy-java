# ThreeDsScenarios

## Overview

### Available Operations

* [create](#create) - Create a 3DS scenario
* [list](#list) - List 3DS scenario
* [update](#update) - Update a 3DS scenario
* [delete](#delete) - Delete a 3DS scenario

## create

Create a new 3DS scenario for a merchant account. Only available in sandbox environments.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_three_ds_scenario" method="post" path="/three-ds-scenarios" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.*;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateThreeDsScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreateThreeDsScenarioResponse res = sdk.threeDsScenarios().create()
                .threeDSecureScenarioCreate(ThreeDSecureScenarioCreate.builder()
                    .conditions(ThreeDSecureScenarioConditions.builder()
                        .build())
                    .outcome(ThreeDSecureScenarioOutcome.builder()
                        .version("2.2.0")
                        .authentication(ThreeDSecureScenarioOutcomeAuthentication.builder()
                            .transactionStatus(ThreeDSecureScenarioOutcomeAuthenticationTransactionStatus.Y)
                            .build())
                        .build())
                    .build())
                .call();

        if (res.threeDSecureScenario().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `merchantAccountId`                                                                 | *JsonNullable\<String>*                                                             | :heavy_minus_sign:                                                                  | The ID of the merchant account to use for this request.                             |
| `threeDSecureScenarioCreate`                                                        | [ThreeDSecureScenarioCreate](../../models/components/ThreeDSecureScenarioCreate.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |

### Response

**[CreateThreeDsScenarioResponse](../../models/operations/CreateThreeDsScenarioResponse.md)**

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

## list

List all 3DS scenarios for a merchant account. Only available in sandbox environments.

### Example Usage

<!-- UsageSnippet language="java" operationID="get_three_ds_scenario" method="get" path="/three-ds-scenarios" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetThreeDsScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();


        sdk.threeDsScenarios().list()
                .limit(20L)
                .callAsStream()
                .forEach((GetThreeDsScenarioResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `cursor`                                                | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | A pointer to the page of results to return.             | ZXhhbXBsZTE                                             |
| `limit`                                                 | *Optional\<Long>*                                       | :heavy_minus_sign:                                      | The maximum number of items that are at returned.       | 20                                                      |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetThreeDsScenarioResponse](../../models/operations/GetThreeDsScenarioResponse.md)**

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

## update

Update a 3DS scenario. Only available in sandbox environments.

### Example Usage

<!-- UsageSnippet language="java" operationID="update_three_ds_scenario" method="put" path="/three-ds-scenarios/{three_ds_scenario_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.ThreeDSecureScenarioUpdate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UpdateThreeDsScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        UpdateThreeDsScenarioResponse res = sdk.threeDsScenarios().update()
                .threeDsScenarioId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .threeDSecureScenarioUpdate(ThreeDSecureScenarioUpdate.builder()
                    .build())
                .call();

        if (res.threeDSecureScenario().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         | Example                                                                             |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `threeDsScenarioId`                                                                 | *String*                                                                            | :heavy_check_mark:                                                                  | The ID of the 3DS scenario                                                          | 7099948d-7286-47e4-aad8-b68f7eb44591                                                |
| `merchantAccountId`                                                                 | *JsonNullable\<String>*                                                             | :heavy_minus_sign:                                                                  | The ID of the merchant account to use for this request.                             |                                                                                     |
| `threeDSecureScenarioUpdate`                                                        | [ThreeDSecureScenarioUpdate](../../models/components/ThreeDSecureScenarioUpdate.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |                                                                                     |

### Response

**[UpdateThreeDsScenarioResponse](../../models/operations/UpdateThreeDsScenarioResponse.md)**

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

Removes a 3DS scenario from our system. Only available in sandbox environments.

### Example Usage

<!-- UsageSnippet language="java" operationID="delete_three_ds_scenario" method="delete" path="/three-ds-scenarios/{three_ds_scenario_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.DeleteThreeDsScenarioResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        DeleteThreeDsScenarioResponse res = sdk.threeDsScenarios().delete()
                .threeDsScenarioId("7099948d-7286-47e4-aad8-b68f7eb44591")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `threeDsScenarioId`                                     | *String*                                                | :heavy_check_mark:                                      | The ID of the 3DS scenario                              | 7099948d-7286-47e4-aad8-b68f7eb44591                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[DeleteThreeDsScenarioResponse](../../models/operations/DeleteThreeDsScenarioResponse.md)**

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