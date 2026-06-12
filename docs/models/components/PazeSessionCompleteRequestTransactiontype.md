# PazeSessionCompleteRequestTransactiontype

The type of transaction being completed. PURCHASE for a one-off checkout, CARD_ON_FILE to retain the card for future use, or BOTH.

## Example Usage

```java
import com.gr4vy.sdk.models.components.PazeSessionCompleteRequestTransactiontype;

PazeSessionCompleteRequestTransactiontype value = PazeSessionCompleteRequestTransactiontype.PURCHASE;

// Open enum: use .of() to create instances from custom string values
PazeSessionCompleteRequestTransactiontype custom = PazeSessionCompleteRequestTransactiontype.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `PURCHASE`     | PURCHASE       |
| `CARD_ON_FILE` | CARD_ON_FILE   |
| `BOTH`         | BOTH           |