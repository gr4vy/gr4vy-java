# TransactionGiftCard


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `type`                                                     | *Optional\<String>*                                        | :heavy_minus_sign:                                         | Always `gift-card`.                                        | gift-card                                                  |
| `id`                                                       | *JsonNullable\<String>*                                    | :heavy_minus_sign:                                         | The ID for the gift card.                                  | 356d56e5-fe16-42ae-97ee-8d55d846ae2e                       |
| `bin`                                                      | *String*                                                   | :heavy_check_mark:                                         | The first 6 digits of the full gift card number.           | 412345                                                     |
| `subBin`                                                   | *String*                                                   | :heavy_check_mark:                                         | The 3 digits after the `bin` of the full gift card number. | 554                                                        |
| `last4`                                                    | *String*                                                   | :heavy_check_mark:                                         | The last 4 digits for the gift card.                       | 1234                                                       |