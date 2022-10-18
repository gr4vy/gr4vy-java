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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T22:22:07.544896Z[Etc/UTC]")
public class AuditLogUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STAFF = "staff";
  @SerializedName(SERIALIZED_NAME_STAFF)
  private Boolean staff;


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
        Objects.equals(this.staff, auditLogUser.staff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, staff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
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

