# GiftCardRedemptionStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.GiftCardRedemptionStatus;

GiftCardRedemptionStatus value = GiftCardRedemptionStatus.CREATED;

// Open enum: use .of() to create instances from custom string values
GiftCardRedemptionStatus custom = GiftCardRedemptionStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `CREATED`   | created     |
| `SUCCEEDED` | succeeded   |
| `FAILED`    | failed      |
| `SKIPPED`   | skipped     |