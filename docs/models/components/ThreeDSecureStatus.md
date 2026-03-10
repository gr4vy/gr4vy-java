# ThreeDSecureStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.ThreeDSecureStatus;

ThreeDSecureStatus value = ThreeDSecureStatus.SETUP_ERROR;

// Open enum: use .of() to create instances from custom string values
ThreeDSecureStatus custom = ThreeDSecureStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `SETUP_ERROR` | setup_error   |
| `ERROR`       | error         |
| `DECLINED`    | declined      |
| `CANCELLED`   | cancelled     |
| `COMPLETE`    | complete      |