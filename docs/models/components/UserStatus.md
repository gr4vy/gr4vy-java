# UserStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.UserStatus;

UserStatus value = UserStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
UserStatus custom = UserStatus.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `ACTIVE`  | active    |
| `PENDING` | pending   |
| `DELETED` | deleted   |