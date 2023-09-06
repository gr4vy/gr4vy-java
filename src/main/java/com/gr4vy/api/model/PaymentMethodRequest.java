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
 * Payment method details used to register a new payment method.
 */
@ApiModel(description = "Payment method details used to register a new payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:55:13.160613Z[Etc/UTC]")
public class PaymentMethodRequest {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

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

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public PaymentMethodRequest method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * The type of the funding source, e.g. &#x60;card&#x60;, &#x60;paypal&#x60;, or &#x60;checkout-session&#x60;.
   * @return method
  **/
  @ApiModelProperty(example = "card", required = true, value = "The type of the funding source, e.g. `card`, `paypal`, or `checkout-session`.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public PaymentMethodRequest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of a Checkout Session.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8d3fe99b-1422-42e6-bbb3-932d95ae5f79", value = "The ID of a Checkout Session.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public PaymentMethodRequest number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The 13-19 digit number for this credit card as it can be found on the front of the card.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4111111111111111", value = "The 13-19 digit number for this credit card as it can be found on the front of the card.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public PaymentMethodRequest expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date of the card, formatted &#x60;MM/YY&#x60;. If a card has been previously stored with us this value is optional.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11/15", value = "The expiration date of the card, formatted `MM/YY`. If a card has been previously stored with us this value is optional.")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PaymentMethodRequest externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the card against your own records.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "account-23423423", value = "An external identifier that can be used to match the card against your own records.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public PaymentMethodRequest buyerId(UUID buyerId) {
    
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


  public PaymentMethodRequest buyerExternalIdentifier(String buyerExternalIdentifier) {
    
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


  public PaymentMethodRequest redirectUrl(String redirectUrl) {
    
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


  public PaymentMethodRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code to store this payment method for. This is used to select the payment service to use.  This only applies to &#x60;redirect&#x60; mode payment methods like &#x60;gocardless&#x60;.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The ISO-4217 currency code to store this payment method for. This is used to select the payment service to use.  This only applies to `redirect` mode payment methods like `gocardless`.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PaymentMethodRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the country to store this payment method for. This is used to select the payment service to use.  This only applies to &#x60;redirect&#x60; mode payment methods like &#x60;gocardless&#x60;.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The 2-letter ISO code of the country to store this payment method for. This is used to select the payment service to use.  This only applies to `redirect` mode payment methods like `gocardless`.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodRequest paymentMethodRequest = (PaymentMethodRequest) o;
    return Objects.equals(this.method, paymentMethodRequest.method) &&
        Objects.equals(this.id, paymentMethodRequest.id) &&
        Objects.equals(this.number, paymentMethodRequest.number) &&
        Objects.equals(this.expirationDate, paymentMethodRequest.expirationDate) &&
        Objects.equals(this.externalIdentifier, paymentMethodRequest.externalIdentifier) &&
        Objects.equals(this.buyerId, paymentMethodRequest.buyerId) &&
        Objects.equals(this.buyerExternalIdentifier, paymentMethodRequest.buyerExternalIdentifier) &&
        Objects.equals(this.redirectUrl, paymentMethodRequest.redirectUrl) &&
        Objects.equals(this.currency, paymentMethodRequest.currency) &&
        Objects.equals(this.country, paymentMethodRequest.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, id, number, expirationDate, externalIdentifier, buyerId, buyerExternalIdentifier, redirectUrl, currency, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    buyerId: ").append(toIndentedString(buyerId)).append("\n");
    sb.append("    buyerExternalIdentifier: ").append(toIndentedString(buyerExternalIdentifier)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

