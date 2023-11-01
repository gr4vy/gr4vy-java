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
 * DigitalWalletClickToPayFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DigitalWalletClickToPayFields {
  public static final String SERIALIZED_NAME_DIGITAL_PAYMENT_APPLICATION_ID = "digital_payment_application_id";
  @SerializedName(SERIALIZED_NAME_DIGITAL_PAYMENT_APPLICATION_ID)
  private String digitalPaymentApplicationId;

  public static final String SERIALIZED_NAME_DIGITAL_PAYMENT_APPLICATION_NAME = "digital_payment_application_name";
  @SerializedName(SERIALIZED_NAME_DIGITAL_PAYMENT_APPLICATION_NAME)
  private String digitalPaymentApplicationName;


  public DigitalWalletClickToPayFields digitalPaymentApplicationId(String digitalPaymentApplicationId) {
    
    this.digitalPaymentApplicationId = digitalPaymentApplicationId;
    return this;
  }

   /**
   * Unique ID assigned for digital payment application.
   * @return digitalPaymentApplicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID assigned for digital payment application.")

  public String getDigitalPaymentApplicationId() {
    return digitalPaymentApplicationId;
  }


  public void setDigitalPaymentApplicationId(String digitalPaymentApplicationId) {
    this.digitalPaymentApplicationId = digitalPaymentApplicationId;
  }


  public DigitalWalletClickToPayFields digitalPaymentApplicationName(String digitalPaymentApplicationName) {
    
    this.digitalPaymentApplicationName = digitalPaymentApplicationName;
    return this;
  }

   /**
   * Name assigned for digital payment application.
   * @return digitalPaymentApplicationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name assigned for digital payment application.")

  public String getDigitalPaymentApplicationName() {
    return digitalPaymentApplicationName;
  }


  public void setDigitalPaymentApplicationName(String digitalPaymentApplicationName) {
    this.digitalPaymentApplicationName = digitalPaymentApplicationName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalWalletClickToPayFields digitalWalletClickToPayFields = (DigitalWalletClickToPayFields) o;
    return Objects.equals(this.digitalPaymentApplicationId, digitalWalletClickToPayFields.digitalPaymentApplicationId) &&
        Objects.equals(this.digitalPaymentApplicationName, digitalWalletClickToPayFields.digitalPaymentApplicationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digitalPaymentApplicationId, digitalPaymentApplicationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWalletClickToPayFields {\n");
    sb.append("    digitalPaymentApplicationId: ").append(toIndentedString(digitalPaymentApplicationId)).append("\n");
    sb.append("    digitalPaymentApplicationName: ").append(toIndentedString(digitalPaymentApplicationName)).append("\n");
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

