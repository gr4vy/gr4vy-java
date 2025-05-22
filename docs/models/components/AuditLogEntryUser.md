# AuditLogEntryUser


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `type`                                              | *Optional\<String>*                                 | :heavy_minus_sign:                                  | Always `user`.                                      | user                                                |
| `id`                                                | *JsonNullable\<String>*                             | :heavy_minus_sign:                                  | The ID of the user.                                 | 14b7b8c5-a6ba-4fb6-bbab-52d43c7f37ef                |
| `name`                                              | *String*                                            | :heavy_check_mark:                                  | The name of the user.                               | John Doe                                            |
| `emailAddress`                                      | *JsonNullable\<String>*                             | :heavy_minus_sign:                                  | The email address for this user.                    | john@example.com                                    |
| `isStaff`                                           | *boolean*                                           | :heavy_check_mark:                                  | Whether this is a Gr4vy staff user.                 | false                                               |
| `status`                                            | [UserStatus](../../models/components/UserStatus.md) | :heavy_check_mark:                                  | N/A                                                 |                                                     |