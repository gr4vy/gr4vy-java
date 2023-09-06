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
 * 3DS authentication context.
 */
@ApiModel(description = "3DS authentication context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:11:33.631354Z[Etc/UTC]")
public class ThreeDSecureAuthenticationRequestEventContext {
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

  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  public static final String SERIALIZED_NAME_DIRECTORY_RESPONSE = "directory_response";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_RESPONSE)
  private String directoryResponse;

  public static final String SERIALIZED_NAME_DIRECTORY_TRANSACTION_ID = "directory_transaction_id";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_TRANSACTION_ID)
  private String directoryTransactionId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public ThreeDSecureAuthenticationRequestEventContext url(String url) {
    
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


  public ThreeDSecureAuthenticationRequestEventContext request(String request) {
    
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


  public ThreeDSecureAuthenticationRequestEventContext response(String response) {
    
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


  public ThreeDSecureAuthenticationRequestEventContext responseStatusCode(Integer responseStatusCode) {
    
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


  public ThreeDSecureAuthenticationRequestEventContext cavv(String cavv) {
    
    this.cavv = cavv;
    return this;
  }

   /**
   * The 3DS CAVV value parsed from the &#x60;response&#x60;.
   * @return cavv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+9YDsoSIbiEgO+PFMdgGSF17Uqk=", value = "The 3DS CAVV value parsed from the `response`.")

  public String getCavv() {
    return cavv;
  }


  public void setCavv(String cavv) {
    this.cavv = cavv;
  }


  public ThreeDSecureAuthenticationRequestEventContext eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * The 3DS ECI value parsed from the &#x60;response&#x60;.
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05", value = "The 3DS ECI value parsed from the `response`.")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public ThreeDSecureAuthenticationRequestEventContext directoryResponse(String directoryResponse) {
    
    this.directoryResponse = directoryResponse;
    return this;
  }

   /**
   * The &#x60;transStatus&#x60; parsed from the &#x60;response&#x60;.
   * @return directoryResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C", value = "The `transStatus` parsed from the `response`.")

  public String getDirectoryResponse() {
    return directoryResponse;
  }


  public void setDirectoryResponse(String directoryResponse) {
    this.directoryResponse = directoryResponse;
  }


  public ThreeDSecureAuthenticationRequestEventContext directoryTransactionId(String directoryTransactionId) {
    
    this.directoryTransactionId = directoryTransactionId;
    return this;
  }

   /**
   * The &#x60;dsTransID&#x60; parsed from the &#x60;response&#x60;.
   * @return directoryTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8875884a-ac2f-42cb-b3f0-09b3ea3c0042", value = "The `dsTransID` parsed from the `response`.")

  public String getDirectoryTransactionId() {
    return directoryTransactionId;
  }


  public void setDirectoryTransactionId(String directoryTransactionId) {
    this.directoryTransactionId = directoryTransactionId;
  }


  public ThreeDSecureAuthenticationRequestEventContext version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of 3DS used.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.2.0", value = "The version of 3DS used.")

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
    ThreeDSecureAuthenticationRequestEventContext threeDSecureAuthenticationRequestEventContext = (ThreeDSecureAuthenticationRequestEventContext) o;
    return Objects.equals(this.url, threeDSecureAuthenticationRequestEventContext.url) &&
        Objects.equals(this.request, threeDSecureAuthenticationRequestEventContext.request) &&
        Objects.equals(this.response, threeDSecureAuthenticationRequestEventContext.response) &&
        Objects.equals(this.responseStatusCode, threeDSecureAuthenticationRequestEventContext.responseStatusCode) &&
        Objects.equals(this.cavv, threeDSecureAuthenticationRequestEventContext.cavv) &&
        Objects.equals(this.eci, threeDSecureAuthenticationRequestEventContext.eci) &&
        Objects.equals(this.directoryResponse, threeDSecureAuthenticationRequestEventContext.directoryResponse) &&
        Objects.equals(this.directoryTransactionId, threeDSecureAuthenticationRequestEventContext.directoryTransactionId) &&
        Objects.equals(this.version, threeDSecureAuthenticationRequestEventContext.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, request, response, responseStatusCode, cavv, eci, directoryResponse, directoryTransactionId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureAuthenticationRequestEventContext {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    directoryResponse: ").append(toIndentedString(directoryResponse)).append("\n");
    sb.append("    directoryTransactionId: ").append(toIndentedString(directoryTransactionId)).append("\n");
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

