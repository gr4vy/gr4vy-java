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

/**
 * A request to set a password for a user.
 */
@ApiModel(description = "A request to set a password for a user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetPasswordRequest {
  public static final String SERIALIZED_NAME_RESET_TOKEN = "reset_token";
  @SerializedName(SERIALIZED_NAME_RESET_TOKEN)
  private String resetToken;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public SetPasswordRequest resetToken(String resetToken) {
    
    this.resetToken = resetToken;
    return this;
  }

   /**
   * Unique reset token valid for 7 days.
   * @return resetToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "nXyWSHq2r5q_8F1_NXtppEStY7KbBHqwU9T8pdmOQa_LYJxpxxXcjOXL58xpHLy5gh1k6s0Myl3ygA6SnsxIjLXBKO3x1EZX3igq", value = "Unique reset token valid for 7 days.")

  public String getResetToken() {
    return resetToken;
  }


  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }


  public SetPasswordRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password the user to log in with.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "this-is-n0t-a-secure-passw0rd", value = "The password the user to log in with.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPasswordRequest setPasswordRequest = (SetPasswordRequest) o;
    return Objects.equals(this.resetToken, setPasswordRequest.resetToken) &&
        Objects.equals(this.password, setPasswordRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetToken, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPasswordRequest {\n");
    sb.append("    resetToken: ").append(toIndentedString(resetToken)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

