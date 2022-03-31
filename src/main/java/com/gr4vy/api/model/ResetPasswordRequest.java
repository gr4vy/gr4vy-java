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
 * A request to reset a password for a user.
 */
@ApiModel(description = "A request to reset a password for a user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-29T11:53:32.457004Z[Etc/UTC]")
public class ResetPasswordRequest {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;


  public ResetPasswordRequest emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address of the user account to reset.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john@example.com", value = "The email address of the user account to reset.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPasswordRequest resetPasswordRequest = (ResetPasswordRequest) o;
    return Objects.equals(this.emailAddress, resetPasswordRequest.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordRequest {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

