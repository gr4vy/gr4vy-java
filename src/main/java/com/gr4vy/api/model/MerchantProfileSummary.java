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
import com.gr4vy.api.model.MerchantProfileSchemeSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Merchant profile for the different card schemes.
 */
@ApiModel(description = "Merchant profile for the different card schemes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantProfileSummary {
  public static final String SERIALIZED_NAME_AMEX = "amex";
  @SerializedName(SERIALIZED_NAME_AMEX)
  private MerchantProfileSchemeSummary amex;

  public static final String SERIALIZED_NAME_DANKORT = "dankort";
  @SerializedName(SERIALIZED_NAME_DANKORT)
  private MerchantProfileSchemeSummary dankort;

  public static final String SERIALIZED_NAME_DISCOVER = "discover";
  @SerializedName(SERIALIZED_NAME_DISCOVER)
  private MerchantProfileSchemeSummary discover;

  public static final String SERIALIZED_NAME_JCB = "jcb";
  @SerializedName(SERIALIZED_NAME_JCB)
  private MerchantProfileSchemeSummary jcb;

  public static final String SERIALIZED_NAME_MASTERCARD = "mastercard";
  @SerializedName(SERIALIZED_NAME_MASTERCARD)
  private MerchantProfileSchemeSummary mastercard;

  public static final String SERIALIZED_NAME_UNIONPAY = "unionpay";
  @SerializedName(SERIALIZED_NAME_UNIONPAY)
  private MerchantProfileSchemeSummary unionpay;

  public static final String SERIALIZED_NAME_VISA = "visa";
  @SerializedName(SERIALIZED_NAME_VISA)
  private MerchantProfileSchemeSummary visa;


  public MerchantProfileSummary amex(MerchantProfileSchemeSummary amex) {
    
    this.amex = amex;
    return this;
  }

   /**
   * Merchant profile for Amex.
   * @return amex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Amex.")

  public MerchantProfileSchemeSummary getAmex() {
    return amex;
  }


  public void setAmex(MerchantProfileSchemeSummary amex) {
    this.amex = amex;
  }


  public MerchantProfileSummary dankort(MerchantProfileSchemeSummary dankort) {
    
    this.dankort = dankort;
    return this;
  }

   /**
   * Merchant profile for Dankort.
   * @return dankort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Dankort.")

  public MerchantProfileSchemeSummary getDankort() {
    return dankort;
  }


  public void setDankort(MerchantProfileSchemeSummary dankort) {
    this.dankort = dankort;
  }


  public MerchantProfileSummary discover(MerchantProfileSchemeSummary discover) {
    
    this.discover = discover;
    return this;
  }

   /**
   * Merchant profile for Discover.
   * @return discover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Discover.")

  public MerchantProfileSchemeSummary getDiscover() {
    return discover;
  }


  public void setDiscover(MerchantProfileSchemeSummary discover) {
    this.discover = discover;
  }


  public MerchantProfileSummary jcb(MerchantProfileSchemeSummary jcb) {
    
    this.jcb = jcb;
    return this;
  }

   /**
   * Merchant profile for JCB.
   * @return jcb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for JCB.")

  public MerchantProfileSchemeSummary getJcb() {
    return jcb;
  }


  public void setJcb(MerchantProfileSchemeSummary jcb) {
    this.jcb = jcb;
  }


  public MerchantProfileSummary mastercard(MerchantProfileSchemeSummary mastercard) {
    
    this.mastercard = mastercard;
    return this;
  }

   /**
   * Merchant profile for Mastercard.
   * @return mastercard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Mastercard.")

  public MerchantProfileSchemeSummary getMastercard() {
    return mastercard;
  }


  public void setMastercard(MerchantProfileSchemeSummary mastercard) {
    this.mastercard = mastercard;
  }


  public MerchantProfileSummary unionpay(MerchantProfileSchemeSummary unionpay) {
    
    this.unionpay = unionpay;
    return this;
  }

   /**
   * Merchant profile for UnionPay.
   * @return unionpay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for UnionPay.")

  public MerchantProfileSchemeSummary getUnionpay() {
    return unionpay;
  }


  public void setUnionpay(MerchantProfileSchemeSummary unionpay) {
    this.unionpay = unionpay;
  }


  public MerchantProfileSummary visa(MerchantProfileSchemeSummary visa) {
    
    this.visa = visa;
    return this;
  }

   /**
   * Merchant profile for Visa.
   * @return visa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant profile for Visa.")

  public MerchantProfileSchemeSummary getVisa() {
    return visa;
  }


  public void setVisa(MerchantProfileSchemeSummary visa) {
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
    MerchantProfileSummary merchantProfileSummary = (MerchantProfileSummary) o;
    return Objects.equals(this.amex, merchantProfileSummary.amex) &&
        Objects.equals(this.dankort, merchantProfileSummary.dankort) &&
        Objects.equals(this.discover, merchantProfileSummary.discover) &&
        Objects.equals(this.jcb, merchantProfileSummary.jcb) &&
        Objects.equals(this.mastercard, merchantProfileSummary.mastercard) &&
        Objects.equals(this.unionpay, merchantProfileSummary.unionpay) &&
        Objects.equals(this.visa, merchantProfileSummary.visa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amex, dankort, discover, jcb, mastercard, unionpay, visa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProfileSummary {\n");
    sb.append("    amex: ").append(toIndentedString(amex)).append("\n");
    sb.append("    dankort: ").append(toIndentedString(dankort)).append("\n");
    sb.append("    discover: ").append(toIndentedString(discover)).append("\n");
    sb.append("    jcb: ").append(toIndentedString(jcb)).append("\n");
    sb.append("    mastercard: ").append(toIndentedString(mastercard)).append("\n");
    sb.append("    unionpay: ").append(toIndentedString(unionpay)).append("\n");
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
