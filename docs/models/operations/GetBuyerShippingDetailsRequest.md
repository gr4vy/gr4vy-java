# GetBuyerShippingDetailsRequest


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `buyerId`                                               | *String*                                                | :heavy_check_mark:                                      | The ID of the buyer to retrieve shipping details for.   | fe26475d-ec3e-4884-9553-f7356683f7f9                    |
| `shippingDetailsId`                                     | *String*                                                | :heavy_check_mark:                                      | The ID of the shipping details to retrieve.             | bf8c36ad-02d9-4904-b0f9-a230b149e341                    |
| `merchantAccountId`                                     | *JsonNullable\<String>*                                 | :heavy_minus_sign:                                      | The ID of the merchant account to use for this request. |                                                         |