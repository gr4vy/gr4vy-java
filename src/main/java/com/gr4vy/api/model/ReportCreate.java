/*
 * Gr4vy API
 * Welcome to the Gr4vy API reference documentation. Our API is still very much a work in product and subject to change.
 *
 * The version of the OpenAPI document: 1.1.0-beta
 * Contact: code@gr4vy.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.gr4vy.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.gr4vy.api.model.ReportSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A request to create a report.
 */
@ApiModel(description = "A request to create a report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T14:21:56.132305Z[Etc/UTC]")
public class ReportCreate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Specifies the schedule of the report.  If this is a one-off report, set this value to &#x60;once&#x60;.  If this is a recurring report, this value should be set to the frequency by which the report will be executed. For example, a &#x60;monthly&#x60; schedule means that the report will be periodically executed at the start of each month.  Note that a &#x60;weekly&#x60; schedule means that the report will be executed at the start of every Monday.
   */
  @JsonAdapter(ScheduleEnum.Adapter.class)
  public enum ScheduleEnum {
    DAILY("daily"),
    
    MONTHLY("monthly"),
    
    ONCE("once"),
    
    WEEKLY("weekly");

    private String value;

    ScheduleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScheduleEnum fromValue(String value) {
      for (ScheduleEnum b : ScheduleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScheduleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScheduleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScheduleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScheduleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private ScheduleEnum schedule = ScheduleEnum.ONCE;

  public static final String SERIALIZED_NAME_SCHEDULE_ENABLED = "schedule_enabled";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_ENABLED)
  private Boolean scheduleEnabled;

  public static final String SERIALIZED_NAME_SCHEDULE_TIMEZONE = "schedule_timezone";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIMEZONE)
  private String scheduleTimezone = "Etc/UTC";

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private ReportSpec spec;


  public ReportCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the report.
   * @return name
  **/
  @ApiModelProperty(example = "Failed Authorizations 042022", required = true, value = "The name of the report.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReportCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the report.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Transactions that failed to authorize in April 2022", value = "The description of the report.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReportCreate schedule(ScheduleEnum schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Specifies the schedule of the report.  If this is a one-off report, set this value to &#x60;once&#x60;.  If this is a recurring report, this value should be set to the frequency by which the report will be executed. For example, a &#x60;monthly&#x60; schedule means that the report will be periodically executed at the start of each month.  Note that a &#x60;weekly&#x60; schedule means that the report will be executed at the start of every Monday.
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "monthly", value = "Specifies the schedule of the report.  If this is a one-off report, set this value to `once`.  If this is a recurring report, this value should be set to the frequency by which the report will be executed. For example, a `monthly` schedule means that the report will be periodically executed at the start of each month.  Note that a `weekly` schedule means that the report will be executed at the start of every Monday.")

  public ScheduleEnum getSchedule() {
    return schedule;
  }


  public void setSchedule(ScheduleEnum schedule) {
    this.schedule = schedule;
  }


  public ReportCreate scheduleEnabled(Boolean scheduleEnabled) {
    
    this.scheduleEnabled = scheduleEnabled;
    return this;
  }

   /**
   * Indicates whether the report&#39;s scheduling is enabled. This value can only be set to &#x60;true&#x60; if this is a recurring report.  If this value is set to &#x60;true&#x60;, the report will be executed at the &#x60;next_execution_at&#x60; date and time.  If this is a recurring report and this value is set to &#x60;false&#x60;, executions of the report will not occur until this value is set to &#x60;true&#x60;.  If this value is not provided, &#x60;schedule_enabled&#x60; will automatically be set to &#x60;false&#x60; if &#x60;schedule&#x60; is &#x60;once&#x60; and set to &#x60;true&#x60; otherwise.
   * @return scheduleEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the report's scheduling is enabled. This value can only be set to `true` if this is a recurring report.  If this value is set to `true`, the report will be executed at the `next_execution_at` date and time.  If this is a recurring report and this value is set to `false`, executions of the report will not occur until this value is set to `true`.  If this value is not provided, `schedule_enabled` will automatically be set to `false` if `schedule` is `once` and set to `true` otherwise.")

  public Boolean getScheduleEnabled() {
    return scheduleEnabled;
  }


  public void setScheduleEnabled(Boolean scheduleEnabled) {
    this.scheduleEnabled = scheduleEnabled;
  }


  public ReportCreate scheduleTimezone(String scheduleTimezone) {
    
    this.scheduleTimezone = scheduleTimezone;
    return this;
  }

   /**
   * The time zone in which the report&#39;s executions will be scheduled. This value is used to compute the report&#39;s &#x60;next_execution_at&#x60; value and is only relevant when this is a recurring report. This time zone is also used to calculate the timestamp range for reports that use date-time placeholders. Date-time placeholders are dynamic timestamps that change with every report execution.  This value must be set to the time zone&#39;s name as presented in the IANA time zone database. For example, to schedule reports in the time zone of New York, set this value to &#x60;America/New_York&#x60;.
   * @return scheduleTimezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Europe/London", value = "The time zone in which the report's executions will be scheduled. This value is used to compute the report's `next_execution_at` value and is only relevant when this is a recurring report. This time zone is also used to calculate the timestamp range for reports that use date-time placeholders. Date-time placeholders are dynamic timestamps that change with every report execution.  This value must be set to the time zone's name as presented in the IANA time zone database. For example, to schedule reports in the time zone of New York, set this value to `America/New_York`.")

  public String getScheduleTimezone() {
    return scheduleTimezone;
  }


  public void setScheduleTimezone(String scheduleTimezone) {
    this.scheduleTimezone = scheduleTimezone;
  }


  public ReportCreate spec(ReportSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(required = true, value = "")

  public ReportSpec getSpec() {
    return spec;
  }


  public void setSpec(ReportSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCreate reportCreate = (ReportCreate) o;
    return Objects.equals(this.name, reportCreate.name) &&
        Objects.equals(this.description, reportCreate.description) &&
        Objects.equals(this.schedule, reportCreate.schedule) &&
        Objects.equals(this.scheduleEnabled, reportCreate.scheduleEnabled) &&
        Objects.equals(this.scheduleTimezone, reportCreate.scheduleTimezone) &&
        Objects.equals(this.spec, reportCreate.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, schedule, scheduleEnabled, scheduleTimezone, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scheduleEnabled: ").append(toIndentedString(scheduleEnabled)).append("\n");
    sb.append("    scheduleTimezone: ").append(toIndentedString(scheduleTimezone)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

