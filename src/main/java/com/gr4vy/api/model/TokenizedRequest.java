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
 * Details for a previously tokenized payment method.
 */
@ApiModel(description = "Details for a previously tokenized payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T11:15:12.826734Z[Etc/UTC]")
public class TokenizedRequest {
  /**
   * &#x60;id&#x60;.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    ID("id");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;


  public TokenizedRequest method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * &#x60;id&#x60;.
   * @return method
  **/
  @ApiModelProperty(example = "id", required = true, value = "`id`.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TokenizedRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A ID that represents a previously tokenized payment method. This token can represent any type of payment method.
   * @return id
  **/
  @ApiModelProperty(example = "46973e9d-88a7-44a6-abfe-be4ff0134ff4", required = true, value = "A ID that represents a previously tokenized payment method. This token can represent any type of payment method.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TokenizedRequest redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * We strongly recommended providing a &#x60;redirect_url&#x60; for stored cards when 3-D Secure is enabled and &#x60;three_d_secure_data&#x60; is not provided. This will be appended with both a transaction ID and status (e.g. &#x60;https://example.com/callback? gr4vy_transaction_id&#x3D;123&amp;gr4vy_transaction_status&#x3D;capture_succeeded&#x60;) after 3-D Secure has completed.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/callback", value = "We strongly recommended providing a `redirect_url` for stored cards when 3-D Secure is enabled and `three_d_secure_data` is not provided. This will be appended with both a transaction ID and status (e.g. `https://example.com/callback? gr4vy_transaction_id=123&gr4vy_transaction_status=capture_succeeded`) after 3-D Secure has completed.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizedRequest tokenizedRequest = (TokenizedRequest) o;
    return Objects.equals(this.method, tokenizedRequest.method) &&
        Objects.equals(this.id, tokenizedRequest.id) &&
        Objects.equals(this.redirectUrl, tokenizedRequest.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, id, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizedRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

