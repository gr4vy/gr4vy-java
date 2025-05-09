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
 * WebhookSubscriptionAuthentication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookSubscriptionAuthentication {
  /**
   * Only &#x60;basic&#x60;&#x60; is currently supported.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    BASIC("basic");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KindEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private KindEnum kind;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public WebhookSubscriptionAuthentication kind(KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Only &#x60;basic&#x60;&#x60; is currently supported.
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "basic", value = "Only `basic`` is currently supported.")

  public KindEnum getKind() {
    return kind;
  }


  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public WebhookSubscriptionAuthentication username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The basic authentication username to use for authentication.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username", value = "The basic authentication username to use for authentication.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public WebhookSubscriptionAuthentication password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The basic authentication password to use for authentication.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "password", value = "The basic authentication password to use for authentication.")

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
    WebhookSubscriptionAuthentication webhookSubscriptionAuthentication = (WebhookSubscriptionAuthentication) o;
    return Objects.equals(this.kind, webhookSubscriptionAuthentication.kind) &&
        Objects.equals(this.username, webhookSubscriptionAuthentication.username) &&
        Objects.equals(this.password, webhookSubscriptionAuthentication.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubscriptionAuthentication {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

