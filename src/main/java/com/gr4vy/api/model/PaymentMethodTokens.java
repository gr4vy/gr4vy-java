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
import com.gr4vy.api.model.PaymentMethodToken;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A list of tokens for a payment method.
 */
@ApiModel(description = "A list of tokens for a payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T12:22:53.235500Z[Etc/UTC]")
public class PaymentMethodTokens {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<PaymentMethodToken> items = null;


  public PaymentMethodTokens items(List<PaymentMethodToken> items) {
    
    this.items = items;
    return this;
  }

  public PaymentMethodTokens addItemsItem(PaymentMethodToken itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<PaymentMethodToken>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of stored tokens for payment methods.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of stored tokens for payment methods.")

  public List<PaymentMethodToken> getItems() {
    return items;
  }


  public void setItems(List<PaymentMethodToken> items) {
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
    PaymentMethodTokens paymentMethodTokens = (PaymentMethodTokens) o;
    return Objects.equals(this.items, paymentMethodTokens.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodTokens {\n");
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

