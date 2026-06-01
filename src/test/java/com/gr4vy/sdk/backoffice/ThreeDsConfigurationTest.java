package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CardScheme;
import com.gr4vy.sdk.models.components.MerchantAccountThreeDSConfigurationCreate;
import com.gr4vy.sdk.models.components.MerchantAccountThreeDSConfigurationUpdate;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the per-merchant 3DS configuration endpoints. All four
 * operations take the merchant account id as a path parameter. Listing is fully
 * supported by the sandbox; create/update/delete need a real 3DS provider, so
 * they are asserted via {@link Reaches}.
 */
class ThreeDsConfigurationTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        String maid = Harness.merchant().merchantAccountId;
        assertNotNull(client.merchantAccounts().threeDsConfiguration().list()
                .merchantAccountId(maid)
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void create() {
        Gr4vy client = Harness.client();
        String maid = Harness.merchant().merchantAccountId;
        Reaches.reaches("three_ds_configuration.create", () -> client.merchantAccounts().threeDsConfiguration().create()
                .merchantAccountId(maid)
                .merchantAccountThreeDSConfigurationCreate(MerchantAccountThreeDSConfigurationCreate.builder()
                        .merchantAcquirerBin("123456")
                        .merchantAcquirerId("acquirer-1")
                        .merchantName("E2E Merchant")
                        .merchantCountryCode("826")
                        .merchantCategoryCode("5411")
                        .merchantUrl("https://example.com")
                        .scheme(CardScheme.VISA)
                        .metadata(Map.of())
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void update() {
        Gr4vy client = Harness.client();
        String maid = Harness.merchant().merchantAccountId;
        Reaches.reaches("three_ds_configuration.update", () -> client.merchantAccounts().threeDsConfiguration().update()
                .merchantAccountId(maid)
                .threeDsConfigurationId(Fixtures.MISSING_ID)
                .merchantAccountThreeDSConfigurationUpdate(MerchantAccountThreeDSConfigurationUpdate.builder()
                        .merchantName("E2E Merchant Updated")
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void delete() {
        Gr4vy client = Harness.client();
        String maid = Harness.merchant().merchantAccountId;
        Reaches.reaches("three_ds_configuration.delete", () -> client.merchantAccounts().threeDsConfiguration().delete()
                .merchantAccountId(maid)
                .threeDsConfigurationId(Fixtures.MISSING_ID)
                .call());
    }
}
