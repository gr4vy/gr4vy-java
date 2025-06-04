# Executions
(*reports().executions()*)

## Overview

### Available Operations

* [list](#list) - List executions for report
* [url](#url) - Create URL for executed report
* [all](#all) - List executed reports
* [get](#get) - Get executed report

## list

List all executions of a specific report.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        sdk.reports().executions().list()
                .reportId("4d4c7123-b794-4fad-b1b9-5ab2606e6bbe")
                .limit(20L)
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
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
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

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `reportId`                                                 | *String*                                                   | :heavy_check_mark:                                         | The ID of the report to retrieve a URL for.                | 4d4c7123-b794-4fad-b1b9-5ab2606e6bbe                       |
| `reportExecutionId`                                        | *String*                                                   | :heavy_check_mark:                                         | The ID of the execution of a report to retrieve a URL for. | 003bc416-f32a-420c-8eb2-062a386e1fb0                       |
| `merchantAccountId`                                        | *JsonNullable\<String>*                                    | :heavy_minus_sign:                                         | The ID of the merchant account to use for this request.    |                                                            |

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

## all

List all executed reports that have been generated.

### Example Usage

```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListAllReportExecutionsRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        ListAllReportExecutionsRequest req = ListAllReportExecutionsRequest.builder()
                .build();

        sdk.reports().executions().all()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAllReportExecutionsRequest](../../models/operations/ListAllReportExecutionsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAllReportExecutionsResponse](../../models/operations/ListAllReportExecutionsResponse.md)**

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
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
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