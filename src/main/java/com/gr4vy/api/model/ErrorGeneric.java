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
import com.gr4vy.api.model.ErrorDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A generic client error.
 */
@ApiModel(description = "A generic client error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T06:53:23.548460Z[Etc/UTC]")
public class ErrorGeneric {
  /**
   * The type of this object. This is always &#x60;error&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ERROR("error");

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
  private TypeEnum type = TypeEnum.ERROR;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<ErrorDetail> details = null;


  public ErrorGeneric type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this object. This is always &#x60;error&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "error", value = "The type of this object. This is always `error`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ErrorGeneric code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A custom code to further describe the type of error being returned. This code provides further specification within the HTTP &#x60;status&#x60; code and can be used by a program to define logic based on the error.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "incorrect_json", value = "A custom code to further describe the type of error being returned. This code provides further specification within the HTTP `status` code and can be used by a program to define logic based on the error.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ErrorGeneric status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code of this error.
   * minimum: 200
   * maximum: 600
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "499", value = "The HTTP status code of this error.")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public ErrorGeneric message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human readable message that describes the error. The content of this field should not be used to determine any business logic. 
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The request body was not valid JSON.", value = "A human readable message that describes the error. The content of this field should not be used to determine any business logic. ")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ErrorGeneric details(List<ErrorDetail> details) {
    
    this.details = details;
    return this;
  }

  public ErrorGeneric addDetailsItem(ErrorDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<ErrorDetail>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * A list of detail objects that further clarify the reason for the error. Not every error supports more detail.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of detail objects that further clarify the reason for the error. Not every error supports more detail.")

  public List<ErrorDetail> getDetails() {
    return details;
  }


  public void setDetails(List<ErrorDetail> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorGeneric errorGeneric = (ErrorGeneric) o;
    return Objects.equals(this.type, errorGeneric.type) &&
        Objects.equals(this.code, errorGeneric.code) &&
        Objects.equals(this.status, errorGeneric.status) &&
        Objects.equals(this.message, errorGeneric.message) &&
        Objects.equals(this.details, errorGeneric.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, status, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorGeneric {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

