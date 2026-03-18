# BaseBankPaymentMethodCreate

Base class for Bank Payment Methods.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `method`                                                          | *Optional\<String>*                                               | :heavy_minus_sign:                                                | Always `bank`.                                                    | bank                                                              |
| `accountHolder`                                                   | [BankAccountHolder](../../models/components/BankAccountHolder.md) | :heavy_check_mark:                                                | N/A                                                               |                                                                   |
| `buyerId`                                                         | *JsonNullable\<String>*                                           | :heavy_minus_sign:                                                | The ID of the buyer to attach the method to.                      | fe26475d-ec3e-4884-9553-f7356683f7f9                              |
| `buyerExternalIdentifier`                                         | *JsonNullable\<String>*                                           | :heavy_minus_sign:                                                | The merchant reference for this payment method.                   | payment-method-12345                                              |
| `externalIdentifier`                                              | *JsonNullable\<String>*                                           | :heavy_minus_sign:                                                | The merchant identifier for this payment method.                  | payment-method-12345                                              |