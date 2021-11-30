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
 * A field containing a key-value pair for a required field defined by the service for this payment service.
 */
@ApiModel(description = "A field containing a key-value pair for a required field defined by the service for this payment service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T06:53:23.548460Z[Etc/UTC]")
public class PaymentServiceUpdateFields {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public PaymentServiceUpdateFields key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the field to set a value for.
   * @return key
  **/
  @ApiModelProperty(example = "private_key", required = true, value = "The key of the field to set a value for.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public PaymentServiceUpdateFields value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of a field to set.
   * @return value
  **/
  @ApiModelProperty(example = "sk_test_4eC39HqLyjWDarjtT1zdp7dc", required = true, value = "The value of a field to set.")

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
    PaymentServiceUpdateFields paymentServiceUpdateFields = (PaymentServiceUpdateFields) o;
    return Objects.equals(this.key, paymentServiceUpdateFields.key) &&
        Objects.equals(this.value, paymentServiceUpdateFields.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServiceUpdateFields {\n");
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

