# MerchantAccounts
(*merchantAccounts()*)

## Overview

### Available Operations

* [list](#list) - List all merchant accounts
* [create](#create) - Create a merchant account
* [get](#get) - Get a merchant account
* [update](#update) - Update a merchant account

## list

List all merchant accounts in an instance.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_merchant_accounts" method="get" path="/merchant-accounts" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListMerchantAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();


        sdk.merchantAccounts().list()
                .cursor("ZXhhbXBsZTE")
                .limit(20L)
                .search("merchant-12345")
                .callAsStream()
                .forEach((ListMerchantAccountsResponse item) -> {
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
| `search`                                          | *JsonNullable\<String>*                           | :heavy_minus_sign:                                | The search term to filter merchant accounts by.   | merchant-12345                                    |

### Response

**[ListMerchantAccountsResponse](../../models/operations/ListMerchantAccountsResponse.md)**

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

Create a new merchant account in an instance.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_merchant_account" method="post" path="/merchant-accounts" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.MerchantAccountCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateMerchantAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        MerchantAccountCreate req = MerchantAccountCreate.builder()
                .id("merchant-12345")
                .displayName("Example")
                .accountUpdaterEnabled(true)
                .build();

        CreateMerchantAccountResponse res = sdk.merchantAccounts().create()
                .request(req)
                .call();

        if (res.merchantAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [MerchantAccountCreate](../../models/shared/MerchantAccountCreate.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateMerchantAccountResponse](../../models/operations/CreateMerchantAccountResponse.md)**

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

Get info about a merchant account in an instance.

### Example Usage

<!-- UsageSnippet language="java" operationID="get_merchant_account" method="get" path="/merchant-accounts/{merchant_account_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetMerchantAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        GetMerchantAccountResponse res = sdk.merchantAccounts().get()
                .merchantAccountId("merchant-12345")
                .call();

        if (res.merchantAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    | Example                        |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `merchantAccountId`            | *String*                       | :heavy_check_mark:             | The ID of the merchant account | merchant-12345                 |

### Response

**[GetMerchantAccountResponse](../../models/operations/GetMerchantAccountResponse.md)**

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

Update info for a merchant account in an instance.

### Example Usage

<!-- UsageSnippet language="java" operationID="update_merchant_account" method="put" path="/merchant-accounts/{merchant_account_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.MerchantAccountUpdate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UpdateMerchantAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        UpdateMerchantAccountResponse res = sdk.merchantAccounts().update()
                .merchantAccountId("merchant-12345")
                .merchantAccountUpdate(MerchantAccountUpdate.builder()
                    .accountUpdaterEnabled(true)
                    .build())
                .call();

        if (res.merchantAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `merchantAccountId`                                                       | *String*                                                                  | :heavy_check_mark:                                                        | The ID of the merchant account                                            | merchant-12345                                                            |
| `merchantAccountUpdate`                                                   | [MerchantAccountUpdate](../../models/components/MerchantAccountUpdate.md) | :heavy_check_mark:                                                        | N/A                                                                       |                                                                           |

### Response

**[UpdateMerchantAccountResponse](../../models/operations/UpdateMerchantAccountResponse.md)**

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