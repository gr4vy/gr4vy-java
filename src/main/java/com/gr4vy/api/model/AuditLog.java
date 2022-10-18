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
import com.gr4vy.api.model.AuditLogResource;
import com.gr4vy.api.model.AuditLogUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * A log of a change that occurred in the Gr4vy instance.
 */
@ApiModel(description = "A log of a change that occurred in the Gr4vy instance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T22:22:07.544896Z[Etc/UTC]")
public class AuditLog {
  /**
   * &#x60;audit-log&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AUDIT_LOG("audit-log");

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

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  /**
   * The action that was performed.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    CREATED("created"),
    
    UPDATED("updated"),
    
    DELETED("deleted");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private AuditLogUser user;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private AuditLogResource resource;


  public AuditLog type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;audit-log&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "audit-log", value = "`audit-log`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AuditLog id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the audit log entry.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8d3fe99b-1422-42e6-bbb3-932d95ae5f79", value = "The ID of the audit log entry.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AuditLog timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The date and time that the action was performed.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-01T00:00Z", value = "The date and time that the action was performed.")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public AuditLog action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * The action that was performed.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "created", value = "The action that was performed.")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public AuditLog user(AuditLogUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditLogUser getUser() {
    return user;
  }


  public void setUser(AuditLogUser user) {
    this.user = user;
  }


  public AuditLog resource(AuditLogResource resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditLogResource getResource() {
    return resource;
  }


  public void setResource(AuditLogResource resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLog auditLog = (AuditLog) o;
    return Objects.equals(this.type, auditLog.type) &&
        Objects.equals(this.id, auditLog.id) &&
        Objects.equals(this.timestamp, auditLog.timestamp) &&
        Objects.equals(this.action, auditLog.action) &&
        Objects.equals(this.user, auditLog.user) &&
        Objects.equals(this.resource, auditLog.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, timestamp, action, user, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLog {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

