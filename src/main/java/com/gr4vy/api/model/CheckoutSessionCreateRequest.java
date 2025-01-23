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
import com.gr4vy.api.model.Airline;
import com.gr4vy.api.model.CartItem;
import com.gr4vy.api.model.TransactionBuyerRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A request to create a checkout session.
 */
@ApiModel(description = "A request to create a checkout session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckoutSessionCreateRequest {
  public static final String SERIALIZED_NAME_CART_ITEMS = "cart_items";
  @SerializedName(SERIALIZED_NAME_CART_ITEMS)
  private List<CartItem> cartItems = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_AIRLINE = "airline";
  @SerializedName(SERIALIZED_NAME_AIRLINE)
  private Airline airline;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private TransactionBuyerRequest buyer;


  public CheckoutSessionCreateRequest cartItems(List<CartItem> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public CheckoutSessionCreateRequest addCartItemsItem(CartItem cartItemsItem) {
    if (this.cartItems == null) {
      this.cartItems = new ArrayList<CartItem>();
    }
    this.cartItems.add(cartItemsItem);
    return this;
  }

   /**
   * An array of cart items that represents the line items of a transaction.
   * @return cartItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of cart items that represents the line items of a transaction.")

  public List<CartItem> getCartItems() {
    return cartItems;
  }


  public void setCartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
  }


  public CheckoutSessionCreateRequest metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CheckoutSessionCreateRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Any additional information about the transaction that you would like to store as key-value pairs. This data is passed to payment service providers that support it.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "Any additional information about the transaction that you would like to store as key-value pairs. This data is passed to payment service providers that support it.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public CheckoutSessionCreateRequest airline(Airline airline) {
    
    this.airline = airline;
    return this;
  }

   /**
   * The airline addendum data which describes the airline booking associated with this transaction.
   * @return airline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The airline addendum data which describes the airline booking associated with this transaction.")

  public Airline getAirline() {
    return airline;
  }


  public void setAirline(Airline airline) {
    this.airline = airline;
  }


  public CheckoutSessionCreateRequest buyer(TransactionBuyerRequest buyer) {
    
    this.buyer = buyer;
    return this;
  }

   /**
   * Get buyer
   * @return buyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionBuyerRequest getBuyer() {
    return buyer;
  }


  public void setBuyer(TransactionBuyerRequest buyer) {
    this.buyer = buyer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutSessionCreateRequest checkoutSessionCreateRequest = (CheckoutSessionCreateRequest) o;
    return Objects.equals(this.cartItems, checkoutSessionCreateRequest.cartItems) &&
        Objects.equals(this.metadata, checkoutSessionCreateRequest.metadata) &&
        Objects.equals(this.airline, checkoutSessionCreateRequest.airline) &&
        Objects.equals(this.buyer, checkoutSessionCreateRequest.buyer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartItems, metadata, airline, buyer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutSessionCreateRequest {\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
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

