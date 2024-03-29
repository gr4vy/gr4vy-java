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
import java.util.UUID;

/**
 * Additional context for this event.
 */
@ApiModel(description = "Additional context for this event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GiftCardRedemptionSucceededContext {
  public static final String SERIALIZED_NAME_GIFT_CARD_SERVICE_ID = "gift_card_service_id";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_SERVICE_ID)
  private UUID giftCardServiceId;

  public static final String SERIALIZED_NAME_GIFT_CARD_SERVICE_NAME = "gift_card_service_name";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_SERVICE_NAME)
  private String giftCardServiceName;

  public static final String SERIALIZED_NAME_GIFT_CARD_SERVICE_DEFINITION_ID = "gift_card_service_definition_id";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_SERVICE_DEFINITION_ID)
  private String giftCardServiceDefinitionId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "response_status_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
  private BigDecimal responseStatusCode;


  public GiftCardRedemptionSucceededContext giftCardServiceId(UUID giftCardServiceId) {
    
    this.giftCardServiceId = giftCardServiceId;
    return this;
  }

   /**
   * The unique ID of the Gift Card service used.
   * @return giftCardServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the Gift Card service used.")

  public UUID getGiftCardServiceId() {
    return giftCardServiceId;
  }


  public void setGiftCardServiceId(UUID giftCardServiceId) {
    this.giftCardServiceId = giftCardServiceId;
  }


  public GiftCardRedemptionSucceededContext giftCardServiceName(String giftCardServiceName) {
    
    this.giftCardServiceName = giftCardServiceName;
    return this;
  }

   /**
   * The name of the Gift Card service used.
   * @return giftCardServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Gift Card service used.")

  public String getGiftCardServiceName() {
    return giftCardServiceName;
  }


  public void setGiftCardServiceName(String giftCardServiceName) {
    this.giftCardServiceName = giftCardServiceName;
  }


  public GiftCardRedemptionSucceededContext giftCardServiceDefinitionId(String giftCardServiceDefinitionId) {
    
    this.giftCardServiceDefinitionId = giftCardServiceDefinitionId;
    return this;
  }

   /**
   * The Gift Card service definition used.
   * @return giftCardServiceDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Gift Card service definition used.")

  public String getGiftCardServiceDefinitionId() {
    return giftCardServiceDefinitionId;
  }


  public void setGiftCardServiceDefinitionId(String giftCardServiceDefinitionId) {
    this.giftCardServiceDefinitionId = giftCardServiceDefinitionId;
  }


  public GiftCardRedemptionSucceededContext url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The endpoint for the request.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The endpoint for the request.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public GiftCardRedemptionSucceededContext request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * The HTTP body sent to the Gift Card provider.
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP body sent to the Gift Card provider.")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public GiftCardRedemptionSucceededContext response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * The HTTP body received from the Gift Card provider.
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP body received from the Gift Card provider.")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }


  public GiftCardRedemptionSucceededContext responseStatusCode(BigDecimal responseStatusCode) {
    
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * The HTTP response status code from the Gift Card provider.
   * @return responseStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP response status code from the Gift Card provider.")

  public BigDecimal getResponseStatusCode() {
    return responseStatusCode;
  }


  public void setResponseStatusCode(BigDecimal responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftCardRedemptionSucceededContext giftCardRedemptionSucceededContext = (GiftCardRedemptionSucceededContext) o;
    return Objects.equals(this.giftCardServiceId, giftCardRedemptionSucceededContext.giftCardServiceId) &&
        Objects.equals(this.giftCardServiceName, giftCardRedemptionSucceededContext.giftCardServiceName) &&
        Objects.equals(this.giftCardServiceDefinitionId, giftCardRedemptionSucceededContext.giftCardServiceDefinitionId) &&
        Objects.equals(this.url, giftCardRedemptionSucceededContext.url) &&
        Objects.equals(this.request, giftCardRedemptionSucceededContext.request) &&
        Objects.equals(this.response, giftCardRedemptionSucceededContext.response) &&
        Objects.equals(this.responseStatusCode, giftCardRedemptionSucceededContext.responseStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCardServiceId, giftCardServiceName, giftCardServiceDefinitionId, url, request, response, responseStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftCardRedemptionSucceededContext {\n");
    sb.append("    giftCardServiceId: ").append(toIndentedString(giftCardServiceId)).append("\n");
    sb.append("    giftCardServiceName: ").append(toIndentedString(giftCardServiceName)).append("\n");
    sb.append("    giftCardServiceDefinitionId: ").append(toIndentedString(giftCardServiceDefinitionId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
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

