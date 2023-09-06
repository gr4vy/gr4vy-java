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
 * Details of the log entry, stack trace and endpoint.
 */
@ApiModel(description = "Details of the log entry, stack trace and endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:11:33.631354Z[Etc/UTC]")
public class ApiLogResponseBodyDetails {
  public static final String SERIALIZED_NAME_POINTER = "pointer";
  @SerializedName(SERIALIZED_NAME_POINTER)
  private String pointer;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ApiLogResponseBodyDetails pointer(String pointer) {
    
    this.pointer = pointer;
    return this;
  }

   /**
   * Log&#39;s pointer.
   * @return pointer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/payment_method/number", value = "Log's pointer.")

  public String getPointer() {
    return pointer;
  }


  public void setPointer(String pointer) {
    this.pointer = pointer;
  }


  public ApiLogResponseBodyDetails message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Detailed message on the log entry.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ensure this value has at least 13 characters", value = "Detailed message on the log entry.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ApiLogResponseBodyDetails location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Location on where the error happened.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "body", value = "Location on where the error happened.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ApiLogResponseBodyDetails type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Detailed error type that is specified in the log entry.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "value_error.any_str.min_length", value = "Detailed error type that is specified in the log entry.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiLogResponseBodyDetails apiLogResponseBodyDetails = (ApiLogResponseBodyDetails) o;
    return Objects.equals(this.pointer, apiLogResponseBodyDetails.pointer) &&
        Objects.equals(this.message, apiLogResponseBodyDetails.message) &&
        Objects.equals(this.location, apiLogResponseBodyDetails.location) &&
        Objects.equals(this.type, apiLogResponseBodyDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointer, message, location, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLogResponseBodyDetails {\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

