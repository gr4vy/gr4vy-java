# DigitalWallets
(*digitalWallets()*)

## Overview

### Available Operations

* [create](#create) - Register digital wallet
* [list](#list) - List digital wallets
* [get](#get) - Get digital wallet
* [delete](#delete) - Delete digital wallet
* [update](#update) - Update digital wallet

## create

Register a digital wallet like Apple Pay, Google Pay, or Click to Pay.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.DigitalWalletCreate;
import com.github.gr4vy.gr4vy_java.models.components.DigitalWalletProvider;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.ConfigureDigitalWalletResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ConfigureDigitalWalletResponse res = sdk.digitalWallets().create()
                .digitalWalletCreate(DigitalWalletCreate.builder()
                    .provider(DigitalWalletProvider.CLICK_TO_PAY)
                    .merchantName("<value>")
                    .acceptTermsAndConditions(false)
                    .merchantCountryCode("DE")
                    .build())
                .call();

        if (res.digitalWallet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `timeoutInSeconds`                                                    | *Optional\<Double>*                                                   | :heavy_minus_sign:                                                    | N/A                                                                   |
| `merchantAccountId`                                                   | *JsonNullable\<String>*                                               | :heavy_minus_sign:                                                    | The ID of the merchant account to use for this request.               |
| `digitalWalletCreate`                                                 | [DigitalWalletCreate](../../models/components/DigitalWalletCreate.md) | :heavy_check_mark:                                                    | N/A                                                                   |

### Response

**[ConfigureDigitalWalletResponse](../../models/operations/ConfigureDigitalWalletResponse.md)**

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

List configured digital wallets.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.ListDigitalWalletsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListDigitalWalletsResponse res = sdk.digitalWallets().list()
                .call();

        if (res.collectionNoCursorDigitalWallet().isPresent()) {
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

**[ListDigitalWalletsResponse](../../models/operations/ListDigitalWalletsResponse.md)**

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

Fetch the details a digital wallet.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.GetDigitalWalletResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetDigitalWalletResponse res = sdk.digitalWallets().get()
                .digitalWalletId("1808f5e6-b49c-4db9-94fa-22371ea352f5")
                .call();

        if (res.digitalWallet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `digitalWalletId`                                       | *String*                                                | :heavy_check_mark:                                      | The ID of the digital wallet to read.                   | 1808f5e6-b49c-4db9-94fa-22371ea352f5                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetDigitalWalletResponse](../../models/operations/GetDigitalWalletResponse.md)**

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

Delete a configured digital wallet.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.DeleteDigitalWalletResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        DeleteDigitalWalletResponse res = sdk.digitalWallets().delete()
                .digitalWalletId("1808f5e6-b49c-4db9-94fa-22371ea352f5")
                .call();

        if (res.any().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `digitalWalletId`                                       | *String*                                                | :heavy_check_mark:                                      | The ID of the digital wallet to delete.                 | 1808f5e6-b49c-4db9-94fa-22371ea352f5                    |
| `timeoutInSeconds`                                      | *Optional\<Double>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[DeleteDigitalWalletResponse](../../models/operations/DeleteDigitalWalletResponse.md)**

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

Update a digital wallet.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.DigitalWalletUpdate;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.UpdateDigitalWalletResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UpdateDigitalWalletResponse res = sdk.digitalWallets().update()
                .digitalWalletId("1808f5e6-b49c-4db9-94fa-22371ea352f5")
                .digitalWalletUpdate(DigitalWalletUpdate.builder()
                    .merchantCountryCode("DE")
                    .build())
                .call();

        if (res.digitalWallet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `digitalWalletId`                                                     | *String*                                                              | :heavy_check_mark:                                                    | The ID of the digital wallet to edit.                                 | 1808f5e6-b49c-4db9-94fa-22371ea352f5                                  |
| `timeoutInSeconds`                                                    | *Optional\<Double>*                                                   | :heavy_minus_sign:                                                    | N/A                                                                   |                                                                       |
| `merchantAccountId`                                                   | *JsonNullable\<String>*                                               | :heavy_minus_sign:                                                    | The ID of the merchant account to use for this request.               |                                                                       |
| `digitalWalletUpdate`                                                 | [DigitalWalletUpdate](../../models/components/DigitalWalletUpdate.md) | :heavy_check_mark:                                                    | N/A                                                                   |                                                                       |

### Response

**[UpdateDigitalWalletResponse](../../models/operations/UpdateDigitalWalletResponse.md)**

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