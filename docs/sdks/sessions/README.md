# DigitalWallets.Sessions

## Overview

### Available Operations

* [googlePay](#googlepay) - Create a Google Pay session
* [applePay](#applepay) - Create a Apple Pay session
* [paze](#paze) - Create a Paze session
* [clickToPay](#clicktopay) - Create a Click to Pay session

## googlePay

Create a session for use with Google Pay.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_google_pay_digital_wallet_session" method="post" path="/digital-wallets/google/session" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.GooglePaySessionRequest;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateGooglePayDigitalWalletSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreateGooglePayDigitalWalletSessionResponse res = sdk.digitalWallets().sessions().googlePay()
                .googlePaySessionRequest(GooglePaySessionRequest.builder()
                    .originDomain("example.com")
                    .build())
                .call();

        if (res.googlePaySession().isPresent()) {
            System.out.println(res.googlePaySession().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `merchantAccountId`                                                           | *JsonNullable\<String>*                                                       | :heavy_minus_sign:                                                            | The ID of the merchant account to use for this request.                       |
| `googlePaySessionRequest`                                                     | [GooglePaySessionRequest](../../models/components/GooglePaySessionRequest.md) | :heavy_check_mark:                                                            | N/A                                                                           |

### Response

**[CreateGooglePayDigitalWalletSessionResponse](../../models/operations/CreateGooglePayDigitalWalletSessionResponse.md)**

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

## applePay

Create a session for use with Apple Pay.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_apple_pay_digital_wallet_session" method="post" path="/digital-wallets/apple/session" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.ApplePaySessionRequest;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateApplePayDigitalWalletSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreateApplePayDigitalWalletSessionResponse res = sdk.digitalWallets().sessions().applePay()
                .applePaySessionRequest(ApplePaySessionRequest.builder()
                    .validationUrl("https://apple-pay-gateway-cert.apple.com")
                    .domainName("example.com")
                    .build())
                .call();

        if (res.applePaySession().isPresent()) {
            System.out.println(res.applePaySession().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `merchantAccountId`                                                         | *JsonNullable\<String>*                                                     | :heavy_minus_sign:                                                          | The ID of the merchant account to use for this request.                     |
| `applePaySessionRequest`                                                    | [ApplePaySessionRequest](../../models/components/ApplePaySessionRequest.md) | :heavy_check_mark:                                                          | N/A                                                                         |

### Response

**[CreateApplePayDigitalWalletSessionResponse](../../models/operations/CreateApplePayDigitalWalletSessionResponse.md)**

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

## paze

Create a session for use with Paze.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_paze_digital_wallet_session" method="post" path="/digital-wallets/paze/session" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.*;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreatePazeDigitalWalletSessionResponse;
import com.gr4vy.sdk.models.operations.ResponseCreatePazeDigitalWalletSession;
import java.lang.Exception;
import java.lang.Object;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreatePazeDigitalWalletSessionResponse res = sdk.digitalWallets().sessions().paze()
                .pazeSessionRequest(PazeSessionRequest.builder()
                    .build())
                .call();

        if (res.responseCreatePazeDigitalWalletSession().isPresent()) {
            ResponseCreatePazeDigitalWalletSession unionValue = res.responseCreatePazeDigitalWalletSession().get();
            Object raw = unionValue.value();
            if (raw instanceof PazeWebSession) {
                PazeWebSession pazeWebSessionValue = (PazeWebSession) raw;
                // Handle pazeWebSession variant
            } else if (raw instanceof PazeMobileSession) {
                PazeMobileSession pazeMobileSessionValue = (PazeMobileSession) raw;
                // Handle pazeMobileSession variant
            } else {
                // Unknown or unsupported variant
            }
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `merchantAccountId`                                                 | *JsonNullable\<String>*                                             | :heavy_minus_sign:                                                  | The ID of the merchant account to use for this request.             |
| `pazeSessionRequest`                                                | [PazeSessionRequest](../../models/components/PazeSessionRequest.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[CreatePazeDigitalWalletSessionResponse](../../models/operations/CreatePazeDigitalWalletSessionResponse.md)**

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

## clickToPay

Create a session for use with Click to Pay.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_click_to_pay_digital_wallet_session" method="post" path="/digital-wallets/click-to-pay/session" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.ClickToPaySessionRequest;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateClickToPayDigitalWalletSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ClickToPaySessionRequest req = ClickToPaySessionRequest.builder()
                .checkoutSessionId("4137b1cf-39ac-42a8-bad6-1c680d5dab6b")
                .build();

        CreateClickToPayDigitalWalletSessionResponse res = sdk.digitalWallets().sessions().clickToPay()
                .request(req)
                .call();

        if (res.clickToPaySession().isPresent()) {
            System.out.println(res.clickToPaySession().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ClickToPaySessionRequest](../../models/shared/ClickToPaySessionRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateClickToPayDigitalWalletSessionResponse](../../models/operations/CreateClickToPayDigitalWalletSessionResponse.md)**

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