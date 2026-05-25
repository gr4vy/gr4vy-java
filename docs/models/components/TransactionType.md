# TransactionType

## Example Usage

```java
import com.gr4vy.sdk.models.components.TransactionType;

TransactionType value = TransactionType.PURCHASE;

// Open enum: use .of() to create instances from custom string values
TransactionType custom = TransactionType.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `PURCHASE`     | PURCHASE       |
| `CARD_ON_FILE` | CARD_ON_FILE   |
| `BOTH`         | BOTH           |