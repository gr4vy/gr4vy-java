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
import com.gr4vy.api.model.ConnectionOptionsAdyenCard;
import com.gr4vy.api.model.ConnectionOptionsCybersourceAntiFraud;
import com.gr4vy.api.model.ConnectionOptionsCybersourceCard;
import com.gr4vy.api.model.ConnectionOptionsForterAntiFraud;
import com.gr4vy.api.model.ConnectionOptionsPaypalPaypal;
import com.gr4vy.api.model.ConnectionOptionsStripeCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConnectionOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionOptions {
  public static final String SERIALIZED_NAME_CYBERSOURCE_CARD = "cybersource-card";
  @SerializedName(SERIALIZED_NAME_CYBERSOURCE_CARD)
  private ConnectionOptionsCybersourceCard cybersourceCard;

  public static final String SERIALIZED_NAME_CYBERSOURCE_ANTI_FRAUD = "cybersource-anti-fraud";
  @SerializedName(SERIALIZED_NAME_CYBERSOURCE_ANTI_FRAUD)
  private ConnectionOptionsCybersourceAntiFraud cybersourceAntiFraud;

  public static final String SERIALIZED_NAME_FORTER_ANTI_FRAUD = "forter-anti-fraud";
  @SerializedName(SERIALIZED_NAME_FORTER_ANTI_FRAUD)
  private ConnectionOptionsForterAntiFraud forterAntiFraud;

  public static final String SERIALIZED_NAME_ADYEN_CARD = "adyen-card";
  @SerializedName(SERIALIZED_NAME_ADYEN_CARD)
  private ConnectionOptionsAdyenCard adyenCard;

  public static final String SERIALIZED_NAME_PAYPAL_PAYPAL = "paypal-paypal";
  @SerializedName(SERIALIZED_NAME_PAYPAL_PAYPAL)
  private ConnectionOptionsPaypalPaypal paypalPaypal;

  public static final String SERIALIZED_NAME_PAYPAL_PAYPALPAYLATER = "paypal-paypalpaylater";
  @SerializedName(SERIALIZED_NAME_PAYPAL_PAYPALPAYLATER)
  private ConnectionOptionsPaypalPaypal paypalPaypalpaylater;

  public static final String SERIALIZED_NAME_STRIPE_CARD = "stripe-card";
  @SerializedName(SERIALIZED_NAME_STRIPE_CARD)
  private ConnectionOptionsStripeCard stripeCard;


  public ConnectionOptions cybersourceCard(ConnectionOptionsCybersourceCard cybersourceCard) {
    
    this.cybersourceCard = cybersourceCard;
    return this;
  }

   /**
   * Get cybersourceCard
   * @return cybersourceCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsCybersourceCard getCybersourceCard() {
    return cybersourceCard;
  }


  public void setCybersourceCard(ConnectionOptionsCybersourceCard cybersourceCard) {
    this.cybersourceCard = cybersourceCard;
  }


  public ConnectionOptions cybersourceAntiFraud(ConnectionOptionsCybersourceAntiFraud cybersourceAntiFraud) {
    
    this.cybersourceAntiFraud = cybersourceAntiFraud;
    return this;
  }

   /**
   * Get cybersourceAntiFraud
   * @return cybersourceAntiFraud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsCybersourceAntiFraud getCybersourceAntiFraud() {
    return cybersourceAntiFraud;
  }


  public void setCybersourceAntiFraud(ConnectionOptionsCybersourceAntiFraud cybersourceAntiFraud) {
    this.cybersourceAntiFraud = cybersourceAntiFraud;
  }


  public ConnectionOptions forterAntiFraud(ConnectionOptionsForterAntiFraud forterAntiFraud) {
    
    this.forterAntiFraud = forterAntiFraud;
    return this;
  }

   /**
   * Get forterAntiFraud
   * @return forterAntiFraud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsForterAntiFraud getForterAntiFraud() {
    return forterAntiFraud;
  }


  public void setForterAntiFraud(ConnectionOptionsForterAntiFraud forterAntiFraud) {
    this.forterAntiFraud = forterAntiFraud;
  }


  public ConnectionOptions adyenCard(ConnectionOptionsAdyenCard adyenCard) {
    
    this.adyenCard = adyenCard;
    return this;
  }

   /**
   * Get adyenCard
   * @return adyenCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsAdyenCard getAdyenCard() {
    return adyenCard;
  }


  public void setAdyenCard(ConnectionOptionsAdyenCard adyenCard) {
    this.adyenCard = adyenCard;
  }


  public ConnectionOptions paypalPaypal(ConnectionOptionsPaypalPaypal paypalPaypal) {
    
    this.paypalPaypal = paypalPaypal;
    return this;
  }

   /**
   * Get paypalPaypal
   * @return paypalPaypal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsPaypalPaypal getPaypalPaypal() {
    return paypalPaypal;
  }


  public void setPaypalPaypal(ConnectionOptionsPaypalPaypal paypalPaypal) {
    this.paypalPaypal = paypalPaypal;
  }


  public ConnectionOptions paypalPaypalpaylater(ConnectionOptionsPaypalPaypal paypalPaypalpaylater) {
    
    this.paypalPaypalpaylater = paypalPaypalpaylater;
    return this;
  }

   /**
   * Get paypalPaypalpaylater
   * @return paypalPaypalpaylater
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsPaypalPaypal getPaypalPaypalpaylater() {
    return paypalPaypalpaylater;
  }


  public void setPaypalPaypalpaylater(ConnectionOptionsPaypalPaypal paypalPaypalpaylater) {
    this.paypalPaypalpaylater = paypalPaypalpaylater;
  }


  public ConnectionOptions stripeCard(ConnectionOptionsStripeCard stripeCard) {
    
    this.stripeCard = stripeCard;
    return this;
  }

   /**
   * Get stripeCard
   * @return stripeCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsStripeCard getStripeCard() {
    return stripeCard;
  }


  public void setStripeCard(ConnectionOptionsStripeCard stripeCard) {
    this.stripeCard = stripeCard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionOptions connectionOptions = (ConnectionOptions) o;
    return Objects.equals(this.cybersourceCard, connectionOptions.cybersourceCard) &&
        Objects.equals(this.cybersourceAntiFraud, connectionOptions.cybersourceAntiFraud) &&
        Objects.equals(this.forterAntiFraud, connectionOptions.forterAntiFraud) &&
        Objects.equals(this.adyenCard, connectionOptions.adyenCard) &&
        Objects.equals(this.paypalPaypal, connectionOptions.paypalPaypal) &&
        Objects.equals(this.paypalPaypalpaylater, connectionOptions.paypalPaypalpaylater) &&
        Objects.equals(this.stripeCard, connectionOptions.stripeCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cybersourceCard, cybersourceAntiFraud, forterAntiFraud, adyenCard, paypalPaypal, paypalPaypalpaylater, stripeCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOptions {\n");
    sb.append("    cybersourceCard: ").append(toIndentedString(cybersourceCard)).append("\n");
    sb.append("    cybersourceAntiFraud: ").append(toIndentedString(cybersourceAntiFraud)).append("\n");
    sb.append("    forterAntiFraud: ").append(toIndentedString(forterAntiFraud)).append("\n");
    sb.append("    adyenCard: ").append(toIndentedString(adyenCard)).append("\n");
    sb.append("    paypalPaypal: ").append(toIndentedString(paypalPaypal)).append("\n");
    sb.append("    paypalPaypalpaylater: ").append(toIndentedString(paypalPaypalpaylater)).append("\n");
    sb.append("    stripeCard: ").append(toIndentedString(stripeCard)).append("\n");
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

