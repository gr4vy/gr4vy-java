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
import com.gr4vy.api.model.ConnectionDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A configured connection.
 */
@ApiModel(description = "A configured connection.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:46:45.100086Z[Etc/UTC]")
public class Connection {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "connection";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_DEFINITION = "definition";
  @SerializedName(SERIALIZED_NAME_DEFINITION)
  private ConnectionDefinition definition;


  public Connection id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the connection.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7b5e02bd-fa53-4ef0-b11e-1609d0f48cc5", value = "The ID of the connection.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Connection type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;connection&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "connection", value = "`connection`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Connection name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this connection.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Connection", value = "The name of this connection.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Connection active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Whether this connection is currently in use. Connections can be deactivated to allow for them to be kept around and re-activated at a later date.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether this connection is currently in use. Connections can be deactivated to allow for them to be kept around and re-activated at a later date.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Connection definition(ConnectionDefinition definition) {
    
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionDefinition getDefinition() {
    return definition;
  }


  public void setDefinition(ConnectionDefinition definition) {
    this.definition = definition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.id, connection.id) &&
        Objects.equals(this.type, connection.type) &&
        Objects.equals(this.name, connection.name) &&
        Objects.equals(this.active, connection.active) &&
        Objects.equals(this.definition, connection.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, active, definition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
