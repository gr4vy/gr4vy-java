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
 * The resource that was changed.
 */
@ApiModel(description = "The resource that was changed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T21:14:21.023172Z[Etc/UTC]")
public class AuditLogResource {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public AuditLogResource type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the resource.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "buyer", value = "The type of the resource.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AuditLogResource id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The ID of the resource.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AuditLogResource name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The descriptive name of the resource.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Samuel J", value = "The descriptive name of the resource.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogResource auditLogResource = (AuditLogResource) o;
    return Objects.equals(this.type, auditLogResource.type) &&
        Objects.equals(this.id, auditLogResource.id) &&
        Objects.equals(this.name, auditLogResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogResource {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

