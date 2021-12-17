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
 * ThreeDSecureDataV1AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-17T10:55:07.385073Z[Etc/UTC]")
public class ThreeDSecureDataV1AllOf {
  public static final String SERIALIZED_NAME_AUTHENTICATION_RESPONSE = "authentication_response";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESPONSE)
  private String authenticationResponse;

  public static final String SERIALIZED_NAME_CAVV_ALGORITHM = "cavv_algorithm";
  @SerializedName(SERIALIZED_NAME_CAVV_ALGORITHM)
  private String cavvAlgorithm;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;


  public ThreeDSecureDataV1AllOf authenticationResponse(String authenticationResponse) {
    
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


  public ThreeDSecureDataV1AllOf cavvAlgorithm(String cavvAlgorithm) {
    
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


  public ThreeDSecureDataV1AllOf xid(String xid) {
    
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
    ThreeDSecureDataV1AllOf threeDSecureDataV1AllOf = (ThreeDSecureDataV1AllOf) o;
    return Objects.equals(this.authenticationResponse, threeDSecureDataV1AllOf.authenticationResponse) &&
        Objects.equals(this.cavvAlgorithm, threeDSecureDataV1AllOf.cavvAlgorithm) &&
        Objects.equals(this.xid, threeDSecureDataV1AllOf.xid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationResponse, cavvAlgorithm, xid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureDataV1AllOf {\n");
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

