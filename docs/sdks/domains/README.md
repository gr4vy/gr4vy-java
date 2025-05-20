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

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.DigitalWalletDomain;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.RegisterDigitalWalletDomainResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        RegisterDigitalWalletDomainResponse res = sdk.digitalWallets().domains().create()
                .digitalWalletId("1808f5e6-b49c-4db9-94fa-22371ea352f5")
                .xGr4vyMerchantAccountId("default")
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
| `timeoutInSeconds`                                                    | *Optional\<Double>*                                                   | :heavy_minus_sign:                                                    | N/A                                                                   |                                                                       |
| `xGr4vyMerchantAccountId`                                             | *JsonNullable\<String>*                                               | :heavy_minus_sign:                                                    | The ID of the merchant account to use for this request.               | default                                                               |
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

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.DigitalWalletDomain;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.UnregisterDigitalWalletDomainResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        UnregisterDigitalWalletDomainResponse res = sdk.digitalWallets().domains().delete()
                .digitalWalletId("")
                .xGr4vyMerchantAccountId("default")
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
| `timeoutInSeconds`                                                    | *Optional\<Double>*                                                   | :heavy_minus_sign:                                                    | N/A                                                                   |                                                                       |
| `xGr4vyMerchantAccountId`                                             | *JsonNullable\<String>*                                               | :heavy_minus_sign:                                                    | The ID of the merchant account to use for this request.               | default                                                               |
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