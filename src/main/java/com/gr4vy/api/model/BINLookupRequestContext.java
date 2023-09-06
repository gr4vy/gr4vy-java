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
 * BIN lookup request context.
 */
@ApiModel(description = "BIN lookup request context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T16:38:13.632050Z[Etc/UTC]")
public class BINLookupRequestContext {
  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "response_status_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
  private Integer responseStatusCode;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;


  public BINLookupRequestContext response(String response) {
    
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


  public BINLookupRequestContext responseStatusCode(Integer responseStatusCode) {
    
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


  public BINLookupRequestContext success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Whether the BIN lookup was successful or not.
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the BIN lookup was successful or not.")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public BINLookupRequestContext bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * The value used to lookup BIN details.
   * @return bin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value used to lookup BIN details.")

  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {
    this.bin = bin;
  }


  public BINLookupRequestContext type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of card, i.e. credit or debit, from the lookup response.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of card, i.e. credit or debit, from the lookup response.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public BINLookupRequestContext scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * The card scheme result from the lookup response.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The card scheme result from the lookup response.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public BINLookupRequestContext countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The card country code result from the lookup response.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The card country code result from the lookup response.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BINLookupRequestContext biNLookupRequestContext = (BINLookupRequestContext) o;
    return Objects.equals(this.response, biNLookupRequestContext.response) &&
        Objects.equals(this.responseStatusCode, biNLookupRequestContext.responseStatusCode) &&
        Objects.equals(this.success, biNLookupRequestContext.success) &&
        Objects.equals(this.bin, biNLookupRequestContext.bin) &&
        Objects.equals(this.type, biNLookupRequestContext.type) &&
        Objects.equals(this.scheme, biNLookupRequestContext.scheme) &&
        Objects.equals(this.countryCode, biNLookupRequestContext.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, responseStatusCode, success, bin, type, scheme, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BINLookupRequestContext {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

