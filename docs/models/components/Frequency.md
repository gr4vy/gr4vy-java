# Frequency

Indicates the frequency unit for the subscription. Allowed values are: `WEEKLY`, `MONTHLY`, `QUARTERLY`, `SEMI_ANNUAL`, `ANNUAL`.

## Example Usage

```java
import com.gr4vy.sdk.models.components.Frequency;

Frequency value = Frequency.WEEKLY;

// Open enum: use .of() to create instances from custom string values
Frequency custom = Frequency.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `WEEKLY`      | WEEKLY        |
| `MONTHLY`     | MONTHLY       |
| `QUARTERLY`   | QUARTERLY     |
| `SEMI_ANNUAL` | SEMI_ANNUAL   |
| `ANNUAL`      | ANNUAL        |