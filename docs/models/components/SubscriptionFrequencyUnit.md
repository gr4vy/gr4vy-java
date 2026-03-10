# SubscriptionFrequencyUnit

Indicates the frequency unit for the subscription. Allowed values are: `DAY`, `WEEK`, `MONTH`, `BI_MONTHLY`, `QUARTER`, `SEMI_ANNUALLY`, `YEAR`, `ONDEMAND`.

## Example Usage

```java
import com.gr4vy.sdk.models.components.SubscriptionFrequencyUnit;

SubscriptionFrequencyUnit value = SubscriptionFrequencyUnit.MONTH;

// Open enum: use .of() to create instances from custom string values
SubscriptionFrequencyUnit custom = SubscriptionFrequencyUnit.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `MONTH`         | MONTH           |
| `WEEK`          | WEEK            |
| `BI_MONTHLY`    | BI_MONTHLY      |
| `ONDEMAND`      | ONDEMAND        |
| `QUARTER`       | QUARTER         |
| `YEAR`          | YEAR            |
| `SEMI_ANNUALLY` | SEMI_ANNUALLY   |
| `DAY`           | DAY             |