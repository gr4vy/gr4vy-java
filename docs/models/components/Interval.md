# Interval

The cadence unit for the subscription plan.

## Example Usage

```java
import com.gr4vy.sdk.models.components.Interval;

Interval value = Interval.DAY;

// Open enum: use .of() to create instances from custom string values
Interval custom = Interval.of("custom_value");
```


## Values

| Name    | Value   |
| ------- | ------- |
| `DAY`   | DAY     |
| `WEEK`  | WEEK    |
| `MONTH` | MONTH   |
| `YEAR`  | YEAR    |