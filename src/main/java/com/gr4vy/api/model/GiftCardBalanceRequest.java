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
import java.util.UUID;

/**
 * Check the balance for a stored/new gift card.
 */
@ApiModel(description = "Check the balance for a stored/new gift card.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GiftCardBalanceRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  private String pin;


  public GiftCardBalanceRequest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the gift card to check a balance for. Required if &#x60;number&#x60; is not set.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e6cdf979-87e2-4796-8ff6-9784d5aed893", value = "The ID of the gift card to check a balance for. Required if `number` is not set.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public GiftCardBalanceRequest number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The 16-19 digit number for this gift card. Required if &#x60;id&#x60; is not set.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4123455541234561234", value = "The 16-19 digit number for this gift card. Required if `id` is not set.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public GiftCardBalanceRequest pin(String pin) {
    
    this.pin = pin;
    return this;
  }

   /**
   * The PIN for this gift card. Required if &#x60;number&#x60; is set.
   * @return pin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "The PIN for this gift card. Required if `number` is set.")

  public String getPin() {
    return pin;
  }


  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftCardBalanceRequest giftCardBalanceRequest = (GiftCardBalanceRequest) o;
    return Objects.equals(this.id, giftCardBalanceRequest.id) &&
        Objects.equals(this.number, giftCardBalanceRequest.number) &&
        Objects.equals(this.pin, giftCardBalanceRequest.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftCardBalanceRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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
