package com.gr4vy.sdk.util;

import java.util.UUID;

import com.gr4vy.sdk.models.components.Address;
import com.gr4vy.sdk.models.components.BillingDetails;
import com.gr4vy.sdk.models.components.CardPaymentMethodCreate;
import com.gr4vy.sdk.models.components.CardWithUrlPaymentMethodCreate;
import com.gr4vy.sdk.models.components.CartItem;

/** Shared, deterministic test data for the E2E suite. */
public final class Fixtures {

    private Fixtures() {}

    /** A card the mock-card service always approves. */
    public static final String APPROVING_CARD_NUMBER = "4111111111111111";
    public static final String CARD_EXPIRATION_DATE = "12/35";
    public static final String CARD_SECURITY_CODE = "123";

    /** A well-formed UUID that does not exist — for get/delete "missing" reach tests. */
    public static final String MISSING_ID = "11111111-1111-1111-1111-111111111111";

    /** A fresh, unique identifier (e.g. for buyer external identifiers). */
    public static String uniqueId() {
        return UUID.randomUUID().toString();
    }

    /** A card-payment-method create body the mock service approves. */
    public static CardPaymentMethodCreate approvingCard() {
        return CardPaymentMethodCreate.builder()
                .number(APPROVING_CARD_NUMBER)
                .expirationDate(CARD_EXPIRATION_DATE)
                .securityCode(CARD_SECURITY_CODE)
                .build();
    }

    /**
     * The approving card as the inline payment-method variant accepted by
     * {@code transactions().create()} (a different union member than the
     * stored-card body used by {@code paymentMethods().create()}).
     */
    public static CardWithUrlPaymentMethodCreate approvingTransactionCard() {
        return CardWithUrlPaymentMethodCreate.builder()
                .number(APPROVING_CARD_NUMBER)
                .expirationDate(CARD_EXPIRATION_DATE)
                .securityCode(CARD_SECURITY_CODE)
                .build();
    }

    /** A sample billing/shipping address (GB). */
    public static Address sampleAddress() {
        return Address.builder()
                .city("London")
                .country("GB")
                .postalCode("EC1A 1BB")
                .state("England")
                .houseNumberOrName("1")
                .build();
    }

    /** Sample billing details wrapping {@link #sampleAddress()}. */
    public static BillingDetails sampleBillingDetails() {
        return BillingDetails.builder()
                .firstName("Jane")
                .lastName("Doe")
                .emailAddress("jane.doe@example.com")
                .address(sampleAddress())
                .build();
    }

    /** A single cart item for transactions/payment-links that require one. */
    public static CartItem sampleCartItem() {
        return CartItem.builder()
                .name("E2E widget")
                .quantity(1L)
                .unitAmount(1299L)
                .build();
    }
}
