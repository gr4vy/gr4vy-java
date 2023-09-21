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
 * ThreeDSecureData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ThreeDSecureData {
  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_DIRECTORY_RESPONSE = "directory_response";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_RESPONSE)
  private String directoryResponse;


  public ThreeDSecureData cavv(String cavv) {
    
    this.cavv = cavv;
    return this;
  }

   /**
   * The cardholder authentication value or AAV.
   * @return cavv
  **/
  @ApiModelProperty(example = "3q2+78r+ur7erb7vyv66vv8=", required = true, value = "The cardholder authentication value or AAV.")

  public String getCavv() {
    return cavv;
  }


  public void setCavv(String cavv) {
    this.cavv = cavv;
  }


  public ThreeDSecureData eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * The electronic commerce indicator for the 3DS transaction.
   * @return eci
  **/
  @ApiModelProperty(example = "05", required = true, value = "The electronic commerce indicator for the 3DS transaction.")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public ThreeDSecureData version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of 3-D Secure that was used.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of 3-D Secure that was used.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ThreeDSecureData directoryResponse(String directoryResponse) {
    
    this.directoryResponse = directoryResponse;
    return this;
  }

   /**
   * For 3-D Secure version 1, the enrolment response. For 3-D Secure version , the transaction status from the &#x60;ARes&#x60;.
   * @return directoryResponse
  **/
  @ApiModelProperty(example = "C", required = true, value = "For 3-D Secure version 1, the enrolment response. For 3-D Secure version , the transaction status from the `ARes`.")

  public String getDirectoryResponse() {
    return directoryResponse;
  }


  public void setDirectoryResponse(String directoryResponse) {
    this.directoryResponse = directoryResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureData threeDSecureData = (ThreeDSecureData) o;
    return Objects.equals(this.cavv, threeDSecureData.cavv) &&
        Objects.equals(this.eci, threeDSecureData.eci) &&
        Objects.equals(this.version, threeDSecureData.version) &&
        Objects.equals(this.directoryResponse, threeDSecureData.directoryResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cavv, eci, version, directoryResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureData {\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    directoryResponse: ").append(toIndentedString(directoryResponse)).append("\n");
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

