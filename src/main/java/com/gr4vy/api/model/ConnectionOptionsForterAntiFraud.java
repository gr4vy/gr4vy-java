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
import com.gr4vy.api.model.ConnectionOptionsForterAntiFraudCartItems;
import com.gr4vy.api.model.ConnectionOptionsForterAntiFraudTotalDiscount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional options for Forter (anti-fraud).
 */
@ApiModel(description = "Additional options for Forter (anti-fraud).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionOptionsForterAntiFraud {
  /**
   * Value to populate the &#x60;deliveryType&#x60; field in &#x60;primaryDeliveryDetails&#x60;.  Represents the type of delivery. This can be set to &#x60;PHYSICAL&#x60; for any type of shipped goods, &#x60;DIGITAL&#x60; for non-shipped goods (services, gift cards etc.), or &#x60;HYBRID&#x60; for others.
   */
  @JsonAdapter(DeliveryTypeEnum.Adapter.class)
  public enum DeliveryTypeEnum {
    PHYSICAL("PHYSICAL"),
    
    DIGITAL("DIGITAL"),
    
    HYBRID("HYBRID");

    private String value;

    DeliveryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryTypeEnum fromValue(String value) {
      for (DeliveryTypeEnum b : DeliveryTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeliveryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_TYPE = "delivery_type";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TYPE)
  private DeliveryTypeEnum deliveryType;

  public static final String SERIALIZED_NAME_DELIVERY_METHOD = "delivery_method";
  @SerializedName(SERIALIZED_NAME_DELIVERY_METHOD)
  private String deliveryMethod;

  public static final String SERIALIZED_NAME_IS_GUEST_BUYER = "is_guest_buyer";
  @SerializedName(SERIALIZED_NAME_IS_GUEST_BUYER)
  private Boolean isGuestBuyer = false;

  public static final String SERIALIZED_NAME_CART_ITEMS = "cart_items";
  @SerializedName(SERIALIZED_NAME_CART_ITEMS)
  private List<ConnectionOptionsForterAntiFraudCartItems> cartItems = null;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT = "total_discount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT)
  private ConnectionOptionsForterAntiFraudTotalDiscount totalDiscount;


  public ConnectionOptionsForterAntiFraud deliveryType(DeliveryTypeEnum deliveryType) {
    
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Value to populate the &#x60;deliveryType&#x60; field in &#x60;primaryDeliveryDetails&#x60;.  Represents the type of delivery. This can be set to &#x60;PHYSICAL&#x60; for any type of shipped goods, &#x60;DIGITAL&#x60; for non-shipped goods (services, gift cards etc.), or &#x60;HYBRID&#x60; for others.
   * @return deliveryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value to populate the `deliveryType` field in `primaryDeliveryDetails`.  Represents the type of delivery. This can be set to `PHYSICAL` for any type of shipped goods, `DIGITAL` for non-shipped goods (services, gift cards etc.), or `HYBRID` for others.")

  public DeliveryTypeEnum getDeliveryType() {
    return deliveryType;
  }


  public void setDeliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
  }


  public ConnectionOptionsForterAntiFraud deliveryMethod(String deliveryMethod) {
    
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Value to populate the &#x60;deliveryMethod&#x60; field in &#x60;primaryDeliveryDetails&#x60;.  Represents the delivery method chosen by customer such as postal service, email, in game transfer, etc.
   * @return deliveryMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value to populate the `deliveryMethod` field in `primaryDeliveryDetails`.  Represents the delivery method chosen by customer such as postal service, email, in game transfer, etc.")

  public String getDeliveryMethod() {
    return deliveryMethod;
  }


  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  public ConnectionOptionsForterAntiFraud isGuestBuyer(Boolean isGuestBuyer) {
    
    this.isGuestBuyer = isGuestBuyer;
    return this;
  }

   /**
   * Defines if this is a guest check-out. This will redact the &#x60;accountId&#x60; and &#x60;created&#x60; fields from the &#x60;accountOwner&#x60; details sent to Forter.
   * @return isGuestBuyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if this is a guest check-out. This will redact the `accountId` and `created` fields from the `accountOwner` details sent to Forter.")

  public Boolean getIsGuestBuyer() {
    return isGuestBuyer;
  }


  public void setIsGuestBuyer(Boolean isGuestBuyer) {
    this.isGuestBuyer = isGuestBuyer;
  }


  public ConnectionOptionsForterAntiFraud cartItems(List<ConnectionOptionsForterAntiFraudCartItems> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public ConnectionOptionsForterAntiFraud addCartItemsItem(ConnectionOptionsForterAntiFraudCartItems cartItemsItem) {
    if (this.cartItems == null) {
      this.cartItems = new ArrayList<ConnectionOptionsForterAntiFraudCartItems>();
    }
    this.cartItems.add(cartItemsItem);
    return this;
  }

   /**
   * A list of Forter cart item objects. These will be merged into the &#x60;cart_items&#x60; passed to the transaction. Every cart item here will be merged with a cart item on the transaction with the same index.  Together, these will augment the &#x60;cartItems&#x60; values sent to the Forter validation API.
   * @return cartItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Forter cart item objects. These will be merged into the `cart_items` passed to the transaction. Every cart item here will be merged with a cart item on the transaction with the same index.  Together, these will augment the `cartItems` values sent to the Forter validation API.")

  public List<ConnectionOptionsForterAntiFraudCartItems> getCartItems() {
    return cartItems;
  }


  public void setCartItems(List<ConnectionOptionsForterAntiFraudCartItems> cartItems) {
    this.cartItems = cartItems;
  }


  public ConnectionOptionsForterAntiFraud totalDiscount(ConnectionOptionsForterAntiFraudTotalDiscount totalDiscount) {
    
    this.totalDiscount = totalDiscount;
    return this;
  }

   /**
   * Get totalDiscount
   * @return totalDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsForterAntiFraudTotalDiscount getTotalDiscount() {
    return totalDiscount;
  }


  public void setTotalDiscount(ConnectionOptionsForterAntiFraudTotalDiscount totalDiscount) {
    this.totalDiscount = totalDiscount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionOptionsForterAntiFraud connectionOptionsForterAntiFraud = (ConnectionOptionsForterAntiFraud) o;
    return Objects.equals(this.deliveryType, connectionOptionsForterAntiFraud.deliveryType) &&
        Objects.equals(this.deliveryMethod, connectionOptionsForterAntiFraud.deliveryMethod) &&
        Objects.equals(this.isGuestBuyer, connectionOptionsForterAntiFraud.isGuestBuyer) &&
        Objects.equals(this.cartItems, connectionOptionsForterAntiFraud.cartItems) &&
        Objects.equals(this.totalDiscount, connectionOptionsForterAntiFraud.totalDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryType, deliveryMethod, isGuestBuyer, cartItems, totalDiscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOptionsForterAntiFraud {\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    isGuestBuyer: ").append(toIndentedString(isGuestBuyer)).append("\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
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

