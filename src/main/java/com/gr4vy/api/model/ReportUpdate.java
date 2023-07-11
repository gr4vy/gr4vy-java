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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request body to update a report.
 */
@ApiModel(description = "Request body to update a report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class ReportUpdate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEDULE_ENABLED = "schedule_enabled";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_ENABLED)
  private Boolean scheduleEnabled;


  public ReportUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the report.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Failed Authorizations 042022", value = "The name of the report.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReportUpdate description(String description) {
    
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


  public ReportUpdate scheduleEnabled(Boolean scheduleEnabled) {
    
    this.scheduleEnabled = scheduleEnabled;
    return this;
  }

   /**
   * Indicates whether the report&#39;s scheduling is enabled. This value can only be set to &#x60;true&#x60; if this is a recurring report.  When this value is set to &#x60;true&#x60;, the report will be executed at the &#x60;next_execution_at&#x60; date and time.  When this value is set to &#x60;false&#x60;, future executions of the report are paused until this value is set to &#x60;true&#x60; again.  If scheduling is enabled after being disabled, then the &#x60;next_execution_at&#x60; value is updated if and only if its current value is a past date-time. The &#x60;next_execution_at&#x60; value is then set to the next closest date-time in the future depending on the values of &#x60;schedule&#x60; and &#x60;schedule_timezone&#x60;.
   * @return scheduleEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the report's scheduling is enabled. This value can only be set to `true` if this is a recurring report.  When this value is set to `true`, the report will be executed at the `next_execution_at` date and time.  When this value is set to `false`, future executions of the report are paused until this value is set to `true` again.  If scheduling is enabled after being disabled, then the `next_execution_at` value is updated if and only if its current value is a past date-time. The `next_execution_at` value is then set to the next closest date-time in the future depending on the values of `schedule` and `schedule_timezone`.")

  public Boolean getScheduleEnabled() {
    return scheduleEnabled;
  }


  public void setScheduleEnabled(Boolean scheduleEnabled) {
    this.scheduleEnabled = scheduleEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportUpdate reportUpdate = (ReportUpdate) o;
    return Objects.equals(this.name, reportUpdate.name) &&
        Objects.equals(this.description, reportUpdate.description) &&
        Objects.equals(this.scheduleEnabled, reportUpdate.scheduleEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, scheduleEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportUpdate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduleEnabled: ").append(toIndentedString(scheduleEnabled)).append("\n");
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

