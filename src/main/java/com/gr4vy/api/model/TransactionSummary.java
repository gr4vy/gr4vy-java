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
import com.gr4vy.api.model.BuyerSnapshot;
import com.gr4vy.api.model.GiftCardRedemption;
import com.gr4vy.api.model.PaymentMethodSnapshot;
import com.gr4vy.api.model.PaymentServiceSnapshot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * A transaction record.
 */
@ApiModel(description = "A transaction record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionSummary {
  /**
   * The type of this resource. Is always &#x60;transaction&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TRANSACTION("transaction");

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

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_AUTHORIZED_AMOUNT = "authorized_amount";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_AMOUNT)
  private Integer authorizedAmount;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private BuyerSnapshot buyer;

  public static final String SERIALIZED_NAME_CAPTURED_AMOUNT = "captured_amount";
  @SerializedName(SERIALIZED_NAME_CAPTURED_AMOUNT)
  private Integer capturedAmount;

  public static final String SERIALIZED_NAME_CHECKOUT_SESSION_ID = "checkout_session_id";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_SESSION_ID)
  private UUID checkoutSessionId;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_GIFT_CARD_REDEMPTIONS = "gift_card_redemptions";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_REDEMPTIONS)
  private List<GiftCardRedemption> giftCardRedemptions = null;

  /**
   * The name of the instrument used to process the transaction. 
   */
  @JsonAdapter(InstrumentTypeEnum.Adapter.class)
  public enum InstrumentTypeEnum {
    APPLEPAY("applepay"),
    
    CARD_TOKEN("card_token"),
    
    GOOGLEPAY("googlepay"),
    
    NETWORK_TOKEN("network_token"),
    
    PAN("pan"),
    
    REDIRECT("redirect"),
    
    REDIRECT_TOKEN("redirect_token");

    private String value;

    InstrumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstrumentTypeEnum fromValue(String value) {
      for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InstrumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstrumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstrumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstrumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrument_type";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private InstrumentTypeEnum instrumentType;

  /**
   * The original &#x60;intent&#x60; used when the transaction was [created](#operation/authorize-new-transaction).
   */
  @JsonAdapter(IntentEnum.Adapter.class)
  public enum IntentEnum {
    AUTHORIZE("authorize"),
    
    CAPTURE("capture");

    private String value;

    IntentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntentEnum fromValue(String value) {
      for (IntentEnum b : IntentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INTENT = "intent";
  @SerializedName(SERIALIZED_NAME_INTENT)
  private IntentEnum intent;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT_ID = "merchant_account_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT_ID)
  private String merchantAccountId;

  /**
   * Gets or Sets method
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
    
    CASHAPP("cashapp"),
    
    CHASEORBITAL("chaseorbital"),
    
    CHECKOUT_SESSION("checkout-session"),
    
    CLEARPAY("clearpay"),
    
    CLICK_TO_PAY("click-to-pay"),
    
    DANA("dana"),
    
    DCB("dcb"),
    
    DLOCAL("dlocal"),
    
    EBANX("ebanx"),
    
    EFECTY("efecty"),
    
    EPS("eps"),
    
    EVERYDAYPAY("everydaypay"),
    
    GCASH("gcash"),
    
    GEM("gem"),
    
    GEMDS("gemds"),
    
    GIFT_CARD("gift-card"),
    
    GIROPAY("giropay"),
    
    GIVINGBLOCK("givingblock"),
    
    GOCARDLESS("gocardless"),
    
    GOOGLEPAY("googlepay"),
    
    GOOGLEPAY_PAN_ONLY("googlepay_pan_only"),
    
    GOPAY("gopay"),
    
    GRABPAY("grabpay"),
    
    ID("id"),
    
    IDEAL("ideal"),
    
    KAKAOPAY("kakaopay"),
    
    KCP("kcp"),
    
    KLARNA("klarna"),
    
    LATITUDE("latitude"),
    
    LATITUDEDS("latitudeds"),
    
    LAYBUY("laybuy"),
    
    LINEPAY("linepay"),
    
    LINKAJA("linkaja"),
    
    MAYBANKQRPAY("maybankqrpay"),
    
    MERCADOPAGO("mercadopago"),
    
    MULTIBANCO("multibanco"),
    
    MULTIPAGO("multipago"),
    
    NETBANKING("netbanking"),
    
    NETWORK_TOKEN("network-token"),
    
    ONEY_3X("oney_3x"),
    
    ONEY_4X("oney_4x"),
    
    ONEY_6X("oney_6x"),
    
    ONEY_10X("oney_10x"),
    
    ONEY_12X("oney_12x"),
    
    OVO("ovo"),
    
    OXXO("oxxo"),
    
    PAYID("payid"),
    
    PAYMAYA("paymaya"),
    
    PAYPAL("paypal"),
    
    PAYPALPAYLATER("paypalpaylater"),
    
    PAYTO("payto"),
    
    VENMO("venmo"),
    
    PIX("pix"),
    
    PSE("pse"),
    
    RABBITLINEPAY("rabbitlinepay"),
    
    RAZORPAY("razorpay"),
    
    SCALAPAY("scalapay"),
    
    SEPA("sepa"),
    
    SHOPEEPAY("shopeepay"),
    
    SINGTELDASH("singteldash"),
    
    SMARTPAY("smartpay"),
    
    SOFORT("sofort"),
    
    SPEI("spei"),
    
    STRIPEDD("stripedd"),
    
    THAIQR("thaiqr"),
    
    TOUCHNGO("touchngo"),
    
    TRUEMONEY("truemoney"),
    
    TRUSTLY("trustly"),
    
    TRUSTLYEUROPE("trustlyeurope"),
    
    UPI("upi"),
    
    VIPPS("vipps"),
    
    WAAVE("waave"),
    
    WEBPAY("webpay"),
    
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
      return null;
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

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethodSnapshot paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_SERVICE = "payment_service";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SERVICE)
  private PaymentServiceSnapshot paymentService;

  public static final String SERIALIZED_NAME_PENDING_REVIEW = "pending_review";
  @SerializedName(SERIALIZED_NAME_PENDING_REVIEW)
  private Boolean pendingReview;

  public static final String SERIALIZED_NAME_RAW_RESPONSE_CODE = "raw_response_code";
  @SerializedName(SERIALIZED_NAME_RAW_RESPONSE_CODE)
  private String rawResponseCode;

  public static final String SERIALIZED_NAME_RAW_RESPONSE_DESCRIPTION = "raw_response_description";
  @SerializedName(SERIALIZED_NAME_RAW_RESPONSE_DESCRIPTION)
  private String rawResponseDescription;

  public static final String SERIALIZED_NAME_RECONCILIATION_ID = "reconciliation_id";
  @SerializedName(SERIALIZED_NAME_RECONCILIATION_ID)
  private String reconciliationId;

  public static final String SERIALIZED_NAME_REFUNDED_AMOUNT = "refunded_amount";
  @SerializedName(SERIALIZED_NAME_REFUNDED_AMOUNT)
  private Integer refundedAmount;

  /**
   * The status of the transaction. The status may change over time as asynchronous processing events occur.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSING("processing"),
    
    BUYER_APPROVAL_PENDING("buyer_approval_pending"),
    
    AUTHORIZATION_SUCCEEDED("authorization_succeeded"),
    
    AUTHORIZATION_FAILED("authorization_failed"),
    
    AUTHORIZATION_DECLINED("authorization_declined"),
    
    CAPTURE_PENDING("capture_pending"),
    
    CAPTURE_SUCCEEDED("capture_succeeded"),
    
    AUTHORIZATION_VOID_PENDING("authorization_void_pending"),
    
    AUTHORIZATION_VOIDED("authorization_voided");

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

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_SETTLED_CURRENCY = "settled_currency";
  @SerializedName(SERIALIZED_NAME_SETTLED_CURRENCY)
  private String settledCurrency;

  public static final String SERIALIZED_NAME_SETTLED_AMOUNT = "settled_amount";
  @SerializedName(SERIALIZED_NAME_SETTLED_AMOUNT)
  private Integer settledAmount;

  public static final String SERIALIZED_NAME_SETTLED = "settled";
  @SerializedName(SERIALIZED_NAME_SETTLED)
  private Boolean settled;


  public TransactionSummary type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of this resource. Is always &#x60;transaction&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transaction", value = "The type of this resource. Is always `transaction`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TransactionSummary id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for this transaction.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The unique identifier for this transaction.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TransactionSummary amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The authorized amount for this transaction. This can be more than the actual captured amount and part of this amount may be refunded.
   * minimum: 0
   * maximum: 99999999
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1299", value = "The authorized amount for this transaction. This can be more than the actual captured amount and part of this amount may be refunded.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public TransactionSummary authorizedAmount(Integer authorizedAmount) {
    
    this.authorizedAmount = authorizedAmount;
    return this;
  }

   /**
   * The amount for this transaction that has been authorized for the &#x60;payment_method&#x60;. This can be less than the &#x60;amount&#x60; if gift cards were used.
   * minimum: 0
   * maximum: 99999999
   * @return authorizedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1299", value = "The amount for this transaction that has been authorized for the `payment_method`. This can be less than the `amount` if gift cards were used.")

  public Integer getAuthorizedAmount() {
    return authorizedAmount;
  }


  public void setAuthorizedAmount(Integer authorizedAmount) {
    this.authorizedAmount = authorizedAmount;
  }


  public TransactionSummary buyer(BuyerSnapshot buyer) {
    
    this.buyer = buyer;
    return this;
  }

   /**
   * The buyer used for this transaction.
   * @return buyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The buyer used for this transaction.")

  public BuyerSnapshot getBuyer() {
    return buyer;
  }


  public void setBuyer(BuyerSnapshot buyer) {
    this.buyer = buyer;
  }


  public TransactionSummary capturedAmount(Integer capturedAmount) {
    
    this.capturedAmount = capturedAmount;
    return this;
  }

   /**
   * The captured amount for this transaction. This can be the full value of the &#x60;authorized_amount&#x60; or less.
   * minimum: 0
   * maximum: 99999999
   * @return capturedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "999", value = "The captured amount for this transaction. This can be the full value of the `authorized_amount` or less.")

  public Integer getCapturedAmount() {
    return capturedAmount;
  }


  public void setCapturedAmount(Integer capturedAmount) {
    this.capturedAmount = capturedAmount;
  }


  public TransactionSummary checkoutSessionId(UUID checkoutSessionId) {
    
    this.checkoutSessionId = checkoutSessionId;
    return this;
  }

   /**
   * The identifier for the checkout session this transaction is associated with.
   * @return checkoutSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe26475d-ec3e-4884-9553-f7356683f7f9", value = "The identifier for the checkout session this transaction is associated with.")

  public UUID getCheckoutSessionId() {
    return checkoutSessionId;
  }


  public void setCheckoutSessionId(UUID checkoutSessionId) {
    this.checkoutSessionId = checkoutSessionId;
  }


  public TransactionSummary country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the country of the transaction. This is used to filter the payment services that is used to process the transaction. 
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The 2-letter ISO code of the country of the transaction. This is used to filter the payment services that is used to process the transaction. ")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public TransactionSummary createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this transaction was created in our system.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "The date and time when this transaction was created in our system.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionSummary currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency code for this transaction.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The currency code for this transaction.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionSummary externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the transaction against your own records.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "An external identifier that can be used to match the transaction against your own records.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public TransactionSummary giftCardRedemptions(List<GiftCardRedemption> giftCardRedemptions) {
    
    this.giftCardRedemptions = giftCardRedemptions;
    return this;
  }

  public TransactionSummary addGiftCardRedemptionsItem(GiftCardRedemption giftCardRedemptionsItem) {
    if (this.giftCardRedemptions == null) {
      this.giftCardRedemptions = new ArrayList<GiftCardRedemption>();
    }
    this.giftCardRedemptions.add(giftCardRedemptionsItem);
    return this;
  }

   /**
   * The gift cards redeemed for this transaction.
   * @return giftCardRedemptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The gift cards redeemed for this transaction.")

  public List<GiftCardRedemption> getGiftCardRedemptions() {
    return giftCardRedemptions;
  }


  public void setGiftCardRedemptions(List<GiftCardRedemption> giftCardRedemptions) {
    this.giftCardRedemptions = giftCardRedemptions;
  }


  public TransactionSummary instrumentType(InstrumentTypeEnum instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * The name of the instrument used to process the transaction. 
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "network_token", value = "The name of the instrument used to process the transaction. ")

  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }


  public TransactionSummary intent(IntentEnum intent) {
    
    this.intent = intent;
    return this;
  }

   /**
   * The original &#x60;intent&#x60; used when the transaction was [created](#operation/authorize-new-transaction).
   * @return intent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "authorize", value = "The original `intent` used when the transaction was [created](#operation/authorize-new-transaction).")

  public IntentEnum getIntent() {
    return intent;
  }


  public void setIntent(IntentEnum intent) {
    this.intent = intent;
  }


  public TransactionSummary merchantAccountId(String merchantAccountId) {
    
    this.merchantAccountId = merchantAccountId;
    return this;
  }

   /**
   * The ID of the merchant account to which this transaction belongs to.
   * @return merchantAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "The ID of the merchant account to which this transaction belongs to.")

  public String getMerchantAccountId() {
    return merchantAccountId;
  }


  public void setMerchantAccountId(String merchantAccountId) {
    this.merchantAccountId = merchantAccountId;
  }


  public TransactionSummary method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card", value = "")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TransactionSummary paymentMethod(PaymentMethodSnapshot paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method used for this transaction.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment method used for this transaction.")

  public PaymentMethodSnapshot getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodSnapshot paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public TransactionSummary paymentService(PaymentServiceSnapshot paymentService) {
    
    this.paymentService = paymentService;
    return this;
  }

   /**
   * The payment service used for this transaction.
   * @return paymentService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment service used for this transaction.")

  public PaymentServiceSnapshot getPaymentService() {
    return paymentService;
  }


  public void setPaymentService(PaymentServiceSnapshot paymentService) {
    this.paymentService = paymentService;
  }


  public TransactionSummary pendingReview(Boolean pendingReview) {
    
    this.pendingReview = pendingReview;
    return this;
  }

   /**
   * Whether a manual review is pending.
   * @return pendingReview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether a manual review is pending.")

  public Boolean getPendingReview() {
    return pendingReview;
  }


  public void setPendingReview(Boolean pendingReview) {
    this.pendingReview = pendingReview;
  }


  public TransactionSummary rawResponseCode(String rawResponseCode) {
    
    this.rawResponseCode = rawResponseCode;
    return this;
  }

   /**
   * This is the response code received from the payment service. This can be set to any value and is not standardized across different payment services.
   * @return rawResponseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "incorrect-zip", value = "This is the response code received from the payment service. This can be set to any value and is not standardized across different payment services.")

  public String getRawResponseCode() {
    return rawResponseCode;
  }


  public void setRawResponseCode(String rawResponseCode) {
    this.rawResponseCode = rawResponseCode;
  }


  public TransactionSummary rawResponseDescription(String rawResponseDescription) {
    
    this.rawResponseDescription = rawResponseDescription;
    return this;
  }

   /**
   * This is the response description received from the payment service. This can be set to any value and is not standardized across different payment services.
   * @return rawResponseDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The card's postal code is incorrect. Check the card's postal code or use a different card.", value = "This is the response description received from the payment service. This can be set to any value and is not standardized across different payment services.")

  public String getRawResponseDescription() {
    return rawResponseDescription;
  }


  public void setRawResponseDescription(String rawResponseDescription) {
    this.rawResponseDescription = rawResponseDescription;
  }


  public TransactionSummary reconciliationId(String reconciliationId) {
    
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * The base62 encoded transaction ID. This represents a shorter version of this transaction&#39;s &#x60;id&#x60; which is sent to payment services, anti-fraud services, and other connectors. You can use this ID to reconcile a payment service&#39;s transaction against our system.  This ID is sent instead of the transaction ID because not all services support 36 digit identifiers.
   * @return reconciliationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7jZXl4gBUNl0CnaLEnfXbt", value = "The base62 encoded transaction ID. This represents a shorter version of this transaction's `id` which is sent to payment services, anti-fraud services, and other connectors. You can use this ID to reconcile a payment service's transaction against our system.  This ID is sent instead of the transaction ID because not all services support 36 digit identifiers.")

  public String getReconciliationId() {
    return reconciliationId;
  }


  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }


  public TransactionSummary refundedAmount(Integer refundedAmount) {
    
    this.refundedAmount = refundedAmount;
    return this;
  }

   /**
   * The refunded amount for this transaction. This can be the full value of the &#x60;captured_amount&#x60; or less.
   * minimum: 0
   * maximum: 99999999
   * @return refundedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The refunded amount for this transaction. This can be the full value of the `captured_amount` or less.")

  public Integer getRefundedAmount() {
    return refundedAmount;
  }


  public void setRefundedAmount(Integer refundedAmount) {
    this.refundedAmount = refundedAmount;
  }


  public TransactionSummary status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the transaction. The status may change over time as asynchronous processing events occur.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "processing", value = "The status of the transaction. The status may change over time as asynchronous processing events occur.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TransactionSummary updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Defines when the transaction was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-07-16T19:23Z", value = "Defines when the transaction was last updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TransactionSummary settledCurrency(String settledCurrency) {
    
    this.settledCurrency = settledCurrency;
    return this;
  }

   /**
   * The currency of this transaction&#39;s settlement in ISO 4217 three-letter code format.
   * @return settledCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GBP", value = "The currency of this transaction's settlement in ISO 4217 three-letter code format.")

  public String getSettledCurrency() {
    return settledCurrency;
  }


  public void setSettledCurrency(String settledCurrency) {
    this.settledCurrency = settledCurrency;
  }


  public TransactionSummary settledAmount(Integer settledAmount) {
    
    this.settledAmount = settledAmount;
    return this;
  }

   /**
   * The net amount settled for this transaction.
   * @return settledAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The net amount settled for this transaction.")

  public Integer getSettledAmount() {
    return settledAmount;
  }


  public void setSettledAmount(Integer settledAmount) {
    this.settledAmount = settledAmount;
  }


  public TransactionSummary settled(Boolean settled) {
    
    this.settled = settled;
    return this;
  }

   /**
   * Indicates whether this transaction has been settled.
   * @return settled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether this transaction has been settled.")

  public Boolean getSettled() {
    return settled;
  }


  public void setSettled(Boolean settled) {
    this.settled = settled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSummary transactionSummary = (TransactionSummary) o;
    return Objects.equals(this.type, transactionSummary.type) &&
        Objects.equals(this.id, transactionSummary.id) &&
        Objects.equals(this.amount, transactionSummary.amount) &&
        Objects.equals(this.authorizedAmount, transactionSummary.authorizedAmount) &&
        Objects.equals(this.buyer, transactionSummary.buyer) &&
        Objects.equals(this.capturedAmount, transactionSummary.capturedAmount) &&
        Objects.equals(this.checkoutSessionId, transactionSummary.checkoutSessionId) &&
        Objects.equals(this.country, transactionSummary.country) &&
        Objects.equals(this.createdAt, transactionSummary.createdAt) &&
        Objects.equals(this.currency, transactionSummary.currency) &&
        Objects.equals(this.externalIdentifier, transactionSummary.externalIdentifier) &&
        Objects.equals(this.giftCardRedemptions, transactionSummary.giftCardRedemptions) &&
        Objects.equals(this.instrumentType, transactionSummary.instrumentType) &&
        Objects.equals(this.intent, transactionSummary.intent) &&
        Objects.equals(this.merchantAccountId, transactionSummary.merchantAccountId) &&
        Objects.equals(this.method, transactionSummary.method) &&
        Objects.equals(this.paymentMethod, transactionSummary.paymentMethod) &&
        Objects.equals(this.paymentService, transactionSummary.paymentService) &&
        Objects.equals(this.pendingReview, transactionSummary.pendingReview) &&
        Objects.equals(this.rawResponseCode, transactionSummary.rawResponseCode) &&
        Objects.equals(this.rawResponseDescription, transactionSummary.rawResponseDescription) &&
        Objects.equals(this.reconciliationId, transactionSummary.reconciliationId) &&
        Objects.equals(this.refundedAmount, transactionSummary.refundedAmount) &&
        Objects.equals(this.status, transactionSummary.status) &&
        Objects.equals(this.updatedAt, transactionSummary.updatedAt) &&
        Objects.equals(this.settledCurrency, transactionSummary.settledCurrency) &&
        Objects.equals(this.settledAmount, transactionSummary.settledAmount) &&
        Objects.equals(this.settled, transactionSummary.settled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, amount, authorizedAmount, buyer, capturedAmount, checkoutSessionId, country, createdAt, currency, externalIdentifier, giftCardRedemptions, instrumentType, intent, merchantAccountId, method, paymentMethod, paymentService, pendingReview, rawResponseCode, rawResponseDescription, reconciliationId, refundedAmount, status, updatedAt, settledCurrency, settledAmount, settled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSummary {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    authorizedAmount: ").append(toIndentedString(authorizedAmount)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    capturedAmount: ").append(toIndentedString(capturedAmount)).append("\n");
    sb.append("    checkoutSessionId: ").append(toIndentedString(checkoutSessionId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    giftCardRedemptions: ").append(toIndentedString(giftCardRedemptions)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    merchantAccountId: ").append(toIndentedString(merchantAccountId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentService: ").append(toIndentedString(paymentService)).append("\n");
    sb.append("    pendingReview: ").append(toIndentedString(pendingReview)).append("\n");
    sb.append("    rawResponseCode: ").append(toIndentedString(rawResponseCode)).append("\n");
    sb.append("    rawResponseDescription: ").append(toIndentedString(rawResponseDescription)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    settledCurrency: ").append(toIndentedString(settledCurrency)).append("\n");
    sb.append("    settledAmount: ").append(toIndentedString(settledAmount)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
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

