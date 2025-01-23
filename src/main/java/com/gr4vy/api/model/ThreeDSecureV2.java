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
 * ThreeDSecureV2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ThreeDSecureV2 {
  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  /**
   * The transaction status after a the 3DS challenge. This will be null in case of a frictionless 3DS flow.
   */
  @JsonAdapter(AuthenticationResponseEnum.Adapter.class)
  public enum AuthenticationResponseEnum {
    Y("Y"),
    
    A("A"),
    
    N("N"),
    
    R("R"),
    
    U("U");

    private String value;

    AuthenticationResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationResponseEnum fromValue(String value) {
      for (AuthenticationResponseEnum b : AuthenticationResponseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthenticationResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthenticationResponseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHENTICATION_RESPONSE = "authentication_response";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESPONSE)
  private AuthenticationResponseEnum authenticationResponse;

  /**
   * The transaction status received as part of the authentication request.
   */
  @JsonAdapter(DirectoryResponseEnum.Adapter.class)
  public enum DirectoryResponseEnum {
    C("C"),
    
    Y("Y"),
    
    A("A"),
    
    N("N"),
    
    R("R"),
    
    U("U");

    private String value;

    DirectoryResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectoryResponseEnum fromValue(String value) {
      for (DirectoryResponseEnum b : DirectoryResponseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectoryResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectoryResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectoryResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectoryResponseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTORY_RESPONSE = "directory_response";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_RESPONSE)
  private DirectoryResponseEnum directoryResponse;

  public static final String SERIALIZED_NAME_DIRECTORY_TRANSACTION_ID = "directory_transaction_id";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_TRANSACTION_ID)
  private String directoryTransactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_REASON = "transaction_reason";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REASON)
  private String transactionReason;


  public ThreeDSecureV2 cavv(String cavv) {
    
    this.cavv = cavv;
    return this;
  }

   /**
   * The cardholder authentication value or AAV.
   * @return cavv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3q2+78r+ur7erb7vyv66vv8=", value = "The cardholder authentication value or AAV.")

  public String getCavv() {
    return cavv;
  }


  public void setCavv(String cavv) {
    this.cavv = cavv;
  }


  public ThreeDSecureV2 eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * The ecommerce indicator for the 3DS transaction.
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05", value = "The ecommerce indicator for the 3DS transaction.")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public ThreeDSecureV2 version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of 3-D Secure that was used.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of 3-D Secure that was used.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ThreeDSecureV2 authenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    
    this.authenticationResponse = authenticationResponse;
    return this;
  }

   /**
   * The transaction status after a the 3DS challenge. This will be null in case of a frictionless 3DS flow.
   * @return authenticationResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "The transaction status after a the 3DS challenge. This will be null in case of a frictionless 3DS flow.")

  public AuthenticationResponseEnum getAuthenticationResponse() {
    return authenticationResponse;
  }


  public void setAuthenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }


  public ThreeDSecureV2 directoryResponse(DirectoryResponseEnum directoryResponse) {
    
    this.directoryResponse = directoryResponse;
    return this;
  }

   /**
   * The transaction status received as part of the authentication request.
   * @return directoryResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C", value = "The transaction status received as part of the authentication request.")

  public DirectoryResponseEnum getDirectoryResponse() {
    return directoryResponse;
  }


  public void setDirectoryResponse(DirectoryResponseEnum directoryResponse) {
    this.directoryResponse = directoryResponse;
  }


  public ThreeDSecureV2 directoryTransactionId(String directoryTransactionId) {
    
    this.directoryTransactionId = directoryTransactionId;
    return this;
  }

   /**
   * The transaction identifier.
   * @return directoryTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c4e59ceb-a382-4d6a-bc87-385d591fa09d", value = "The transaction identifier.")

  public String getDirectoryTransactionId() {
    return directoryTransactionId;
  }


  public void setDirectoryTransactionId(String directoryTransactionId) {
    this.directoryTransactionId = directoryTransactionId;
  }


  public ThreeDSecureV2 transactionReason(String transactionReason) {
    
    this.transactionReason = transactionReason;
    return this;
  }

   /**
   * The reason identifier for a declined transaction.
   * @return transactionReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05", value = "The reason identifier for a declined transaction.")

  public String getTransactionReason() {
    return transactionReason;
  }


  public void setTransactionReason(String transactionReason) {
    this.transactionReason = transactionReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureV2 threeDSecureV2 = (ThreeDSecureV2) o;
    return Objects.equals(this.cavv, threeDSecureV2.cavv) &&
        Objects.equals(this.eci, threeDSecureV2.eci) &&
        Objects.equals(this.version, threeDSecureV2.version) &&
        Objects.equals(this.authenticationResponse, threeDSecureV2.authenticationResponse) &&
        Objects.equals(this.directoryResponse, threeDSecureV2.directoryResponse) &&
        Objects.equals(this.directoryTransactionId, threeDSecureV2.directoryTransactionId) &&
        Objects.equals(this.transactionReason, threeDSecureV2.transactionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cavv, eci, version, authenticationResponse, directoryResponse, directoryTransactionId, transactionReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureV2 {\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    directoryResponse: ").append(toIndentedString(directoryResponse)).append("\n");
    sb.append("    directoryTransactionId: ").append(toIndentedString(directoryTransactionId)).append("\n");
    sb.append("    transactionReason: ").append(toIndentedString(transactionReason)).append("\n");
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

