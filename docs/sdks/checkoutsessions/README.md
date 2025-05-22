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

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.*;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.CreateCheckoutSessionResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateCheckoutSessionResponse res = sdk.checkoutSessions().create()
                .checkoutSessionCreate(CheckoutSessionCreate.builder()
                    .cartItems(List.of(
                        CartItem.builder()
                            .name("GoPro HD")
                            .quantity(2L)
                            .unitAmount(1299L)
                            .discountAmount(0L)
                            .taxAmount(0L)
                            .externalIdentifier("goprohd")
                            .sku("GPHD1078")
                            .productUrl("https://example.com/catalog/go-pro-hd")
                            .imageUrl("https://example.com/images/go-pro-hd.jpg")
                            .categories(List.of(
                                "camera",
                                "travel",
                                "gear"))
                            .productType(ProductType.PHYSICAL)
                            .sellerCountry("US")
                            .build(),
                        CartItem.builder()
                            .name("GoPro HD")
                            .quantity(2L)
                            .unitAmount(1299L)
                            .discountAmount(0L)
                            .taxAmount(0L)
                            .externalIdentifier("goprohd")
                            .sku("GPHD1078")
                            .productUrl("https://example.com/catalog/go-pro-hd")
                            .imageUrl("https://example.com/images/go-pro-hd.jpg")
                            .categories(List.of(
                                "camera",
                                "travel",
                                "gear"))
                            .productType(ProductType.PHYSICAL)
                            .sellerCountry("US")
                            .build()))
                    .metadata(Map.ofEntries(
                        Map.entry("cohort", "cohort-a"),
                        Map.entry("order_id", "order-12345")))
                    .buyer(JsonNullable.of(null))
                    .airline(Airline.builder()
                        .bookingCode("X36Q9C")
                        .isCardholderTraveling(true)
                        .issuedAddress("123 Broadway, New York")
                        .issuedAt(OffsetDateTime.parse("2013-07-16T19:23:00.000+00:00"))
                        .issuingCarrierCode("649")
                        .issuingCarrierName("Air Transat A.T. Inc")
                        .issuingIataDesignator("TS")
                        .issuingIcaoCode("TSC")
                        .legs(List.of(
                            AirlineLeg.builder()
                                .arrivalAirport("LAX")
                                .arrivalAt(OffsetDateTime.parse("2013-07-16T19:23:00.000+00:00"))
                                .arrivalCity("Los Angeles")
                                .arrivalCountry("US")
                                .carrierCode("649")
                                .carrierName("Air Transat A.T. Inc")
                                .iataDesignator("TS")
                                .icaoCode("TSC")
                                .couponNumber("15885566")
                                .departureAirport("LHR")
                                .departureAt(OffsetDateTime.parse("2013-07-16T19:23:00.000+00:00"))
                                .departureCity("London")
                                .departureCountry("GB")
                                .departureTaxAmount(1200L)
                                .fareAmount(129900L)
                                .fareBasisCode("FY")
                                .feeAmount(1200L)
                                .flightClass("E")
                                .flightNumber("101")
                                .routeType(RouteType.ROUND_TRIP)
                                .seatClass("F")
                                .stopOver(false)
                                .taxAmount(1200L)
                                .build()))
                        .passengerNameRecord("JOHN L")
                        .passengers(List.of(
                            AirlinePassenger.builder()
                                .ageGroup(AgeGroup.ADULT)
                                .dateOfBirth(LocalDate.parse("2013-07-16"))
                                .emailAddress("john@example.com")
                                .firstName("John")
                                .frequentFlyerNumber("15885566")
                                .lastName("Luhn")
                                .passportNumber("11117700225")
                                .phoneNumber("+1234567890")
                                .ticketNumber("BA1236699999")
                                .title("Mr.")
                                .countryCode("US")
                                .build(),
                            AirlinePassenger.builder()
                                .ageGroup(AgeGroup.ADULT)
                                .dateOfBirth(LocalDate.parse("2013-07-16"))
                                .emailAddress("john@example.com")
                                .firstName("John")
                                .frequentFlyerNumber("15885566")
                                .lastName("Luhn")
                                .passportNumber("11117700225")
                                .phoneNumber("+1234567890")
                                .ticketNumber("BA1236699999")
                                .title("Mr.")
                                .countryCode("US")
                                .build()))
                        .reservationSystem("Amadeus")
                        .restrictedTicket(false)
                        .ticketDeliveryMethod(TicketDeliveryMethod.ELECTRONIC)
                        .ticketNumber("123-1234-151555")
                        .travelAgencyCode("12345")
                        .travelAgencyInvoiceNumber("EG15555155")
                        .travelAgencyName("ACME Agency")
                        .travelAgencyPlanName("B733")
                        .build())
                    .build())
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
| `timeoutInSeconds`                                                                   | *Optional\<Double>*                                                                  | :heavy_minus_sign:                                                                   | N/A                                                                                  |
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

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.components.*;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.UpdateCheckoutSessionResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UpdateCheckoutSessionResponse res = sdk.checkoutSessions().update()
                .sessionId("4137b1cf-39ac-42a8-bad6-1c680d5dab6b")
                .checkoutSessionCreate(CheckoutSessionCreate.builder()
                    .cartItems(List.of(
                        CartItem.builder()
                            .name("GoPro HD")
                            .quantity(2L)
                            .unitAmount(1299L)
                            .discountAmount(0L)
                            .taxAmount(0L)
                            .externalIdentifier("goprohd")
                            .sku("GPHD1078")
                            .productUrl("https://example.com/catalog/go-pro-hd")
                            .imageUrl("https://example.com/images/go-pro-hd.jpg")
                            .categories(List.of(
                                "camera",
                                "travel",
                                "gear"))
                            .productType(ProductType.PHYSICAL)
                            .sellerCountry("GB")
                            .build(),
                        CartItem.builder()
                            .name("GoPro HD")
                            .quantity(2L)
                            .unitAmount(1299L)
                            .discountAmount(0L)
                            .taxAmount(0L)
                            .externalIdentifier("goprohd")
                            .sku("GPHD1078")
                            .productUrl("https://example.com/catalog/go-pro-hd")
                            .imageUrl("https://example.com/images/go-pro-hd.jpg")
                            .categories(List.of(
                                "camera",
                                "travel",
                                "gear"))
                            .productType(ProductType.PHYSICAL)
                            .sellerCountry("GB")
                            .build(),
                        CartItem.builder()
                            .name("GoPro HD")
                            .quantity(2L)
                            .unitAmount(1299L)
                            .discountAmount(0L)
                            .taxAmount(0L)
                            .externalIdentifier("goprohd")
                            .sku("GPHD1078")
                            .productUrl("https://example.com/catalog/go-pro-hd")
                            .imageUrl("https://example.com/images/go-pro-hd.jpg")
                            .categories(List.of(
                                "camera",
                                "travel",
                                "gear"))
                            .productType(ProductType.PHYSICAL)
                            .sellerCountry("GB")
                            .build()))
                    .metadata(Map.ofEntries(
                        Map.entry("cohort", "cohort-a"),
                        Map.entry("order_id", "order-12345")))
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
                                .kind(TaxIdKind.AR_CUIT)
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
                    .airline(Airline.builder()
                        .bookingCode("X36Q9C")
                        .isCardholderTraveling(true)
                        .issuedAddress("123 Broadway, New York")
                        .issuedAt(OffsetDateTime.parse("2013-07-16T19:23:00.000+00:00"))
                        .issuingCarrierCode("649")
                        .issuingCarrierName("Air Transat A.T. Inc")
                        .issuingIataDesignator("TS")
                        .issuingIcaoCode("TSC")
                        .legs(List.of(
                            AirlineLeg.builder()
                                .arrivalAirport("LAX")
                                .arrivalAt(OffsetDateTime.parse("2013-07-16T19:23:00.000+00:00"))
                                .arrivalCity("Los Angeles")
                                .arrivalCountry("US")
                                .carrierCode("649")
                                .carrierName("Air Transat A.T. Inc")
                                .iataDesignator("TS")
                                .icaoCode("TSC")
                                .couponNumber("15885566")
                                .departureAirport("LHR")
                                .departureAt(OffsetDateTime.parse("2013-07-16T19:23:00.000+00:00"))
                                .departureCity("London")
                                .departureCountry("GB")
                                .departureTaxAmount(1200L)
                                .fareAmount(129900L)
                                .fareBasisCode("FY")
                                .feeAmount(1200L)
                                .flightClass("E")
                                .flightNumber("101")
                                .routeType(RouteType.ROUND_TRIP)
                                .seatClass("F")
                                .stopOver(false)
                                .taxAmount(1200L)
                                .build()))
                        .passengerNameRecord("JOHN L")
                        .passengers(List.of(
                            AirlinePassenger.builder()
                                .ageGroup(AgeGroup.ADULT)
                                .dateOfBirth(LocalDate.parse("2013-07-16"))
                                .emailAddress("john@example.com")
                                .firstName("John")
                                .frequentFlyerNumber("15885566")
                                .lastName("Luhn")
                                .passportNumber("11117700225")
                                .phoneNumber("+1234567890")
                                .ticketNumber("BA1236699999")
                                .title("Mr.")
                                .countryCode("US")
                                .build()))
                        .reservationSystem("Amadeus")
                        .restrictedTicket(false)
                        .ticketDeliveryMethod(TicketDeliveryMethod.ELECTRONIC)
                        .ticketNumber("123-1234-151555")
                        .travelAgencyCode("12345")
                        .travelAgencyInvoiceNumber("EG15555155")
                        .travelAgencyName("ACME Agency")
                        .travelAgencyPlanName("B733")
                        .build())
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
| `timeoutInSeconds`                                                        | *Optional\<Double>*                                                       | :heavy_minus_sign:                                                        | N/A                                                                       |                                                                           |
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

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.GetCheckoutSessionResponse;
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
| `timeoutInSeconds`                                      | *Optional\<Double>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
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

import com.github.gr4vy.gr4vy_java.Gr4vy;
import com.github.gr4vy.gr4vy_java.models.errors.*;
import com.github.gr4vy.gr4vy_java.models.operations.DeleteCheckoutSessionResponse;
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
| `timeoutInSeconds`                                      | *Optional\<Double>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
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