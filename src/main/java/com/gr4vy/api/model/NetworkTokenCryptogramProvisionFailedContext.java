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
 * Additional context for this event.
 */
@ApiModel(description = "Additional context for this event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkTokenCryptogramProvisionFailedContext {
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

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public NetworkTokenCryptogramProvisionFailedContext url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The endpoint for the request, if performed.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The endpoint for the request, if performed.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public NetworkTokenCryptogramProvisionFailedContext request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * The HTTP body sent to the Network Token provider, if performed.
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP body sent to the Network Token provider, if performed.")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public NetworkTokenCryptogramProvisionFailedContext response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * The HTTP body received from the Network Token provider, if any.
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP body received from the Network Token provider, if any.")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }


  public NetworkTokenCryptogramProvisionFailedContext responseStatusCode(BigDecimal responseStatusCode) {
    
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * The HTTP response status code from the Network Token provider, if any.
   * @return responseStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP response status code from the Network Token provider, if any.")

  public BigDecimal getResponseStatusCode() {
    return responseStatusCode;
  }


  public void setResponseStatusCode(BigDecimal responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public NetworkTokenCryptogramProvisionFailedContext reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason we could not provision the cryptogram.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Network Error", value = "The reason we could not provision the cryptogram.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkTokenCryptogramProvisionFailedContext networkTokenCryptogramProvisionFailedContext = (NetworkTokenCryptogramProvisionFailedContext) o;
    return Objects.equals(this.url, networkTokenCryptogramProvisionFailedContext.url) &&
        Objects.equals(this.request, networkTokenCryptogramProvisionFailedContext.request) &&
        Objects.equals(this.response, networkTokenCryptogramProvisionFailedContext.response) &&
        Objects.equals(this.responseStatusCode, networkTokenCryptogramProvisionFailedContext.responseStatusCode) &&
        Objects.equals(this.reason, networkTokenCryptogramProvisionFailedContext.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, request, response, responseStatusCode, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkTokenCryptogramProvisionFailedContext {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

