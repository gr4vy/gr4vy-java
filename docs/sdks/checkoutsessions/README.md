# CheckoutSessions
(*checkoutSessions()*)

## Overview

### Available Operations

* [create](#create) - Create checkout session
* [update](#update) - Update checkout session
* [get](#get) - Get checkout session
* [delete](#delete) - Delete checkout session

## create

Create a new checkout session.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateCheckoutSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateCheckoutSessionResponse res = sdk.checkoutSessions().create()
                .call();

        if (res.checkoutSession().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `merchantAccountId`                                                                  | *JsonNullable\<String>*                                                              | :heavy_minus_sign:                                                                   | The ID of the merchant account to use for this request.                              |
| `checkoutSessionCreate`                                                              | [Optional\<CheckoutSessionCreate>](../../models/components/CheckoutSessionCreate.md) | :heavy_minus_sign:                                                                   | N/A                                                                                  |

### Response

**[CreateCheckoutSessionResponse](../../models/operations/CreateCheckoutSessionResponse.md)**

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

Update the information stored on a checkout session.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CheckoutSessionCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UpdateCheckoutSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UpdateCheckoutSessionResponse res = sdk.checkoutSessions().update()
                .sessionId("4137b1cf-39ac-42a8-bad6-1c680d5dab6b")
                .checkoutSessionCreate(CheckoutSessionCreate.builder()
                    .build())
                .call();

        if (res.checkoutSession().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `sessionId`                                                               | *String*                                                                  | :heavy_check_mark:                                                        | The ID of the checkout session.                                           | 4137b1cf-39ac-42a8-bad6-1c680d5dab6b                                      |
| `merchantAccountId`                                                       | *JsonNullable\<String>*                                                   | :heavy_minus_sign:                                                        | The ID of the merchant account to use for this request.                   |                                                                           |
| `checkoutSessionCreate`                                                   | [CheckoutSessionCreate](../../models/components/CheckoutSessionCreate.md) | :heavy_check_mark:                                                        | N/A                                                                       |                                                                           |

### Response

**[UpdateCheckoutSessionResponse](../../models/operations/UpdateCheckoutSessionResponse.md)**

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

Retrieve the information stored on a checkout session.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetCheckoutSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetCheckoutSessionResponse res = sdk.checkoutSessions().get()
                .sessionId("4137b1cf-39ac-42a8-bad6-1c680d5dab6b")
                .call();

        if (res.checkoutSession().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `sessionId`                                             | *String*                                                | :heavy_check_mark:                                      | The ID of the checkout session.                         | 4137b1cf-39ac-42a8-bad6-1c680d5dab6b                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetCheckoutSessionResponse](../../models/operations/GetCheckoutSessionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/Error400     | 400                        | application/json           |
| models/errors/Error401     | 401                        | application/json           |
| models/errors/Error403     | 403                        | application/json           |
| models/errors/Error404     | 404                        | application/json           |
| models/errors/Error405     | 405                        | application/json           |
| models/errors/Error409     | 409                        | application/json           |
| models/errors/Error425     | 425                        | application/json           |
| models/errors/Error429     | 429                        | application/json           |
| models/errors/Error500     | 500                        | application/json           |
| models/errors/Error502     | 502                        | application/json           |
| models/errors/Error504     | 504                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## delete

Deleta a checkout session and all of its (PCI) data.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.DeleteCheckoutSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        DeleteCheckoutSessionResponse res = sdk.checkoutSessions().delete()
                .sessionId("4137b1cf-39ac-42a8-bad6-1c680d5dab6b")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `sessionId`                                             | *String*                                                | :heavy_check_mark:                                      | The ID of the checkout session.                         | 4137b1cf-39ac-42a8-bad6-1c680d5dab6b                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[DeleteCheckoutSessionResponse](../../models/operations/DeleteCheckoutSessionResponse.md)**

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