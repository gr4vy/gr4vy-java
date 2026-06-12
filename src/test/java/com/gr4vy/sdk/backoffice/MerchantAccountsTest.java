package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.security.SecureRandom;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.MerchantAccount;
import com.gr4vy.sdk.models.components.MerchantAccountCreate;
import com.gr4vy.sdk.models.components.MerchantAccountUpdate;
import com.gr4vy.sdk.util.Harness;

/**
 * E2E coverage for the merchant-accounts endpoints: list, create, get and
 * update. These are admin-level operations that the deterministic sandbox fully
 * supports, so each assertion expects a real 2xx response.
 */
class MerchantAccountsTest {

    /** A fresh 8-char hex id, mirroring how the harness names merchants. */
    private static String randomMerchantId() {
        byte[] bytes = new byte[4];
        new SecureRandom().nextBytes(bytes);
        StringBuilder sb = new StringBuilder(8);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        assertNotNull(client.merchantAccounts().list().call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void create() throws Exception {
        Gr4vy client = Harness.client();
        String id = randomMerchantId();
        MerchantAccount account = client.merchantAccounts().create()
                .request(MerchantAccountCreate.builder()
                        .id(id)
                        .displayName(id)
                        .build())
                .call()
                .merchantAccount()
                .orElseThrow(() -> new IllegalStateException("create returned no merchant account"));
        assertFalse(account.id().isEmpty(), "created merchant account id must be non-empty");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void get() throws Exception {
        Gr4vy client = Harness.client();
        String maid = Harness.merchant().merchantAccountId;
        MerchantAccount account = client.merchantAccounts().get()
                .merchantAccountId(maid)
                .call()
                .merchantAccount()
                .orElseThrow(() -> new IllegalStateException("get returned no merchant account"));
        assertFalse(account.id().isEmpty(), "fetched merchant account id must be non-empty");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void update() throws Exception {
        Gr4vy client = Harness.client();
        String maid = Harness.merchant().merchantAccountId;
        // Send a benign field so the update is a no-op behaviourally but still
        // exercises the PUT path.
        assertNotNull(client.merchantAccounts().update()
                .merchantAccountId(maid)
                .merchantAccountUpdate(MerchantAccountUpdate.builder()
                        .displayName(maid)
                        .build())
                .call());
    }
}
