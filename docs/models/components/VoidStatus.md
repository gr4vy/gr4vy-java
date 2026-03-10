# VoidStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.VoidStatus;

VoidStatus value = VoidStatus.SUCCEEDED;

// Open enum: use .of() to create instances from custom string values
VoidStatus custom = VoidStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `SUCCEEDED` | succeeded   |
| `PENDING`   | pending     |
| `DECLINED`  | declined    |
| `FAILED`    | failed      |