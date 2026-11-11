# PaymentLinkIntent

## Example Usage

```java
import com.gr4vy.sdk.models.components.PaymentLinkIntent;

PaymentLinkIntent value = PaymentLinkIntent.AUTHORIZE;

// Open enum: use .of() to create instances from custom string values
PaymentLinkIntent custom = PaymentLinkIntent.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `AUTHORIZE`        | authorize          |
| `CAPTURE`          | capture            |
| `PREFER_AUTHORIZE` | prefer_authorize   |