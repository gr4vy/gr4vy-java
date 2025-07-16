# MockCardMerchantAdviceCodeOptions


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `result`                                                                           | *JsonNullable\<String>*                                                            | :heavy_minus_sign:                                                                 | The MAC to return for this request.                                                |
| `accountNumber`                                                                    | *Optional\<String>*                                                                | :heavy_check_mark:                                                                 | When set, the MAC is only returned if the card number matches this account number. |