# Reports
(*reports()*)

## Overview

### Available Operations

* [list](#list) - List configured reports
* [create](#create) - Add a report
* [get](#get) - Get a report
* [put](#put) - Update a report

## list

List all configured reports that can be generated.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListReportsRequest;
import com.gr4vy.sdk.models.operations.ListReportsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListReportsRequest req = ListReportsRequest.builder()
                .build();

        sdk.reports().list()
                .request(req)
                .callAsStream()
                .forEach((ListReportsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListReportsRequest](../../models/operations/ListReportsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListReportsResponse](../../models/operations/ListReportsResponse.md)**

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

Create a new report.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.*;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.AddReportResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AddReportResponse res = sdk.reports().create()
                .reportCreate(ReportCreate.builder()
                    .name("Monthly Transaction Report")
                    .schedule(ReportSchedule.DAILY)
                    .scheduleEnabled(true)
                    .spec(DetailedSettlementReportSpec.builder()
                        .params(Map.ofEntries(
                            Map.entry("filters", Map.ofEntries(
                                Map.entry("ingested_at", Map.ofEntries(
                                    Map.entry("end", "day_end"),
                                    Map.entry("start", "day_start")))))))
                        .build())
                    .scheduleTimezone("UTC")
                    .build())
                .call();

        if (res.report().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |
| `reportCreate`                                          | [ReportCreate](../../models/components/ReportCreate.md) | :heavy_check_mark:                                      | N/A                                                     |

### Response

**[AddReportResponse](../../models/operations/AddReportResponse.md)**

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

Fetches a report by its ID.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetReportResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetReportResponse res = sdk.reports().get()
                .reportId("4d4c7123-b794-4fad-b1b9-5ab2606e6bbe")
                .call();

        if (res.report().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `reportId`                                              | *String*                                                | :heavy_check_mark:                                      | The ID of the report to retrieve details for.           | 4d4c7123-b794-4fad-b1b9-5ab2606e6bbe                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[GetReportResponse](../../models/operations/GetReportResponse.md)**

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

## put

Updates the configuration of a report.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.ReportUpdate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.UpdateReportResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        UpdateReportResponse res = sdk.reports().put()
                .reportId("4d4c7123-b794-4fad-b1b9-5ab2606e6bbe")
                .reportUpdate(ReportUpdate.builder()
                    .build())
                .call();

        if (res.report().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `reportId`                                              | *String*                                                | :heavy_check_mark:                                      | The ID of the report to edit.                           | 4d4c7123-b794-4fad-b1b9-5ab2606e6bbe                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |
| `reportUpdate`                                          | [ReportUpdate](../../models/components/ReportUpdate.md) | :heavy_check_mark:                                      | N/A                                                     |                                                         |

### Response

**[UpdateReportResponse](../../models/operations/UpdateReportResponse.md)**

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