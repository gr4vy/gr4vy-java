# Intent

Primary intent of the checkout session.

## Example Usage

```java
import com.gr4vy.sdk.models.components.Intent;

Intent value = Intent.REVIEW_AND_PAY;

// Open enum: use .of() to create instances from custom string values
Intent custom = Intent.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `REVIEW_AND_PAY`   | REVIEW_AND_PAY     |
| `EXPRESS_CHECKOUT` | EXPRESS_CHECKOUT   |
| `ADD_CARD`         | ADD_CARD           |