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
import com.gr4vy.api.model.PaymentMethodTokenized;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A list of stored payment methods in summarized format.
 */
@ApiModel(description = "A list of stored payment methods in summarized format.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class PaymentMethodsTokenized {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<PaymentMethodTokenized> items = null;


  public PaymentMethodsTokenized items(List<PaymentMethodTokenized> items) {
    
    this.items = items;
    return this;
  }

  public PaymentMethodsTokenized addItemsItem(PaymentMethodTokenized itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<PaymentMethodTokenized>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of stored payment methods in summarized format.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of stored payment methods in summarized format.")

  public List<PaymentMethodTokenized> getItems() {
    return items;
  }


  public void setItems(List<PaymentMethodTokenized> items) {
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
    PaymentMethodsTokenized paymentMethodsTokenized = (PaymentMethodsTokenized) o;
    return Objects.equals(this.items, paymentMethodsTokenized.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodsTokenized {\n");
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

