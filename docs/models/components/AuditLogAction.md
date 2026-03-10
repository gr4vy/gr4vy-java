# AuditLogAction

## Example Usage

```java
import com.gr4vy.sdk.models.components.AuditLogAction;

AuditLogAction value = AuditLogAction.CREATED;

// Open enum: use .of() to create instances from custom string values
AuditLogAction custom = AuditLogAction.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `CREATED`  | created    |
| `UPDATED`  | updated    |
| `DELETED`  | deleted    |
| `VOIDED`   | voided     |
| `CANCELED` | canceled   |
| `CAPTURED` | captured   |