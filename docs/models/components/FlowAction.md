# FlowAction

## Example Usage

```java
import com.gr4vy.sdk.models.components.FlowAction;

FlowAction value = FlowAction.SELECT_PAYMENT_OPTIONS;

// Open enum: use .of() to create instances from custom string values
FlowAction custom = FlowAction.of("custom_value");
```


## Values

| Name                     | Value                    |
| ------------------------ | ------------------------ |
| `SELECT_PAYMENT_OPTIONS` | select-payment-options   |
| `ROUTE_TRANSACTION`      | route-transaction        |
| `DECLINE_EARLY`          | decline-early            |
| `SKIP3DS`                | skip-3ds                 |