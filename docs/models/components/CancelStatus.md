# CancelStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.CancelStatus;

CancelStatus value = CancelStatus.SUCCEEDED;

// Open enum: use .of() to create instances from custom string values
CancelStatus custom = CancelStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `SUCCEEDED` | succeeded   |
| `PENDING`   | pending     |
| `FAILED`    | failed      |