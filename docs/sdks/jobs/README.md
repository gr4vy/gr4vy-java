# Jobs
(*accountUpdater().jobs()*)

## Overview

### Available Operations

* [create](#create) - Create account updater job

## create

Schedule one or more stored cards for an account update.

### Example Usage

```java
package hello.world;

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.AccountUpdaterJobCreate;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.CreateAccountUpdaterJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .oAuth2PasswordBearer("<YOUR_O_AUTH2_PASSWORD_BEARER_HERE>")
            .build();

        CreateAccountUpdaterJobResponse res = sdk.accountUpdater().jobs().create()
                .xGr4vyMerchantAccountId("default")
                .accountUpdaterJobCreate(AccountUpdaterJobCreate.builder()
                    .paymentMethodIds(List.of(
                        "ef9496d8-53a5-4aad-8ca2-00eb68334389",
                        "f29e886e-93cc-4714-b4a3-12b7a718e595"))
                    .build())
                .call();

        if (res.accountUpdaterJob().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `timeoutInSeconds`                                                            | *Optional\<Double>*                                                           | :heavy_minus_sign:                                                            | N/A                                                                           |                                                                               |
| `xGr4vyMerchantAccountId`                                                     | *JsonNullable\<String>*                                                       | :heavy_minus_sign:                                                            | The ID of the merchant account to use for this request.                       | default                                                                       |
| `accountUpdaterJobCreate`                                                     | [AccountUpdaterJobCreate](../../models/components/AccountUpdaterJobCreate.md) | :heavy_check_mark:                                                            | N/A                                                                           |                                                                               |

### Response

**[CreateAccountUpdaterJobResponse](../../models/operations/CreateAccountUpdaterJobResponse.md)**

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