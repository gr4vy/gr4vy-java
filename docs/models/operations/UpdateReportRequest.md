# UpdateReportRequest


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `reportId`                                              | *String*                                                | :heavy_check_mark:                                      | The ID of the report to edit.                           | 4d4c7123-b794-4fad-b1b9-5ab2606e6bbe                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |
| `reportUpdate`                                          | [ReportUpdate](../../models/components/ReportUpdate.md) | :heavy_check_mark:                                      | N/A                                                     |                                                         |