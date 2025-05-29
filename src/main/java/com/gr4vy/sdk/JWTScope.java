package com.gr4vy.sdk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum JWTScope {

    READ_ALL("*.read"),
    WRITE_ALL("*.write"),
    EMBED("embed"),
    ANTI_FRAUD_SERVICE_DEFINITIONS_READ("anti-fraud-service-definitions.read"),
    ANTI_FRAUD_SERVICE_DEFINITIONS_WRITE("anti-fraud-service-definitions.write"),
    ANTI_FRAUD_SERVICES_READ("anti-fraud-services.read"),
    ANTI_FRAUD_SERVICES_WRITE("anti-fraud-services.write"),
    AUDIT_LOGS_READ("audit-logs.read"),
    BUYERS_READ("buyers.read"),
    BUYERS_WRITE("buyers.write"),
    BUYERS_BILLING_DETAILS_READ("buyers.billing-details.read"),
    BUYERS_BILLING_DETAILS_WRITE("buyers.billing-details.write"),
    CARD_SCHEME_DEFINITIONS_READ("card-scheme-definitions.read"),
    CHECKOUT_SESSIONS_READ("checkout-sessions.read"),
    CHECKOUT_SESSIONS_WRITE("checkout-sessions.write"),
    CONNECTIONS_READ("connections.read"),
    CONNECTIONS_WRITE("connections.write"),
    DIGITAL_WALLETS_READ("digital-wallets.read"),
    DIGITAL_WALLETS_WRITE("digital-wallets.write"),
    FLOWS_READ("flows.read"),
    FLOWS_WRITE("flows.write"),
    GIFT_CARD_SERVICE_DEFINITIONS_READ("gift-card-service-definitions.read"),
    GIFT_CARD_SERVICES_READ("gift-card-services.read"),
    GIFT_CARD_SERVICES_WRITE("gift-card-services.write"),
    GIFT_CARDS_READ("gift-cards.read"),
    GIFT_CARDS_WRITE("gift-cards.write"),
    MERCHANT_ACCOUNT_READ("merchant-accounts.reads"),
    MERCHANT_ACCOUNT_WRITE("merchant-accounts.write"),
    PAYMENT_METHOD_DEFINITIONS_READ("payment-method-definitions.read"),
    PAYMENT_METHOD_READ("payment-methods.read"),
    PAYMENT_METHOD_WRITE("payment-methods.write"),
    PAYMENT_OPTIONS_READ("payment-options.read"),
    PAYMENT_SERVICE_DEFINITIONS_READ("payment-service-definitions.read"),
    PAYMENT_SERVICES_READ("payment-services.read"),
    PAYMENT_SERVICES_WRITE("payment-services.write"),
    REPORTS_READ("reports.read"),
    REPORTS_WRITE("reports.write"),
    TRANSACTIONS_READ("transactions.read"),
    TRANSACTIONS_WRITE("transactions.write"),
    VAULT_FORWARD_WRITE("vault-forward.write");

    private final String value;

    JWTScope(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // Optional: Override toString() to return the string value directly
    @Override
    public String toString() {
        return value;
    }

    // Optional: Static method to get enum from string value
    public static JWTScope fromValue(String value) {
        for (JWTScope scope : JWTScope.values()) {
            if (scope.value.equals(value)) {
                return scope;
            }
        }
        throw new IllegalArgumentException("Unknown scope: " + value);
    }

    public static List<JWTScope> fromStringList(List<String> scopeStrings) {
        if (scopeStrings == null) {
            return null;
        }
        return scopeStrings.stream()
                .map(s -> Arrays.stream(JWTScope.values())
                        .filter(scope -> scope.getValue().equals(s))
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("Unknown scope: " + s)))
                .collect(Collectors.toList());
    }

}