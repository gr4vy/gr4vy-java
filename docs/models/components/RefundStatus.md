# RefundStatus

## Example Usage

```java
import com.gr4vy.sdk.models.components.RefundStatus;

RefundStatus value = RefundStatus.PROCESSING;

// Open enum: use .of() to create instances from custom string values
RefundStatus custom = RefundStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `PROCESSING` | processing   |
| `SUCCEEDED`  | succeeded    |
| `FAILED`     | failed       |
| `DECLINED`   | declined     |
| `VOIDED`     | voided       |