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
 * Details for a previously stored payment method.
 */
@ApiModel(description = "Details for a previously stored payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class TransactionStoredRequest extends TransactionPaymentMethodRequest {
  
  public TransactionStoredRequest() {
	  this.method = "id";
  }
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_SECURITY_CODE = "security_code";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE)
  private String securityCode;



  public TransactionStoredRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A ID that represents a previously stored payment method. This ID can represent any type of payment method.
   * @return id
  **/
  @ApiModelProperty(example = "46973e9d-88a7-44a6-abfe-be4ff0134ff4", required = true, value = "A ID that represents a previously stored payment method. This ID can represent any type of payment method.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransactionStoredRequest redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * This value is mandatory for stored redirect payment methods. For stored cards, we strongly recommend providing a &#x60;redirect_url&#x60; either when 3-D Secure is enabled and &#x60;three_d_secure_data&#x60; is not provided, or when using connections where 3DS is enabled. This value will be appended with both a transaction ID and status (e.g. &#x60;https://example.com/callback?gr4vy_transaction_id&#x3D;123 &amp;gr4vy_transaction_status&#x3D;capture_succeeded&#x60;) after 3-D Secure has completed. For those cases, if the value is not present, the transaction will be marked as failed.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/callback", value = "This value is mandatory for stored redirect payment methods. For stored cards, we strongly recommend providing a `redirect_url` either when 3-D Secure is enabled and `three_d_secure_data` is not provided, or when using connections where 3DS is enabled. This value will be appended with both a transaction ID and status (e.g. `https://example.com/callback?gr4vy_transaction_id=123 &gr4vy_transaction_status=capture_succeeded`) after 3-D Secure has completed. For those cases, if the value is not present, the transaction will be marked as failed.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public TransactionStoredRequest securityCode(String securityCode) {
    
    this.securityCode = securityCode;
    return this;
  }

   /**
   * The 3 or 4 digit security code often found on the card. This often referred to as the CVV or CVD.  The security code can only be set if the stored payment method represents a card.
   * @return securityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "The 3 or 4 digit security code often found on the card. This often referred to as the CVV or CVD.  The security code can only be set if the stored payment method represents a card.")

  public String getSecurityCode() {
    return securityCode;
  }


  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStoredRequest tokenizedRequest = (TransactionStoredRequest) o;
    return Objects.equals(this.method, tokenizedRequest.method) &&
        Objects.equals(this.id, tokenizedRequest.id) &&
        Objects.equals(this.redirectUrl, tokenizedRequest.redirectUrl) &&
        Objects.equals(this.securityCode, tokenizedRequest.securityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, id, redirectUrl, securityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizedRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
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

