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
import com.gr4vy.api.model.RoleAssignmentRequestAssignee;
import com.gr4vy.api.model.RoleAssignmentRequestRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A request to create a role assignment.
 */
@ApiModel(description = "A request to create a role assignment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleAssignmentRequest {
  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleAssignmentRequestRole role;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private RoleAssignmentRequestAssignee assignee;


  public RoleAssignmentRequest role(RoleAssignmentRequestRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")

  public RoleAssignmentRequestRole getRole() {
    return role;
  }


  public void setRole(RoleAssignmentRequestRole role) {
    this.role = role;
  }


  public RoleAssignmentRequest assignee(RoleAssignmentRequestAssignee assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(required = true, value = "")

  public RoleAssignmentRequestAssignee getAssignee() {
    return assignee;
  }


  public void setAssignee(RoleAssignmentRequestAssignee assignee) {
    this.assignee = assignee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAssignmentRequest roleAssignmentRequest = (RoleAssignmentRequest) o;
    return Objects.equals(this.role, roleAssignmentRequest.role) &&
        Objects.equals(this.assignee, roleAssignmentRequest.assignee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, assignee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAssignmentRequest {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
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

