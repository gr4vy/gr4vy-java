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
import com.gr4vy.api.model.MerchantProfileScheme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Merchant profile for the different card schemes.
 */
@ApiModel(description = "Merchant profile for the different card schemes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class MerchantProfile {
  public static final String SERIALIZED_NAME_AMEX = "amex";
  @SerializedName(SERIALIZED_NAME_AMEX)
  private MerchantProfileScheme amex;

  public static final String SERIALIZED_NAME_DISCOVER = "discover";
  @SerializedName(SERIALIZED_NAME_DISCOVER)
  private MerchantProfileScheme discover;

  public static final String SERIALIZED_NAME_MASTERCARD = "mastercard";
  @SerializedName(SERIALIZED_NAME_MASTERCARD)
  private MerchantProfileScheme mastercard;

  public static final String SERIALIZED_NAME_VISA = "visa";
  @SerializedName(SERIALIZED_NAME_VISA)
  private MerchantProfileScheme visa;


  public MerchantProfile amex(MerchantProfileScheme amex) {
    
    this.amex = amex;
    return this;
  }

   /**
   * Merchant profile for Amex.
   * @return amex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Amex.")

  public MerchantProfileScheme getAmex() {
    return amex;
  }


  public void setAmex(MerchantProfileScheme amex) {
    this.amex = amex;
  }


  public MerchantProfile discover(MerchantProfileScheme discover) {
    
    this.discover = discover;
    return this;
  }

   /**
   * Merchant profile for Discover.
   * @return discover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Discover.")

  public MerchantProfileScheme getDiscover() {
    return discover;
  }


  public void setDiscover(MerchantProfileScheme discover) {
    this.discover = discover;
  }


  public MerchantProfile mastercard(MerchantProfileScheme mastercard) {
    
    this.mastercard = mastercard;
    return this;
  }

   /**
   * Merchant profile for Mastercard.
   * @return mastercard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Mastercard.")

  public MerchantProfileScheme getMastercard() {
    return mastercard;
  }


  public void setMastercard(MerchantProfileScheme mastercard) {
    this.mastercard = mastercard;
  }


  public MerchantProfile visa(MerchantProfileScheme visa) {
    
    this.visa = visa;
    return this;
  }

   /**
   * Merchant profile for Visa.
   * @return visa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Visa.")

  public MerchantProfileScheme getVisa() {
    return visa;
  }


  public void setVisa(MerchantProfileScheme visa) {
    this.visa = visa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProfile merchantProfile = (MerchantProfile) o;
    return Objects.equals(this.amex, merchantProfile.amex) &&
        Objects.equals(this.discover, merchantProfile.discover) &&
        Objects.equals(this.mastercard, merchantProfile.mastercard) &&
        Objects.equals(this.visa, merchantProfile.visa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amex, discover, mastercard, visa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProfile {\n");
    sb.append("    amex: ").append(toIndentedString(amex)).append("\n");
    sb.append("    discover: ").append(toIndentedString(discover)).append("\n");
    sb.append("    mastercard: ").append(toIndentedString(mastercard)).append("\n");
    sb.append("    visa: ").append(toIndentedString(visa)).append("\n");
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

