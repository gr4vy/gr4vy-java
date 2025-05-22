# CaptureTransactionRequest


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `transactionId`                                                     | *String*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `timeoutInSeconds`                                                  | *Optional\<Double>*                                                 | :heavy_minus_sign:                                                  | N/A                                                                 |
| `merchantAccountId`                                                 | *JsonNullable\<String>*                                             | :heavy_minus_sign:                                                  | The ID of the merchant account to use for this request.             |
| `transactionCapture`                                                | [TransactionCapture](../../models/components/TransactionCapture.md) | :heavy_check_mark:                                                  | N/A                                                                 |