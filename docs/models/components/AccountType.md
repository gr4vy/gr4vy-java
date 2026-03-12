# AccountType

Specify whether this is a `checking` or `savings` account

## Example Usage

```java
import com.gr4vy.sdk.models.components.AccountType;

AccountType value = AccountType.CHECKING;

// Open enum: use .of() to create instances from custom string values
AccountType custom = AccountType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `CHECKING` | checking   |
| `SAVINGS`  | savings    |