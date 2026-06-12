package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.Field;
import com.gr4vy.sdk.models.components.PaymentService;
import com.gr4vy.sdk.models.components.PaymentServiceCreate;
import com.gr4vy.sdk.models.components.PaymentServiceUpdate;
import com.gr4vy.sdk.models.components.VerifyCredentials;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the payment-services endpoints. Create/get/update/list run
 * against the deterministic mock-card definition and expect real 2xx responses.
 * Delete is exercised on a throwaway service. Verify and session cannot return a
 * clean 2xx against the mock (no live credentials / session provider), so they
 * are asserted via {@link Reaches}.
 */
class PaymentServicesTest {

    /** Builds a mock-card service-create body bound to the test merchant. */
    private static PaymentServiceCreate mockCardService(String displayName, String merchantId) {
        return PaymentServiceCreate.builder()
                .displayName(displayName)
                .paymentServiceDefinitionId("mock-card")
                .acceptedCurrencies(List.of("USD", "EUR", "GBP"))
                .acceptedCountries(List.of("US", "GB"))
                .fields(List.of(Field.builder()
                        .key("merchant_id")
                        .value(merchantId)
                        .build()))
                .build();
    }

    private static String createService(Gr4vy client, String displayName) throws Exception {
        String merchantId = Harness.merchant().merchantAccountId;
        PaymentService service = client.paymentServices().create()
                .paymentServiceCreate(mockCardService(displayName, merchantId))
                .call()
                .paymentService()
                .orElseThrow(() -> new IllegalStateException("create returned no payment service"));
        String id = service.id().orElseThrow(() -> new IllegalStateException("payment service has no id"));
        assertFalse(id.isEmpty(), "created payment service id must be non-empty");
        return id;
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void create() throws Exception {
        createService(Harness.client(), "E2E ps create");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void get() throws Exception {
        Gr4vy client = Harness.client();
        String id = createService(client, "E2E ps get");
        assertNotNull(client.paymentServices().get().paymentServiceId(id).call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void update() throws Exception {
        Gr4vy client = Harness.client();
        String id = createService(client, "E2E ps update");
        assertNotNull(client.paymentServices().update()
                .paymentServiceId(id)
                .paymentServiceUpdate(PaymentServiceUpdate.builder()
                        .displayName("E2E ps updated")
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        assertNotNull(client.paymentServices().list().call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void delete() throws Exception {
        Gr4vy client = Harness.client();
        String id = createService(client, "E2E ps delete");
        assertNotNull(client.paymentServices().delete().paymentServiceId(id).call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void verify() {
        Gr4vy client = Harness.client();
        String merchantId = Harness.merchant().merchantAccountId;
        Reaches.reaches("payment_services.verify", () -> client.paymentServices().verify()
                .verifyCredentials(VerifyCredentials.builder()
                        .paymentServiceDefinitionId("mock-card")
                        .fields(List.of(Field.builder()
                                .key("merchant_id")
                                .value(merchantId)
                                .build()))
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void session() throws Exception {
        Gr4vy client = Harness.client();
        String id = createService(client, "E2E ps session");
        Reaches.reaches("payment_services.session", () -> client.paymentServices().session()
                .paymentServiceId(id)
                .requestBody(java.util.Map.of())
                .call());
    }
}
