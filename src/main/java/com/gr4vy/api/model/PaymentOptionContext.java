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
import com.gr4vy.api.model.PaymentOptionApprovalUI;
import com.gr4vy.api.model.RequiredFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional context specific to the payment option. This is currently only returned for Apple Pay and Google Pay.
 */
@ApiModel(description = "Additional context specific to the payment option. This is currently only returned for Apple Pay and Google Pay.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class PaymentOptionContext {
  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_GATEWAY_MERCHANT_ID = "gateway_merchant_id";
  @SerializedName(SERIALIZED_NAME_GATEWAY_MERCHANT_ID)
  private String gatewayMerchantId;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_SUPPORTED_SCHEMES = "supported_schemes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_SCHEMES)
  private List<String> supportedSchemes = null;

  public static final String SERIALIZED_NAME_APPROVAL_UI = "approval_ui";
  @SerializedName(SERIALIZED_NAME_APPROVAL_UI)
  private PaymentOptionApprovalUI approvalUi;

  public static final String SERIALIZED_NAME_REQUIRED_FIELDS = "required_fields";
  @SerializedName(SERIALIZED_NAME_REQUIRED_FIELDS)
  private RequiredFields requiredFields;


  public PaymentOptionContext gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Gateway used for Google Pay payments.
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gateway used for Google Pay payments.")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public PaymentOptionContext gatewayMerchantId(String gatewayMerchantId) {
    
    this.gatewayMerchantId = gatewayMerchantId;
    return this;
  }

   /**
   * Gateway merchant identifier used for Google Pay payments.
   * @return gatewayMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gateway merchant identifier used for Google Pay payments.")

  public String getGatewayMerchantId() {
    return gatewayMerchantId;
  }


  public void setGatewayMerchantId(String gatewayMerchantId) {
    this.gatewayMerchantId = gatewayMerchantId;
  }


  public PaymentOptionContext merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Display name of the merchant as registered with the digital wallet provider.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display name of the merchant as registered with the digital wallet provider.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public PaymentOptionContext supportedSchemes(List<String> supportedSchemes) {
    
    this.supportedSchemes = supportedSchemes;
    return this;
  }

  public PaymentOptionContext addSupportedSchemesItem(String supportedSchemesItem) {
    if (this.supportedSchemes == null) {
      this.supportedSchemes = new ArrayList<String>();
    }
    this.supportedSchemes.add(supportedSchemesItem);
    return this;
  }

   /**
   * Card schemes supported by the digital wallet provider.
   * @return supportedSchemes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card schemes supported by the digital wallet provider.")

  public List<String> getSupportedSchemes() {
    return supportedSchemes;
  }


  public void setSupportedSchemes(List<String> supportedSchemes) {
    this.supportedSchemes = supportedSchemes;
  }


  public PaymentOptionContext approvalUi(PaymentOptionApprovalUI approvalUi) {
    
    this.approvalUi = approvalUi;
    return this;
  }

   /**
   * Get approvalUi
   * @return approvalUi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentOptionApprovalUI getApprovalUi() {
    return approvalUi;
  }


  public void setApprovalUi(PaymentOptionApprovalUI approvalUi) {
    this.approvalUi = approvalUi;
  }


  public PaymentOptionContext requiredFields(RequiredFields requiredFields) {
    
    this.requiredFields = requiredFields;
    return this;
  }

   /**
   * Get requiredFields
   * @return requiredFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequiredFields getRequiredFields() {
    return requiredFields;
  }


  public void setRequiredFields(RequiredFields requiredFields) {
    this.requiredFields = requiredFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOptionContext paymentOptionContext = (PaymentOptionContext) o;
    return Objects.equals(this.gateway, paymentOptionContext.gateway) &&
        Objects.equals(this.gatewayMerchantId, paymentOptionContext.gatewayMerchantId) &&
        Objects.equals(this.merchantName, paymentOptionContext.merchantName) &&
        Objects.equals(this.supportedSchemes, paymentOptionContext.supportedSchemes) &&
        Objects.equals(this.approvalUi, paymentOptionContext.approvalUi) &&
        Objects.equals(this.requiredFields, paymentOptionContext.requiredFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gateway, gatewayMerchantId, merchantName, supportedSchemes, approvalUi, requiredFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOptionContext {\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    gatewayMerchantId: ").append(toIndentedString(gatewayMerchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    supportedSchemes: ").append(toIndentedString(supportedSchemes)).append("\n");
    sb.append("    approvalUi: ").append(toIndentedString(approvalUi)).append("\n");
    sb.append("    requiredFields: ").append(toIndentedString(requiredFields)).append("\n");
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

