# ApiKeyPairs

## Overview

### Available Operations

* [list](#list) - List all API key pairs
* [create](#create) - Create an API key pair
* [get](#get) - Get an API key pair
* [update](#update) - Update an API key pair
* [delete](#delete) - Delete an API key pair

## list

List all API key pairs.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_api_key_pairs" method="get" path="/api-key-pairs" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListApiKeyPairsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();


        sdk.apiKeyPairs().list()
                .limit(20L)
                .callAsStream()
                .forEach((ListApiKeyPairsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `cursor`                                       | *JsonNullable\<String>*                        | :heavy_minus_sign:                             | A pointer to the page of results to return.    | ZXhhbXBsZTE                                    |
| `limit`                                        | *Optional\<Long>*                              | :heavy_minus_sign:                             | The maximum number of items that are returned. | 20                                             |

### Response

**[ListApiKeyPairsResponse](../../models/operations/ListApiKeyPairsResponse.md)**

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

Create a new API key pair.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_api_key_pair" method="post" path="/api-key-pairs" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.APIKeyPairCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateApiKeyPairResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        APIKeyPairCreate req = APIKeyPairCreate.builder()
                .displayName("Production key")
                .roleIds(List.of(
                    "8f4b8c1a-1b2c-4d3e-9f5a-6b7c8d9e0f1a"))
                .build();

        CreateApiKeyPairResponse res = sdk.apiKeyPairs().create()
                .request(req)
                .call();

        if (res.apiKeyPair().isPresent()) {
            System.out.println(res.apiKeyPair().get());
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [APIKeyPairCreate](../../models/shared/APIKeyPairCreate.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[CreateApiKeyPairResponse](../../models/operations/CreateApiKeyPairResponse.md)**

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

Fetches an API key pair by its ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="get_api_key_pair" method="get" path="/api-key-pairs/{api_key_pair_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetApiKeyPairResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        GetApiKeyPairResponse res = sdk.apiKeyPairs().get()
                .apiKeyPairId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .call();

        if (res.apiKeyPair().isPresent()) {
            System.out.println(res.apiKeyPair().get());
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `apiKeyPairId`                       | *String*                             | :heavy_check_mark:                   | The ID of the API key pair.          | fe26475d-ec3e-4884-9553-f7356683f7f9 |

### Response

**[GetApiKeyPairResponse](../../models/operations/GetApiKeyPairResponse.md)**

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

Updates an API key pair.

### Example Usage

<!-- UsageSnippet language="java" operationID="update_api_key_pair" method="put" path="/api-key-pairs/{api_key_pair_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.APIKeyPairUpdate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UpdateApiKeyPairResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        UpdateApiKeyPairResponse res = sdk.apiKeyPairs().update()
                .apiKeyPairId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .apiKeyPairUpdate(APIKeyPairUpdate.builder()
                    .build())
                .call();

        if (res.apiKeyPair().isPresent()) {
            System.out.println(res.apiKeyPair().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `apiKeyPairId`                                                  | *String*                                                        | :heavy_check_mark:                                              | The ID of the API key pair.                                     | fe26475d-ec3e-4884-9553-f7356683f7f9                            |
| `apiKeyPairUpdate`                                              | [APIKeyPairUpdate](../../models/components/APIKeyPairUpdate.md) | :heavy_check_mark:                                              | N/A                                                             |                                                                 |

### Response

**[UpdateApiKeyPairResponse](../../models/operations/UpdateApiKeyPairResponse.md)**

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

Permanently removes an API key pair.

### Example Usage

<!-- UsageSnippet language="java" operationID="delete_api_key_pair" method="delete" path="/api-key-pairs/{api_key_pair_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.DeleteApiKeyPairResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        DeleteApiKeyPairResponse res = sdk.apiKeyPairs().delete()
                .apiKeyPairId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `apiKeyPairId`                       | *String*                             | :heavy_check_mark:                   | The ID of the API key pair.          | fe26475d-ec3e-4884-9553-f7356683f7f9 |

### Response

**[DeleteApiKeyPairResponse](../../models/operations/DeleteApiKeyPairResponse.md)**

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