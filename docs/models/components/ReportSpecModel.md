# ReportSpecModel

## Example Usage

```java
import com.gr4vy.sdk.models.components.ReportSpecModel;

ReportSpecModel value = ReportSpecModel.TRANSACTIONS;

// Open enum: use .of() to create instances from custom string values
ReportSpecModel custom = ReportSpecModel.of("custom_value");
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `TRANSACTIONS`         | transactions           |
| `TRANSACTION_RETRIES`  | transaction_retries    |
| `DETAILED_SETTLEMENT`  | detailed_settlement    |
| `ACCOUNTS_RECEIVABLES` | accounts_receivables   |