# PaymentMethodStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.PaymentMethodStatus;

PaymentMethodStatus value = PaymentMethodStatus.PROCESSING;

// Open enum: use .of() to create instances from custom string values
PaymentMethodStatus custom = PaymentMethodStatus.of("custom_value");
```


## Values

| Name                      | Value                     |
| ------------------------- | ------------------------- |
| `PROCESSING`              | processing                |
| `BUYER_APPROVAL_REQUIRED` | buyer_approval_required   |
| `SUCCEEDED`               | succeeded                 |
| `FAILED`                  | failed                    |
| `PAUSED`                  | paused                    |