# CardType

## Example Usage

```java
import com.gr4vy.sdk.models.components.CardType;

CardType value = CardType.CREDIT;

// Open enum: use .of() to create instances from custom string values
CardType custom = CardType.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `CREDIT`  | credit    |
| `DEBIT`   | debit     |
| `PREPAID` | prepaid   |