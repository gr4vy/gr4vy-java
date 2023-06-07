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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A request to update a user.
 */
@ApiModel(description = "A request to update a user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T14:21:56.132305Z[Etc/UTC]")
public class UserUpdate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROLE_IDS = "role_ids";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<UUID> roleIds = null;


  public UserUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The full name of the user which is used in the Gr4vy admin panel to give a user a human readable name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John L.", value = "The full name of the user which is used in the Gr4vy admin panel to give a user a human readable name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserUpdate roleIds(List<UUID> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public UserUpdate addRoleIdsItem(UUID roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<UUID>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * The IDs of the roles to assign to the user. Sending an empty list will remove all roles assigned to the user.
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"46973e9d-88a7-44a6-abfe-be4ff0134ff4\"]", value = "The IDs of the roles to assign to the user. Sending an empty list will remove all roles assigned to the user.")

  public List<UUID> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<UUID> roleIds) {
    this.roleIds = roleIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdate userUpdate = (UserUpdate) o;
    return Objects.equals(this.name, userUpdate.name) &&
        Objects.equals(this.roleIds, userUpdate.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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
