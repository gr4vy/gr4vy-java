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
 * A request to create a merchant account.
 */
@ApiModel(description = "A request to create a merchant account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class MerchantAccountCreate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_OUTBOUND_WEBHOOK_URL = "outbound_webhook_url";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_WEBHOOK_URL)
  private String outboundWebhookUrl;

  public static final String SERIALIZED_NAME_OUTBOUND_WEBHOOK_USERNAME = "outbound_webhook_username";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_WEBHOOK_USERNAME)
  private String outboundWebhookUsername;

  public static final String SERIALIZED_NAME_OUTBOUND_WEBHOOK_PASSWORD = "outbound_webhook_password";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_WEBHOOK_PASSWORD)
  private String outboundWebhookPassword;

  public static final String SERIALIZED_NAME_VISA_NETWORK_TOKENS_REQUESTOR_ID = "visa_network_tokens_requestor_id";
  @SerializedName(SERIALIZED_NAME_VISA_NETWORK_TOKENS_REQUESTOR_ID)
  private String visaNetworkTokensRequestorId;

  public static final String SERIALIZED_NAME_VISA_NETWORK_TOKENS_APP_ID = "visa_network_tokens_app_id";
  @SerializedName(SERIALIZED_NAME_VISA_NETWORK_TOKENS_APP_ID)
  private String visaNetworkTokensAppId;

  public static final String SERIALIZED_NAME_AMEX_NETWORK_TOKENS_REQUESTOR_ID = "amex_network_tokens_requestor_id";
  @SerializedName(SERIALIZED_NAME_AMEX_NETWORK_TOKENS_REQUESTOR_ID)
  private String amexNetworkTokensRequestorId;

  public static final String SERIALIZED_NAME_AMEX_NETWORK_TOKENS_APP_ID = "amex_network_tokens_app_id";
  @SerializedName(SERIALIZED_NAME_AMEX_NETWORK_TOKENS_APP_ID)
  private String amexNetworkTokensAppId;

  public static final String SERIALIZED_NAME_MASTERCARD_NETWORK_TOKENS_REQUESTOR_ID = "mastercard_network_tokens_requestor_id";
  @SerializedName(SERIALIZED_NAME_MASTERCARD_NETWORK_TOKENS_REQUESTOR_ID)
  private String mastercardNetworkTokensRequestorId;

  public static final String SERIALIZED_NAME_MASTERCARD_NETWORK_TOKENS_APP_ID = "mastercard_network_tokens_app_id";
  @SerializedName(SERIALIZED_NAME_MASTERCARD_NETWORK_TOKENS_APP_ID)
  private String mastercardNetworkTokensAppId;


  public MerchantAccountCreate id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID for the merchant account.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "plantly-uk", value = "The unique ID for the merchant account.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MerchantAccountCreate displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The human-readable name of the merchant account.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Plantly UK", value = "The human-readable name of the merchant account.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public MerchantAccountCreate outboundWebhookUrl(String outboundWebhookUrl) {
    
    this.outboundWebhookUrl = outboundWebhookUrl;
    return this;
  }

   /**
   * The optional URL where webhooks will be received.
   * @return outboundWebhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com/webhook", value = "The optional URL where webhooks will be received.")

  public String getOutboundWebhookUrl() {
    return outboundWebhookUrl;
  }


  public void setOutboundWebhookUrl(String outboundWebhookUrl) {
    this.outboundWebhookUrl = outboundWebhookUrl;
  }


  public MerchantAccountCreate outboundWebhookUsername(String outboundWebhookUsername) {
    
    this.outboundWebhookUsername = outboundWebhookUsername;
    return this;
  }

   /**
   * The optional username to use when &#x60;outbound_webhook_url&#x60; is configured and requires basic authentication.
   * @return outboundWebhookUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gr4vy", value = "The optional username to use when `outbound_webhook_url` is configured and requires basic authentication.")

  public String getOutboundWebhookUsername() {
    return outboundWebhookUsername;
  }


  public void setOutboundWebhookUsername(String outboundWebhookUsername) {
    this.outboundWebhookUsername = outboundWebhookUsername;
  }


  public MerchantAccountCreate outboundWebhookPassword(String outboundWebhookPassword) {
    
    this.outboundWebhookPassword = outboundWebhookPassword;
    return this;
  }

   /**
   * The optional password to use when &#x60;outbound_webhook_url&#x60; is configured and requires basic authentication.
   * @return outboundWebhookPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "super-secret-password", value = "The optional password to use when `outbound_webhook_url` is configured and requires basic authentication.")

  public String getOutboundWebhookPassword() {
    return outboundWebhookPassword;
  }


  public void setOutboundWebhookPassword(String outboundWebhookPassword) {
    this.outboundWebhookPassword = outboundWebhookPassword;
  }


  public MerchantAccountCreate visaNetworkTokensRequestorId(String visaNetworkTokensRequestorId) {
    
    this.visaNetworkTokensRequestorId = visaNetworkTokensRequestorId;
    return this;
  }

   /**
   * Requestor ID provided for Visa after onboarding to use Network Tokens. The requestor ID must be unique across all schemes and merchant accounts.
   * @return visaNetworkTokensRequestorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Requestor ID provided for Visa after onboarding to use Network Tokens. The requestor ID must be unique across all schemes and merchant accounts.")

  public String getVisaNetworkTokensRequestorId() {
    return visaNetworkTokensRequestorId;
  }


  public void setVisaNetworkTokensRequestorId(String visaNetworkTokensRequestorId) {
    this.visaNetworkTokensRequestorId = visaNetworkTokensRequestorId;
  }


  public MerchantAccountCreate visaNetworkTokensAppId(String visaNetworkTokensAppId) {
    
    this.visaNetworkTokensAppId = visaNetworkTokensAppId;
    return this;
  }

   /**
   * Application ID provided for Visa after onboarding to use Network Tokens. The application ID must be unique across all schemes and merchant accounts.
   * @return visaNetworkTokensAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Application ID provided for Visa after onboarding to use Network Tokens. The application ID must be unique across all schemes and merchant accounts.")

  public String getVisaNetworkTokensAppId() {
    return visaNetworkTokensAppId;
  }


  public void setVisaNetworkTokensAppId(String visaNetworkTokensAppId) {
    this.visaNetworkTokensAppId = visaNetworkTokensAppId;
  }


  public MerchantAccountCreate amexNetworkTokensRequestorId(String amexNetworkTokensRequestorId) {
    
    this.amexNetworkTokensRequestorId = amexNetworkTokensRequestorId;
    return this;
  }

   /**
   * Requestor ID provided for Amex after onboarding to use Network Tokens. The requestor ID must be unique across all schemes and merchant accounts.
   * @return amexNetworkTokensRequestorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Requestor ID provided for Amex after onboarding to use Network Tokens. The requestor ID must be unique across all schemes and merchant accounts.")

  public String getAmexNetworkTokensRequestorId() {
    return amexNetworkTokensRequestorId;
  }


  public void setAmexNetworkTokensRequestorId(String amexNetworkTokensRequestorId) {
    this.amexNetworkTokensRequestorId = amexNetworkTokensRequestorId;
  }


  public MerchantAccountCreate amexNetworkTokensAppId(String amexNetworkTokensAppId) {
    
    this.amexNetworkTokensAppId = amexNetworkTokensAppId;
    return this;
  }

   /**
   * Application ID provided for Amex after onboarding to use Network Tokens. The application ID must be unique across all schemes and merchant accounts.
   * @return amexNetworkTokensAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Application ID provided for Amex after onboarding to use Network Tokens. The application ID must be unique across all schemes and merchant accounts.")

  public String getAmexNetworkTokensAppId() {
    return amexNetworkTokensAppId;
  }


  public void setAmexNetworkTokensAppId(String amexNetworkTokensAppId) {
    this.amexNetworkTokensAppId = amexNetworkTokensAppId;
  }


  public MerchantAccountCreate mastercardNetworkTokensRequestorId(String mastercardNetworkTokensRequestorId) {
    
    this.mastercardNetworkTokensRequestorId = mastercardNetworkTokensRequestorId;
    return this;
  }

   /**
   * Requestor ID provided for Mastercard after onboarding to use Network Tokens. The requestor ID must be unique across all schemes and merchant accounts.
   * @return mastercardNetworkTokensRequestorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Requestor ID provided for Mastercard after onboarding to use Network Tokens. The requestor ID must be unique across all schemes and merchant accounts.")

  public String getMastercardNetworkTokensRequestorId() {
    return mastercardNetworkTokensRequestorId;
  }


  public void setMastercardNetworkTokensRequestorId(String mastercardNetworkTokensRequestorId) {
    this.mastercardNetworkTokensRequestorId = mastercardNetworkTokensRequestorId;
  }


  public MerchantAccountCreate mastercardNetworkTokensAppId(String mastercardNetworkTokensAppId) {
    
    this.mastercardNetworkTokensAppId = mastercardNetworkTokensAppId;
    return this;
  }

   /**
   * Application ID provided for Mastercard after onboarding to use Network Tokens. The application ID must be unique across all schemes and merchant accounts.
   * @return mastercardNetworkTokensAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Application ID provided for Mastercard after onboarding to use Network Tokens. The application ID must be unique across all schemes and merchant accounts.")

  public String getMastercardNetworkTokensAppId() {
    return mastercardNetworkTokensAppId;
  }


  public void setMastercardNetworkTokensAppId(String mastercardNetworkTokensAppId) {
    this.mastercardNetworkTokensAppId = mastercardNetworkTokensAppId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantAccountCreate merchantAccountCreate = (MerchantAccountCreate) o;
    return Objects.equals(this.id, merchantAccountCreate.id) &&
        Objects.equals(this.displayName, merchantAccountCreate.displayName) &&
        Objects.equals(this.outboundWebhookUrl, merchantAccountCreate.outboundWebhookUrl) &&
        Objects.equals(this.outboundWebhookUsername, merchantAccountCreate.outboundWebhookUsername) &&
        Objects.equals(this.outboundWebhookPassword, merchantAccountCreate.outboundWebhookPassword) &&
        Objects.equals(this.visaNetworkTokensRequestorId, merchantAccountCreate.visaNetworkTokensRequestorId) &&
        Objects.equals(this.visaNetworkTokensAppId, merchantAccountCreate.visaNetworkTokensAppId) &&
        Objects.equals(this.amexNetworkTokensRequestorId, merchantAccountCreate.amexNetworkTokensRequestorId) &&
        Objects.equals(this.amexNetworkTokensAppId, merchantAccountCreate.amexNetworkTokensAppId) &&
        Objects.equals(this.mastercardNetworkTokensRequestorId, merchantAccountCreate.mastercardNetworkTokensRequestorId) &&
        Objects.equals(this.mastercardNetworkTokensAppId, merchantAccountCreate.mastercardNetworkTokensAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, outboundWebhookUrl, outboundWebhookUsername, outboundWebhookPassword, visaNetworkTokensRequestorId, visaNetworkTokensAppId, amexNetworkTokensRequestorId, amexNetworkTokensAppId, mastercardNetworkTokensRequestorId, mastercardNetworkTokensAppId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantAccountCreate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    outboundWebhookUrl: ").append(toIndentedString(outboundWebhookUrl)).append("\n");
    sb.append("    outboundWebhookUsername: ").append(toIndentedString(outboundWebhookUsername)).append("\n");
    sb.append("    outboundWebhookPassword: ").append(toIndentedString(outboundWebhookPassword)).append("\n");
    sb.append("    visaNetworkTokensRequestorId: ").append(toIndentedString(visaNetworkTokensRequestorId)).append("\n");
    sb.append("    visaNetworkTokensAppId: ").append(toIndentedString(visaNetworkTokensAppId)).append("\n");
    sb.append("    amexNetworkTokensRequestorId: ").append(toIndentedString(amexNetworkTokensRequestorId)).append("\n");
    sb.append("    amexNetworkTokensAppId: ").append(toIndentedString(amexNetworkTokensAppId)).append("\n");
    sb.append("    mastercardNetworkTokensRequestorId: ").append(toIndentedString(mastercardNetworkTokensRequestorId)).append("\n");
    sb.append("    mastercardNetworkTokensAppId: ").append(toIndentedString(mastercardNetworkTokensAppId)).append("\n");
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

