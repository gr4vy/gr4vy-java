# NetworkTokenStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.NetworkTokenStatus;

NetworkTokenStatus value = NetworkTokenStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
NetworkTokenStatus custom = NetworkTokenStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `ACTIVE`    | active      |
| `INACTIVE`  | inactive    |
| `SUSPENDED` | suspended   |
| `DELETED`   | deleted     |