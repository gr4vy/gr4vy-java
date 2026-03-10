# Flow

## Example Usage

```java
import com.gr4vy.sdk.models.components.Flow;

Flow value = Flow.CHECKOUT;

// Open enum: use .of() to create instances from custom string values
Flow custom = Flow.of("custom_value");
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `CHECKOUT`             | checkout               |
| `CARD_TRANSACTION`     | card-transaction       |
| `NON_CARD_TRANSACTION` | non-card-transaction   |
| `REDIRECT_TRANSACTION` | redirect-transaction   |