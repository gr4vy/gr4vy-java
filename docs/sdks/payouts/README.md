# Payouts
(*payouts()*)

## Overview

### Available Operations

* [list](#list) - List payouts created.
* [create](#create) - Create a payout.
* [get](#get) - Get a payout.

## list

Returns a list of payouts made.

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

        sdk.payouts().list()
                .cursor("ZXhhbXBsZTE")
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `cursor`                                                | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | A pointer to the page of results to return.             | ZXhhbXBsZTE                                             |
| `limit`                                                 | *Optional\<Long>*                                       | :heavy_minus_sign:                                      | The maximum number of items that are at returned.       | 20                                                      |
| `applicationName`                                       | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[ListPayoutsResponse](../../models/operations/ListPayoutsResponse.md)**

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

Creates a new payout.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.*;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreatePayoutResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreatePayoutResponse res = sdk.payouts().create()
                .payoutCreate(PayoutCreate.builder()
                    .amount(1299L)
                    .currency("EUR")
                    .paymentServiceId("ed8bd87d-85ad-40cf-8e8f-007e21e55aad")
                    .paymentMethod(PayoutCreatePaymentMethod.of(PaymentMethodStoredCard.builder()
                        .id("852b951c-d7ea-4c98-b09e-4a1c9e97c077")
                        .build()))
                    .category(PayoutCategory.ONLINE_GAMBLING)
                    .externalIdentifier("payout-12345")
                    .buyerId("fe26475d-ec3e-4884-9553-f7356683f7f9")
                    .buyer(GuestBuyerInput.builder()
                        .displayName("John Doe")
                        .externalIdentifier("buyer-12345")
                        .billingDetails(BillingDetailsInput.builder()
                            .firstName("John")
                            .lastName("Doe")
                            .emailAddress("john@example.com")
                            .phoneNumber("+1234567890")
                            .address(Address.builder()
                                .city("San Jose")
                                .country("US")
                                .postalCode("94560")
                                .state("California")
                                .stateCode("US-CA")
                                .houseNumberOrName("10")
                                .line1("Stafford Appartments")
                                .line2("29th Street")
                                .organization("Gr4vy")
                                .build())
                            .taxId(TaxId.builder()
                                .value("12345678931")
                                .kind(TaxIdKind.IN_GST)
                                .build())
                            .build())
                        .shippingDetails(ShippingDetailsCreate.builder()
                            .firstName("John")
                            .lastName("Doe")
                            .emailAddress("john@example.com")
                            .phoneNumber("+1234567890")
                            .address(Address.builder()
                                .city("San Jose")
                                .country("US")
                                .postalCode("94560")
                                .state("California")
                                .stateCode("US-CA")
                                .houseNumberOrName("10")
                                .line1("Stafford Appartments")
                                .line2("29th Street")
                                .organization("Gr4vy")
                                .build())
                            .build())
                        .build())
                    .buyerExternalIdentifier("buyer-12345")
                    .merchant(JsonNullable.of(null))
                    .connectionOptions(ConnectionOptions.builder()
                        .checkoutCard(CheckoutCardConnectionOptions.builder()
                            .processingChannelId("channel-1234")
                            .sourceId("acct-1234")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.payoutSummary().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `applicationName`                                       | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |
| `payoutCreate`                                          | [PayoutCreate](../../models/components/PayoutCreate.md) | :heavy_check_mark:                                      | N/A                                                     |

### Response

**[CreatePayoutResponse](../../models/operations/CreatePayoutResponse.md)**

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

Retreives a payout.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetPayoutResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetPayoutResponse res = sdk.payouts().get()
                .payoutId("4344fef2-bc2f-49a6-924f-343e62f67224")
                .call();

        if (res.payoutSummary().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `payoutId`                                              | *String*                                                | :heavy_check_mark:                                      | N/A                                                     |
| `applicationName`                                       | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |

### Response

**[GetPayoutResponse](../../models/operations/GetPayoutResponse.md)**

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