# PayoutStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.PayoutStatus;

PayoutStatus value = PayoutStatus.DECLINED;

// Open enum: use .of() to create instances from custom string values
PayoutStatus custom = PayoutStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `DECLINED`  | declined    |
| `FAILED`    | failed      |
| `PENDING`   | pending     |
| `SUCCEEDED` | succeeded   |