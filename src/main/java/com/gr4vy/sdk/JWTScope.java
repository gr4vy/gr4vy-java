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
    API_LOGS_READ("api-logs.read"),
    API_LOGS_WRITE("api-logs.write"),
    APPLE_PAY_CERTIFICATES_READ("apple-pay-certificates.read"),
    APPLE_PAY_CERTIFICATES_WRITE("apple-pay-certificates.write"),
    AUDIT_LOGS_READ("audit-logs.read"),
    AUDIT_LOGS_WRITE("audit-logs.write"),
    BUYERS_READ("buyers.read"),
    BUYERS_WRITE("buyers.write"),
    BUYERS_BILLING_DETAILS_READ("buyers.billing-details.read"),
    BUYERS_BILLING_DETAILS_WRITE("buyers.billing-details.write"),
    CARD_SCHEME_DEFINITIONS_READ("card-scheme-definitions.read"),
    CARD_SCHEME_DEFINITIONS_WRITE("card-scheme-definitions.write"),
    CHECKOUT_SESSIONS_READ("checkout-sessions.read"),
    CHECKOUT_SESSIONS_WRITE("checkout-sessions.write"),
    CONNECTIONS_READ("connections.read"),
    CONNECTIONS_WRITE("connections.write"),
    DIGITAL_WALLETS_READ("digital-wallets.read"),
    DIGITAL_WALLETS_WRITE("digital-wallets.write"),
    FLOWS_READ("flows.read"),
    FLOWS_WRITE("flows.write"),
    GIFT_CARD_SERVICE_DEFINITIONS_READ("gift-card-service-definitions.read"),
    GIFT_CARD_SERVICE_DEFINITIONS_WRITE("gift-card-service-definitions.write"),
    GIFT_CARD_SERVICES_READ("gift-card-services.read"),
    GIFT_CARD_SERVICES_WRITE("gift-card-services.write"),
    GIFT_CARDS_READ("gift-cards.read"),
    GIFT_CARDS_WRITE("gift-cards.write"),
    MERCHANT_ACCOUNTS_READ("merchant-accounts.read"),
    MERCHANT_ACCOUNTS_WRITE("merchant-accounts.write"),
    PAYMENT_LINKS_READ("payment-links.read"),
    PAYMENT_LINKS_WRITE("payment-links.write"),
    PAYMENT_METHOD_DEFINITIONS_READ("payment-method-definitions.read"),
    PAYMENT_METHOD_DEFINITIONS_WRITE("payment-method-definitions.write"),
    PAYMENT_METHODS_READ("payment-methods.read"),
    PAYMENT_METHODS_WRITE("payment-methods.write"),
    PAYMENT_OPTIONS_READ("payment-options.read"),
    PAYMENT_OPTIONS_WRITE("payment-options.write"),
    PAYMENT_SERVICE_DEFINITIONS_READ("payment-service-definitions.read"),
    PAYMENT_SERVICE_DEFINITIONS_WRITE("payment-service-definitions.write"),
    PAYMENT_SERVICES_READ("payment-services.read"),
    PAYMENT_SERVICES_WRITE("payment-services.write"),
    PAYOUTS_READ("payouts.read"),
    PAYOUTS_WRITE("payouts.write"),
    REPORTS_READ("reports.read"),
    REPORTS_WRITE("reports.write"),
    ROLES_READ("roles.read"),
    ROLES_WRITE("roles.write"),
    TRANSACTIONS_READ("transactions.read"),
    TRANSACTIONS_WRITE("transactions.write"),
    USERS_ME_READ("users.me.read"),
    USERS_ME_WRITE("users.me.write"),
    VAULT_FORWARD_READ("vault-forward.read"),
    VAULT_FORWARD_WRITE("vault-forward.write"),
    VAULT_FORWARD_AUTHENTICATIONS_READ("vault-forward-authentications.read"),
    VAULT_FORWARD_AUTHENTICATIONS_WRITE("vault-forward-authentications.write"),
    VAULT_FORWARD_CONFIGS_READ("vault-forward-configs.read"),
    VAULT_FORWARD_CONFIGS_WRITE("vault-forward-configs.write"),
    VAULT_FORWARD_DEFINITIONS_READ("vault-forward-definitions.read"),
    VAULT_FORWARD_DEFINITIONS_WRITE("vault-forward-definitions.write"),
    WEBHOOK_SUBSCRIPTIONS_READ("webhook-subscriptions.read"),
    WEBHOOK_SUBSCRIPTIONS_WRITE("webhook-subscriptions.write");

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