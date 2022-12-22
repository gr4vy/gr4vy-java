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
import com.gr4vy.api.model.BillingDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Buyer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T14:21:56.132305Z[Etc/UTC]")
public class Buyer {
  /**
   * The type of this resource. Is always &#x60;buyer&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BUYER("buyer");

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

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_BILLING_DETAILS = "billing_details";
  @SerializedName(SERIALIZED_NAME_BILLING_DETAILS)
  private BillingDetails billingDetails;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public Buyer type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource. Is always &#x60;buyer&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "buyer", value = "The type of this resource. Is always `buyer`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Buyer id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique Gr4vy ID for this buyer.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The unique Gr4vy ID for this buyer.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Buyer externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the buyer against your own records.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "An external identifier that can be used to match the buyer against your own records.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public Buyer displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A unique name for this buyer which is used in the Gr4vy admin panel to give a buyer a human readable name.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John L.", value = "A unique name for this buyer which is used in the Gr4vy admin panel to give a buyer a human readable name.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Buyer billingDetails(BillingDetails billingDetails) {
    
    this.billingDetails = billingDetails;
    return this;
  }

   /**
   * Get billingDetails
   * @return billingDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingDetails getBillingDetails() {
    return billingDetails;
  }


  public void setBillingDetails(BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
  }


  public Buyer createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this buyer was created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time when this buyer was created in our system.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Buyer updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when this buyer was last updated in our system.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time when this buyer was last updated in our system.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Buyer buyer = (Buyer) o;
    return Objects.equals(this.type, buyer.type) &&
        Objects.equals(this.id, buyer.id) &&
        Objects.equals(this.externalIdentifier, buyer.externalIdentifier) &&
        Objects.equals(this.displayName, buyer.displayName) &&
        Objects.equals(this.billingDetails, buyer.billingDetails) &&
        Objects.equals(this.createdAt, buyer.createdAt) &&
        Objects.equals(this.updatedAt, buyer.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, externalIdentifier, displayName, billingDetails, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Buyer {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

