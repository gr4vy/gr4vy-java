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
import java.util.UUID;

/**
 * The user who performed the action.
 */
@ApiModel(description = "The user who performed the action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditLogUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_STAFF = "staff";
  @SerializedName(SERIALIZED_NAME_STAFF)
  private Boolean staff;

  /**
   * The status of the user.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    PENDING("pending"),
    
    DELETED("deleted");

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


  public AuditLogUser id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the user.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "77a76f7e-d2de-4bbc-ada9-d6a0015e6bd5", value = "The ID of the user.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AuditLogUser name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the user.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John L", value = "The name of the user.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AuditLogUser emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address for this user.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john@example.com", value = "The email address for this user.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public AuditLogUser staff(Boolean staff) {
    
    this.staff = staff;
    return this;
  }

   /**
   * Whether the user is Gr4vy staff.
   * @return staff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the user is Gr4vy staff.")

  public Boolean getStaff() {
    return staff;
  }


  public void setStaff(Boolean staff) {
    this.staff = staff;
  }


  public AuditLogUser status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the user.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "The status of the user.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogUser auditLogUser = (AuditLogUser) o;
    return Objects.equals(this.id, auditLogUser.id) &&
        Objects.equals(this.name, auditLogUser.name) &&
        Objects.equals(this.emailAddress, auditLogUser.emailAddress) &&
        Objects.equals(this.staff, auditLogUser.staff) &&
        Objects.equals(this.status, auditLogUser.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, emailAddress, staff, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

