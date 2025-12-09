# PaymentLinks

## Overview

### Available Operations

* [create](#create) - Add a payment link
* [list](#list) - List all payment links
* [expire](#expire) - Expire a payment link
* [get](#get) - Get payment link

## create

Create a new payment link.

### Example Usage

<!-- UsageSnippet language="java" operationID="add_payment_link" method="post" path="/payment-links" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.PaymentLinkCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.AddPaymentLinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        AddPaymentLinkResponse res = sdk.paymentLinks().create()
                .paymentLinkCreate(PaymentLinkCreate.builder()
                    .amount(1299L)
                    .country("DE")
                    .currency("EUR")
                    .store(true)
                    .build())
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `merchantAccountId`                                               | *JsonNullable\<String>*                                           | :heavy_minus_sign:                                                | The ID of the merchant account to use for this request.           |
| `paymentLinkCreate`                                               | [PaymentLinkCreate](../../models/components/PaymentLinkCreate.md) | :heavy_check_mark:                                                | N/A                                                               |

### Response

**[AddPaymentLinkResponse](../../models/operations/AddPaymentLinkResponse.md)**

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

List all created payment links.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_payment_links" method="get" path="/payment-links" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListPaymentLinksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();


        sdk.paymentLinks().list()
                .limit(20L)
                .callAsStream()
                .forEach((ListPaymentLinksResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `cursor`                                                                                                                        | *JsonNullable\<String>*                                                                                                         | :heavy_minus_sign:                                                                                                              | A pointer to the page of results to return.                                                                                     | ZXhhbXBsZTE                                                                                                                     |
| `limit`                                                                                                                         | *Optional\<Long>*                                                                                                               | :heavy_minus_sign:                                                                                                              | The maximum number of items that are returned.                                                                                  | 20                                                                                                                              |
| `buyerSearch`                                                                                                                   | List\<*String*>                                                                                                                 | :heavy_minus_sign:                                                                                                              | Filters the results to only get the items for which some of the buyer data contains exactly the provided `buyer_search` values. | [<br/>"John",<br/>"London"<br/>]                                                                                                |
| `merchantAccountId`                                                                                                             | *JsonNullable\<String>*                                                                                                         | :heavy_minus_sign:                                                                                                              | The ID of the merchant account to use for this request.                                                                         |                                                                                                                                 |

### Response

**[ListPaymentLinksResponse](../../models/operations/ListPaymentLinksResponse.md)**

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

## expire

Expire an existing payment link.

### Example Usage

<!-- UsageSnippet language="java" operationID="expire_payment_link" method="post" path="/payment-links/{payment_link_id}/expire" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ExpirePaymentLinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ExpirePaymentLinkResponse res = sdk.paymentLinks().expire()
                .paymentLinkId("a1b2c3d4-5678-90ab-cdef-1234567890ab")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `paymentLinkId`                                         | *String*                                                | :heavy_check_mark:                                      | The unique identifier for the payment link.             | a1b2c3d4-5678-90ab-cdef-1234567890ab                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[ExpirePaymentLinkResponse](../../models/operations/ExpirePaymentLinkResponse.md)**

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

Fetch the details for a payment link.

### Example Usage

<!-- UsageSnippet language="java" operationID="get_payment_link" method="get" path="/payment-links/{payment_link_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetPaymentLinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        GetPaymentLinkResponse res = sdk.paymentLinks().get()
                .paymentLinkId("a1b2c3d4-5678-90ab-cdef-1234567890ab")
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `paymentLinkId`                                         | *String*                                                | :heavy_check_mark:                                      | The unique identifier for the payment link.             | a1b2c3d4-5678-90ab-cdef-1234567890ab                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetPaymentLinkResponse](../../models/operations/GetPaymentLinkResponse.md)**

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