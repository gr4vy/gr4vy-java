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
import java.math.BigDecimal;

/**
 * Stripe Connect configuration options.
 */
@ApiModel(description = "Stripe Connect configuration options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionOptionsStripeCardStripeConnect {
  public static final String SERIALIZED_NAME_STRIPE_ACCOUNT = "stripe_account";
  @SerializedName(SERIALIZED_NAME_STRIPE_ACCOUNT)
  private String stripeAccount;

  public static final String SERIALIZED_NAME_APPLICATION_FEE_AMOUNT = "application_fee_amount";
  @SerializedName(SERIALIZED_NAME_APPLICATION_FEE_AMOUNT)
  private BigDecimal applicationFeeAmount;


  public ConnectionOptionsStripeCardStripeConnect stripeAccount(String stripeAccount) {
    
    this.stripeAccount = stripeAccount;
    return this;
  }

   /**
   * The ID of the connected Stripe account to process for.
   * @return stripeAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the connected Stripe account to process for.")

  public String getStripeAccount() {
    return stripeAccount;
  }


  public void setStripeAccount(String stripeAccount) {
    this.stripeAccount = stripeAccount;
  }


  public ConnectionOptionsStripeCardStripeConnect applicationFeeAmount(BigDecimal applicationFeeAmount) {
    
    this.applicationFeeAmount = applicationFeeAmount;
    return this;
  }

   /**
   * The application fee to charge when processing for a connected account.
   * @return applicationFeeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The application fee to charge when processing for a connected account.")

  public BigDecimal getApplicationFeeAmount() {
    return applicationFeeAmount;
  }


  public void setApplicationFeeAmount(BigDecimal applicationFeeAmount) {
    this.applicationFeeAmount = applicationFeeAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionOptionsStripeCardStripeConnect connectionOptionsStripeCardStripeConnect = (ConnectionOptionsStripeCardStripeConnect) o;
    return Objects.equals(this.stripeAccount, connectionOptionsStripeCardStripeConnect.stripeAccount) &&
        Objects.equals(this.applicationFeeAmount, connectionOptionsStripeCardStripeConnect.applicationFeeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeAccount, applicationFeeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOptionsStripeCardStripeConnect {\n");
    sb.append("    stripeAccount: ").append(toIndentedString(stripeAccount)).append("\n");
    sb.append("    applicationFeeAmount: ").append(toIndentedString(applicationFeeAmount)).append("\n");
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
