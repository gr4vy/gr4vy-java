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

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        sdk.merchantAccounts().list()
                .cursor("ZXhhbXBsZTE")
                .search("merchant-12345")
                .callAsStream()
                .forEach(item -> {
                   // handle item
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
| `applicationName`                                 | *Optional\<String>*                               | :heavy_minus_sign:                                | N/A                                               |                                                   |

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

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CardScheme;
import com.gr4vy.sdk.models.components.MerchantAccountCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateMerchantAccountResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateMerchantAccountResponse res = sdk.merchantAccounts().create()
                .merchantAccountCreate(MerchantAccountCreate.builder()
                    .id("merchant-12345")
                    .displayName("Example")
                    .accountUpdaterRequestEncryptionKey("key-1234")
                    .accountUpdaterRequestEncryptionKeyId("key-id-1234")
                    .accountUpdaterResponseDecryptionKey("key-1234")
                    .accountUpdaterResponseDecryptionKeyId("key-id-1234")
                    .overCaptureAmount(1299L)
                    .overCapturePercentage(25L)
                    .loonClientKey("client-key-1234")
                    .loonSecretKey("key-12345")
                    .loonAcceptedSchemes(List.of(
                        CardScheme.VISA))
                    .visaNetworkTokensRequestorId("id-12345")
                    .visaNetworkTokensAppId("id-12345")
                    .amexNetworkTokensRequestorId("id-12345")
                    .amexNetworkTokensAppId("id-12345")
                    .mastercardNetworkTokensRequestorId("id-12345")
                    .mastercardNetworkTokensAppId("id-12345")
                    .outboundWebhookUrl("https://example.com/callback")
                    .outboundWebhookUsername("user-12345")
                    .outboundWebhookPassword("password-12345")
                    .build())
                .call();

        if (res.merchantAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `applicationName`                                                         | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | N/A                                                                       |
| `merchantAccountCreate`                                                   | [MerchantAccountCreate](../../models/components/MerchantAccountCreate.md) | :heavy_check_mark:                                                        | N/A                                                                       |

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

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetMerchantAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
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
| `applicationName`              | *Optional\<String>*            | :heavy_minus_sign:             | N/A                            |                                |

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

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CardScheme;
import com.gr4vy.sdk.models.components.MerchantAccountUpdate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UpdateMerchantAccountResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UpdateMerchantAccountResponse res = sdk.merchantAccounts().update()
                .merchantAccountId("merchant-12345")
                .merchantAccountUpdate(MerchantAccountUpdate.builder()
                    .accountUpdaterRequestEncryptionKey("key-1234")
                    .accountUpdaterRequestEncryptionKeyId("key-id-1234")
                    .accountUpdaterResponseDecryptionKey("key-1234")
                    .accountUpdaterResponseDecryptionKeyId("key-id-1234")
                    .overCaptureAmount(1299L)
                    .overCapturePercentage(25L)
                    .loonClientKey("client-key-1234")
                    .loonSecretKey("key-12345")
                    .loonAcceptedSchemes(List.of(
                        CardScheme.VISA))
                    .visaNetworkTokensRequestorId("id-12345")
                    .visaNetworkTokensAppId("id-12345")
                    .amexNetworkTokensRequestorId("id-12345")
                    .amexNetworkTokensAppId("id-12345")
                    .mastercardNetworkTokensRequestorId("id-12345")
                    .mastercardNetworkTokensAppId("id-12345")
                    .displayName("Example")
                    .outboundWebhookUrl("https://example.com/callback")
                    .outboundWebhookUsername("user-12345")
                    .outboundWebhookPassword("password-12345")
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
| `applicationName`                                                         | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | N/A                                                                       |                                                                           |
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