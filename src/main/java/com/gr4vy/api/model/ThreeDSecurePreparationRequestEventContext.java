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
 * 3DS pre-authentication context.
 */
@ApiModel(description = "3DS pre-authentication context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:11:33.631354Z[Etc/UTC]")
public class ThreeDSecurePreparationRequestEventContext {
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
  private Integer responseStatusCode;

  public static final String SERIALIZED_NAME_IS_ENROLLED = "is_enrolled";
  @SerializedName(SERIALIZED_NAME_IS_ENROLLED)
  private Boolean isEnrolled;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public ThreeDSecurePreparationRequestEventContext url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL that was called for this request.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://3dserver.example/auth", value = "The URL that was called for this request.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ThreeDSecurePreparationRequestEventContext request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * The request body sent to the &#x60;url&#x60;.
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "The request body sent to the `url`.")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public ThreeDSecurePreparationRequestEventContext response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * The response body received from the &#x60;url&#x60;.
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "The response body received from the `url`.")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }


  public ThreeDSecurePreparationRequestEventContext responseStatusCode(Integer responseStatusCode) {
    
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * The response status code received from the &#x60;url&#x60;.
   * @return responseStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The response status code received from the `url`.")

  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }


  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public ThreeDSecurePreparationRequestEventContext isEnrolled(Boolean isEnrolled) {
    
    this.isEnrolled = isEnrolled;
    return this;
  }

   /**
   * If the card is enrolled for 3DS.
   * @return isEnrolled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the card is enrolled for 3DS.")

  public Boolean getIsEnrolled() {
    return isEnrolled;
  }


  public void setIsEnrolled(Boolean isEnrolled) {
    this.isEnrolled = isEnrolled;
  }


  public ThreeDSecurePreparationRequestEventContext version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of 3DS extracted from the &#x60;response.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.2.0", value = "The version of 3DS extracted from the `response.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecurePreparationRequestEventContext threeDSecurePreparationRequestEventContext = (ThreeDSecurePreparationRequestEventContext) o;
    return Objects.equals(this.url, threeDSecurePreparationRequestEventContext.url) &&
        Objects.equals(this.request, threeDSecurePreparationRequestEventContext.request) &&
        Objects.equals(this.response, threeDSecurePreparationRequestEventContext.response) &&
        Objects.equals(this.responseStatusCode, threeDSecurePreparationRequestEventContext.responseStatusCode) &&
        Objects.equals(this.isEnrolled, threeDSecurePreparationRequestEventContext.isEnrolled) &&
        Objects.equals(this.version, threeDSecurePreparationRequestEventContext.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, request, response, responseStatusCode, isEnrolled, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecurePreparationRequestEventContext {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    isEnrolled: ").append(toIndentedString(isEnrolled)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

