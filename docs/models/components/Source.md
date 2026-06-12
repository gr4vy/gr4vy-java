# Source

The platform that the Paze session is being created for. Defaults to `web`.

## Example Usage

```java
import com.gr4vy.sdk.models.components.Source;

Source value = Source.WEB;

// Open enum: use .of() to create instances from custom string values
Source custom = Source.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `WEB`    | web      |
| `MOBILE` | mobile   |