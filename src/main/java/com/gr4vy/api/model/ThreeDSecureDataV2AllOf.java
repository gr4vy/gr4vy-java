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
 * ThreeDSecureDataV2AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T12:22:53.235500Z[Etc/UTC]")
public class ThreeDSecureDataV2AllOf {
  public static final String SERIALIZED_NAME_AUTHENTICATION_RESPONSE = "authentication_response";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESPONSE)
  private String authenticationResponse;

  public static final String SERIALIZED_NAME_DIRECTORY_TRANSACTION_ID = "directory_transaction_id";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_TRANSACTION_ID)
  private String directoryTransactionId;


  public ThreeDSecureDataV2AllOf authenticationResponse(String authenticationResponse) {
    
    this.authenticationResponse = authenticationResponse;
    return this;
  }

   /**
   * The transaction status from the challenge result (not required for frictionless).
   * @return authenticationResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "The transaction status from the challenge result (not required for frictionless).")

  public String getAuthenticationResponse() {
    return authenticationResponse;
  }


  public void setAuthenticationResponse(String authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }


  public ThreeDSecureDataV2AllOf directoryTransactionId(String directoryTransactionId) {
    
    this.directoryTransactionId = directoryTransactionId;
    return this;
  }

   /**
   * The transaction identifier.
   * @return directoryTransactionId
  **/
  @ApiModelProperty(example = "c4e59ceb-a382-4d6a-bc87-385d591fa09d", required = true, value = "The transaction identifier.")

  public String getDirectoryTransactionId() {
    return directoryTransactionId;
  }


  public void setDirectoryTransactionId(String directoryTransactionId) {
    this.directoryTransactionId = directoryTransactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureDataV2AllOf threeDSecureDataV2AllOf = (ThreeDSecureDataV2AllOf) o;
    return Objects.equals(this.authenticationResponse, threeDSecureDataV2AllOf.authenticationResponse) &&
        Objects.equals(this.directoryTransactionId, threeDSecureDataV2AllOf.directoryTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationResponse, directoryTransactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureDataV2AllOf {\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    directoryTransactionId: ").append(toIndentedString(directoryTransactionId)).append("\n");
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

