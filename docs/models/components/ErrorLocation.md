# ErrorLocation

## Example Usage

```java
import com.gr4vy.sdk.models.components.ErrorLocation;

ErrorLocation value = ErrorLocation.QUERY;

// Open enum: use .of() to create instances from custom string values
ErrorLocation custom = ErrorLocation.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `QUERY`   | query     |
| `BODY`    | body      |
| `PATH`    | path      |
| `HEADER`  | header    |
| `UNKNOWN` | unknown   |