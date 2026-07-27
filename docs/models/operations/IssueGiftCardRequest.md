# IssueGiftCardRequest


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `idempotencyKey`                                                                 | *JsonNullable\<String>*                                                          | :heavy_minus_sign:                                                               | A unique key forwarded to the gift card service to make the issuance idempotent. |
| `merchantAccountId`                                                              | *JsonNullable\<String>*                                                          | :heavy_minus_sign:                                                               | The ID of the merchant account to use for this request.                          |
| `giftCardIssuanceCreate`                                                         | [GiftCardIssuanceCreate](../../models/components/GiftCardIssuanceCreate.md)      | :heavy_check_mark:                                                               | N/A                                                                              |