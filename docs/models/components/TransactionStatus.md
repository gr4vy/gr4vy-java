# TransactionStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.TransactionStatus;

TransactionStatus value = TransactionStatus.PROCESSING;

// Open enum: use .of() to create instances from custom string values
TransactionStatus custom = TransactionStatus.of("custom_value");
```


## Values

| Name                         | Value                        |
| ---------------------------- | ---------------------------- |
| `PROCESSING`                 | processing                   |
| `AUTHORIZATION_SUCCEEDED`    | authorization_succeeded      |
| `AUTHORIZATION_DECLINED`     | authorization_declined       |
| `AUTHORIZATION_FAILED`       | authorization_failed         |
| `AUTHORIZATION_VOIDED`       | authorization_voided         |
| `AUTHORIZATION_VOID_PENDING` | authorization_void_pending   |
| `CAPTURE_SUCCEEDED`          | capture_succeeded            |
| `CAPTURE_PENDING`            | capture_pending              |
| `BUYER_APPROVAL_PENDING`     | buyer_approval_pending       |