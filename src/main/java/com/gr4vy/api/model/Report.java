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
import com.gr4vy.api.model.ReportExecution;
import com.gr4vy.api.model.ReportSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * A report record.
 */
@ApiModel(description = "A report record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T21:14:21.023172Z[Etc/UTC]")
public class Report {
  /**
   * The type of this resource. Is always &#x60;report&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REPORT("report");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private ReportSpec spec;

  public static final String SERIALIZED_NAME_LATEST_EXECUTION = "latest_execution";
  @SerializedName(SERIALIZED_NAME_LATEST_EXECUTION)
  private ReportExecution latestExecution;


  public Report type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource. Is always &#x60;report&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "report", value = "The type of this resource. Is always `report`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Report id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this report.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The unique identifier for this report.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Report createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time this report was created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time this report was created in our system.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Report updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time this report was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time this report was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Report name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this report.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Failed Authorizations 042022", value = "The name of this report.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Report description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of this report.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Transactions that failed to authorize in April 2022", value = "The description of this report.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Report spec(ReportSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * The specifications of this report.
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specifications of this report.")

  public ReportSpec getSpec() {
    return spec;
  }


  public void setSpec(ReportSpec spec) {
    this.spec = spec;
  }


  public Report latestExecution(ReportExecution latestExecution) {
    
    this.latestExecution = latestExecution;
    return this;
  }

   /**
   * Details of the latest execution of this report.
   * @return latestExecution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the latest execution of this report.")

  public ReportExecution getLatestExecution() {
    return latestExecution;
  }


  public void setLatestExecution(ReportExecution latestExecution) {
    this.latestExecution = latestExecution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.type, report.type) &&
        Objects.equals(this.id, report.id) &&
        Objects.equals(this.createdAt, report.createdAt) &&
        Objects.equals(this.updatedAt, report.updatedAt) &&
        Objects.equals(this.name, report.name) &&
        Objects.equals(this.description, report.description) &&
        Objects.equals(this.spec, report.spec) &&
        Objects.equals(this.latestExecution, report.latestExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, createdAt, updatedAt, name, description, spec, latestExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    latestExecution: ").append(toIndentedString(latestExecution)).append("\n");
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
