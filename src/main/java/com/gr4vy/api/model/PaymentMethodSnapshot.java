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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private PaymentMethodDetailsCard details;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_LAST_REPLACED_AT = "last_replaced_at";
  @SerializedName(SERIALIZED_NAME_LAST_REPLACED_AT)
  private String lastReplacedAt;

  /**
   * The type of this payment method.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    AFTERPAY("afterpay"),
    
    ALIPAY("alipay"),
    
    ALIPAYHK("alipayhk"),
    
    APPLEPAY("applepay"),
    
    BACS("bacs"),
    
    BANCONTACT("bancontact"),
    
    BANKED("banked"),
    
    BECS("becs"),
    
    BITPAY("bitpay"),
    
    BOLETO("boleto"),
    
    BOOST("boost"),
    
    CARD("card"),
    
    CHECKOUT_SESSION("checkout-session"),
    
    CLICK_TO_PAY("click-to-pay"),
    
    CLEARPAY("clearpay"),
    
    DANA("dana"),
    
    DCB("dcb"),
    
    EPS("eps"),
    
    FORTUMO("fortumo"),
    
    GCASH("gcash"),
    
    GIROPAY("giropay"),
    
    GOCARDLESS("gocardless"),
    
    GOOGLEPAY("googlepay"),
    
    GOPAY("gopay"),
    
    GRABPAY("grabpay"),
    
    IDEAL("ideal"),
    
    ID("id"),
    
    KAKAOPAY("kakaopay"),
    
    KLARNA("klarna"),
    
    LAYBUY("laybuy"),
    
    LINEPAY("linepay"),
    
    LINKAJA("linkaja"),
    
    MAYBANKQRPAY("maybankqrpay"),
    
    MULTIBANCO("multibanco"),
    
    ONEY_3X("oney_3x"),
    
    ONEY_4X("oney_4x"),
    
    ONEY_6X("oney_6x"),
    
    ONEY_10X("oney_10x"),
    
    ONEY_12X("oney_12x"),
    
    OVO("ovo"),
    
    OXXO("oxxo"),
    
    PAYMAYA("paymaya"),
    
    PAYPAL("paypal"),
    
    PAYPALPAYLATER("paypalpaylater"),
    
    PIX("pix"),
    
    RABBITLINEPAY("rabbitlinepay"),
    
    RAZORPAY("razorpay"),
    
    SCALAPAY("scalapay"),
    
    SEPA("sepa"),
    
    SHOPEEPAY("shopeepay"),
    
    SINGTELDASH("singteldash"),
    
    SOFORT("sofort"),
    
    STRIPEDD("stripedd"),
    
    THAIQR("thaiqr"),
    
    TOUCHNGO("touchngo"),
    
    TRUEMONEY("truemoney"),
    
    TRUSTLY("trustly"),
    
    VENMO("venmo"),
    
    WAAVE("waave"),
    
    WECHAT("wechat"),
    
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

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_REFERENCE = "payment_account_reference";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_REFERENCE)
  private String paymentAccountReference;

  /**
   * An additional label used to differentiate different sub-types of a payment method. Most notably this can include the type of card used in a transaction.
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


  public PaymentMethodSnapshot lastReplacedAt(String lastReplacedAt) {
    
    this.lastReplacedAt = lastReplacedAt;
    return this;
  }

   /**
   * The date and time when this card was last replaced.  When the Account Updater determines that new card details are available, existing details are not changed immediately. There are three scenarios in which the actual replacement occurs:  1. When this card has expired. 2. When only the expiration date changed. 3. When a transaction using this card is declined with any of the following codes:     * &#x60;canceled_payment_method&#x60;     * &#x60;expired_payment_method&#x60;     * &#x60;unavailable_payment_method&#x60;     * &#x60;unknown_payment_method&#x60;  When the replacement is applied, this field is updated. For non-card payment methods, the value of this field is always set to &#x60;null&#x60;.
   * @return lastReplacedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-07-26T19:23Z", value = "The date and time when this card was last replaced.  When the Account Updater determines that new card details are available, existing details are not changed immediately. There are three scenarios in which the actual replacement occurs:  1. When this card has expired. 2. When only the expiration date changed. 3. When a transaction using this card is declined with any of the following codes:     * `canceled_payment_method`     * `expired_payment_method`     * `unavailable_payment_method`     * `unknown_payment_method`  When the replacement is applied, this field is updated. For non-card payment methods, the value of this field is always set to `null`.")

  public String getLastReplacedAt() {
    return lastReplacedAt;
  }


  public void setLastReplacedAt(String lastReplacedAt) {
    this.lastReplacedAt = lastReplacedAt;
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


  public PaymentMethodSnapshot paymentAccountReference(String paymentAccountReference) {
    
    this.paymentAccountReference = paymentAccountReference;
    return this;
  }

   /**
   * The payment account reference (PAR) returned by the card scheme. This is a unique reference to the underlying account that has been used to fund this payment method. This value will be unique if the same underlying account was used, regardless of the actual payment method used. For example, a network token or an Apple Pay device token will return the same PAR when possible.  The uniqueness of this value will depend on the card scheme, please refer to their documentation for further details. The availability of the PAR in our API depends on the availability of its value in the API of the payment service used for the transaction.
   * @return paymentAccountReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "V0010014629724763377327521982", value = "The payment account reference (PAR) returned by the card scheme. This is a unique reference to the underlying account that has been used to fund this payment method. This value will be unique if the same underlying account was used, regardless of the actual payment method used. For example, a network token or an Apple Pay device token will return the same PAR when possible.  The uniqueness of this value will depend on the card scheme, please refer to their documentation for further details. The availability of the PAR in our API depends on the availability of its value in the API of the payment service used for the transaction.")

  public String getPaymentAccountReference() {
    return paymentAccountReference;
  }


  public void setPaymentAccountReference(String paymentAccountReference) {
    this.paymentAccountReference = paymentAccountReference;
  }


  public PaymentMethodSnapshot scheme(SchemeEnum scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * An additional label used to differentiate different sub-types of a payment method. Most notably this can include the type of card used in a transaction.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "visa", value = "An additional label used to differentiate different sub-types of a payment method. Most notably this can include the type of card used in a transaction.")

  public SchemeEnum getScheme() {
    return scheme;
  }


  public void setScheme(SchemeEnum scheme) {
    this.scheme = scheme;
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
        Objects.equals(this.approvalTarget, paymentMethodSnapshot.approvalTarget) &&
        Objects.equals(this.approvalUrl, paymentMethodSnapshot.approvalUrl) &&
        Objects.equals(this.country, paymentMethodSnapshot.country) &&
        Objects.equals(this.currency, paymentMethodSnapshot.currency) &&
        Objects.equals(this.details, paymentMethodSnapshot.details) &&
        Objects.equals(this.expirationDate, paymentMethodSnapshot.expirationDate) &&
        Objects.equals(this.externalIdentifier, paymentMethodSnapshot.externalIdentifier) &&
        Objects.equals(this.label, paymentMethodSnapshot.label) &&
        Objects.equals(this.lastReplacedAt, paymentMethodSnapshot.lastReplacedAt) &&
        Objects.equals(this.method, paymentMethodSnapshot.method) &&
        Objects.equals(this.paymentAccountReference, paymentMethodSnapshot.paymentAccountReference) &&
        Objects.equals(this.scheme, paymentMethodSnapshot.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, approvalTarget, approvalUrl, country, currency, details, expirationDate, externalIdentifier, label, lastReplacedAt, method, paymentAccountReference, scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodSnapshot {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    approvalTarget: ").append(toIndentedString(approvalTarget)).append("\n");
    sb.append("    approvalUrl: ").append(toIndentedString(approvalUrl)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastReplacedAt: ").append(toIndentedString(lastReplacedAt)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    paymentAccountReference: ").append(toIndentedString(paymentAccountReference)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

