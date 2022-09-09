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
 * Definitions of a payment method including icon, label, etc.
 */
@ApiModel(description = "Definitions of a payment method including icon, label, etc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:46:45.100086Z[Etc/UTC]")
public class PaymentMethodDefinition {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_LONG_DISPLAY_NAME = "long_display_name";
  @SerializedName(SERIALIZED_NAME_LONG_DISPLAY_NAME)
  private String longDisplayName;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;


  public PaymentMethodDefinition id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The mode of this payment method.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bank", value = "The mode of this payment method.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PaymentMethodDefinition iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * The icon for this payment method.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.sandbox.example.gr4vy.app/assets/payment-method-definitions/bank.svg", value = "The icon for this payment method.")

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public PaymentMethodDefinition displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of this payment method.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bank", value = "The display name of this payment method.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PaymentMethodDefinition longDisplayName(String longDisplayName) {
    
    this.longDisplayName = longDisplayName;
    return this;
  }

   /**
   * The long display name of this payment method.
   * @return longDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bank (BACS)", value = "The long display name of this payment method.")

  public String getLongDisplayName() {
    return longDisplayName;
  }


  public void setLongDisplayName(String longDisplayName) {
    this.longDisplayName = longDisplayName;
  }


  public PaymentMethodDefinition method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * The method, or type, for this payment method.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BACS", value = "The method, or type, for this payment method.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodDefinition paymentMethodDefinition = (PaymentMethodDefinition) o;
    return Objects.equals(this.id, paymentMethodDefinition.id) &&
        Objects.equals(this.iconUrl, paymentMethodDefinition.iconUrl) &&
        Objects.equals(this.displayName, paymentMethodDefinition.displayName) &&
        Objects.equals(this.longDisplayName, paymentMethodDefinition.longDisplayName) &&
        Objects.equals(this.method, paymentMethodDefinition.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, iconUrl, displayName, longDisplayName, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    longDisplayName: ").append(toIndentedString(longDisplayName)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

