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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details for a Google Pay payment method.
 */
@ApiModel(description = "Details for a Google Pay payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class TransactionGooglePayRequest extends TransactionPaymentMethodRequest {
  
  public TransactionGooglePayRequest() {
	  this.method = "googlepay";
  }
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private Object token;

  public static final String SERIALIZED_NAME_ASSURANCE_DETAILS = "assurance_details";
  @SerializedName(SERIALIZED_NAME_ASSURANCE_DETAILS)
  private GooglePayRequestAssuranceDetails assuranceDetails;

  public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "card_holder_name";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
  private String cardHolderName;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;



  public TransactionGooglePayRequest token(Object token) {
    
    this.token = token;
    return this;
  }

   /**
   * The encrypted (opaque) token returned by the Google Pay API that represents a payment method.
   * @return token
  **/
  @ApiModelProperty(required = true, value = "The encrypted (opaque) token returned by the Google Pay API that represents a payment method.")

  public Object getToken() {
    return token;
  }


  public void setToken(Object token) {
    this.token = token;
  }


  public TransactionGooglePayRequest assuranceDetails(GooglePayRequestAssuranceDetails assuranceDetails) {
    
    this.assuranceDetails = assuranceDetails;
    return this;
  }

   /**
   * Get assuranceDetails
   * @return assuranceDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GooglePayRequestAssuranceDetails getAssuranceDetails() {
    return assuranceDetails;
  }


  public void setAssuranceDetails(GooglePayRequestAssuranceDetails assuranceDetails) {
    this.assuranceDetails = assuranceDetails;
  }


  public TransactionGooglePayRequest cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Name of the card holder.
   * @return cardHolderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the card holder.")

  public String getCardHolderName() {
    return cardHolderName;
  }


  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  public TransactionGooglePayRequest redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * We strongly recommend providing a &#x60;redirect_url&#x60; either when 3-D Secure is enabled and &#x60;three_d_secure_data&#x60; is not provided, or when using connections where 3DS is enabled. This value will be appended with both a transaction ID and status (e.g. &#x60;https://example.com/callback?gr4vy_transaction_id&#x3D;123 &amp;gr4vy_transaction_status&#x3D;capture_succeeded&#x60;) after 3-D Secure has completed. For those cases, if the value is not present, the transaction will be marked as failed.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/callback", value = "We strongly recommend providing a `redirect_url` either when 3-D Secure is enabled and `three_d_secure_data` is not provided, or when using connections where 3DS is enabled. This value will be appended with both a transaction ID and status (e.g. `https://example.com/callback?gr4vy_transaction_id=123 &gr4vy_transaction_status=capture_succeeded`) after 3-D Secure has completed. For those cases, if the value is not present, the transaction will be marked as failed.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionGooglePayRequest googlePayRequest = (TransactionGooglePayRequest) o;
    return Objects.equals(this.method, googlePayRequest.method) &&
        Objects.equals(this.token, googlePayRequest.token) &&
        Objects.equals(this.assuranceDetails, googlePayRequest.assuranceDetails) &&
        Objects.equals(this.cardHolderName, googlePayRequest.cardHolderName) &&
        Objects.equals(this.redirectUrl, googlePayRequest.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, token, assuranceDetails, cardHolderName, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePayRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    assuranceDetails: ").append(toIndentedString(assuranceDetails)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

