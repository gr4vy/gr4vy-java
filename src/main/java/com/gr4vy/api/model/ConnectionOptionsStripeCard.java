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
import com.gr4vy.api.model.ConnectionOptionsStripeCardStripeConnect;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Additional options to be passed through to Stripe when processing transactions.
 */
@ApiModel(description = "Additional options to be passed through to Stripe when processing transactions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionOptionsStripeCard {
  public static final String SERIALIZED_NAME_ERROR_ON_REQUIRES_ACTION = "error_on_requires_action";
  @SerializedName(SERIALIZED_NAME_ERROR_ON_REQUIRES_ACTION)
  private Boolean errorOnRequiresAction = false;

  public static final String SERIALIZED_NAME_STRIPE_CONNECT = "stripe_connect";
  @SerializedName(SERIALIZED_NAME_STRIPE_CONNECT)
  private ConnectionOptionsStripeCardStripeConnect stripeConnect;


  public ConnectionOptionsStripeCard errorOnRequiresAction(Boolean errorOnRequiresAction) {
    
    this.errorOnRequiresAction = errorOnRequiresAction;
    return this;
  }

   /**
   * Defines if Stripe should automatically fail the payment if it requires two-factor authentication from the user.
   * @return errorOnRequiresAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if Stripe should automatically fail the payment if it requires two-factor authentication from the user.")

  public Boolean getErrorOnRequiresAction() {
    return errorOnRequiresAction;
  }


  public void setErrorOnRequiresAction(Boolean errorOnRequiresAction) {
    this.errorOnRequiresAction = errorOnRequiresAction;
  }


  public ConnectionOptionsStripeCard stripeConnect(ConnectionOptionsStripeCardStripeConnect stripeConnect) {
    
    this.stripeConnect = stripeConnect;
    return this;
  }

   /**
   * Get stripeConnect
   * @return stripeConnect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionOptionsStripeCardStripeConnect getStripeConnect() {
    return stripeConnect;
  }


  public void setStripeConnect(ConnectionOptionsStripeCardStripeConnect stripeConnect) {
    this.stripeConnect = stripeConnect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionOptionsStripeCard connectionOptionsStripeCard = (ConnectionOptionsStripeCard) o;
    return Objects.equals(this.errorOnRequiresAction, connectionOptionsStripeCard.errorOnRequiresAction) &&
        Objects.equals(this.stripeConnect, connectionOptionsStripeCard.stripeConnect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorOnRequiresAction, stripeConnect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOptionsStripeCard {\n");
    sb.append("    errorOnRequiresAction: ").append(toIndentedString(errorOnRequiresAction)).append("\n");
    sb.append("    stripeConnect: ").append(toIndentedString(stripeConnect)).append("\n");
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

