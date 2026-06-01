package com.gr4vy.sdk.flows;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CheckoutSession;
import com.gr4vy.sdk.models.components.CheckoutSessionCreate;
import com.gr4vy.sdk.models.operations.CreateCheckoutSessionResponse;
import com.gr4vy.sdk.models.operations.GetCheckoutSessionResponse;
import com.gr4vy.sdk.models.operations.UpdateCheckoutSessionResponse;
import com.gr4vy.sdk.util.Checkout;
import com.gr4vy.sdk.util.Harness;

/**
 * Full happy-path lifecycle for a checkout session: create, read, secure an
 * approving card into it via the field PUT, update the session, then delete it.
 */
class CheckoutSessionLifecycleTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void checkoutSessionLifecycle() throws Exception {
        Gr4vy client = Harness.client();

        // 1. Create a checkout session.
        CreateCheckoutSessionResponse createRes = client.checkoutSessions().create()
                .checkoutSessionCreate(CheckoutSessionCreate.builder().build())
                .call();
        CheckoutSession created = createRes.checkoutSession().orElseThrow();
        String sid = created.id();
        assertNotNull(sid, "checkout session should have an id");

        // 2. Read the session back.
        GetCheckoutSessionResponse getRes = client.checkoutSessions().get()
                .sessionId(sid)
                .call();
        CheckoutSession fetched = getRes.checkoutSession().orElseThrow();
        assertEquals(sid, fetched.id());

        // 3. Secure the approving card into the session (raw field PUT, expects 204).
        Checkout.putCard(sid);

        // 4. Update the session.
        UpdateCheckoutSessionResponse updateRes = client.checkoutSessions().update()
                .sessionId(sid)
                .checkoutSessionCreate(CheckoutSessionCreate.builder().build())
                .call();
        CheckoutSession updated = updateRes.checkoutSession().orElseThrow();
        assertEquals(sid, updated.id());

        // 5. Delete the session.
        client.checkoutSessions().delete()
                .sessionId(sid)
                .call();
    }
}
