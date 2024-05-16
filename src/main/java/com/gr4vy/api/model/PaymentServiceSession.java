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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A session request for a payment session. This is an opaque object passed to the payment service.
 */
@ApiModel(description = "A session request for a payment session. This is an opaque object passed to the payment service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentServiceSession {
  /**
   * The type of this resource.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYMENT_SERVICE_SESSION("payment-service-session");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * The status of the response.  - &#x60;succeeded&#x60; - The session was successfully generated. - &#x60;failed&#x60; - The session could not be generated.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

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

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private BigDecimal statusCode;

  public static final String SERIALIZED_NAME_RESPONSE_BODY = "response_body";
  @SerializedName(SERIALIZED_NAME_RESPONSE_BODY)
  private Map<String, Object> responseBody = null;


  public PaymentServiceSession type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment-service-session", value = "The type of this resource.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentServiceSession status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the response.  - &#x60;succeeded&#x60; - The session was successfully generated. - &#x60;failed&#x60; - The session could not be generated.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "succeeded", value = "The status of the response.  - `succeeded` - The session was successfully generated. - `failed` - The session could not be generated.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PaymentServiceSession code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A generic error code that may be returned when the session could not be generated.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNKNOWN_ERROR", value = "A generic error code that may be returned when the session could not be generated.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public PaymentServiceSession statusCode(BigDecimal statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * The HTTP status code received from the payment service.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The HTTP status code received from the payment service.")

  public BigDecimal getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
  }


  public PaymentServiceSession responseBody(Map<String, Object> responseBody) {
    
    this.responseBody = responseBody;
    return this;
  }

  public PaymentServiceSession putResponseBodyItem(String key, Object responseBodyItem) {
    if (this.responseBody == null) {
      this.responseBody = new HashMap<String, Object>();
    }
    this.responseBody.put(key, responseBodyItem);
    return this;
  }

   /**
   * The parsed JSON received from the payment service.
   * @return responseBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"data\":{\"customerType\":\"EXISTING\",\"walletManagementUrl\":\"https://example.com/session\"},\"meta\":{}}", value = "The parsed JSON received from the payment service.")

  public Map<String, Object> getResponseBody() {
    return responseBody;
  }


  public void setResponseBody(Map<String, Object> responseBody) {
    this.responseBody = responseBody;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentServiceSession paymentServiceSession = (PaymentServiceSession) o;
    return Objects.equals(this.type, paymentServiceSession.type) &&
        Objects.equals(this.status, paymentServiceSession.status) &&
        Objects.equals(this.code, paymentServiceSession.code) &&
        Objects.equals(this.statusCode, paymentServiceSession.statusCode) &&
        Objects.equals(this.responseBody, paymentServiceSession.responseBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, code, statusCode, responseBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServiceSession {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
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
