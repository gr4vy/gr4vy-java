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
 * Initiates a new session with Apple Pay.
 */
@ApiModel(description = "Initiates a new session with Apple Pay.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-29T11:53:32.457004Z[Etc/UTC]")
public class ApplePaySessionRequest {
  public static final String SERIALIZED_NAME_VALIDATION_URL = "validation_url";
  @SerializedName(SERIALIZED_NAME_VALIDATION_URL)
  private String validationUrl;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domain_name";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;


  public ApplePaySessionRequest validationUrl(String validationUrl) {
    
    this.validationUrl = validationUrl;
    return this;
  }

   /**
   * Validation URL obtained from the event passed to a &#x60;onvalidatemerchant&#x60; callback.
   * @return validationUrl
  **/
  @ApiModelProperty(required = true, value = "Validation URL obtained from the event passed to a `onvalidatemerchant` callback.")

  public String getValidationUrl() {
    return validationUrl;
  }


  public void setValidationUrl(String validationUrl) {
    this.validationUrl = validationUrl;
  }


  public ApplePaySessionRequest domainName(String domainName) {
    
    this.domainName = domainName;
    return this;
  }

   /**
   * Fully qualified domain name of the merchant.
   * @return domainName
  **/
  @ApiModelProperty(required = true, value = "Fully qualified domain name of the merchant.")

  public String getDomainName() {
    return domainName;
  }


  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePaySessionRequest applePaySessionRequest = (ApplePaySessionRequest) o;
    return Objects.equals(this.validationUrl, applePaySessionRequest.validationUrl) &&
        Objects.equals(this.domainName, applePaySessionRequest.domainName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationUrl, domainName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePaySessionRequest {\n");
    sb.append("    validationUrl: ").append(toIndentedString(validationUrl)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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

