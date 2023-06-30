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
import com.gr4vy.api.model.ApiLogResponseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * A log of an error that happened in the API call.
 */
@ApiModel(description = "A log of an error that happened in the API call.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class ApiLog {
  /**
   * &#x60;api-log&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    API_LOG("api-log");

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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REQUEST_METHOD = "request_method";
  @SerializedName(SERIALIZED_NAME_REQUEST_METHOD)
  private String requestMethod;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_REQUEST_RECEIVED_AT = "request_received_at";
  @SerializedName(SERIALIZED_NAME_REQUEST_RECEIVED_AT)
  private OffsetDateTime requestReceivedAt;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "response_status_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
  private BigDecimal responseStatusCode;

  public static final String SERIALIZED_NAME_RESPONSE_BODY = "response_body";
  @SerializedName(SERIALIZED_NAME_RESPONSE_BODY)
  private ApiLogResponseBody responseBody;

  public static final String SERIALIZED_NAME_RESPONSE_SENT_AT = "response_sent_at";
  @SerializedName(SERIALIZED_NAME_RESPONSE_SENT_AT)
  private OffsetDateTime responseSentAt;


  public ApiLog type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;api-log&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "api-log", value = "`api-log`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ApiLog id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the API log entry.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8d3fe99b-1422-42e6-bbb3-932d95ae5f79", value = "The ID of the API log entry.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ApiLog requestMethod(String requestMethod) {
    
    this.requestMethod = requestMethod;
    return this;
  }

   /**
   * The http request method that generated the log entry.
   * @return requestMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POST", value = "The http request method that generated the log entry.")

  public String getRequestMethod() {
    return requestMethod;
  }


  public void setRequestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
  }


  public ApiLog requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * The http request URL which trigged the error log.
   * @return requestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://api.wpay.gr4vy.app/transactions", value = "The http request URL which trigged the error log.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public ApiLog requestReceivedAt(OffsetDateTime requestReceivedAt) {
    
    this.requestReceivedAt = requestReceivedAt;
    return this;
  }

   /**
   * The date and time that the request was received.
   * @return requestReceivedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01T00:00Z", value = "The date and time that the request was received.")

  public OffsetDateTime getRequestReceivedAt() {
    return requestReceivedAt;
  }


  public void setRequestReceivedAt(OffsetDateTime requestReceivedAt) {
    this.requestReceivedAt = requestReceivedAt;
  }


  public ApiLog responseStatusCode(BigDecimal responseStatusCode) {
    
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * The http request status code.
   * @return responseStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400", value = "The http request status code.")

  public BigDecimal getResponseStatusCode() {
    return responseStatusCode;
  }


  public void setResponseStatusCode(BigDecimal responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public ApiLog responseBody(ApiLogResponseBody responseBody) {
    
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Get responseBody
   * @return responseBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApiLogResponseBody getResponseBody() {
    return responseBody;
  }


  public void setResponseBody(ApiLogResponseBody responseBody) {
    this.responseBody = responseBody;
  }


  public ApiLog responseSentAt(OffsetDateTime responseSentAt) {
    
    this.responseSentAt = responseSentAt;
    return this;
  }

   /**
   * date-time of when the response was sent.
   * @return responseSentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01T00:00:10Z", value = "date-time of when the response was sent.")

  public OffsetDateTime getResponseSentAt() {
    return responseSentAt;
  }


  public void setResponseSentAt(OffsetDateTime responseSentAt) {
    this.responseSentAt = responseSentAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiLog apiLog = (ApiLog) o;
    return Objects.equals(this.type, apiLog.type) &&
        Objects.equals(this.id, apiLog.id) &&
        Objects.equals(this.requestMethod, apiLog.requestMethod) &&
        Objects.equals(this.requestUrl, apiLog.requestUrl) &&
        Objects.equals(this.requestReceivedAt, apiLog.requestReceivedAt) &&
        Objects.equals(this.responseStatusCode, apiLog.responseStatusCode) &&
        Objects.equals(this.responseBody, apiLog.responseBody) &&
        Objects.equals(this.responseSentAt, apiLog.responseSentAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, requestMethod, requestUrl, requestReceivedAt, responseStatusCode, responseBody, responseSentAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLog {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestReceivedAt: ").append(toIndentedString(requestReceivedAt)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseSentAt: ").append(toIndentedString(responseSentAt)).append("\n");
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

