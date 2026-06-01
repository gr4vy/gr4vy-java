# PazeLocationAddress


## Fields

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `name`                                             | *JsonNullable\<String>*                            | :heavy_minus_sign:                                 | Name of the organization or entity at the address. |
| `line1`                                            | *String*                                           | :heavy_check_mark:                                 | Line 1 of the address.                             |
| `line2`                                            | *JsonNullable\<String>*                            | :heavy_minus_sign:                                 | Line 2 of the address.                             |
| `line3`                                            | *JsonNullable\<String>*                            | :heavy_minus_sign:                                 | Line 3 of the address.                             |
| `city`                                             | *String*                                           | :heavy_check_mark:                                 | City.                                              |
| `state`                                            | *String*                                           | :heavy_check_mark:                                 | State or region.                                   |
| `zip`                                              | *String*                                           | :heavy_check_mark:                                 | Postal code.                                       |
| `countryCode`                                      | *String*                                           | :heavy_check_mark:                                 | ISO 3166-1 alpha-2 country code.                   |