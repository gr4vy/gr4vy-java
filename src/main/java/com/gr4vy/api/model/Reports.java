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
import com.gr4vy.api.model.Report;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A list of reports.
 */
@ApiModel(description = "A list of reports.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Reports {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Report> items = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 20;

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_PREVIOUS_CURSOR = "previous_cursor";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_CURSOR)
  private String previousCursor;


  public Reports items(List<Report> items) {
    
    this.items = items;
    return this;
  }

  public Reports addItemsItem(Report itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Report>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of reports.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of reports.")

  public List<Report> getItems() {
    return items;
  }


  public void setItems(List<Report> items) {
    this.items = items;
  }


  public Reports limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit applied to request. This represents the number of items that are at maximum returned by this request.
   * minimum: 1
   * maximum: 100
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The limit applied to request. This represents the number of items that are at maximum returned by this request.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public Reports nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * The cursor that represents the next page of results. Use the &#x60;cursor&#x60; query parameter to fetch this page of items.
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZXhhbXBsZTE", value = "The cursor that represents the next page of results. Use the `cursor` query parameter to fetch this page of items.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public Reports previousCursor(String previousCursor) {
    
    this.previousCursor = previousCursor;
    return this;
  }

   /**
   * The cursor that represents the next page of results. Use the &#x60;cursor&#x60; query parameter to fetch this page of items.
   * @return previousCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cursor that represents the next page of results. Use the `cursor` query parameter to fetch this page of items.")

  public String getPreviousCursor() {
    return previousCursor;
  }


  public void setPreviousCursor(String previousCursor) {
    this.previousCursor = previousCursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reports reports = (Reports) o;
    return Objects.equals(this.items, reports.items) &&
        Objects.equals(this.limit, reports.limit) &&
        Objects.equals(this.nextCursor, reports.nextCursor) &&
        Objects.equals(this.previousCursor, reports.previousCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, limit, nextCursor, previousCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reports {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    previousCursor: ").append(toIndentedString(previousCursor)).append("\n");
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

