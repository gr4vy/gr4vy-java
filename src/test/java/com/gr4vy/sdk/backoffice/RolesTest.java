package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CollectionRole;
import com.gr4vy.sdk.models.components.Role;
import com.gr4vy.sdk.util.Harness;

/**
 * E2E coverage for the roles list endpoint. The instance's role set is not
 * ours to control, so this checks the shape of whatever comes back rather
 * than asserting the list is non-empty.
 */
class RolesTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        CollectionRole roles = client.roles().list().call().collectionRole().orElseThrow();
        assertNotNull(roles.items());
        for (Role role : roles.items()) {
            assertEquals("role", role.type().orElse(null));
            assertFalse(role.id().isEmpty(), "role should have an id");
            assertFalse(role.slug().isEmpty(), "role should have a slug");
        }
    }
}
