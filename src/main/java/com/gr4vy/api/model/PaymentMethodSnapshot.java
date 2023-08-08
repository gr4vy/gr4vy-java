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
import com.gr4vy.api.model.PaymentMethodDetailsCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * Snapshot of a payment method, as used when embedded inside other resources.
 */
@ApiModel(description = "Snapshot of a payment method, as used when embedded inside other resources.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class PaymentMethodSnapshot {
  /**
   * &#x60;payment-method&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYMENT_METHOD("payment-method");

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
   * The type of this payment method.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    AFTERPAY("afterpay"),
    
    APPLEPAY("applepay"),
    
    BANKED("banked"),
    
    BITPAY("bitpay"),
    
    BOLETO("boleto"),
    
    CARD("card"),
    
    CLEARPAY("clearpay"),
    
    DANA("dana"),
    
    FORTUMO("fortumo"),
    
    GCASH("gcash"),
    
    GOCARDLESS("gocardless"),
    
    GOOGLEPAY("googlepay"),
    
    GRABPAY("grabpay"),
    
    KLARNA("klarna"),
    
    OVO("ovo"),
    
    PAYMAYA("paymaya"),
    
    PAYPAL("paypal"),
    
    PIX("pix"),
    
    RABBITLINEPAY("rabbitlinepay"),
    
    SCALAPAY("scalapay"),
    
    SHOPEEPAY("shopeepay"),
    
    STRIPEDD("stripedd"),
    
    TRUEMONEY("truemoney"),
    
    TRUSTLY("trustly"),
    
    ZIPPAY("zippay");

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

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  /**
   * The browser target that an approval URL must be opened in. If &#x60;any&#x60; or &#x60;null&#x60;, then there is no specific requirement.
   */
  @JsonAdapter(ApprovalTargetEnum.Adapter.class)
  public enum ApprovalTargetEnum {
    ANY("any"),
    
    NEW_WINDOW("new_window");

    private String value;

    ApprovalTargetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApprovalTargetEnum fromValue(String value) {
      for (ApprovalTargetEnum b : ApprovalTargetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApprovalTargetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApprovalTargetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApprovalTargetEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApprovalTargetEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPROVAL_TARGET = "approval_target";
  @SerializedName(SERIALIZED_NAME_APPROVAL_TARGET)
  private ApprovalTargetEnum approvalTarget;

  public static final String SERIALIZED_NAME_APPROVAL_URL = "approval_url";
  @SerializedName(SERIALIZED_NAME_APPROVAL_URL)
  private String approvalUrl;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private PaymentMethodDetailsCard details;


  public PaymentMethodSnapshot type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;payment-method&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payment-method", value = "`payment-method`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentMethodSnapshot id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the payment method.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "77a76f7e-d2de-4bbc-ada9-d6a0015e6bd5", value = "The unique ID of the payment method.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public PaymentMethodSnapshot method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The type of this payment method.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "The type of this payment method.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public PaymentMethodSnapshot externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the payment method against your own records.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "An external identifier that can be used to match the payment method against your own records.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public PaymentMethodSnapshot label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * A label for the payment method. This can be the last 4 digits for a card, or the email address for an alternative payment method.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1111", value = "A label for the payment method. This can be the last 4 digits for a card, or the email address for an alternative payment method.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public PaymentMethodSnapshot scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * An additional label used to differentiate different sub-types of a payment method. Most notably this can include the type of card used in a transaction.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "visa", value = "An additional label used to differentiate different sub-types of a payment method. Most notably this can include the type of card used in a transaction.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public PaymentMethodSnapshot expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date for this payment method. This is mostly used by cards where the card might have an expiration date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11/25", value = "The expiration date for this payment method. This is mostly used by cards where the card might have an expiration date.")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PaymentMethodSnapshot approvalTarget(ApprovalTargetEnum approvalTarget) {
    
    this.approvalTarget = approvalTarget;
    return this;
  }

   /**
   * The browser target that an approval URL must be opened in. If &#x60;any&#x60; or &#x60;null&#x60;, then there is no specific requirement.
   * @return approvalTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "any", value = "The browser target that an approval URL must be opened in. If `any` or `null`, then there is no specific requirement.")

  public ApprovalTargetEnum getApprovalTarget() {
    return approvalTarget;
  }


  public void setApprovalTarget(ApprovalTargetEnum approvalTarget) {
    this.approvalTarget = approvalTarget;
  }


  public PaymentMethodSnapshot approvalUrl(String approvalUrl) {
    
    this.approvalUrl = approvalUrl;
    return this;
  }

   /**
   * The optional URL that the buyer needs to be redirected to to further authorize their payment.
   * @return approvalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.example.app.gr4vy.com/payment-methods/ffc88ec9-e1ee-45ba-993d-b5902c3b2a8c/approve", value = "The optional URL that the buyer needs to be redirected to to further authorize their payment.")

  public String getApprovalUrl() {
    return approvalUrl;
  }


  public void setApprovalUrl(String approvalUrl) {
    this.approvalUrl = approvalUrl;
  }


  public PaymentMethodSnapshot currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code that this payment method can be used for. If this value is &#x60;null&#x60; the payment method may be used for multiple currencies.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The ISO-4217 currency code that this payment method can be used for. If this value is `null` the payment method may be used for multiple currencies.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PaymentMethodSnapshot country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the country this payment method can be used for. If this value is &#x60;null&#x60; the payment method may be used in multiple countries.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The 2-letter ISO code of the country this payment method can be used for. If this value is `null` the payment method may be used in multiple countries.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PaymentMethodSnapshot details(PaymentMethodDetailsCard details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentMethodDetailsCard getDetails() {
    return details;
  }


  public void setDetails(PaymentMethodDetailsCard details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodSnapshot paymentMethodSnapshot = (PaymentMethodSnapshot) o;
    return Objects.equals(this.type, paymentMethodSnapshot.type) &&
        Objects.equals(this.id, paymentMethodSnapshot.id) &&
        Objects.equals(this.method, paymentMethodSnapshot.method) &&
        Objects.equals(this.externalIdentifier, paymentMethodSnapshot.externalIdentifier) &&
        Objects.equals(this.label, paymentMethodSnapshot.label) &&
        Objects.equals(this.scheme, paymentMethodSnapshot.scheme) &&
        Objects.equals(this.expirationDate, paymentMethodSnapshot.expirationDate) &&
        Objects.equals(this.approvalTarget, paymentMethodSnapshot.approvalTarget) &&
        Objects.equals(this.approvalUrl, paymentMethodSnapshot.approvalUrl) &&
        Objects.equals(this.currency, paymentMethodSnapshot.currency) &&
        Objects.equals(this.country, paymentMethodSnapshot.country) &&
        Objects.equals(this.details, paymentMethodSnapshot.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, method, externalIdentifier, label, scheme, expirationDate, approvalTarget, approvalUrl, currency, country, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodSnapshot {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    approvalTarget: ").append(toIndentedString(approvalTarget)).append("\n");
    sb.append("    approvalUrl: ").append(toIndentedString(approvalUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

