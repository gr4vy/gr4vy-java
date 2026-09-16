# SecCode

## Example Usage

```java
import com.gr4vy.sdk.models.components.SecCode;

SecCode value = SecCode.WEB_DEBIT;

// Open enum: use .of() to create instances from custom string values
SecCode custom = SecCode.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `WEB_DEBIT` | WebDebit    |
| `TEL_DEBIT` | TelDebit    |
| `PPD_DEBIT` | PpdDebit    |