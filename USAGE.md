<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.errors.HTTPValidationError;
import com.gr4vy.sdk.models.operations.BrowsePaymentMethodDefinitionsGetResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws HTTPValidationError, Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("<id>")
                .bearerAuth(System.getenv().getOrDefault("BEARER_AUTH", ""))
            .build();

        BrowsePaymentMethodDefinitionsGetResponse res = sdk.browsePaymentMethodDefinitionsGet()
                .call();

        if (res.any().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->