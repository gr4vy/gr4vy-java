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
 * Information about the validation performed on the payment data. (See https://developers.google.com/pay/api/web/reference/response-objects#assurance-details-specifications).
 */
@ApiModel(description = "Information about the validation performed on the payment data. (See https://developers.google.com/pay/api/web/reference/response-objects#assurance-details-specifications).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class GooglePayRequestAssuranceDetails {
  public static final String SERIALIZED_NAME_ACCOUNT_VERIFIED = "account_verified";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_VERIFIED)
  private Boolean accountVerified;

  public static final String SERIALIZED_NAME_CARD_HOLDER_AUTHENTICATED = "card_holder_authenticated";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_AUTHENTICATED)
  private Boolean cardHolderAuthenticated;


  public GooglePayRequestAssuranceDetails accountVerified(Boolean accountVerified) {
    
    this.accountVerified = accountVerified;
    return this;
  }

   /**
   * Indicates that card holder possession validation has been performed.
   * @return accountVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates that card holder possession validation has been performed.")

  public Boolean getAccountVerified() {
    return accountVerified;
  }


  public void setAccountVerified(Boolean accountVerified) {
    this.accountVerified = accountVerified;
  }


  public GooglePayRequestAssuranceDetails cardHolderAuthenticated(Boolean cardHolderAuthenticated) {
    
    this.cardHolderAuthenticated = cardHolderAuthenticated;
    return this;
  }

   /**
   * Indicates that identification and verifications was performed.
   * @return cardHolderAuthenticated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates that identification and verifications was performed.")

  public Boolean getCardHolderAuthenticated() {
    return cardHolderAuthenticated;
  }


  public void setCardHolderAuthenticated(Boolean cardHolderAuthenticated) {
    this.cardHolderAuthenticated = cardHolderAuthenticated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePayRequestAssuranceDetails googlePayRequestAssuranceDetails = (GooglePayRequestAssuranceDetails) o;
    return Objects.equals(this.accountVerified, googlePayRequestAssuranceDetails.accountVerified) &&
        Objects.equals(this.cardHolderAuthenticated, googlePayRequestAssuranceDetails.cardHolderAuthenticated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountVerified, cardHolderAuthenticated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePayRequestAssuranceDetails {\n");
    sb.append("    accountVerified: ").append(toIndentedString(accountVerified)).append("\n");
    sb.append("    cardHolderAuthenticated: ").append(toIndentedString(cardHolderAuthenticated)).append("\n");
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

