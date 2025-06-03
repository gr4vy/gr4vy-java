# PaymentServices
(*paymentServices()*)

## Overview

### Available Operations

* [list](#list) - List payment services
* [create](#create) - Update a configured payment service
* [get](#get) - Get payment service
* [update](#update) - Configure a payment service
* [delete](#delete) - Delete a configured payment service
* [verify](#verify) - Verify payment service credentials
* [session](#session) - Create a session for apayment service definition

## list

List the configured payment services.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListPaymentServicesRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListPaymentServicesRequest req = ListPaymentServicesRequest.builder()
                .cursor("ZXhhbXBsZTE")
                .deleted(true)
                .build();

        sdk.paymentServices().list()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListPaymentServicesRequest](../../models/operations/ListPaymentServicesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListPaymentServicesResponse](../../models/operations/ListPaymentServicesResponse.md)**

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

Updates the configuration of a payment service.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.*;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UpdatePaymentServiceResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UpdatePaymentServiceResponse res = sdk.paymentServices().create()
                .paymentServiceCreate(PaymentServiceCreate.builder()
                    .displayName("Stripe")
                    .paymentServiceDefinitionId("stripe-card")
                    .fields(List.of(
                        Field.builder()
                            .key("api_key")
                            .value("key-12345")
                            .build(),
                        Field.builder()
                            .key("api_key")
                            .value("key-12345")
                            .build()))
                    .acceptedCurrencies(List.of(
                        "USD",
                        "EUR",
                        "GBP"))
                    .acceptedCountries(List.of(
                        "US",
                        "DE",
                        "GB"))
                    .reportingFields(List.of(
                        Field.builder()
                            .key("api_key")
                            .value("key-12345")
                            .build(),
                        Field.builder()
                            .key("api_key")
                            .value("key-12345")
                            .build(),
                        Field.builder()
                            .key("api_key")
                            .value("key-12345")
                            .build()))
                    .position(1L)
                    .active(true)
                    .merchantProfile(Map.ofEntries(
                        Map.entry("key", MerchantProfileScheme.builder()
                            .merchantAcquirerBin("516327")
                            .merchantUrl("https://example.com")
                            .merchantAcquirerId("123456789012345")
                            .merchantName("Acme Inc.")
                            .merchantCountryCode("USD")
                            .merchantCategoryCode("1234")
                            .build()),
                        Map.entry("key1", MerchantProfileScheme.builder()
                            .merchantAcquirerBin("516327")
                            .merchantUrl("https://example.com")
                            .merchantAcquirerId("123456789012345")
                            .merchantName("Acme Inc.")
                            .merchantCountryCode("USD")
                            .merchantCategoryCode("1234")
                            .build()),
                        Map.entry("key2", MerchantProfileScheme.builder()
                            .merchantAcquirerBin("516327")
                            .merchantUrl("https://example.com")
                            .merchantAcquirerId("123456789012345")
                            .merchantName("Acme Inc.")
                            .merchantCountryCode("USD")
                            .merchantCategoryCode("1234")
                            .build())))
                    .paymentMethodTokenizationEnabled(true)
                    .networkTokensEnabled(true)
                    .openLoop(true)
                    .build())
                .call();

        if (res.paymentService().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `applicationName`                                                       | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | N/A                                                                     |
| `merchantAccountId`                                                     | *JsonNullable\<String>*                                                 | :heavy_minus_sign:                                                      | The ID of the merchant account to use for this request.                 |
| `paymentServiceCreate`                                                  | [PaymentServiceCreate](../../models/components/PaymentServiceCreate.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[UpdatePaymentServiceResponse](../../models/operations/UpdatePaymentServiceResponse.md)**

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

Get the details of a configured payment service.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetPaymentServiceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetPaymentServiceResponse res = sdk.paymentServices().get()
                .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
                .call();

        if (res.paymentService().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `paymentServiceId`                                      | *String*                                                | :heavy_check_mark:                                      | the ID of the payment service                           | fffd152a-9532-4087-9a4f-de58754210f0                    |
| `applicationName`                                       | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetPaymentServiceResponse](../../models/operations/GetPaymentServiceResponse.md)**

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

Configures a new payment service for use by merchants.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.PaymentServiceUpdate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreatePaymentServiceResponse;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreatePaymentServiceResponse res = sdk.paymentServices().update()
                .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
                .paymentServiceUpdate(PaymentServiceUpdate.builder()
                    .displayName("Stripe")
                    .position(1L)
                    .acceptedCurrencies(List.of(
                        "USD",
                        "EUR",
                        "GBP"))
                    .acceptedCountries(List.of(
                        "US",
                        "DE",
                        "GB"))
                    .active(true)
                    .threeDSecureEnabled(true)
                    .merchantProfile(JsonNullable.of(null))
                    .paymentMethodTokenizationEnabled(true)
                    .networkTokensEnabled(true)
                    .openLoop(true)
                    .build())
                .call();

        if (res.paymentService().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `paymentServiceId`                                                      | *String*                                                                | :heavy_check_mark:                                                      | the ID of the payment service                                           | fffd152a-9532-4087-9a4f-de58754210f0                                    |
| `applicationName`                                                       | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | N/A                                                                     |                                                                         |
| `merchantAccountId`                                                     | *JsonNullable\<String>*                                                 | :heavy_minus_sign:                                                      | The ID of the merchant account to use for this request.                 |                                                                         |
| `paymentServiceUpdate`                                                  | [PaymentServiceUpdate](../../models/components/PaymentServiceUpdate.md) | :heavy_check_mark:                                                      | N/A                                                                     |                                                                         |

### Response

**[CreatePaymentServiceResponse](../../models/operations/CreatePaymentServiceResponse.md)**

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

Deletes all the configuration of a payment service.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.DeletePaymentServiceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        DeletePaymentServiceResponse res = sdk.paymentServices().delete()
                .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
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
| `paymentServiceId`                                      | *String*                                                | :heavy_check_mark:                                      | the ID of the payment service                           | fffd152a-9532-4087-9a4f-de58754210f0                    |
| `applicationName`                                       | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[DeletePaymentServiceResponse](../../models/operations/DeletePaymentServiceResponse.md)**

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

## verify

Verify the credentials of a configured payment service

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.VerifyCredentials;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.VerifyPaymentServiceCredentialsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        VerifyPaymentServiceCredentialsResponse res = sdk.paymentServices().verify()
                .verifyCredentials(VerifyCredentials.builder()
                    .paymentServiceDefinitionId("stripe-card")
                    .fields(List.of())
                    .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
                    .build())
                .call();

        if (res.any().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `applicationName`                                                 | *Optional\<String>*                                               | :heavy_minus_sign:                                                | N/A                                                               |
| `merchantAccountId`                                               | *JsonNullable\<String>*                                           | :heavy_minus_sign:                                                | The ID of the merchant account to use for this request.           |
| `verifyCredentials`                                               | [VerifyCredentials](../../models/components/VerifyCredentials.md) | :heavy_check_mark:                                                | N/A                                                               |

### Response

**[VerifyPaymentServiceCredentialsResponse](../../models/operations/VerifyPaymentServiceCredentialsResponse.md)**

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

## session

Creates a session for a payment service that supports sessions.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreatePaymentServiceSessionResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreatePaymentServiceSessionResponse res = sdk.paymentServices().session()
                .paymentServiceId("fffd152a-9532-4087-9a4f-de58754210f0")
                .requestBody(Map.ofEntries(
                ))
                .call();

        if (res.createSession().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `paymentServiceId`                                      | *String*                                                | :heavy_check_mark:                                      | the ID of the payment service                           | fffd152a-9532-4087-9a4f-de58754210f0                    |
| `applicationName`                                       | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |
| `requestBody`                                           | Map\<String, *Object*>                                  | :heavy_check_mark:                                      | N/A                                                     |                                                         |

### Response

**[CreatePaymentServiceSessionResponse](../../models/operations/CreatePaymentServiceSessionResponse.md)**

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