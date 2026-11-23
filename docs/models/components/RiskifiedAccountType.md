# RiskifiedAccountType

The customer account types recommended by Riskified.

## Example Usage

```java
import com.gr4vy.sdk.models.components.RiskifiedAccountType;

RiskifiedAccountType value = RiskifiedAccountType.GUEST;

// Open enum: use .of() to create instances from custom string values
RiskifiedAccountType custom = RiskifiedAccountType.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `GUEST`      | guest        |
| `REGISTERED` | registered   |
| `PREMIUM`    | premium      |
| `BUSINESS`   | business     |