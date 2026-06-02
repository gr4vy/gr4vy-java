package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.util.Harness;

/**
 * E2E coverage for the top-level report-executions list endpoint (executions
 * across all reports), which the sandbox fully supports.
 */
class ReportExecutionsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        assertNotNull(client.reportExecutions().list().call());
    }
}
