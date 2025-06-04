<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.AccountUpdaterJobCreate;
import com.gr4vy.sdk.models.errors.*;
import com.gr4vy.sdk.models.operations.CreateAccountUpdaterJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Gr4vy sdk = Gr4vy.builder()
                .merchantAccountId("default")
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateAccountUpdaterJobResponse res = sdk.accountUpdater().jobs().create()
                .accountUpdaterJobCreate(AccountUpdaterJobCreate.builder()
                    .paymentMethodIds(List.of(
                        "ef9496d8-53a5-4aad-8ca2-00eb68334389",
                        "f29e886e-93cc-4714-b4a3-12b7a718e595"))
                    .build())
                .call();

        if (res.accountUpdaterJob().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->