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
import com.gr4vy.api.model.ThreeDSecureDataV1V2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about the 3-D Secure challenge that was presented to the buyer for this transaction, where applicable.
 */
@ApiModel(description = "Details about the 3-D Secure challenge that was presented to the buyer for this transaction, where applicable.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T12:22:53.235500Z[Etc/UTC]")
public class ThreeDSecureSummary {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  /**
   * The status of the 3DS challenge for this transaction.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SETUP_ERROR("setup_error"),
    
    ERROR("error"),
    
    DECLINED("declined"),
    
    CANCELLED("cancelled"),
    
    COMPLETE("complete");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * The method used for 3DS authentication for this transaction.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    CHALLENGE("challenge"),
    
    FRICTIONLESS("frictionless");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_RESPONSE_DATA = "response_data";
  @SerializedName(SERIALIZED_NAME_RESPONSE_DATA)
  private ThreeDSecureDataV1V2 responseData;


  public ThreeDSecureSummary version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of 3DS used for this transaction.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.1.0", value = "The version of 3DS used for this transaction.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ThreeDSecureSummary status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the 3DS challenge for this transaction.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the 3DS challenge for this transaction.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ThreeDSecureSummary method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The method used for 3DS authentication for this transaction.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The method used for 3DS authentication for this transaction.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public ThreeDSecureSummary responseData(ThreeDSecureDataV1V2 responseData) {
    
    this.responseData = responseData;
    return this;
  }

   /**
   * Get responseData
   * @return responseData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDSecureDataV1V2 getResponseData() {
    return responseData;
  }


  public void setResponseData(ThreeDSecureDataV1V2 responseData) {
    this.responseData = responseData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureSummary threeDSecureSummary = (ThreeDSecureSummary) o;
    return Objects.equals(this.version, threeDSecureSummary.version) &&
        Objects.equals(this.status, threeDSecureSummary.status) &&
        Objects.equals(this.method, threeDSecureSummary.method) &&
        Objects.equals(this.responseData, threeDSecureSummary.responseData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, status, method, responseData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureSummary {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    responseData: ").append(toIndentedString(responseData)).append("\n");
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
