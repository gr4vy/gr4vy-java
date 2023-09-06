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
import com.gr4vy.api.model.ReportExecutionSummary;
import com.gr4vy.api.model.ReportSpec;
import com.gr4vy.api.model.ReportSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;


/**
 * A report record.
 */
@ApiModel(description = "A report record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T16:38:13.632050Z[Etc/UTC]")
public class Report {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_NEXT_EXECUTION_AT = "next_execution_at";
  @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_AT)
  private String nextExecutionAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Specifies the schedule of this report.  If this is a one-off report, this value is &#x60;once&#x60;.  If this is a recurring report, this value is set to the frequency by which the report will be executed. For example, a &#x60;monthly&#x60; schedule means that this report will be periodically executed at the start of each month.  Note that a &#x60;weekly&#x60; schedule means that the report is executed at the start of every Monday.
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
  private ScheduleEnum schedule;

  public static final String SERIALIZED_NAME_SCHEDULE_ENABLED = "schedule_enabled";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_ENABLED)
  private Boolean scheduleEnabled;

  public static final String SERIALIZED_NAME_SCHEDULE_TIMEZONE = "schedule_timezone";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIMEZONE)
  private String scheduleTimezone;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private ReportSpec spec;

  public static final String SERIALIZED_NAME_LATEST_EXECUTION = "latest_execution";
  @SerializedName(SERIALIZED_NAME_LATEST_EXECUTION)
  private ReportExecutionSummary latestExecution;

  /**
   * The type of this resource. Is always &#x60;report&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REPORT("report");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT_ID = "merchant_account_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT_ID)
  private String merchantAccountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private UUID creatorId;

  public static final String SERIALIZED_NAME_CREATOR_DISPLAY_NAME = "creator_display_name";
  @SerializedName(SERIALIZED_NAME_CREATOR_DISPLAY_NAME)
  private String creatorDisplayName;

  /**
   * The type of the creator of this report.
   */
  @JsonAdapter(CreatorTypeEnum.Adapter.class)
  public enum CreatorTypeEnum {
    USER("user"),
    
    PRIVATE_KEY("private_key");

    private String value;

    CreatorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreatorTypeEnum fromValue(String value) {
      for (CreatorTypeEnum b : CreatorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CreatorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreatorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreatorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CreatorTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CREATOR_TYPE = "creator_type";
  @SerializedName(SERIALIZED_NAME_CREATOR_TYPE)
  private CreatorTypeEnum creatorType;


  public Report createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time this report was created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time this report was created in our system.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Report updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time this report was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time this report was last updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Report nextExecutionAt(String nextExecutionAt) {
    
    this.nextExecutionAt = nextExecutionAt;
    return this;
  }

   /**
   * The date and time this report will next be executed, provided that &#x60;schedule_enabled&#x60; is &#x60;true&#x60;. This value is null if this is a one-off report.
   * @return nextExecutionAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-01T00:00Z", value = "The date and time this report will next be executed, provided that `schedule_enabled` is `true`. This value is null if this is a one-off report.")

  public String getNextExecutionAt() {
    return nextExecutionAt;
  }


  public void setNextExecutionAt(String nextExecutionAt) {
    this.nextExecutionAt = nextExecutionAt;
  }


  public Report description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of this report.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Transactions that failed to authorize in April 2022", value = "The description of this report.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Report schedule(ScheduleEnum schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Specifies the schedule of this report.  If this is a one-off report, this value is &#x60;once&#x60;.  If this is a recurring report, this value is set to the frequency by which the report will be executed. For example, a &#x60;monthly&#x60; schedule means that this report will be periodically executed at the start of each month.  Note that a &#x60;weekly&#x60; schedule means that the report is executed at the start of every Monday.
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "monthly", value = "Specifies the schedule of this report.  If this is a one-off report, this value is `once`.  If this is a recurring report, this value is set to the frequency by which the report will be executed. For example, a `monthly` schedule means that this report will be periodically executed at the start of each month.  Note that a `weekly` schedule means that the report is executed at the start of every Monday.")

  public ScheduleEnum getSchedule() {
    return schedule;
  }


  public void setSchedule(ScheduleEnum schedule) {
    this.schedule = schedule;
  }


  public Report scheduleEnabled(Boolean scheduleEnabled) {
    
    this.scheduleEnabled = scheduleEnabled;
    return this;
  }

   /**
   * Indicates whether this report&#39;s scheduling is enabled. This value can only be set to &#x60;true&#x60; if this is a recurring report.  When this value is set to &#x60;true&#x60;, this report will be executed at the &#x60;next_execution_at&#x60; date and time.  When this value is set to &#x60;false&#x60;, future executions of this report are paused until this value is set to &#x60;true&#x60; again.
   * @return scheduleEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether this report's scheduling is enabled. This value can only be set to `true` if this is a recurring report.  When this value is set to `true`, this report will be executed at the `next_execution_at` date and time.  When this value is set to `false`, future executions of this report are paused until this value is set to `true` again.")

  public Boolean getScheduleEnabled() {
    return scheduleEnabled;
  }


  public void setScheduleEnabled(Boolean scheduleEnabled) {
    this.scheduleEnabled = scheduleEnabled;
  }


  public Report scheduleTimezone(String scheduleTimezone) {
    
    this.scheduleTimezone = scheduleTimezone;
    return this;
  }

   /**
   * The time zone in which the next execution will be scheduled. This value is used to calculate this report&#39;s &#x60;next_execution_at&#x60; value and is only relevant if this is a recurring report. This time zone is also used to calculate the timestamp range for reports that use date-time placeholders. Date-time placeholders are dynamic timestamps that change with every report execution.
   * @return scheduleTimezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time zone in which the next execution will be scheduled. This value is used to calculate this report's `next_execution_at` value and is only relevant if this is a recurring report. This time zone is also used to calculate the timestamp range for reports that use date-time placeholders. Date-time placeholders are dynamic timestamps that change with every report execution.")

  public String getScheduleTimezone() {
    return scheduleTimezone;
  }


  public void setScheduleTimezone(String scheduleTimezone) {
    this.scheduleTimezone = scheduleTimezone;
  }


  public Report spec(ReportSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * The specifications of this report.
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specifications of this report.")

  public ReportSpec getSpec() {
    return spec;
  }


  public void setSpec(ReportSpec spec) {
    this.spec = spec;
  }


  public Report latestExecution(ReportExecutionSummary latestExecution) {
    
    this.latestExecution = latestExecution;
    return this;
  }

   /**
   * Details of the latest execution of this report.
   * @return latestExecution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the latest execution of this report.")

  public ReportExecutionSummary getLatestExecution() {
    return latestExecution;
  }


  public void setLatestExecution(ReportExecutionSummary latestExecution) {
    this.latestExecution = latestExecution;
  }


  public Report type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource. Is always &#x60;report&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "report", value = "The type of this resource. Is always `report`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Report id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this report.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The unique identifier for this report.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Report merchantAccountId(String merchantAccountId) {
    
    this.merchantAccountId = merchantAccountId;
    return this;
  }

   /**
   * The unique ID for a merchant account.
   * @return merchantAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "The unique ID for a merchant account.")

  public String getMerchantAccountId() {
    return merchantAccountId;
  }


  public void setMerchantAccountId(String merchantAccountId) {
    this.merchantAccountId = merchantAccountId;
  }


  public Report name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this report.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Failed Authorizations 042022", value = "The name of this report.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Report creatorId(UUID creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * The unique identifier for the creator of this report.
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bd5d40d1-913b-419c-bd62-84efc46e0026", value = "The unique identifier for the creator of this report.")

  public UUID getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(UUID creatorId) {
    this.creatorId = creatorId;
  }


  public Report creatorDisplayName(String creatorDisplayName) {
    
    this.creatorDisplayName = creatorDisplayName;
    return this;
  }

   /**
   * The name of the creator of this report.
   * @return creatorDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "The name of the creator of this report.")

  public String getCreatorDisplayName() {
    return creatorDisplayName;
  }


  public void setCreatorDisplayName(String creatorDisplayName) {
    this.creatorDisplayName = creatorDisplayName;
  }


  public Report creatorType(CreatorTypeEnum creatorType) {
    
    this.creatorType = creatorType;
    return this;
  }

   /**
   * The type of the creator of this report.
   * @return creatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the creator of this report.")

  public CreatorTypeEnum getCreatorType() {
    return creatorType;
  }


  public void setCreatorType(CreatorTypeEnum creatorType) {
    this.creatorType = creatorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.createdAt, report.createdAt) &&
        Objects.equals(this.updatedAt, report.updatedAt) &&
        Objects.equals(this.nextExecutionAt, report.nextExecutionAt) &&
        Objects.equals(this.description, report.description) &&
        Objects.equals(this.schedule, report.schedule) &&
        Objects.equals(this.scheduleEnabled, report.scheduleEnabled) &&
        Objects.equals(this.scheduleTimezone, report.scheduleTimezone) &&
        Objects.equals(this.spec, report.spec) &&
        Objects.equals(this.latestExecution, report.latestExecution) &&
        Objects.equals(this.type, report.type) &&
        Objects.equals(this.id, report.id) &&
        Objects.equals(this.merchantAccountId, report.merchantAccountId) &&
        Objects.equals(this.name, report.name) &&
        Objects.equals(this.creatorId, report.creatorId) &&
        Objects.equals(this.creatorDisplayName, report.creatorDisplayName) &&
        Objects.equals(this.creatorType, report.creatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, nextExecutionAt, description, schedule, scheduleEnabled, scheduleTimezone, spec, latestExecution, type, id, merchantAccountId, name, creatorId, creatorDisplayName, creatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    nextExecutionAt: ").append(toIndentedString(nextExecutionAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scheduleEnabled: ").append(toIndentedString(scheduleEnabled)).append("\n");
    sb.append("    scheduleTimezone: ").append(toIndentedString(scheduleTimezone)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    latestExecution: ").append(toIndentedString(latestExecution)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantAccountId: ").append(toIndentedString(merchantAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    creatorDisplayName: ").append(toIndentedString(creatorDisplayName)).append("\n");
    sb.append("    creatorType: ").append(toIndentedString(creatorType)).append("\n");
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

