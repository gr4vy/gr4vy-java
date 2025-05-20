# PayoutPaymentService


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `type`                                                   | *Optional\<String>*                                      | :heavy_minus_sign:                                       | Always `payment-service`.                                | payment-service                                          |
| `id`                                                     | *JsonNullable\<String>*                                  | :heavy_minus_sign:                                       | The ID for the payout service.                           | b6c9eb12-2b62-4103-99b9-e3efc94e396d                     |
| `method`                                                 | *Optional\<String>*                                      | :heavy_minus_sign:                                       | Always `card`.                                           | card                                                     |
| `paymentServiceDefinitionId`                             | *String*                                                 | :heavy_check_mark:                                       | The ID of the connection used for this payout.           | nuvei-card                                               |
| `displayName`                                            | *JsonNullable\<String>*                                  | :heavy_minus_sign:                                       | The display name of the connection used for this payout. | Nuvei                                                    |