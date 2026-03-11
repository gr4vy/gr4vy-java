# InstrumentType

## Example Usage

```java
import com.gr4vy.sdk.models.components.InstrumentType;

InstrumentType value = InstrumentType.PAN;

// Open enum: use .of() to create instances from custom string values
InstrumentType custom = InstrumentType.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PAN`            | pan              |
| `CARD_TOKEN`     | card_token       |
| `REDIRECT`       | redirect         |
| `REDIRECT_TOKEN` | redirect_token   |
| `GOOGLEPAY`      | googlepay        |
| `APPLEPAY`       | applepay         |
| `NETWORK_TOKEN`  | network_token    |
| `PLAID`          | plaid            |
| `BANK_DETAILS`   | bank_details     |