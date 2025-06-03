# ListPaymentMethodPaymentServiceTokensRequest


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `paymentMethodId`                                       | *String*                                                | :heavy_check_mark:                                      | The ID of the payment method                            | ef9496d8-53a5-4aad-8ca2-00eb68334389                    |
| `paymentServiceId`                                      | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the payment service                           | fffd152a-9532-4087-9a4f-de58754210f0                    |
| `applicationName`                                       | *Optional\<String>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |