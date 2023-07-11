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
import org.threeten.bp.OffsetDateTime;

/**
 * MerchantAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class MerchantAccount {
  /**
   * &#x60;merchant-account&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MERCHANT_ACCOUNT("merchant-account");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public MerchantAccount type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;merchant-account&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "merchant-account", value = "`merchant-account`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public MerchantAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID for this merchant account.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "plantly-uk", value = "The ID for this merchant account.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public MerchantAccount displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of this merchant account.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Plantly UK", value = "The display name of this merchant account.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public MerchantAccount outboundWebhookUrl(String outboundWebhookUrl) {
    
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


  public MerchantAccount outboundWebhookUsername(String outboundWebhookUsername) {
    
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


  public MerchantAccount visaNetworkTokensRequestorId(String visaNetworkTokensRequestorId) {
    
    this.visaNetworkTokensRequestorId = visaNetworkTokensRequestorId;
    return this;
  }

   /**
   * Requestor ID provided for Visa after onboarding to use Network Tokens.
   * @return visaNetworkTokensRequestorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Requestor ID provided for Visa after onboarding to use Network Tokens.")

  public String getVisaNetworkTokensRequestorId() {
    return visaNetworkTokensRequestorId;
  }


  public void setVisaNetworkTokensRequestorId(String visaNetworkTokensRequestorId) {
    this.visaNetworkTokensRequestorId = visaNetworkTokensRequestorId;
  }


  public MerchantAccount visaNetworkTokensAppId(String visaNetworkTokensAppId) {
    
    this.visaNetworkTokensAppId = visaNetworkTokensAppId;
    return this;
  }

   /**
   * Application ID provided for Visa after onboarding to use Network Tokens.
   * @return visaNetworkTokensAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Application ID provided for Visa after onboarding to use Network Tokens.")

  public String getVisaNetworkTokensAppId() {
    return visaNetworkTokensAppId;
  }


  public void setVisaNetworkTokensAppId(String visaNetworkTokensAppId) {
    this.visaNetworkTokensAppId = visaNetworkTokensAppId;
  }


  public MerchantAccount amexNetworkTokensRequestorId(String amexNetworkTokensRequestorId) {
    
    this.amexNetworkTokensRequestorId = amexNetworkTokensRequestorId;
    return this;
  }

   /**
   * Requestor ID provided for Amex after onboarding to use Network Tokens.
   * @return amexNetworkTokensRequestorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Requestor ID provided for Amex after onboarding to use Network Tokens.")

  public String getAmexNetworkTokensRequestorId() {
    return amexNetworkTokensRequestorId;
  }


  public void setAmexNetworkTokensRequestorId(String amexNetworkTokensRequestorId) {
    this.amexNetworkTokensRequestorId = amexNetworkTokensRequestorId;
  }


  public MerchantAccount amexNetworkTokensAppId(String amexNetworkTokensAppId) {
    
    this.amexNetworkTokensAppId = amexNetworkTokensAppId;
    return this;
  }

   /**
   * Application ID provided for Amex after onboarding to use Network Tokens.
   * @return amexNetworkTokensAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Application ID provided for Amex after onboarding to use Network Tokens.")

  public String getAmexNetworkTokensAppId() {
    return amexNetworkTokensAppId;
  }


  public void setAmexNetworkTokensAppId(String amexNetworkTokensAppId) {
    this.amexNetworkTokensAppId = amexNetworkTokensAppId;
  }


  public MerchantAccount mastercardNetworkTokensRequestorId(String mastercardNetworkTokensRequestorId) {
    
    this.mastercardNetworkTokensRequestorId = mastercardNetworkTokensRequestorId;
    return this;
  }

   /**
   * Requestor ID provided for Mastercard after onboarding to use Network Tokens.
   * @return mastercardNetworkTokensRequestorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Requestor ID provided for Mastercard after onboarding to use Network Tokens.")

  public String getMastercardNetworkTokensRequestorId() {
    return mastercardNetworkTokensRequestorId;
  }


  public void setMastercardNetworkTokensRequestorId(String mastercardNetworkTokensRequestorId) {
    this.mastercardNetworkTokensRequestorId = mastercardNetworkTokensRequestorId;
  }


  public MerchantAccount mastercardNetworkTokensAppId(String mastercardNetworkTokensAppId) {
    
    this.mastercardNetworkTokensAppId = mastercardNetworkTokensAppId;
    return this;
  }

   /**
   * Application ID provided for Mastercard after onboarding to use Network Tokens.
   * @return mastercardNetworkTokensAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e50fa0da-903d-4d54-aacc-4cac57d48df2", value = "Application ID provided for Mastercard after onboarding to use Network Tokens.")

  public String getMastercardNetworkTokensAppId() {
    return mastercardNetworkTokensAppId;
  }


  public void setMastercardNetworkTokensAppId(String mastercardNetworkTokensAppId) {
    this.mastercardNetworkTokensAppId = mastercardNetworkTokensAppId;
  }


  public MerchantAccount createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this merchant account was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-01T14:20Z", value = "The date and time when this merchant account was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public MerchantAccount updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when this merchant account was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-01T14:20Z", value = "The date and time when this merchant account was updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantAccount merchantAccount = (MerchantAccount) o;
    return Objects.equals(this.type, merchantAccount.type) &&
        Objects.equals(this.id, merchantAccount.id) &&
        Objects.equals(this.displayName, merchantAccount.displayName) &&
        Objects.equals(this.outboundWebhookUrl, merchantAccount.outboundWebhookUrl) &&
        Objects.equals(this.outboundWebhookUsername, merchantAccount.outboundWebhookUsername) &&
        Objects.equals(this.visaNetworkTokensRequestorId, merchantAccount.visaNetworkTokensRequestorId) &&
        Objects.equals(this.visaNetworkTokensAppId, merchantAccount.visaNetworkTokensAppId) &&
        Objects.equals(this.amexNetworkTokensRequestorId, merchantAccount.amexNetworkTokensRequestorId) &&
        Objects.equals(this.amexNetworkTokensAppId, merchantAccount.amexNetworkTokensAppId) &&
        Objects.equals(this.mastercardNetworkTokensRequestorId, merchantAccount.mastercardNetworkTokensRequestorId) &&
        Objects.equals(this.mastercardNetworkTokensAppId, merchantAccount.mastercardNetworkTokensAppId) &&
        Objects.equals(this.createdAt, merchantAccount.createdAt) &&
        Objects.equals(this.updatedAt, merchantAccount.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, displayName, outboundWebhookUrl, outboundWebhookUsername, visaNetworkTokensRequestorId, visaNetworkTokensAppId, amexNetworkTokensRequestorId, amexNetworkTokensAppId, mastercardNetworkTokensRequestorId, mastercardNetworkTokensAppId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantAccount {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    outboundWebhookUrl: ").append(toIndentedString(outboundWebhookUrl)).append("\n");
    sb.append("    outboundWebhookUsername: ").append(toIndentedString(outboundWebhookUsername)).append("\n");
    sb.append("    visaNetworkTokensRequestorId: ").append(toIndentedString(visaNetworkTokensRequestorId)).append("\n");
    sb.append("    visaNetworkTokensAppId: ").append(toIndentedString(visaNetworkTokensAppId)).append("\n");
    sb.append("    amexNetworkTokensRequestorId: ").append(toIndentedString(amexNetworkTokensRequestorId)).append("\n");
    sb.append("    amexNetworkTokensAppId: ").append(toIndentedString(amexNetworkTokensAppId)).append("\n");
    sb.append("    mastercardNetworkTokensRequestorId: ").append(toIndentedString(mastercardNetworkTokensRequestorId)).append("\n");
    sb.append("    mastercardNetworkTokensAppId: ").append(toIndentedString(mastercardNetworkTokensAppId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

