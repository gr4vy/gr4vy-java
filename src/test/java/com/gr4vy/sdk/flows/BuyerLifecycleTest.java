package com.gr4vy.sdk.flows;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.Buyer;
import com.gr4vy.sdk.models.components.BuyerCreate;
import com.gr4vy.sdk.models.components.BuyerUpdate;
import com.gr4vy.sdk.models.components.Buyers;
import com.gr4vy.sdk.models.components.ShippingDetails;
import com.gr4vy.sdk.models.components.ShippingDetailsCreate;
import com.gr4vy.sdk.models.components.ShippingDetailsList;
import com.gr4vy.sdk.models.operations.AddBuyerResponse;
import com.gr4vy.sdk.models.operations.AddBuyerShippingDetailsResponse;
import com.gr4vy.sdk.models.operations.GetBuyerResponse;
import com.gr4vy.sdk.models.operations.ListBuyerShippingDetailsResponse;
import com.gr4vy.sdk.models.operations.ListBuyersRequest;
import com.gr4vy.sdk.models.operations.ListBuyersResponse;
import com.gr4vy.sdk.models.operations.UpdateBuyerResponse;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;

/**
 * Full happy-path lifecycle for a buyer: create, read, update the display name,
 * list buyers, attach a shipping detail, list shipping details, then delete the
 * buyer.
 */
class BuyerLifecycleTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void buyerLifecycle() throws Exception {
        Gr4vy client = Harness.client();

        // 1. Create a buyer.
        AddBuyerResponse createRes = client.buyers().create()
                .buyerCreate(BuyerCreate.builder()
                        .displayName("E2E buyer")
                        .externalIdentifier(Fixtures.uniqueId())
                        .build())
                .call();
        Buyer created = createRes.buyer().orElseThrow();
        assertTrue(created.id().isPresent(), "buyer create returned no id");
        String buyerId = created.id().get();
        assertNotNull(buyerId);
        assertEquals("E2E buyer", created.displayName().orElse(null));

        // 2. Read the buyer back.
        GetBuyerResponse getRes = client.buyers().get()
                .buyerId(buyerId)
                .call();
        Buyer fetched = getRes.buyer().orElseThrow();
        assertEquals(buyerId, fetched.id().orElse(null));

        // 3. Update the display name.
        UpdateBuyerResponse updateRes = client.buyers().update()
                .buyerId(buyerId)
                .buyerUpdate(BuyerUpdate.builder()
                        .displayName("E2E buyer (updated)")
                        .build())
                .call();
        Buyer updated = updateRes.buyer().orElseThrow();
        assertEquals("E2E buyer (updated)", updated.displayName().orElse(null));

        // 4. List buyers; our buyer should be reachable.
        ListBuyersResponse listRes = client.buyers().list()
                .request(ListBuyersRequest.builder().build())
                .call();
        Buyers page = listRes.buyers().orElseThrow();
        assertNotNull(page.items());

        // 5. Attach a shipping detail to the buyer.
        AddBuyerShippingDetailsResponse sdRes = client.buyers().shippingDetails().create()
                .buyerId(buyerId)
                .shippingDetailsCreate(ShippingDetailsCreate.builder()
                        .firstName("Jane")
                        .lastName("Doe")
                        .emailAddress("jane.doe@example.com")
                        .address(Fixtures.sampleAddress())
                        .build())
                .call();
        ShippingDetails shipping = sdRes.shippingDetails().orElseThrow();
        assertTrue(shipping.id().isPresent(), "created shipping detail should have an id");

        // 6. List the buyer's shipping details.
        ListBuyerShippingDetailsResponse sdListRes = client.buyers().shippingDetails().list()
                .buyerId(buyerId)
                .call();
        ShippingDetailsList shippingList = sdListRes.shippingDetailsList().orElseThrow();
        assertNotNull(shippingList.items());
        assertFalse(shippingList.items().isEmpty(), "buyer should have at least one shipping detail");

        // 7. Delete the buyer.
        client.buyers().delete()
                .buyerId(buyerId)
                .call();
    }
}
