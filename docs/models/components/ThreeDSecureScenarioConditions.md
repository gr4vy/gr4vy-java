# ThreeDSecureScenarioConditions


## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `firstName`                          | *JsonNullable\<String>*              | :heavy_minus_sign:                   | First name of the buyer to match.    | John                                 |
| `lastName`                           | *JsonNullable\<String>*              | :heavy_minus_sign:                   | Last name of the buyer to match.     | Luhn                                 |
| `emailAddress`                       | *JsonNullable\<String>*              | :heavy_minus_sign:                   | Email address of the buyer to match. | john@example.com                     |
| `amount`                             | *JsonNullable\<Long>*                | :heavy_minus_sign:                   | Amount of the transaction to match.  | 100                                  |
| `externalIdentifier`                 | *JsonNullable\<String>*              | :heavy_minus_sign:                   | External identifier to match.        | buyer-12345                          |
| `cardNumber`                         | *JsonNullable\<String>*              | :heavy_minus_sign:                   | Card number to match.                | 4242424242424242                     |