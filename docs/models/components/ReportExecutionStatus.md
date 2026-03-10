# ReportExecutionStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.ReportExecutionStatus;

ReportExecutionStatus value = ReportExecutionStatus.DISPATCHED;

// Open enum: use .of() to create instances from custom string values
ReportExecutionStatus custom = ReportExecutionStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `DISPATCHED` | dispatched   |
| `FAILED`     | failed       |
| `PENDING`    | pending      |
| `PROCESSING` | processing   |
| `SUCCEEDED`  | succeeded    |