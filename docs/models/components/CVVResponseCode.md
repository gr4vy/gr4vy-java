# CVVResponseCode

## Example Usage

```java
import com.gr4vy.sdk.models.components.CVVResponseCode;

CVVResponseCode value = CVVResponseCode.MATCH;

// Open enum: use .of() to create instances from custom string values
CVVResponseCode custom = CVVResponseCode.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `MATCH`        | match          |
| `NO_MATCH`     | no_match       |
| `UNAVAILABLE`  | unavailable    |
| `NOT_PROVIDED` | not_provided   |