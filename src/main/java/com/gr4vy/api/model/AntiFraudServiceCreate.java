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
import com.gr4vy.api.model.AntiFraudServiceUpdate;
import com.gr4vy.api.model.AntiFraudServiceUpdateFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A request to create an anti-fraud service.
 */
@ApiModel(description = "A request to create an anti-fraud service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-30T05:21:36.133441Z[Etc/UTC]")
public class AntiFraudServiceCreate {
  /**
   * The name of the Anti-Fraud service provider. During update request, this value is used for validation only but the underlying service can not be changed for an existing service.
   */
  @JsonAdapter(AntiFraudServiceDefinitionIdEnum.Adapter.class)
  public enum AntiFraudServiceDefinitionIdEnum {
    SIFT_ANTI_FRAUD("sift-anti-fraud"),
    
    CYBERSOURCE_ANTI_FRAUD("cybersource-anti-fraud");

    private String value;

    AntiFraudServiceDefinitionIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AntiFraudServiceDefinitionIdEnum fromValue(String value) {
      for (AntiFraudServiceDefinitionIdEnum b : AntiFraudServiceDefinitionIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AntiFraudServiceDefinitionIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AntiFraudServiceDefinitionIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AntiFraudServiceDefinitionIdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AntiFraudServiceDefinitionIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ANTI_FRAUD_SERVICE_DEFINITION_ID = "anti_fraud_service_definition_id";
  @SerializedName(SERIALIZED_NAME_ANTI_FRAUD_SERVICE_DEFINITION_ID)
  private AntiFraudServiceDefinitionIdEnum antiFraudServiceDefinitionId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_REVIEWS_ENABLED = "reviews_enabled";
  @SerializedName(SERIALIZED_NAME_REVIEWS_ENABLED)
  private Boolean reviewsEnabled = false;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<AntiFraudServiceUpdateFields> fields = new ArrayList<AntiFraudServiceUpdateFields>();


  public AntiFraudServiceCreate antiFraudServiceDefinitionId(AntiFraudServiceDefinitionIdEnum antiFraudServiceDefinitionId) {
    
    this.antiFraudServiceDefinitionId = antiFraudServiceDefinitionId;
    return this;
  }

   /**
   * The name of the Anti-Fraud service provider. During update request, this value is used for validation only but the underlying service can not be changed for an existing service.
   * @return antiFraudServiceDefinitionId
  **/
  @ApiModelProperty(example = "sift-anti-fraud", required = true, value = "The name of the Anti-Fraud service provider. During update request, this value is used for validation only but the underlying service can not be changed for an existing service.")

  public AntiFraudServiceDefinitionIdEnum getAntiFraudServiceDefinitionId() {
    return antiFraudServiceDefinitionId;
  }


  public void setAntiFraudServiceDefinitionId(AntiFraudServiceDefinitionIdEnum antiFraudServiceDefinitionId) {
    this.antiFraudServiceDefinitionId = antiFraudServiceDefinitionId;
  }


  public AntiFraudServiceCreate displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A unique name for this anti-fraud service which is used in the Gr4vy admin panel to give a anti-fraud Service a human readable name.
   * @return displayName
  **/
  @ApiModelProperty(example = "Sift Anti-Fraud Service.", required = true, value = "A unique name for this anti-fraud service which is used in the Gr4vy admin panel to give a anti-fraud Service a human readable name.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public AntiFraudServiceCreate active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Defines if this service is currently active or not. There can only be one active service at any time. When updating a service to active, the current active service will be deactivated.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defines if this service is currently active or not. There can only be one active service at any time. When updating a service to active, the current active service will be deactivated.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public AntiFraudServiceCreate reviewsEnabled(Boolean reviewsEnabled) {
    
    this.reviewsEnabled = reviewsEnabled;
    return this;
  }

   /**
   * Defines if this service needs to handle the review status from anti-fraud responses with a proper review workflow. If not, the review status will be treated as any other one.
   * @return reviewsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Defines if this service needs to handle the review status from anti-fraud responses with a proper review workflow. If not, the review status will be treated as any other one.")

  public Boolean getReviewsEnabled() {
    return reviewsEnabled;
  }


  public void setReviewsEnabled(Boolean reviewsEnabled) {
    this.reviewsEnabled = reviewsEnabled;
  }


  public AntiFraudServiceCreate fields(List<AntiFraudServiceUpdateFields> fields) {
    
    this.fields = fields;
    return this;
  }

  public AntiFraudServiceCreate addFieldsItem(AntiFraudServiceUpdateFields fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * A list of fields, each containing a key-value pair for each field defined by the definition for this anti-fraud service e.g. for Sift &#x60;api_key&#x60; must be sent within this field when creating the service.  For updates, only the fields sent here will be updated, existing ones will not be affected if not present.
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "A list of fields, each containing a key-value pair for each field defined by the definition for this anti-fraud service e.g. for Sift `api_key` must be sent within this field when creating the service.  For updates, only the fields sent here will be updated, existing ones will not be affected if not present.")

  public List<AntiFraudServiceUpdateFields> getFields() {
    return fields;
  }


  public void setFields(List<AntiFraudServiceUpdateFields> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntiFraudServiceCreate antiFraudServiceCreate = (AntiFraudServiceCreate) o;
    return Objects.equals(this.antiFraudServiceDefinitionId, antiFraudServiceCreate.antiFraudServiceDefinitionId) &&
        Objects.equals(this.displayName, antiFraudServiceCreate.displayName) &&
        Objects.equals(this.active, antiFraudServiceCreate.active) &&
        Objects.equals(this.reviewsEnabled, antiFraudServiceCreate.reviewsEnabled) &&
        Objects.equals(this.fields, antiFraudServiceCreate.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiFraudServiceDefinitionId, displayName, active, reviewsEnabled, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntiFraudServiceCreate {\n");
    sb.append("    antiFraudServiceDefinitionId: ").append(toIndentedString(antiFraudServiceDefinitionId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    reviewsEnabled: ").append(toIndentedString(reviewsEnabled)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

