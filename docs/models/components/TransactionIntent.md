# TransactionIntent

## Example Usage

```java
import com.gr4vy.sdk.models.components.TransactionIntent;

TransactionIntent value = TransactionIntent.AUTHORIZE;

// Open enum: use .of() to create instances from custom string values
TransactionIntent custom = TransactionIntent.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `AUTHORIZE` | authorize   |
| `CAPTURE`   | capture     |