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
 * Features supported by the payment definition.
 */
@ApiModel(description = "Features supported by the payment definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T18:03:23.672646Z[Etc/UTC]")
public class PaymentServiceDefinitionSupportedFeatures {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TOKENIZATION = "payment_method_tokenization";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TOKENIZATION)
  private Boolean paymentMethodTokenization;

  public static final String SERIALIZED_NAME_THREE_D_SECURE_HOSTED = "three_d_secure_hosted";
  @SerializedName(SERIALIZED_NAME_THREE_D_SECURE_HOSTED)
  private Boolean threeDSecureHosted;

  public static final String SERIALIZED_NAME_THREE_D_SECURE_PASS_THROUGH = "three_d_secure_pass_through";
  @SerializedName(SERIALIZED_NAME_THREE_D_SECURE_PASS_THROUGH)
  private Boolean threeDSecurePassThrough;

  public static final String SERIALIZED_NAME_NETWORK_TOKENS = "network_tokens";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOKENS)
  private Boolean networkTokens;

  public static final String SERIALIZED_NAME_VERIFY_CREDENTIALS = "verify_credentials";
  @SerializedName(SERIALIZED_NAME_VERIFY_CREDENTIALS)
  private Boolean verifyCredentials;

  public static final String SERIALIZED_NAME_VOID = "void";
  @SerializedName(SERIALIZED_NAME_VOID)
  private Boolean _void;

  public static final String SERIALIZED_NAME_REFUNDS = "refunds";
  @SerializedName(SERIALIZED_NAME_REFUNDS)
  private Boolean refunds;

  public static final String SERIALIZED_NAME_PARTIAL_REFUNDS = "partial_refunds";
  @SerializedName(SERIALIZED_NAME_PARTIAL_REFUNDS)
  private Boolean partialRefunds;


  public PaymentServiceDefinitionSupportedFeatures paymentMethodTokenization(Boolean paymentMethodTokenization) {
    
    this.paymentMethodTokenization = paymentMethodTokenization;
    return this;
  }

   /**
   * Supports storing a payment method via tokenization.
   * @return paymentMethodTokenization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Supports storing a payment method via tokenization.")

  public Boolean getPaymentMethodTokenization() {
    return paymentMethodTokenization;
  }


  public void setPaymentMethodTokenization(Boolean paymentMethodTokenization) {
    this.paymentMethodTokenization = paymentMethodTokenization;
  }


  public PaymentServiceDefinitionSupportedFeatures threeDSecureHosted(Boolean threeDSecureHosted) {
    
    this.threeDSecureHosted = threeDSecureHosted;
    return this;
  }

   /**
   * Supports hosted 3-D Secure with a redirect.
   * @return threeDSecureHosted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Supports hosted 3-D Secure with a redirect.")

  public Boolean getThreeDSecureHosted() {
    return threeDSecureHosted;
  }


  public void setThreeDSecureHosted(Boolean threeDSecureHosted) {
    this.threeDSecureHosted = threeDSecureHosted;
  }


  public PaymentServiceDefinitionSupportedFeatures threeDSecurePassThrough(Boolean threeDSecurePassThrough) {
    
    this.threeDSecurePassThrough = threeDSecurePassThrough;
    return this;
  }

   /**
   * Supports passing 3-D Secure data to the underlying processor.
   * @return threeDSecurePassThrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Supports passing 3-D Secure data to the underlying processor.")

  public Boolean getThreeDSecurePassThrough() {
    return threeDSecurePassThrough;
  }


  public void setThreeDSecurePassThrough(Boolean threeDSecurePassThrough) {
    this.threeDSecurePassThrough = threeDSecurePassThrough;
  }


  public PaymentServiceDefinitionSupportedFeatures networkTokens(Boolean networkTokens) {
    
    this.networkTokens = networkTokens;
    return this;
  }

   /**
   * Supports passing decrypted digital wallet (e.g. Apple Pay) tokens to the underlying processor.
   * @return networkTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Supports passing decrypted digital wallet (e.g. Apple Pay) tokens to the underlying processor.")

  public Boolean getNetworkTokens() {
    return networkTokens;
  }


  public void setNetworkTokens(Boolean networkTokens) {
    this.networkTokens = networkTokens;
  }


  public PaymentServiceDefinitionSupportedFeatures verifyCredentials(Boolean verifyCredentials) {
    
    this.verifyCredentials = verifyCredentials;
    return this;
  }

   /**
   * Supports verifying the credentials entered while setting up the underlying processor. This is for internal use only.
   * @return verifyCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Supports verifying the credentials entered while setting up the underlying processor. This is for internal use only.")

  public Boolean getVerifyCredentials() {
    return verifyCredentials;
  }


  public void setVerifyCredentials(Boolean verifyCredentials) {
    this.verifyCredentials = verifyCredentials;
  }


  public PaymentServiceDefinitionSupportedFeatures _void(Boolean _void) {
    
    this._void = _void;
    return this;
  }

   /**
   * Supports [voiding](#operation/void-transaction) authorized transactions.
   * @return _void
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Supports [voiding](#operation/void-transaction) authorized transactions.")

  public Boolean getVoid() {
    return _void;
  }


  public void setVoid(Boolean _void) {
    this._void = _void;
  }


  public PaymentServiceDefinitionSupportedFeatures refunds(Boolean refunds) {
    
    this.refunds = refunds;
    return this;
  }

   /**
   * Supports [refunding](#operation/refund-transaction) captured transactions.
   * @return refunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Supports [refunding](#operation/refund-transaction) captured transactions.")

  public Boolean getRefunds() {
    return refunds;
  }


  public void setRefunds(Boolean refunds) {
    this.refunds = refunds;
  }


  public PaymentServiceDefinitionSupportedFeatures partialRefunds(Boolean partialRefunds) {
    
    this.partialRefunds = partialRefunds;
    return this;
  }

   /**
   * Supports [partially refunding](#operation/refund-transaction) captured transactions.
   * @return partialRefunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Supports [partially refunding](#operation/refund-transaction) captured transactions.")

  public Boolean getPartialRefunds() {
    return partialRefunds;
  }


  public void setPartialRefunds(Boolean partialRefunds) {
    this.partialRefunds = partialRefunds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentServiceDefinitionSupportedFeatures paymentServiceDefinitionSupportedFeatures = (PaymentServiceDefinitionSupportedFeatures) o;
    return Objects.equals(this.paymentMethodTokenization, paymentServiceDefinitionSupportedFeatures.paymentMethodTokenization) &&
        Objects.equals(this.threeDSecureHosted, paymentServiceDefinitionSupportedFeatures.threeDSecureHosted) &&
        Objects.equals(this.threeDSecurePassThrough, paymentServiceDefinitionSupportedFeatures.threeDSecurePassThrough) &&
        Objects.equals(this.networkTokens, paymentServiceDefinitionSupportedFeatures.networkTokens) &&
        Objects.equals(this.verifyCredentials, paymentServiceDefinitionSupportedFeatures.verifyCredentials) &&
        Objects.equals(this._void, paymentServiceDefinitionSupportedFeatures._void) &&
        Objects.equals(this.refunds, paymentServiceDefinitionSupportedFeatures.refunds) &&
        Objects.equals(this.partialRefunds, paymentServiceDefinitionSupportedFeatures.partialRefunds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodTokenization, threeDSecureHosted, threeDSecurePassThrough, networkTokens, verifyCredentials, _void, refunds, partialRefunds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServiceDefinitionSupportedFeatures {\n");
    sb.append("    paymentMethodTokenization: ").append(toIndentedString(paymentMethodTokenization)).append("\n");
    sb.append("    threeDSecureHosted: ").append(toIndentedString(threeDSecureHosted)).append("\n");
    sb.append("    threeDSecurePassThrough: ").append(toIndentedString(threeDSecurePassThrough)).append("\n");
    sb.append("    networkTokens: ").append(toIndentedString(networkTokens)).append("\n");
    sb.append("    verifyCredentials: ").append(toIndentedString(verifyCredentials)).append("\n");
    sb.append("    _void: ").append(toIndentedString(_void)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    partialRefunds: ").append(toIndentedString(partialRefunds)).append("\n");
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

