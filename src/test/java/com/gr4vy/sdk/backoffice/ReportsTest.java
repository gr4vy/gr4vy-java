package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.Report;
import com.gr4vy.sdk.models.components.ReportCreate;
import com.gr4vy.sdk.models.components.ReportSchedule;
import com.gr4vy.sdk.models.components.ReportUpdate;
import com.gr4vy.sdk.models.components.TransactionsReportSpec;
import com.gr4vy.sdk.models.operations.ListReportsRequest;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the reports endpoints. Create/get/list/put (update) run
 * against the sandbox as real 2xx happy paths using a transactions report spec.
 * Report executions are listed for the created report; the execution get/url
 * operations require a materialized execution the mock will not have, so they
 * are asserted via {@link Reaches} against a missing id.
 */
class ReportsTest {

    /** Creates a daily, schedule-disabled transactions report and returns its id. */
    private static String createReport(Gr4vy client, String name) throws Exception {
        Report report = client.reports().create()
                .reportCreate(ReportCreate.builder()
                        .name(name)
                        .schedule(ReportSchedule.DAILY)
                        .scheduleEnabled(false)
                        .spec(TransactionsReportSpec.builder()
                                // The transactions report requires fields, filters
                                // and sort in its params (see the Go SDK suite).
                                .params(Map.of(
                                        "fields", List.of("id", "status"),
                                        "filters", Map.of("status", List.of("capture_succeeded")),
                                        "sort", List.of(Map.of("field", "created_at", "order", "desc"))))
                                .build())
                        .build())
                .call()
                .report()
                .orElseThrow(() -> new IllegalStateException("create returned no report"));
        String id = report.id();
        assertNotNull(id, "created report id must not be null");
        assertFalse(id.isEmpty(), "created report id must be non-empty");
        return id;
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void create() throws Exception {
        createReport(Harness.client(), "E2E report create");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void get() throws Exception {
        Gr4vy client = Harness.client();
        String id = createReport(client, "E2E report get");
        assertNotNull(client.reports().get().reportId(id).call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        assertNotNull(client.reports().list()
                .request(ListReportsRequest.builder().build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void put() throws Exception {
        Gr4vy client = Harness.client();
        String id = createReport(client, "E2E report put");
        assertNotNull(client.reports().put()
                .reportId(id)
                .reportUpdate(ReportUpdate.builder()
                        .name("E2E report updated")
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void executionsList() throws Exception {
        Gr4vy client = Harness.client();
        String id = createReport(client, "E2E report executions");
        assertNotNull(client.reports().executions().list()
                .reportId(id)
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void executionsGet() {
        Gr4vy client = Harness.client();
        Reaches.reaches("reports.executions.get", () -> client.reports().executions().get()
                .reportExecutionId(Fixtures.MISSING_ID)
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void executionsUrl() {
        Gr4vy client = Harness.client();
        Reaches.reaches("reports.executions.url", () -> client.reports().executions().url()
                .reportId(Fixtures.MISSING_ID)
                .reportExecutionId(Fixtures.MISSING_ID)
                .call());
    }
}
