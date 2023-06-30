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
import com.gr4vy.api.model.ThreeDSecureData;
import com.gr4vy.api.model.ThreeDSecureDataV1AllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ThreeDSecureDataV1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class ThreeDSecureDataV1 {
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

  public static final String SERIALIZED_NAME_AUTHENTICATION_RESPONSE = "authentication_response";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESPONSE)
  private String authenticationResponse;

  public static final String SERIALIZED_NAME_CAVV_ALGORITHM = "cavv_algorithm";
  @SerializedName(SERIALIZED_NAME_CAVV_ALGORITHM)
  private String cavvAlgorithm;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;


  public ThreeDSecureDataV1 cavv(String cavv) {
    
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


  public ThreeDSecureDataV1 eci(String eci) {
    
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


  public ThreeDSecureDataV1 version(String version) {
    
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


  public ThreeDSecureDataV1 directoryResponse(String directoryResponse) {
    
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


  public ThreeDSecureDataV1 authenticationResponse(String authenticationResponse) {
    
    this.authenticationResponse = authenticationResponse;
    return this;
  }

   /**
   * The authentication response.
   * @return authenticationResponse
  **/
  @ApiModelProperty(example = "Y", required = true, value = "The authentication response.")

  public String getAuthenticationResponse() {
    return authenticationResponse;
  }


  public void setAuthenticationResponse(String authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }


  public ThreeDSecureDataV1 cavvAlgorithm(String cavvAlgorithm) {
    
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * The CAVV Algorithm used.
   * @return cavvAlgorithm
  **/
  @ApiModelProperty(required = true, value = "The CAVV Algorithm used.")

  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }


  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }


  public ThreeDSecureDataV1 xid(String xid) {
    
    this.xid = xid;
    return this;
  }

   /**
   * The transaction identifier.
   * @return xid
  **/
  @ApiModelProperty(required = true, value = "The transaction identifier.")

  public String getXid() {
    return xid;
  }


  public void setXid(String xid) {
    this.xid = xid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureDataV1 threeDSecureDataV1 = (ThreeDSecureDataV1) o;
    return Objects.equals(this.cavv, threeDSecureDataV1.cavv) &&
        Objects.equals(this.eci, threeDSecureDataV1.eci) &&
        Objects.equals(this.version, threeDSecureDataV1.version) &&
        Objects.equals(this.directoryResponse, threeDSecureDataV1.directoryResponse) &&
        Objects.equals(this.authenticationResponse, threeDSecureDataV1.authenticationResponse) &&
        Objects.equals(this.cavvAlgorithm, threeDSecureDataV1.cavvAlgorithm) &&
        Objects.equals(this.xid, threeDSecureDataV1.xid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cavv, eci, version, directoryResponse, authenticationResponse, cavvAlgorithm, xid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureDataV1 {\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    directoryResponse: ").append(toIndentedString(directoryResponse)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
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

