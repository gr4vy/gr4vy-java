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
 * Additional options for Giving Block connector.
 */
@ApiModel(description = "Additional options for Giving Block connector.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionOptionsGivingblockGivingblock {
  public static final String SERIALIZED_NAME_DEFAULT_CRYPTOCURRENCY = "defaultCryptocurrency";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CRYPTOCURRENCY)
  private String defaultCryptocurrency;


  public ConnectionOptionsGivingblockGivingblock defaultCryptocurrency(String defaultCryptocurrency) {
    
    this.defaultCryptocurrency = defaultCryptocurrency;
    return this;
  }

   /**
   * The default crypto currency to display on the hosted page presented by The Giving Block.
   * @return defaultCryptocurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ETH", value = "The default crypto currency to display on the hosted page presented by The Giving Block.")

  public String getDefaultCryptocurrency() {
    return defaultCryptocurrency;
  }


  public void setDefaultCryptocurrency(String defaultCryptocurrency) {
    this.defaultCryptocurrency = defaultCryptocurrency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionOptionsGivingblockGivingblock connectionOptionsGivingblockGivingblock = (ConnectionOptionsGivingblockGivingblock) o;
    return Objects.equals(this.defaultCryptocurrency, connectionOptionsGivingblockGivingblock.defaultCryptocurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCryptocurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOptionsGivingblockGivingblock {\n");
    sb.append("    defaultCryptocurrency: ").append(toIndentedString(defaultCryptocurrency)).append("\n");
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
