# ShippingDetails
(*buyers().shippingDetails()*)

## Overview

### Available Operations

* [create](#create) - Add buyer shipping details
* [list](#list) - List a buyer's shipping details
* [get](#get) - Get buyer shipping details
* [update](#update) - Update a buyer's shipping details
* [delete](#delete) - Delete a buyer's shipping details

## create

Associate shipping details to a buyer.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.ShippingDetailsCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.AddBuyerShippingDetailsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AddBuyerShippingDetailsResponse res = sdk.buyers().shippingDetails().create()
                .buyerId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .shippingDetailsCreate(ShippingDetailsCreate.builder()
                    .build())
                .call();

        if (res.shippingDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `buyerId`                                                                 | *String*                                                                  | :heavy_check_mark:                                                        | The ID of the buyer to add shipping details to.                           | fe26475d-ec3e-4884-9553-f7356683f7f9                                      |
| `merchantAccountId`                                                       | *JsonNullable\<String>*                                                   | :heavy_minus_sign:                                                        | The ID of the merchant account to use for this request.                   |                                                                           |
| `shippingDetailsCreate`                                                   | [ShippingDetailsCreate](../../models/components/ShippingDetailsCreate.md) | :heavy_check_mark:                                                        | N/A                                                                       |                                                                           |

### Response

**[AddBuyerShippingDetailsResponse](../../models/operations/AddBuyerShippingDetailsResponse.md)**

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

List all the shipping details associated to a specific buyer.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListBuyerShippingDetailsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListBuyerShippingDetailsResponse res = sdk.buyers().shippingDetails().list()
                .buyerId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .call();

        if (res.shippingDetailsList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `buyerId`                                               | *String*                                                | :heavy_check_mark:                                      | The ID of the buyer to retrieve shipping details for.   | fe26475d-ec3e-4884-9553-f7356683f7f9                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[ListBuyerShippingDetailsResponse](../../models/operations/ListBuyerShippingDetailsResponse.md)**

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

Get a buyer's shipping details.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetBuyerShippingDetailsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetBuyerShippingDetailsResponse res = sdk.buyers().shippingDetails().get()
                .buyerId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .shippingDetailsId("bf8c36ad-02d9-4904-b0f9-a230b149e341")
                .call();

        if (res.shippingDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `buyerId`                                               | *String*                                                | :heavy_check_mark:                                      | The ID of the buyer to retrieve shipping details for.   | fe26475d-ec3e-4884-9553-f7356683f7f9                    |
| `shippingDetailsId`                                     | *String*                                                | :heavy_check_mark:                                      | The ID of the shipping details to retrieve.             | bf8c36ad-02d9-4904-b0f9-a230b149e341                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetBuyerShippingDetailsResponse](../../models/operations/GetBuyerShippingDetailsResponse.md)**

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

Update the shipping details associated to a specific buyer.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.ShippingDetailsUpdate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UpdateBuyerShippingDetailsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UpdateBuyerShippingDetailsResponse res = sdk.buyers().shippingDetails().update()
                .buyerId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .shippingDetailsId("bf8c36ad-02d9-4904-b0f9-a230b149e341")
                .shippingDetailsUpdate(ShippingDetailsUpdate.builder()
                    .build())
                .call();

        if (res.shippingDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `buyerId`                                                                 | *String*                                                                  | :heavy_check_mark:                                                        | The ID of the buyer to update shipping details for.                       | fe26475d-ec3e-4884-9553-f7356683f7f9                                      |
| `shippingDetailsId`                                                       | *String*                                                                  | :heavy_check_mark:                                                        | The ID of the shipping details to update.                                 | bf8c36ad-02d9-4904-b0f9-a230b149e341                                      |
| `merchantAccountId`                                                       | *JsonNullable\<String>*                                                   | :heavy_minus_sign:                                                        | The ID of the merchant account to use for this request.                   |                                                                           |
| `shippingDetailsUpdate`                                                   | [ShippingDetailsUpdate](../../models/components/ShippingDetailsUpdate.md) | :heavy_check_mark:                                                        | N/A                                                                       |                                                                           |

### Response

**[UpdateBuyerShippingDetailsResponse](../../models/operations/UpdateBuyerShippingDetailsResponse.md)**

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

Delete the shipping details associated to a specific buyer.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.DeleteBuyerShippingDetailsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        DeleteBuyerShippingDetailsResponse res = sdk.buyers().shippingDetails().delete()
                .buyerId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                .shippingDetailsId("bf8c36ad-02d9-4904-b0f9-a230b149e341")
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
| `buyerId`                                               | *String*                                                | :heavy_check_mark:                                      | The ID of the buyer to delete shipping details for.     | fe26475d-ec3e-4884-9553-f7356683f7f9                    |
| `shippingDetailsId`                                     | *String*                                                | :heavy_check_mark:                                      | The ID of the shipping details to delete.               | bf8c36ad-02d9-4904-b0f9-a230b149e341                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[DeleteBuyerShippingDetailsResponse](../../models/operations/DeleteBuyerShippingDetailsResponse.md)**

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