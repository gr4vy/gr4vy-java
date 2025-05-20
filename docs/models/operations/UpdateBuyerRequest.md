# UpdateBuyerRequest


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `buyerId`                                               | *String*                                                | :heavy_check_mark:                                      | The ID of the buyer to edit.                            | fe26475d-ec3e-4884-9553-f7356683f7f9                    |
| `timeoutInSeconds`                                      | *Optional\<Double>*                                     | :heavy_minus_sign:                                      | N/A                                                     |                                                         |
| `xGr4vyMerchantAccountId`                               | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. | default                                                 |
| `buyerUpdate`                                           | [BuyerUpdate](../../models/components/BuyerUpdate.md)   | :heavy_check_mark:                                      | N/A                                                     |                                                         |