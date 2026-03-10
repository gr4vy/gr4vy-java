# PaymentLinkStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.PaymentLinkStatus;

PaymentLinkStatus value = PaymentLinkStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
PaymentLinkStatus custom = PaymentLinkStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `ACTIVE`     | active       |
| `COMPLETED`  | completed    |
| `EXPIRED`    | expired      |
| `PROCESSING` | processing   |