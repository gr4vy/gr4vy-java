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
 * A single field that needs to be submitted for a payment service when it is created.
 */
@ApiModel(description = "A single field that needs to be submitted for a payment service when it is created.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T11:15:12.826734Z[Etc/UTC]")
public class PaymentServiceDefinitionFields {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  /**
   * Defines the type of input that needs to be rendered for this field.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    TEXT("text"),
    
    MULTILINE("multiline"),
    
    NUMBER("number");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;


  public PaymentServiceDefinitionFields key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of a field that needs to be submitted.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "private_api_key", value = "The key of a field that needs to be submitted.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public PaymentServiceDefinitionFields displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name to display for a field in the dashboard.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Private API key", value = "The name to display for a field in the dashboard.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PaymentServiceDefinitionFields required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Defines if this field is required when the service is created.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if this field is required when the service is created.")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public PaymentServiceDefinitionFields format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * Defines the type of input that needs to be rendered for this field.
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text", value = "Defines the type of input that needs to be rendered for this field.")

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentServiceDefinitionFields paymentServiceDefinitionFields = (PaymentServiceDefinitionFields) o;
    return Objects.equals(this.key, paymentServiceDefinitionFields.key) &&
        Objects.equals(this.displayName, paymentServiceDefinitionFields.displayName) &&
        Objects.equals(this.required, paymentServiceDefinitionFields.required) &&
        Objects.equals(this.format, paymentServiceDefinitionFields.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, displayName, required, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServiceDefinitionFields {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

