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
import com.gr4vy.api.model.GiftCardSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A list of gift cards in a short format including the latest balance.
 */
@ApiModel(description = "A list of gift cards in a short format including the latest balance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GiftCardsSummary {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<GiftCardSummary> items = null;


  public GiftCardsSummary items(List<GiftCardSummary> items) {
    
    this.items = items;
    return this;
  }

  public GiftCardsSummary addItemsItem(GiftCardSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<GiftCardSummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of stored gift cards.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of stored gift cards.")

  public List<GiftCardSummary> getItems() {
    return items;
  }


  public void setItems(List<GiftCardSummary> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftCardsSummary giftCardsSummary = (GiftCardsSummary) o;
    return Objects.equals(this.items, giftCardsSummary.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftCardsSummary {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

