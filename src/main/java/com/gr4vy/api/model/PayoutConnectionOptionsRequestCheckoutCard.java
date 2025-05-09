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
 * Custom options for checkout-card payment service.
 */
@ApiModel(description = "Custom options for checkout-card payment service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayoutConnectionOptionsRequestCheckoutCard {
  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_PROCESSING_CHANNEL_ID = "processing_channel_id";
  @SerializedName(SERIALIZED_NAME_PROCESSING_CHANNEL_ID)
  private String processingChannelId;


  public PayoutConnectionOptionsRequestCheckoutCard sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The ID of the currency account that will fund the payout.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the currency account that will fund the payout.")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public PayoutConnectionOptionsRequestCheckoutCard processingChannelId(String processingChannelId) {
    
    this.processingChannelId = processingChannelId;
    return this;
  }

   /**
   * The processing channel to be used for the payment.
   * @return processingChannelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processing channel to be used for the payment.")

  public String getProcessingChannelId() {
    return processingChannelId;
  }


  public void setProcessingChannelId(String processingChannelId) {
    this.processingChannelId = processingChannelId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutConnectionOptionsRequestCheckoutCard payoutConnectionOptionsRequestCheckoutCard = (PayoutConnectionOptionsRequestCheckoutCard) o;
    return Objects.equals(this.sourceId, payoutConnectionOptionsRequestCheckoutCard.sourceId) &&
        Objects.equals(this.processingChannelId, payoutConnectionOptionsRequestCheckoutCard.processingChannelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, processingChannelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutConnectionOptionsRequestCheckoutCard {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    processingChannelId: ").append(toIndentedString(processingChannelId)).append("\n");
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

