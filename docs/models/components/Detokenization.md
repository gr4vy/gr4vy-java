# Detokenization


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `type`                                                                     | *Optional\<String>*                                                        | :heavy_minus_sign:                                                         | Always `payment-method-detokenization`.                                    | payment-method-detokenization                                              |
| `encryptedPayload`                                                         | *String*                                                                   | :heavy_check_mark:                                                         | The card details, encrypted to the merchant's public key as a compact JWE. | eyJhbGciOiJSU0EtT0FFUC0yNTYiLCJlbmMiOi...                                  |