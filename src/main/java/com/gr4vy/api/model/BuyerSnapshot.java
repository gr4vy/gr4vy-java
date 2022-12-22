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

/**
 * Snapshot of a buyer, as used when embedded inside other resources.
 */
@ApiModel(description = "Snapshot of a buyer, as used when embedded inside other resources.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T14:21:56.132305Z[Etc/UTC]")
public class BuyerSnapshot {
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


  public BuyerSnapshot type(TypeEnum type) {
    
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


  public BuyerSnapshot id(UUID id) {
    
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


  public BuyerSnapshot externalIdentifier(String externalIdentifier) {
    
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


  public BuyerSnapshot displayName(String displayName) {
    
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


  public BuyerSnapshot billingDetails(BillingDetails billingDetails) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerSnapshot buyerSnapshot = (BuyerSnapshot) o;
    return Objects.equals(this.type, buyerSnapshot.type) &&
        Objects.equals(this.id, buyerSnapshot.id) &&
        Objects.equals(this.externalIdentifier, buyerSnapshot.externalIdentifier) &&
        Objects.equals(this.displayName, buyerSnapshot.displayName) &&
        Objects.equals(this.billingDetails, buyerSnapshot.billingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, externalIdentifier, displayName, billingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerSnapshot {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
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

