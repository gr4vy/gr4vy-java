# AffirmItineraryOptions


## Fields

| Field                                            | Type                                             | Required                                         | Description                                      | Example                                          |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `type`                                           | *JsonNullable\<String>*                          | :heavy_minus_sign:                               | The type of itinerary object.                    | flight                                           |
| `sku`                                            | *JsonNullable\<String>*                          | :heavy_minus_sign:                               | The booking/itinerary number (if applicable).    | ABC123                                           |
| `displayName`                                    | *JsonNullable\<String>*                          | :heavy_minus_sign:                               | Readable description of the itinerary item.      | MIA-DCA-2019-12-11T12:07                         |
| `venue`                                          | *JsonNullable\<String>*                          | :heavy_minus_sign:                               | The name of the venue where the event is hosted. | Petco Park                                       |
| `location`                                       | *JsonNullable\<String>*                          | :heavy_minus_sign:                               | The address object that can be parsed.           | 925 Collins Avenue, Miami Beach, FL, 33140, US   |
| `dateStart`                                      | *JsonNullable\<String>*                          | :heavy_minus_sign:                               | The start date of this itinerary item.           | 2019-12-05                                       |
| `management`                                     | *JsonNullable\<String>*                          | :heavy_minus_sign:                               | The corporation.                                 | Marriott                                         |