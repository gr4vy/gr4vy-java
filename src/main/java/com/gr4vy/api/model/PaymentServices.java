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
import com.gr4vy.api.model.PaymentService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A list of active, configured payment services.
 */
@ApiModel(description = "A list of active, configured payment services.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T12:22:53.235500Z[Etc/UTC]")
public class PaymentServices {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<PaymentService> items = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit = 20;

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_PREVIOUS_CURSOR = "previous_cursor";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_CURSOR)
  private String previousCursor;


  public PaymentServices items(List<PaymentService> items) {
    
    this.items = items;
    return this;
  }

  public PaymentServices addItemsItem(PaymentService itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<PaymentService>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentService> getItems() {
    return items;
  }


  public void setItems(List<PaymentService> items) {
    this.items = items;
  }


  public PaymentServices limit(Integer limit) {
    
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


  public PaymentServices nextCursor(String nextCursor) {
    
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


  public PaymentServices previousCursor(String previousCursor) {
    
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
    PaymentServices paymentServices = (PaymentServices) o;
    return Objects.equals(this.items, paymentServices.items) &&
        Objects.equals(this.limit, paymentServices.limit) &&
        Objects.equals(this.nextCursor, paymentServices.nextCursor) &&
        Objects.equals(this.previousCursor, paymentServices.previousCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, limit, nextCursor, previousCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServices {\n");
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

