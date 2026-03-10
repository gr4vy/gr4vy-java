# CaptureStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.CaptureStatus;

CaptureStatus value = CaptureStatus.SUCCEEDED;

// Open enum: use .of() to create instances from custom string values
CaptureStatus custom = CaptureStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `SUCCEEDED` | succeeded   |
| `PENDING`   | pending     |
| `DECLINED`  | declined    |
| `FAILED`    | failed      |