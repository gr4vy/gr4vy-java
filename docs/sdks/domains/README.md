# Domains
(*digitalWallets().domains()*)

## Overview

### Available Operations

* [create](#create) - Register a digital wallet domain
* [delete](#delete) - Remove a digital wallet domain

## create

Register a digital wallet domain (Apple Pay only).

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.DigitalWalletDomain;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.RegisterDigitalWalletDomainResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        RegisterDigitalWalletDomainResponse res = sdk.digitalWallets().domains().create()
                .digitalWalletId("1808f5e6-b49c-4db9-94fa-22371ea352f5")
                .digitalWalletDomain(DigitalWalletDomain.builder()
                    .domainName("example.com")
                    .build())
                .call();

        if (res.any().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `digitalWalletId`                                                     | *String*                                                              | :heavy_check_mark:                                                    | The ID of the digital wallet to remove a domain for.                  | 1808f5e6-b49c-4db9-94fa-22371ea352f5                                  |
| `applicationName`                                                     | *Optional\<String>*                                                   | :heavy_minus_sign:                                                    | N/A                                                                   |                                                                       |
| `merchantAccountId`                                                   | *JsonNullable\<String>*                                               | :heavy_minus_sign:                                                    | The ID of the merchant account to use for this request.               |                                                                       |
| `digitalWalletDomain`                                                 | [DigitalWalletDomain](../../models/components/DigitalWalletDomain.md) | :heavy_check_mark:                                                    | N/A                                                                   |                                                                       |

### Response

**[RegisterDigitalWalletDomainResponse](../../models/operations/RegisterDigitalWalletDomainResponse.md)**

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

Remove a digital wallet domain (Apple Pay only).

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.DigitalWalletDomain;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UnregisterDigitalWalletDomainResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UnregisterDigitalWalletDomainResponse res = sdk.digitalWallets().domains().delete()
                .digitalWalletId("")
                .digitalWalletDomain(DigitalWalletDomain.builder()
                    .domainName("example.com")
                    .build())
                .call();

        if (res.any().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           | Example                                                               |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `digitalWalletId`                                                     | *String*                                                              | :heavy_check_mark:                                                    | N/A                                                                   |                                                                       |
| `applicationName`                                                     | *Optional\<String>*                                                   | :heavy_minus_sign:                                                    | N/A                                                                   |                                                                       |
| `merchantAccountId`                                                   | *JsonNullable\<String>*                                               | :heavy_minus_sign:                                                    | The ID of the merchant account to use for this request.               |                                                                       |
| `digitalWalletDomain`                                                 | [DigitalWalletDomain](../../models/components/DigitalWalletDomain.md) | :heavy_check_mark:                                                    | N/A                                                                   |                                                                       |

### Response

**[UnregisterDigitalWalletDomainResponse](../../models/operations/UnregisterDigitalWalletDomainResponse.md)**

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