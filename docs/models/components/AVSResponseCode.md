# AVSResponseCode

## Example Usage

```java
import com.gr4vy.sdk.models.components.AVSResponseCode;

AVSResponseCode value = AVSResponseCode.MATCH;

// Open enum: use .of() to create instances from custom string values
AVSResponseCode custom = AVSResponseCode.of("custom_value");
```


## Values

| Name                     | Value                    |
| ------------------------ | ------------------------ |
| `MATCH`                  | match                    |
| `NO_MATCH`               | no_match                 |
| `PARTIAL_MATCH_ADDRESS`  | partial_match_address    |
| `PARTIAL_MATCH_POSTCODE` | partial_match_postcode   |
| `PARTIAL_MATCH_NAME`     | partial_match_name       |
| `UNAVAILABLE`            | unavailable              |