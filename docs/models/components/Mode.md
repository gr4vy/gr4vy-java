# Mode

## Example Usage

```java
import com.gr4vy.sdk.models.components.Mode;

Mode value = Mode.CARD;

// Open enum: use .of() to create instances from custom string values
Mode custom = Mode.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `CARD`             | card               |
| `REDIRECT`         | redirect           |
| `APPLEPAY`         | applepay           |
| `GOOGLEPAY`        | googlepay          |
| `CHECKOUT_SESSION` | checkout-session   |
| `CLICK_TO_PAY`     | click-to-pay       |
| `GIFT_CARD`        | gift-card          |
| `BANK`             | bank               |
| `PAZE`             | paze               |