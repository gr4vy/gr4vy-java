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
import com.gr4vy.api.model.ReportExecutionSummary;
import com.gr4vy.api.model.ReportExecutionSummaryContext;
import com.gr4vy.api.model.ReportSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * A report execution.
 */
@ApiModel(description = "A report execution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:11:33.631354Z[Etc/UTC]")
public class ReportExecution {
  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private ReportSummary report;

  /**
   * The type of this resource. Is always &#x60;report-execution&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REPORT_EXECUTION("report-execution");

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

  /**
   * The status of this report execution.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DISPATCHED("dispatched"),
    
    FAILED("failed"),
    
    PENDING("pending"),
    
    PROCESSING("processing"),
    
    SUCCEEDED("succeeded");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private ReportExecutionSummaryContext context;


  public ReportExecution report(ReportSummary report) {
    
    this.report = report;
    return this;
  }

   /**
   * The report associated with this report execution.
   * @return report
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The report associated with this report execution.")

  public ReportSummary getReport() {
    return report;
  }


  public void setReport(ReportSummary report) {
    this.report = report;
  }


  public ReportExecution type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource. Is always &#x60;report-execution&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "report-execution", value = "The type of this resource. Is always `report-execution`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ReportExecution id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this report execution.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The unique identifier for this report execution.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ReportExecution createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time this report execution was created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time this report execution was created in our system.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ReportExecution updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time this report execution was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time this report execution was last updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ReportExecution status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of this report execution.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "succeeded", value = "The status of this report execution.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ReportExecution context(ReportExecutionSummaryContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportExecutionSummaryContext getContext() {
    return context;
  }


  public void setContext(ReportExecutionSummaryContext context) {
    this.context = context;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportExecution reportExecution = (ReportExecution) o;
    return Objects.equals(this.report, reportExecution.report) &&
        Objects.equals(this.type, reportExecution.type) &&
        Objects.equals(this.id, reportExecution.id) &&
        Objects.equals(this.createdAt, reportExecution.createdAt) &&
        Objects.equals(this.updatedAt, reportExecution.updatedAt) &&
        Objects.equals(this.status, reportExecution.status) &&
        Objects.equals(this.context, reportExecution.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, type, id, createdAt, updatedAt, status, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportExecution {\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

