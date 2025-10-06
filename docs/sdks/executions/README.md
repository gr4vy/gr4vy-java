# Executions
(*reports().executions()*)

## Overview

### Available Operations

* [list](#list) - List executions for report
* [url](#url) - Create URL for executed report
* [get](#get) - Get executed report

## list

List all executions of a specific report.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_report_executions" method="get" path="/reports/{report_id}/executions" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListReportExecutionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();


        sdk.reports().executions().list()
                .reportId("4d4c7123-b794-4fad-b1b9-5ab2606e6bbe")
                .limit(20L)
                .callAsStream()
                .forEach((ListReportExecutionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `reportId`                                              | *String*                                                | :heavy_check_mark:                                      | The ID of the report to retrieve details for.           | 4d4c7123-b794-4fad-b1b9-5ab2606e6bbe                    |
| `cursor`                                                | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | A pointer to the page of results to return.             | ZXhhbXBsZTE                                             |
| `limit`                                                 | *Optional\<Long>*                                       | :heavy_minus_sign:                                      | The maximum number of items that are at returned.       | 20                                                      |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |

### Response

**[ListReportExecutionsResponse](../../models/operations/ListReportExecutionsResponse.md)**

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

## url

Creates a download URL for a specific execution of a report.

### Example Usage

<!-- UsageSnippet language="java" operationID="create_report_execution_url" method="post" path="/reports/{report_id}/executions/{report_execution_id}/url" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateReportExecutionUrlResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        CreateReportExecutionUrlResponse res = sdk.reports().executions().url()
                .reportId("4d4c7123-b794-4fad-b1b9-5ab2606e6bbe")
                .reportExecutionId("003bc416-f32a-420c-8eb2-062a386e1fb0")
                .call();

        if (res.reportExecutionUrl().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `reportId`                                                                                     | *String*                                                                                       | :heavy_check_mark:                                                                             | The ID of the report to retrieve a URL for.                                                    | 4d4c7123-b794-4fad-b1b9-5ab2606e6bbe                                                           |
| `reportExecutionId`                                                                            | *String*                                                                                       | :heavy_check_mark:                                                                             | The ID of the execution of a report to retrieve a URL for.                                     | 003bc416-f32a-420c-8eb2-062a386e1fb0                                                           |
| `merchantAccountId`                                                                            | *JsonNullable\<String>*                                                                        | :heavy_minus_sign:                                                                             | The ID of the merchant account to use for this request.                                        |                                                                                                |
| `reportExecutionUrlGenerate`                                                                   | [Optional\<ReportExecutionUrlGenerate>](../../models/components/ReportExecutionUrlGenerate.md) | :heavy_minus_sign:                                                                             | N/A                                                                                            |                                                                                                |

### Response

**[CreateReportExecutionUrlResponse](../../models/operations/CreateReportExecutionUrlResponse.md)**

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

Fetch a specific executed report.

### Example Usage

<!-- UsageSnippet language="java" operationID="get_report_execution" method="get" path="/report-executions/{report_execution_id}" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.GetReportExecutionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        GetReportExecutionResponse res = sdk.reports().executions().get()
                .reportExecutionId("003bc416-f32a-420c-8eb2-062a386e1fb0")
                .call();

        if (res.reportExecution().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `reportExecutionId`                                          | *String*                                                     | :heavy_check_mark:                                           | The ID of the execution of a report to retrieve details for. | 003bc416-f32a-420c-8eb2-062a386e1fb0                         |
| `merchantAccountId`                                          | *JsonNullable\<String>*                                      | :heavy_minus_sign:                                           | The ID of the merchant account to use for this request.      |                                                              |

### Response

**[GetReportExecutionResponse](../../models/operations/GetReportExecutionResponse.md)**

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