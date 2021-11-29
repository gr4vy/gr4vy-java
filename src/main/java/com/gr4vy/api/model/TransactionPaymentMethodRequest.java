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
 * Payment method details to use in a transaction or to register a new payment method.
 */
@ApiModel(description = "Payment method details to use in a transaction or to register a new payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T06:53:23.548460Z[Etc/UTC]")
public class TransactionPaymentMethodRequest {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_SECURITY_CODE = "security_code";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE)
  private String securityCode;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_BUYER_ID = "buyer_id";
  @SerializedName(SERIALIZED_NAME_BUYER_ID)
  private UUID buyerId;

  public static final String SERIALIZED_NAME_BUYER_EXTERNAL_IDENTIFIER = "buyer_external_identifier";
  @SerializedName(SERIALIZED_NAME_BUYER_EXTERNAL_IDENTIFIER)
  private String buyerExternalIdentifier;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public TransactionPaymentMethodRequest method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(required = true, value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public TransactionPaymentMethodRequest number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The 15-16 digit number for this credit card as it can be found on the front of the card.  If a card has been stored with us previously, this number will represent the unique tokenized card ID provided via our API.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4111111111111111", value = "The 15-16 digit number for this credit card as it can be found on the front of the card.  If a card has been stored with us previously, this number will represent the unique tokenized card ID provided via our API.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public TransactionPaymentMethodRequest expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date of the card, formatted &#x60;MM/YY&#x60;. If a card has been previously stored with us this value is optional.  If the &#x60;number&#x60; of this card represents a tokenized card, then this value is ignored.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11/15", value = "The expiration date of the card, formatted `MM/YY`. If a card has been previously stored with us this value is optional.  If the `number` of this card represents a tokenized card, then this value is ignored.")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public TransactionPaymentMethodRequest securityCode(String securityCode) {
    
    this.securityCode = securityCode;
    return this;
  }

   /**
   * The 3 or 4 digit security code often found on the card. This often referred to as the CVV or CVD.  If the &#x60;number&#x60; of this card represents a tokenized card, then this value is ignored.
   * @return securityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "The 3 or 4 digit security code often found on the card. This often referred to as the CVV or CVD.  If the `number` of this card represents a tokenized card, then this value is ignored.")

  public String getSecurityCode() {
    return securityCode;
  }


  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  public TransactionPaymentMethodRequest externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the card against your own records.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "An external identifier that can be used to match the card against your own records.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public TransactionPaymentMethodRequest buyerId(UUID buyerId) {
    
    this.buyerId = buyerId;
    return this;
  }

   /**
   * The ID of the buyer to associate this payment method to. If this field is provided then the &#x60;buyer_external_identifier&#x60; field needs to be unset.
   * @return buyerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The ID of the buyer to associate this payment method to. If this field is provided then the `buyer_external_identifier` field needs to be unset.")

  public UUID getBuyerId() {
    return buyerId;
  }


  public void setBuyerId(UUID buyerId) {
    this.buyerId = buyerId;
  }


  public TransactionPaymentMethodRequest buyerExternalIdentifier(String buyerExternalIdentifier) {
    
    this.buyerExternalIdentifier = buyerExternalIdentifier;
    return this;
  }

   /**
   * The &#x60;external_identifier&#x60; of the buyer to associate this payment method to. If this field is provided then the &#x60;buyer_id&#x60; field needs to be unset.
   * @return buyerExternalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "The `external_identifier` of the buyer to associate this payment method to. If this field is provided then the `buyer_id` field needs to be unset.")

  public String getBuyerExternalIdentifier() {
    return buyerExternalIdentifier;
  }


  public void setBuyerExternalIdentifier(String buyerExternalIdentifier) {
    this.buyerExternalIdentifier = buyerExternalIdentifier;
  }


  public TransactionPaymentMethodRequest redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The redirect URL to redirect a buyer to after they have authorized their transaction or payment method. This only applies to payment methods that require buyer approval.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/callback", value = "The redirect URL to redirect a buyer to after they have authorized their transaction or payment method. This only applies to payment methods that require buyer approval.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public TransactionPaymentMethodRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An identifier for a previously tokenized payment method. This id can represent any type of payment method.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "77a76f7e-d2de-4bbc-ada9-d6a0015e6bd5", value = "An identifier for a previously tokenized payment method. This id can represent any type of payment method.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPaymentMethodRequest transactionPaymentMethodRequest = (TransactionPaymentMethodRequest) o;
    return Objects.equals(this.method, transactionPaymentMethodRequest.method) &&
        Objects.equals(this.number, transactionPaymentMethodRequest.number) &&
        Objects.equals(this.expirationDate, transactionPaymentMethodRequest.expirationDate) &&
        Objects.equals(this.securityCode, transactionPaymentMethodRequest.securityCode) &&
        Objects.equals(this.externalIdentifier, transactionPaymentMethodRequest.externalIdentifier) &&
        Objects.equals(this.buyerId, transactionPaymentMethodRequest.buyerId) &&
        Objects.equals(this.buyerExternalIdentifier, transactionPaymentMethodRequest.buyerExternalIdentifier) &&
        Objects.equals(this.redirectUrl, transactionPaymentMethodRequest.redirectUrl) &&
        Objects.equals(this.id, transactionPaymentMethodRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, number, expirationDate, securityCode, externalIdentifier, buyerId, buyerExternalIdentifier, redirectUrl, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPaymentMethodRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
    sb.append("    buyerExternalIdentifier: ").append(toIndentedString(buyerExternalIdentifier)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

