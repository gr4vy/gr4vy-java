# Refunds


## Fields

| Field                                              | Type                                               | Required                                           | Description                                        | Example                                            |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `items`                                            | List\<[Refund](../../models/components/Refund.md)> | :heavy_check_mark:                                 | A list of items returned for this request.         |                                                    |
| `limit`                                            | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The number of items for this page.                 | 20                                                 |
| `nextCursor`                                       | *JsonNullable\<String>*                            | :heavy_minus_sign:                                 | The cursor pointing at the next page of items.     | ZXhhbXBsZTE                                        |
| `previousCursor`                                   | *JsonNullable\<String>*                            | :heavy_minus_sign:                                 | The cursor pointing at the previous page of items. | Xkjss7asS                                          |