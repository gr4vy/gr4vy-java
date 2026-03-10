# AntiFraudDecision

## Example Usage

```java
import com.gr4vy.sdk.models.components.AntiFraudDecision;

AntiFraudDecision value = AntiFraudDecision.ACCEPT;

// Open enum: use .of() to create instances from custom string values
AntiFraudDecision custom = AntiFraudDecision.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `ACCEPT`    | accept      |
| `ERROR`     | error       |
| `EXCEPTION` | exception   |
| `REJECT`    | reject      |
| `REVIEW`    | review      |
| `SKIPPED`   | skipped     |
| `PENDING`   | pending     |