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
 * Initiates a new session with Google Pay.
 */
@ApiModel(description = "Initiates a new session with Google Pay.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:46:45.100086Z[Etc/UTC]")
public class GooglePaySessionRequest {
  public static final String SERIALIZED_NAME_ORIGIN_DOMAIN = "origin_domain";
  @SerializedName(SERIALIZED_NAME_ORIGIN_DOMAIN)
  private String originDomain;


  public GooglePaySessionRequest originDomain(String originDomain) {
    
    this.originDomain = originDomain;
    return this;
  }

   /**
   * Fully qualified domain name of the merchant.
   * @return originDomain
  **/
  @ApiModelProperty(required = true, value = "Fully qualified domain name of the merchant.")

  public String getOriginDomain() {
    return originDomain;
  }


  public void setOriginDomain(String originDomain) {
    this.originDomain = originDomain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePaySessionRequest googlePaySessionRequest = (GooglePaySessionRequest) o;
    return Objects.equals(this.originDomain, googlePaySessionRequest.originDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePaySessionRequest {\n");
    sb.append("    originDomain: ").append(toIndentedString(originDomain)).append("\n");
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

