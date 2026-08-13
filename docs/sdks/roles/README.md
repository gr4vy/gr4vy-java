# Roles

## Overview

### Available Operations

* [list](#list) - List all roles

## list

List all roles available in the instance.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_roles" method="get" path="/roles" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListRolesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();


        sdk.roles().list()
                .limit(20L)
                .callAsStream()
                .forEach((ListRolesResponse item) -> {
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

**[ListRolesResponse](../../models/operations/ListRolesResponse.md)**

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