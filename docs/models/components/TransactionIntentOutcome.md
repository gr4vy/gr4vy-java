# TransactionIntentOutcome

## Example Usage

```java
import com.gr4vy.sdk.models.components.TransactionIntentOutcome;

TransactionIntentOutcome value = TransactionIntentOutcome.PENDING;

// Open enum: use .of() to create instances from custom string values
TransactionIntentOutcome custom = TransactionIntentOutcome.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | pending     |
| `SUCCEEDED` | succeeded   |
| `FAILED`    | failed      |