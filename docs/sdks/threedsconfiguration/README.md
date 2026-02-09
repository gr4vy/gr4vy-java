# MerchantAccounts.ThreeDsConfiguration

## Overview

### Available Operations

* [create](#create) - Create 3DS configuration for merchant
* [list](#list) - List 3DS configurations for merchant
* [update](#update) - Edit 3DS configuration
* [delete](#delete) - Delete 3DS configuration for a merchant

## create

Create a new 3DS configuration for a merchant account.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_three_ds_configuration" method="post" path="/merchant-accounts/{merchant_account_id}/three-ds-configurations" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CardScheme;
import com.gr4vy.sdk.models.components.MerchantAccountThreeDSConfigurationCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateThreeDsConfigurationResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreateThreeDsConfigurationResponse res = sdk.merchantAccounts().threeDsConfiguration().create()
                .merchantAccountId("merchant-12345")
                .merchantAccountThreeDSConfigurationCreate(MerchantAccountThreeDSConfigurationCreate.builder()
                    .merchantAcquirerBin("516327")
                    .merchantAcquirerId("123456789012345")
                    .merchantName("Acme Inc.")
                    .merchantCountryCode("840")
                    .merchantCategoryCode("1234")
                    .merchantUrl("https://example.com")
                    .scheme(CardScheme.VISA)
                    .metadata(Map.ofEntries(
                        Map.entry("key", "<value>"),
                        Map.entry("key1", "<value>"),
                        Map.entry("key2", "<value>")))
                    .build())
                .call();

        if (res.merchantAccountThreeDSConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       | Example                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `merchantAccountId`                                                                                               | *String*                                                                                                          | :heavy_check_mark:                                                                                                | The ID of the merchant account.                                                                                   | merchant-12345                                                                                                    |
| `merchantAccountThreeDSConfigurationCreate`                                                                       | [MerchantAccountThreeDSConfigurationCreate](../../models/components/MerchantAccountThreeDSConfigurationCreate.md) | :heavy_check_mark:                                                                                                | N/A                                                                                                               |                                                                                                                   |

### Response

**[CreateThreeDsConfigurationResponse](../../models/operations/CreateThreeDsConfigurationResponse.md)**

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

List all 3DS configurations for a merchant account.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_three_ds_configurations" method="get" path="/merchant-accounts/{merchant_account_id}/three-ds-configurations" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListThreeDsConfigurationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListThreeDsConfigurationsResponse res = sdk.merchantAccounts().threeDsConfiguration().list()
                .merchantAccountId("merchant-12345")
                .call();

        if (res.merchantAccountThreeDSConfigurations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `merchantAccountId`                                                 | *String*                                                            | :heavy_check_mark:                                                  | The ID of the merchant account.                                     | merchant-12345                                                      |
| `currency`                                                          | *JsonNullable\<String>*                                             | :heavy_minus_sign:                                                  | ISO 4217 currency code (3 characters) to filter 3DS configurations. | **Example 1:** USD<br/>**Example 2:** EUR<br/>**Example 3:** GBP    |

### Response

**[ListThreeDsConfigurationsResponse](../../models/operations/ListThreeDsConfigurationsResponse.md)**

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

Update the 3DS configuration for a merchant account.

### Example Usage

<!-- UsageSnippet language="java" operationID="edit_three_ds_configuration" method="put" path="/merchant-accounts/{merchant_account_id}/three-ds-configurations/{three_ds_configuration_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.MerchantAccountThreeDSConfigurationUpdate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.EditThreeDsConfigurationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        EditThreeDsConfigurationResponse res = sdk.merchantAccounts().threeDsConfiguration().update()
                .merchantAccountId("merchant-12345")
                .threeDsConfigurationId("1808f5e6-b49c-4db9-94fa-22371ea352f5")
                .merchantAccountThreeDSConfigurationUpdate(MerchantAccountThreeDSConfigurationUpdate.builder()
                    .build())
                .call();

        if (res.merchantAccountThreeDSConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       | Example                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `merchantAccountId`                                                                                               | *String*                                                                                                          | :heavy_check_mark:                                                                                                | The ID of the merchant account.                                                                                   | merchant-12345                                                                                                    |
| `threeDsConfigurationId`                                                                                          | *String*                                                                                                          | :heavy_check_mark:                                                                                                | The ID of the 3DS configuration for a merchant account.                                                           | 1808f5e6-b49c-4db9-94fa-22371ea352f5                                                                              |
| `merchantAccountThreeDSConfigurationUpdate`                                                                       | [MerchantAccountThreeDSConfigurationUpdate](../../models/components/MerchantAccountThreeDSConfigurationUpdate.md) | :heavy_check_mark:                                                                                                | N/A                                                                                                               |                                                                                                                   |

### Response

**[EditThreeDsConfigurationResponse](../../models/operations/EditThreeDsConfigurationResponse.md)**

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

Delete a 3DS configuration for a merchant account.

### Example Usage

<!-- UsageSnippet language="java" operationID="delete_three_ds_configuration" method="delete" path="/merchant-accounts/{merchant_account_id}/three-ds-configurations/{three_ds_configuration_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.DeleteThreeDsConfigurationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        DeleteThreeDsConfigurationResponse res = sdk.merchantAccounts().threeDsConfiguration().delete()
                .merchantAccountId("merchant-12345")
                .threeDsConfigurationId("1808f5e6-b49c-4db9-94fa-22371ea352f5")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `merchantAccountId`                                     | *String*                                                | :heavy_check_mark:                                      | The ID of the merchant account.                         | merchant-12345                                          |
| `threeDsConfigurationId`                                | *String*                                                | :heavy_check_mark:                                      | The ID of the 3DS configuration for a merchant account. | 1808f5e6-b49c-4db9-94fa-22371ea352f5                    |

### Response

**[DeleteThreeDsConfigurationResponse](../../models/operations/DeleteThreeDsConfigurationResponse.md)**

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