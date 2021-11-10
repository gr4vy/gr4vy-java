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
import com.gr4vy.api.model.PaymentServiceSnapshot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A token for a payment method.
 */
@ApiModel(description = "A token for a payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T11:15:12.826734Z[Etc/UTC]")
public class PaymentMethodToken {
  /**
   * &#x60;payment-method-token&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYMENT_METHOD_TOKEN("payment-method-token");

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
  private String id;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE = "payment_service";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE)
  private PaymentServiceSnapshot paymentService;


  public PaymentMethodToken type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;payment-method-token&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment-method-token", value = "`payment-method-token`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentMethodToken id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The external ID of this payment method as it has been registered with the payment service, which can be used directly in combination with the &#x60;token&#x60; without the need to go through Gr4vy for a transaction.  In some cases this is a different value to the &#x60;token&#x60; while in others this value is identical. Please see the documentation for the payment service for more details.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cus_4QEiU0VT5E3Whi", value = "The external ID of this payment method as it has been registered with the payment service, which can be used directly in combination with the `token` without the need to go through Gr4vy for a transaction.  In some cases this is a different value to the `token` while in others this value is identical. Please see the documentation for the payment service for more details.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PaymentMethodToken token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The token of this payment method as it has been registered with the payment service, which can be used directly in combination with the &#x60;id&#x60; without the need to go through Gr4vy for a transaction.  In some cases this is a different value to the &#x60;id&#x60; while in others this value is identical. Please see the documentation for the payment service for more details.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tok_1JCNiQ2eZvKYlo2CpvA4ODiD", value = "The token of this payment method as it has been registered with the payment service, which can be used directly in combination with the `id` without the need to go through Gr4vy for a transaction.  In some cases this is a different value to the `id` while in others this value is identical. Please see the documentation for the payment service for more details.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public PaymentMethodToken paymentService(PaymentServiceSnapshot paymentService) {
    
    this.paymentService = paymentService;
    return this;
  }

   /**
   * Get paymentService
   * @return paymentService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentServiceSnapshot getPaymentService() {
    return paymentService;
  }


  public void setPaymentService(PaymentServiceSnapshot paymentService) {
    this.paymentService = paymentService;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodToken paymentMethodToken = (PaymentMethodToken) o;
    return Objects.equals(this.type, paymentMethodToken.type) &&
        Objects.equals(this.id, paymentMethodToken.id) &&
        Objects.equals(this.token, paymentMethodToken.token) &&
        Objects.equals(this.paymentService, paymentMethodToken.paymentService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, token, paymentService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodToken {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    paymentService: ").append(toIndentedString(paymentService)).append("\n");
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

