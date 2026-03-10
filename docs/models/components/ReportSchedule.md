# ReportSchedule

## Example Usage

```java
import com.gr4vy.sdk.models.components.ReportSchedule;

ReportSchedule value = ReportSchedule.DAILY;

// Open enum: use .of() to create instances from custom string values
ReportSchedule custom = ReportSchedule.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `DAILY`   | daily     |
| `MONTHLY` | monthly   |
| `ONCE`    | once      |
| `WEEKLY`  | weekly    |