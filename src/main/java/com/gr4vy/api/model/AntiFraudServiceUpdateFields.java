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
 * A key-value pair that represents a field defined in the definition for this anti-fraud service.
 */
@ApiModel(description = "A key-value pair that represents a field defined in the definition for this anti-fraud service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-19T17:27:23.170866Z[Etc/UTC]")
public class AntiFraudServiceUpdateFields {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public AntiFraudServiceUpdateFields key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the field to set a value for.
   * @return key
  **/
  @ApiModelProperty(example = "api_key", required = true, value = "The key of the field to set a value for.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public AntiFraudServiceUpdateFields value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of a field to set.
   * @return value
  **/
  @ApiModelProperty(example = "sk_test_26PHem9AhJZvU623DfE1x4sd", required = true, value = "The value of a field to set.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntiFraudServiceUpdateFields antiFraudServiceUpdateFields = (AntiFraudServiceUpdateFields) o;
    return Objects.equals(this.key, antiFraudServiceUpdateFields.key) &&
        Objects.equals(this.value, antiFraudServiceUpdateFields.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntiFraudServiceUpdateFields {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

