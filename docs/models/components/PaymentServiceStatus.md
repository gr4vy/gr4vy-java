# PaymentServiceStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.PaymentServiceStatus;

PaymentServiceStatus value = PaymentServiceStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
PaymentServiceStatus custom = PaymentServiceStatus.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `PENDING` | pending   |
| `CREATED` | created   |
| `FAILED`  | failed    |