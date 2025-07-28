# AuditLogs
(*auditLogs()*)

## Overview

### Available Operations

* [list](#list) - List audit log entries

## list

Returns a list of activity by dashboard users.

### Example Usage

<!-- UsageSnippet language="java" operationID="list_audit_logs" method="get" path="/audit-logs" -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.AuditLogAction;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.ListAuditLogsRequest;
import com.gr4vy.sdk.models.operations.ListAuditLogsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        ListAuditLogsRequest req = ListAuditLogsRequest.builder()
                .cursor("ZXhhbXBsZTE")
                .action(AuditLogAction.CREATED)
                .userId("14b7b8c5-a6ba-4fb6-bbab-52d43c7f37ef")
                .resourceType("user")
                .build();

        sdk.auditLogs().list()
                .request(req)
                .callAsStream()
                .forEach((ListAuditLogsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListAuditLogsRequest](../../models/operations/ListAuditLogsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListAuditLogsResponse](../../models/operations/ListAuditLogsResponse.md)**

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