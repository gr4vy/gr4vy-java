package com.gr4vy.sdk.processing;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.Buyer;
import com.gr4vy.sdk.models.components.BuyerCreate;
import com.gr4vy.sdk.models.components.BuyerUpdate;
import com.gr4vy.sdk.models.components.ShippingDetails;
import com.gr4vy.sdk.models.components.ShippingDetailsCreate;
import com.gr4vy.sdk.models.operations.ListBuyerGiftCardsRequest;
import com.gr4vy.sdk.models.operations.ListBuyerPaymentMethodsRequest;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;

/**
 * E2E coverage for buyers: create/get/update/list/delete plus the nested
 * payment-methods, gift-cards and shipping-details sub-resources.
 */
class BuyersTest {

    private static Buyer createBuyer(Gr4vy client) throws Exception {
        return client.buyers().create()
                .buyerCreate(BuyerCreate.builder()
                        .displayName("E2E Buyer")
                        .externalIdentifier(Fixtures.uniqueId())
                        .build())
                .call()
                .buyer()
                .orElseThrow();
    }

    private static String buyerId(Buyer b) {
        String id = b.id();
        if (id == null) {
            fail("buyer id was not present on create response");
        }
        return id;
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createGetUpdateListDelete() throws Exception {
        Gr4vy client = Harness.client();

        Buyer b = createBuyer(client);
        String id = buyerId(b);

        client.buyers().get().buyerId(id).call();

        client.buyers().update()
                .buyerId(id)
                .buyerUpdate(BuyerUpdate.builder()
                        .displayName("E2E Buyer Updated")
                        .build())
                .call();

        client.buyers().list().call();

        client.buyers().delete().buyerId(id).call();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void nestedPaymentMethodsAndGiftCards() throws Exception {
        Gr4vy client = Harness.client();
        Buyer b = createBuyer(client);
        String id = buyerId(b);

        client.buyers().paymentMethods().list()
                .request(ListBuyerPaymentMethodsRequest.builder()
                        .buyerId(id)
                        .build())
                .call();

        client.buyers().giftCards().list()
                .request(ListBuyerGiftCardsRequest.builder()
                        .buyerId(id)
                        .build())
                .call();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void shippingDetails() throws Exception {
        Gr4vy client = Harness.client();
        Buyer b = createBuyer(client);
        String id = buyerId(b);

        ShippingDetails sd = client.buyers().shippingDetails().create()
                .buyerId(id)
                .shippingDetailsCreate(ShippingDetailsCreate.builder()
                        .firstName("Jane")
                        .lastName("Doe")
                        .emailAddress("jane.doe@example.com")
                        .phoneNumber("+447700900000")
                        .address(Fixtures.sampleAddress())
                        .build())
                .call()
                .shippingDetails()
                .orElseThrow();

        client.buyers().shippingDetails().list().buyerId(id).call();

        if (!sd.id().isPresent()) {
            fail("shipping details id was not present on create response");
        }
        String sdId = sd.id().get();

        client.buyers().shippingDetails().get()
                .buyerId(id)
                .shippingDetailsId(sdId)
                .call();

        client.buyers().shippingDetails().update()
                .buyerId(id)
                .shippingDetailsId(sdId)
                .shippingDetailsUpdate(com.gr4vy.sdk.models.components.ShippingDetailsUpdate.builder()
                        .firstName("Janet")
                        .build())
                .call();

        client.buyers().shippingDetails().delete()
                .buyerId(id)
                .shippingDetailsId(sdId)
                .call();
    }
}
