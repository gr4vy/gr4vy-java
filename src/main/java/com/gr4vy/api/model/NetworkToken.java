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
import org.threeten.bp.OffsetDateTime;

/**
 * A network token generated by an open-loop PSP.
 */
@ApiModel(description = "A network token generated by an open-loop PSP.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T15:11:33.631354Z[Etc/UTC]")
public class NetworkToken {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_ID = "payment_method_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_ID)
  private UUID paymentMethodId;

  /**
   * The state of the network token.  - &#x60;active&#x60; - The network token is active and ready to be used. - &#x60;inactive&#x60; - The network token is being deactivated. - &#x60;suspended&#x60; - The network token is suspended. - &#x60;deleted&#x60; - The network token is deleted.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    SUSPENDED("suspended"),
    
    DELETED("deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public NetworkToken id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the token.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d6ad71d5-6908-45d6-ab65-39c55475dd08", value = "The unique ID of the token.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public NetworkToken paymentMethodId(UUID paymentMethodId) {
    
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * The unique ID of the payment method.
   * @return paymentMethodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9bdc4bc4-005e-4658-8eee-a309fc43cd4d", value = "The unique ID of the payment method.")

  public UUID getPaymentMethodId() {
    return paymentMethodId;
  }


  public void setPaymentMethodId(UUID paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }


  public NetworkToken status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The state of the network token.  - &#x60;active&#x60; - The network token is active and ready to be used. - &#x60;inactive&#x60; - The network token is being deactivated. - &#x60;suspended&#x60; - The network token is suspended. - &#x60;deleted&#x60; - The network token is deleted.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "The state of the network token.  - `active` - The network token is active and ready to be used. - `inactive` - The network token is being deactivated. - `suspended` - The network token is suspended. - `deleted` - The network token is deleted.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public NetworkToken token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The value of the network token.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the network token.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public NetworkToken expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date for the network token.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01/30", value = "The expiration date for the network token.")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public NetworkToken createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this network token was first created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T12:34Z", value = "The date and time when this network token was first created in our system.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public NetworkToken updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when this network token was last updated in our system.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01T12:34Z", value = "The date and time when this network token was last updated in our system.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkToken networkToken = (NetworkToken) o;
    return Objects.equals(this.id, networkToken.id) &&
        Objects.equals(this.paymentMethodId, networkToken.paymentMethodId) &&
        Objects.equals(this.status, networkToken.status) &&
        Objects.equals(this.token, networkToken.token) &&
        Objects.equals(this.expirationDate, networkToken.expirationDate) &&
        Objects.equals(this.createdAt, networkToken.createdAt) &&
        Objects.equals(this.updatedAt, networkToken.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentMethodId, status, token, expirationDate, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkToken {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

