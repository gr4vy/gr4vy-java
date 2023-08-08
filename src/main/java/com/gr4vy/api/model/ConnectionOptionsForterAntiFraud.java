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
 * Additional options for Forter (anti-fraud).
 */
@ApiModel(description = "Additional options for Forter (anti-fraud).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class ConnectionOptionsForterAntiFraud {
  public static final String SERIALIZED_NAME_DELIVERY_TYPE = "delivery_type";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TYPE)
  private String deliveryType;

  public static final String SERIALIZED_NAME_DELIVERY_METHOD = "delivery_method";
  @SerializedName(SERIALIZED_NAME_DELIVERY_METHOD)
  private String deliveryMethod;


  public ConnectionOptionsForterAntiFraud deliveryType(String deliveryType) {
    
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Value to populate the &#x60;deliveryType&#x60; field in &#x60;primaryDeliveryDetails&#x60;.  Represents the type of delivery. This can be set to &#x60;PHYSICAL&#x60; for any type of shipped goods, &#x60;DIGITAL&#x60; for non-shipped goods (services, gift cards etc.), or &#x60;HYBRID&#x60; for others.
   * @return deliveryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value to populate the `deliveryType` field in `primaryDeliveryDetails`.  Represents the type of delivery. This can be set to `PHYSICAL` for any type of shipped goods, `DIGITAL` for non-shipped goods (services, gift cards etc.), or `HYBRID` for others.")

  public String getDeliveryType() {
    return deliveryType;
  }


  public void setDeliveryType(String deliveryType) {
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
        Objects.equals(this.deliveryMethod, connectionOptionsForterAntiFraud.deliveryMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryType, deliveryMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOptionsForterAntiFraud {\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
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
