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
import com.gr4vy.api.model.CartItem;
import com.gr4vy.api.model.CheckoutSessionPaymentMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/**
 * A short-lived checkout session.
 */
@ApiModel(description = "A short-lived checkout session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckoutSession {
  /**
   * &#x60;checkout-session&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CHECKOUT_SESSION("checkout-session");

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

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt;

  public static final String SERIALIZED_NAME_CART_ITEMS = "cart_items";
  @SerializedName(SERIALIZED_NAME_CART_ITEMS)
  private List<CartItem> cartItems = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private CheckoutSessionPaymentMethod paymentMethod;


  public CheckoutSession type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;checkout-session&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "checkout-session", value = "`checkout-session`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CheckoutSession id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the Checkout Session.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8d3fe99b-1422-42e6-bbb3-932d95ae5f79", value = "The ID of the Checkout Session.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public CheckoutSession expiresAt(String expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The date and time when the Checkout Session will expire. By default this will be set to 1 hour from the date of creation.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01T00:00Z", value = "The date and time when the Checkout Session will expire. By default this will be set to 1 hour from the date of creation.")

  public String getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public CheckoutSession cartItems(List<CartItem> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public CheckoutSession addCartItemsItem(CartItem cartItemsItem) {
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


  public CheckoutSession metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CheckoutSession putMetadataItem(String key, String metadataItem) {
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


  public CheckoutSession paymentMethod(CheckoutSessionPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CheckoutSessionPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(CheckoutSessionPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutSession checkoutSession = (CheckoutSession) o;
    return Objects.equals(this.type, checkoutSession.type) &&
        Objects.equals(this.id, checkoutSession.id) &&
        Objects.equals(this.expiresAt, checkoutSession.expiresAt) &&
        Objects.equals(this.cartItems, checkoutSession.cartItems) &&
        Objects.equals(this.metadata, checkoutSession.metadata) &&
        Objects.equals(this.paymentMethod, checkoutSession.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, expiresAt, cartItems, metadata, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutSession {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

