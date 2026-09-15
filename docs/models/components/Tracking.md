# Tracking


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `number`                                                      | *String*                                                      | :heavy_check_mark:                                            | The tracking number for the shipment.                         | 1Z999AA10123456784                                            |
| `carrier`                                                     | [ShippingCarrier](../../models/components/ShippingCarrier.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |
| `url`                                                         | *JsonNullable\<String>*                                       | :heavy_minus_sign:                                            | The URL to track the shipment.                                | https://www.ups.com/track?tracknum=1Z999AA10123456784         |