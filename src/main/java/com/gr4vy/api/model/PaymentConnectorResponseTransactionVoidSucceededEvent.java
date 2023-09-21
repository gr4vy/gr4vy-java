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
import com.gr4vy.api.model.PaymentConnectorResponseTransactionVoidSucceededEventContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;


/**
 * This event logs the exact details parsed details for a succeeded void as reported by our connector.
 */
@ApiModel(description = "This event logs the exact details parsed details for a succeeded void as reported by our connector.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentConnectorResponseTransactionVoidSucceededEvent {
  /**
   * The type of this resource. Is always &#x60;transaction-event&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TRANSACTION_EVENT("transaction-event");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  /**
   * The name of this resource. Is always &#x60;payment-connector-response-transaction-void-succeeded&#x60;.
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    PAYMENT_CONNECTOR_RESPONSE_TRANSACTION_VOID_SUCCEEDED("payment-connector-response-transaction-void-succeeded");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private PaymentConnectorResponseTransactionVoidSucceededEventContext context;


  public PaymentConnectorResponseTransactionVoidSucceededEvent type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource. Is always &#x60;transaction-event&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transaction-event", value = "The type of this resource. Is always `transaction-event`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentConnectorResponseTransactionVoidSucceededEvent id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this event.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The unique identifier for this event.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public PaymentConnectorResponseTransactionVoidSucceededEvent name(NameEnum name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this resource. Is always &#x60;payment-connector-response-transaction-void-succeeded&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment-connector-response-transaction-void-succeeded", value = "The name of this resource. Is always `payment-connector-response-transaction-void-succeeded`.")

  public NameEnum getName() {
    return name;
  }


  public void setName(NameEnum name) {
    this.name = name;
  }


  public PaymentConnectorResponseTransactionVoidSucceededEvent createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this event was created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time when this event was created in our system.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PaymentConnectorResponseTransactionVoidSucceededEvent context(PaymentConnectorResponseTransactionVoidSucceededEventContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentConnectorResponseTransactionVoidSucceededEventContext getContext() {
    return context;
  }


  public void setContext(PaymentConnectorResponseTransactionVoidSucceededEventContext context) {
    this.context = context;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConnectorResponseTransactionVoidSucceededEvent paymentConnectorResponseTransactionVoidSucceededEvent = (PaymentConnectorResponseTransactionVoidSucceededEvent) o;
    return Objects.equals(this.type, paymentConnectorResponseTransactionVoidSucceededEvent.type) &&
        Objects.equals(this.id, paymentConnectorResponseTransactionVoidSucceededEvent.id) &&
        Objects.equals(this.name, paymentConnectorResponseTransactionVoidSucceededEvent.name) &&
        Objects.equals(this.createdAt, paymentConnectorResponseTransactionVoidSucceededEvent.createdAt) &&
        Objects.equals(this.context, paymentConnectorResponseTransactionVoidSucceededEvent.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, createdAt, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConnectorResponseTransactionVoidSucceededEvent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

