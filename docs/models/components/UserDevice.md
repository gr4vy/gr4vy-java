# UserDevice

The platform that is being used to access the website.

## Example Usage

```java
import com.gr4vy.sdk.models.components.UserDevice;

UserDevice value = UserDevice.DESKTOP;

// Open enum: use .of() to create instances from custom string values
UserDevice custom = UserDevice.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `DESKTOP` | desktop   |
| `MOBILE`  | mobile    |