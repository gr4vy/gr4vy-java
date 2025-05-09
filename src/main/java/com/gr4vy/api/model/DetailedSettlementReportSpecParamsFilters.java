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
import com.gr4vy.api.model.DetailedSettlementReportSpecParamsFiltersIngestedAt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The filters for the report.
 */
@ApiModel(description = "The filters for the report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetailedSettlementReportSpecParamsFilters {
  public static final String SERIALIZED_NAME_INGESTED_AT = "ingested_at";
  @SerializedName(SERIALIZED_NAME_INGESTED_AT)
  private DetailedSettlementReportSpecParamsFiltersIngestedAt ingestedAt;


  public DetailedSettlementReportSpecParamsFilters ingestedAt(DetailedSettlementReportSpecParamsFiltersIngestedAt ingestedAt) {
    
    this.ingestedAt = ingestedAt;
    return this;
  }

   /**
   * Get ingestedAt
   * @return ingestedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DetailedSettlementReportSpecParamsFiltersIngestedAt getIngestedAt() {
    return ingestedAt;
  }


  public void setIngestedAt(DetailedSettlementReportSpecParamsFiltersIngestedAt ingestedAt) {
    this.ingestedAt = ingestedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedSettlementReportSpecParamsFilters detailedSettlementReportSpecParamsFilters = (DetailedSettlementReportSpecParamsFilters) o;
    return Objects.equals(this.ingestedAt, detailedSettlementReportSpecParamsFilters.ingestedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSettlementReportSpecParamsFilters {\n");
    sb.append("    ingestedAt: ").append(toIndentedString(ingestedAt)).append("\n");
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

