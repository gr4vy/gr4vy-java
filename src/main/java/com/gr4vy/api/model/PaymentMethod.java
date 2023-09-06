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
import com.gr4vy.api.model.Buyer;
import com.gr4vy.api.model.PaymentMethodDetailsCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;


/**
 * A generic payment method.
 */
@ApiModel(description = "A generic payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T16:38:13.632050Z[Etc/UTC]")
public class PaymentMethod {
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

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT_ID = "merchant_account_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT_ID)
  private String merchantAccountId;

  /**
   * The state of the payment method.  - &#x60;processing&#x60; - The payment method is still being stored. - &#x60;buyer_approval_required&#x60; - Storing the payment method requires   the buyer to provide approval. Follow the &#x60;approval_url&#x60; for next steps. - &#x60;succeeded&#x60; - The payment method is approved and stored with all   relevant payment services. - &#x60;failed&#x60; - Storing the payment method did not succeed.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSING("processing"),
    
    BUYER_APPROVAL_REQUIRED("buyer_approval_required"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

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

  /**
   * The mode to use with this payment method.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    CARD("card"),
    
    REDIRECT("redirect"),
    
    APPLEPAY("applepay"),
    
    GOOGLEPAY("googlepay");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private Buyer buyer;

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

  public static final String SERIALIZED_NAME_LAST_REPLACED_AT = "last_replaced_at";
  @SerializedName(SERIALIZED_NAME_LAST_REPLACED_AT)
  private String lastReplacedAt;

  public static final String SERIALIZED_NAME_HAS_REPLACEMENT = "has_replacement";
  @SerializedName(SERIALIZED_NAME_HAS_REPLACEMENT)
  private Boolean hasReplacement;


  public PaymentMethod type(TypeEnum type) {
    
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


  public PaymentMethod id(UUID id) {
    
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


  public PaymentMethod merchantAccountId(String merchantAccountId) {
    
    this.merchantAccountId = merchantAccountId;
    return this;
  }

   /**
   * The unique ID for a merchant account.
   * @return merchantAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "The unique ID for a merchant account.")

  public String getMerchantAccountId() {
    return merchantAccountId;
  }


  public void setMerchantAccountId(String merchantAccountId) {
    this.merchantAccountId = merchantAccountId;
  }


  public PaymentMethod status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The state of the payment method.  - &#x60;processing&#x60; - The payment method is still being stored. - &#x60;buyer_approval_required&#x60; - Storing the payment method requires   the buyer to provide approval. Follow the &#x60;approval_url&#x60; for next steps. - &#x60;succeeded&#x60; - The payment method is approved and stored with all   relevant payment services. - &#x60;failed&#x60; - Storing the payment method did not succeed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "succeeded", value = "The state of the payment method.  - `processing` - The payment method is still being stored. - `buyer_approval_required` - Storing the payment method requires   the buyer to provide approval. Follow the `approval_url` for next steps. - `succeeded` - The payment method is approved and stored with all   relevant payment services. - `failed` - Storing the payment method did not succeed.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PaymentMethod method(MethodEnum method) {
    
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


  public PaymentMethod mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * The mode to use with this payment method.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "The mode to use with this payment method.")

  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public PaymentMethod createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this payment method was first created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time when this payment method was first created in our system.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PaymentMethod updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time when this payment method was last updated in our system.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time when this payment method was last updated in our system.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PaymentMethod externalIdentifier(String externalIdentifier) {
    
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


  public PaymentMethod buyer(Buyer buyer) {
    
    this.buyer = buyer;
    return this;
  }

   /**
   * The optional buyer for which this payment method has been stored.
   * @return buyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The optional buyer for which this payment method has been stored.")

  public Buyer getBuyer() {
    return buyer;
  }


  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }


  public PaymentMethod label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * A label for the card or the account. For a &#x60;paypal&#x60; payment method this is the user&#39;s email address. For a card it is the last 4 digits of the card.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john@example.com", value = "A label for the card or the account. For a `paypal` payment method this is the user's email address. For a card it is the last 4 digits of the card.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public PaymentMethod scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * The scheme of the card. Only applies to card payments.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "visa", value = "The scheme of the card. Only applies to card payments.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public PaymentMethod expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date for the payment method.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "07/24", value = "The expiration date for the payment method.")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PaymentMethod approvalTarget(ApprovalTargetEnum approvalTarget) {
    
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


  public PaymentMethod approvalUrl(String approvalUrl) {
    
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


  public PaymentMethod currency(String currency) {
    
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


  public PaymentMethod country(String country) {
    
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


  public PaymentMethod details(PaymentMethodDetailsCard details) {
    
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


  public PaymentMethod lastReplacedAt(String lastReplacedAt) {
    
    this.lastReplacedAt = lastReplacedAt;
    return this;
  }

   /**
   * The date and time when this card was last replaced.  When the Account Updater determines that new card details are available (e.g. when it&#39;s about to expire), existing details are not changed immediately. The actual replacement occurs when a transaction using this payment method is declined with any of the following codes:  * &#x60;canceled_payment_method&#x60; * &#x60;expired_payment_method&#x60; * &#x60;unavailable_payment_method&#x60; * &#x60;unknown_payment_method&#x60;  When the replacement is applied, this field is updated. For non-card payment methods, the value of this field is always set to &#x60;null&#x60;.
   * @return lastReplacedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-07-26T19:23Z", value = "The date and time when this card was last replaced.  When the Account Updater determines that new card details are available (e.g. when it's about to expire), existing details are not changed immediately. The actual replacement occurs when a transaction using this payment method is declined with any of the following codes:  * `canceled_payment_method` * `expired_payment_method` * `unavailable_payment_method` * `unknown_payment_method`  When the replacement is applied, this field is updated. For non-card payment methods, the value of this field is always set to `null`.")

  public String getLastReplacedAt() {
    return lastReplacedAt;
  }


  public void setLastReplacedAt(String lastReplacedAt) {
    this.lastReplacedAt = lastReplacedAt;
  }


  public PaymentMethod hasReplacement(Boolean hasReplacement) {
    
    this.hasReplacement = hasReplacement;
    return this;
  }

   /**
   * Whether this card has a pending replacement that hasn&#39;t been applied yet.  When the Account Updater determines that new card details are available (e.g. when it&#39;s about to expire), existing details are not changed immediately, but this field is set to &#x60;true&#x60;. The actual replacement occurs when a transaction using this payment method is declined with any of the following codes:  * &#x60;canceled_payment_method&#x60; * &#x60;expired_payment_method&#x60; * &#x60;unavailable_payment_method&#x60; * &#x60;unknown_payment_method&#x60;  When the replacement is applied, this field is set to &#x60;false&#x60;. For non-card payment methods, the value of this field is always set to &#x60;false&#x60;.
   * @return hasReplacement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether this card has a pending replacement that hasn't been applied yet.  When the Account Updater determines that new card details are available (e.g. when it's about to expire), existing details are not changed immediately, but this field is set to `true`. The actual replacement occurs when a transaction using this payment method is declined with any of the following codes:  * `canceled_payment_method` * `expired_payment_method` * `unavailable_payment_method` * `unknown_payment_method`  When the replacement is applied, this field is set to `false`. For non-card payment methods, the value of this field is always set to `false`.")

  public Boolean getHasReplacement() {
    return hasReplacement;
  }


  public void setHasReplacement(Boolean hasReplacement) {
    this.hasReplacement = hasReplacement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.type, paymentMethod.type) &&
        Objects.equals(this.id, paymentMethod.id) &&
        Objects.equals(this.merchantAccountId, paymentMethod.merchantAccountId) &&
        Objects.equals(this.status, paymentMethod.status) &&
        Objects.equals(this.method, paymentMethod.method) &&
        Objects.equals(this.mode, paymentMethod.mode) &&
        Objects.equals(this.createdAt, paymentMethod.createdAt) &&
        Objects.equals(this.updatedAt, paymentMethod.updatedAt) &&
        Objects.equals(this.externalIdentifier, paymentMethod.externalIdentifier) &&
        Objects.equals(this.buyer, paymentMethod.buyer) &&
        Objects.equals(this.label, paymentMethod.label) &&
        Objects.equals(this.scheme, paymentMethod.scheme) &&
        Objects.equals(this.expirationDate, paymentMethod.expirationDate) &&
        Objects.equals(this.approvalTarget, paymentMethod.approvalTarget) &&
        Objects.equals(this.approvalUrl, paymentMethod.approvalUrl) &&
        Objects.equals(this.currency, paymentMethod.currency) &&
        Objects.equals(this.country, paymentMethod.country) &&
        Objects.equals(this.details, paymentMethod.details) &&
        Objects.equals(this.lastReplacedAt, paymentMethod.lastReplacedAt) &&
        Objects.equals(this.hasReplacement, paymentMethod.hasReplacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, merchantAccountId, status, method, mode, createdAt, updatedAt, externalIdentifier, buyer, label, scheme, expirationDate, approvalTarget, approvalUrl, currency, country, details, lastReplacedAt, hasReplacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantAccountId: ").append(toIndentedString(merchantAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    approvalTarget: ").append(toIndentedString(approvalTarget)).append("\n");
    sb.append("    approvalUrl: ").append(toIndentedString(approvalUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    lastReplacedAt: ").append(toIndentedString(lastReplacedAt)).append("\n");
    sb.append("    hasReplacement: ").append(toIndentedString(hasReplacement)).append("\n");
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

