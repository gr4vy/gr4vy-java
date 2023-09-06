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
 * Contains the context values used to compute the value of date-time placeholders such as &#x60;month_start&#x60; and &#x60;month_end&#x60; if present in the report&#39;s specification. Date-time placeholders are dynamic timestamps that change with every report execution.
 */
@ApiModel(description = "Contains the context values used to compute the value of date-time placeholders such as `month_start` and `month_end` if present in the report's specification. Date-time placeholders are dynamic timestamps that change with every report execution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class ReportExecutionSummaryContext {
  public static final String SERIALIZED_NAME_REFERENCE_TIMESTAMP = "reference_timestamp";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TIMESTAMP)
  private String referenceTimestamp;

  public static final String SERIALIZED_NAME_REFERENCE_TIMEZONE = "reference_timezone";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TIMEZONE)
  private String referenceTimezone;


  public ReportExecutionSummaryContext referenceTimestamp(String referenceTimestamp) {
    
    this.referenceTimestamp = referenceTimestamp;
    return this;
  }

   /**
   * The date and time used by the system as a reference point to compute date-time placeholders.
   * @return referenceTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time used by the system as a reference point to compute date-time placeholders.")

  public String getReferenceTimestamp() {
    return referenceTimestamp;
  }


  public void setReferenceTimestamp(String referenceTimestamp) {
    this.referenceTimestamp = referenceTimestamp;
  }


  public ReportExecutionSummaryContext referenceTimezone(String referenceTimezone) {
    
    this.referenceTimezone = referenceTimezone;
    return this;
  }

   /**
   * The time zone used to compute date-time placeholders.
   * @return referenceTimezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Europe/London", value = "The time zone used to compute date-time placeholders.")

  public String getReferenceTimezone() {
    return referenceTimezone;
  }


  public void setReferenceTimezone(String referenceTimezone) {
    this.referenceTimezone = referenceTimezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportExecutionSummaryContext reportExecutionSummaryContext = (ReportExecutionSummaryContext) o;
    return Objects.equals(this.referenceTimestamp, reportExecutionSummaryContext.referenceTimestamp) &&
        Objects.equals(this.referenceTimezone, reportExecutionSummaryContext.referenceTimezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceTimestamp, referenceTimezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportExecutionSummaryContext {\n");
    sb.append("    referenceTimestamp: ").append(toIndentedString(referenceTimestamp)).append("\n");
    sb.append("    referenceTimezone: ").append(toIndentedString(referenceTimezone)).append("\n");
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

