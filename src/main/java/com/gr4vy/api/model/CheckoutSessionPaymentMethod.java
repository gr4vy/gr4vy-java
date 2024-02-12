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
import com.gr4vy.api.model.CheckoutSessionPaymentMethodDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about the payment method for card type only.
 */
@ApiModel(description = "Details about the payment method for card type only.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckoutSessionPaymentMethod {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Payment method type.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    CARD("card");

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

  /**
   * The scheme/brand of the card.
   */
  @JsonAdapter(SchemeEnum.Adapter.class)
  public enum SchemeEnum {
    ACCEL("accel"),
    
    AMEX("amex"),
    
    BANCONTACT("bancontact"),
    
    CARTE_BANCAIRE("carte-bancaire"),
    
    CIRRUS("cirrus"),
    
    CULIANCE("culiance"),
    
    DANKORT("dankort"),
    
    DINERS_CLUB("diners-club"),
    
    DISCOVER("discover"),
    
    EFTPOS_AUSTRALIA("eftpos-australia"),
    
    ELO("elo"),
    
    HIPERCARD("hipercard"),
    
    JCB("jcb"),
    
    MAESTRO("maestro"),
    
    MASTERCARD("mastercard"),
    
    NYCE("nyce"),
    
    OTHER("other"),
    
    PULSE("pulse"),
    
    RUPAY("rupay"),
    
    STAR("star"),
    
    UNIONPAY("unionpay"),
    
    VISA("visa");

    private String value;

    SchemeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SchemeEnum fromValue(String value) {
      for (SchemeEnum b : SchemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SchemeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SchemeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SchemeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SchemeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private SchemeEnum scheme;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private CheckoutSessionPaymentMethodDetails details;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;


  public CheckoutSessionPaymentMethod type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment_method", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CheckoutSessionPaymentMethod id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for the payment method.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID for the payment method.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CheckoutSessionPaymentMethod method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Payment method type.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "Payment method type.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public CheckoutSessionPaymentMethod scheme(SchemeEnum scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * The scheme/brand of the card.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "visa", value = "The scheme/brand of the card.")

  public SchemeEnum getScheme() {
    return scheme;
  }


  public void setScheme(SchemeEnum scheme) {
    this.scheme = scheme;
  }


  public CheckoutSessionPaymentMethod label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Last four digits of PAN.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4242", value = "Last four digits of PAN.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public CheckoutSessionPaymentMethod details(CheckoutSessionPaymentMethodDetails details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CheckoutSessionPaymentMethodDetails getDetails() {
    return details;
  }


  public void setDetails(CheckoutSessionPaymentMethodDetails details) {
    this.details = details;
  }


  public CheckoutSessionPaymentMethod fingerprint(String fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * The unique hash derived from the payment method identifier (e.g. card number).
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20eb353620155d2b5fc864cc46a73ea77cb92c725238650839da1813fa987a17", value = "The unique hash derived from the payment method identifier (e.g. card number).")

  public String getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutSessionPaymentMethod checkoutSessionPaymentMethod = (CheckoutSessionPaymentMethod) o;
    return Objects.equals(this.type, checkoutSessionPaymentMethod.type) &&
        Objects.equals(this.id, checkoutSessionPaymentMethod.id) &&
        Objects.equals(this.method, checkoutSessionPaymentMethod.method) &&
        Objects.equals(this.scheme, checkoutSessionPaymentMethod.scheme) &&
        Objects.equals(this.label, checkoutSessionPaymentMethod.label) &&
        Objects.equals(this.details, checkoutSessionPaymentMethod.details) &&
        Objects.equals(this.fingerprint, checkoutSessionPaymentMethod.fingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, method, scheme, label, details, fingerprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutSessionPaymentMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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

