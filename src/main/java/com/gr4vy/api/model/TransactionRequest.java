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
import com.gr4vy.api.model.BrowserInfo;
import com.gr4vy.api.model.CartItem;
import com.gr4vy.api.model.StatementDescriptor;
import com.gr4vy.api.model.ThreeDSecureDataV1V2;
import com.gr4vy.api.model.TransactionPaymentMethodRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A request to create a transaction.
 */
@ApiModel(description = "A request to create a transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-18T21:14:21.023172Z[Etc/UTC]")
public class TransactionRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private TransactionPaymentMethodRequest paymentMethod;

  public static final String SERIALIZED_NAME_STORE = "store";
  @SerializedName(SERIALIZED_NAME_STORE)
  private Boolean store = false;

  /**
   * Defines the intent of this API call. This determines the desired initial state of the transaction.  * &#x60;authorize&#x60; - (Default) Optionally approves and then authorizes a transaction but does not capture the funds. * &#x60;capture&#x60; - Optionally approves and then authorizes and captures the funds of the transaction.
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
  private IntentEnum intent = IntentEnum.AUTHORIZE;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_THREE_D_SECURE_DATA = "three_d_secure_data";
  @SerializedName(SERIALIZED_NAME_THREE_D_SECURE_DATA)
  private ThreeDSecureDataV1V2 threeDSecureData;

  public static final String SERIALIZED_NAME_MERCHANT_INITIATED = "merchant_initiated";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INITIATED)
  private Boolean merchantInitiated = false;

  /**
   * The source of the transaction. Defaults to &#x60;ecommerce&#x60;.
   */
  @JsonAdapter(PaymentSourceEnum.Adapter.class)
  public enum PaymentSourceEnum {
    ECOMMERCE("ecommerce"),
    
    MOTO("moto"),
    
    RECURRING("recurring"),
    
    INSTALLMENT("installment"),
    
    CARD_ON_FILE("card_on_file");

    private String value;

    PaymentSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentSourceEnum fromValue(String value) {
      for (PaymentSourceEnum b : PaymentSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_SOURCE = "payment_source";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SOURCE)
  private PaymentSourceEnum paymentSource;

  public static final String SERIALIZED_NAME_IS_SUBSEQUENT_PAYMENT = "is_subsequent_payment";
  @SerializedName(SERIALIZED_NAME_IS_SUBSEQUENT_PAYMENT)
  private Boolean isSubsequentPayment = false;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_STATEMENT_DESCRIPTOR = "statement_descriptor";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DESCRIPTOR)
  private StatementDescriptor statementDescriptor;

  public static final String SERIALIZED_NAME_CART_ITEMS = "cart_items";
  @SerializedName(SERIALIZED_NAME_CART_ITEMS)
  private List<CartItem> cartItems = null;

  public static final String SERIALIZED_NAME_PREVIOUS_SCHEME_TRANSACTION_ID = "previous_scheme_transaction_id";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_SCHEME_TRANSACTION_ID)
  private String previousSchemeTransactionId = "null";

  public static final String SERIALIZED_NAME_BROWSER_INFO = "browser_info";
  @SerializedName(SERIALIZED_NAME_BROWSER_INFO)
  private BrowserInfo browserInfo;


  public TransactionRequest amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The monetary amount to create an authorization for, in the smallest currency unit for the given currency, for example &#x60;1299&#x60; cents to create an authorization for &#x60;$12.99&#x60;.  If the &#x60;intent&#x60; is set to &#x60;capture&#x60;, an amount greater than zero must be supplied.
   * minimum: 0
   * maximum: 99999999
   * @return amount
  **/
  @ApiModelProperty(example = "1299", required = true, value = "The monetary amount to create an authorization for, in the smallest currency unit for the given currency, for example `1299` cents to create an authorization for `$12.99`.  If the `intent` is set to `capture`, an amount greater than zero must be supplied.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public TransactionRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * A supported ISO-4217 currency code.  For redirect requests, this value must match the one specified for &#x60;currency&#x60; in &#x60;payment_method&#x60;. 
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "A supported ISO-4217 currency code.  For redirect requests, this value must match the one specified for `currency` in `payment_method`. ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the country of the transaction. This is used to filter the payment services that is used to process the transaction.  If this value is provided for redirect requests and it&#39;s not &#x60;null&#x60;, it must match the one specified for &#x60;country&#x60; in &#x60;payment_method&#x60;. Otherwise, the value specified for &#x60;country&#x60; in &#x60;payment_method&#x60; will be assumed implicitly. 
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The 2-letter ISO code of the country of the transaction. This is used to filter the payment services that is used to process the transaction.  If this value is provided for redirect requests and it's not `null`, it must match the one specified for `country` in `payment_method`. Otherwise, the value specified for `country` in `payment_method` will be assumed implicitly. ")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public TransactionRequest paymentMethod(TransactionPaymentMethodRequest paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionPaymentMethodRequest getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(TransactionPaymentMethodRequest paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public TransactionRequest store(Boolean store) {
    
    this.store = store;
    return this;
  }

   /**
   * Whether or not to also try and store the payment method with us so that it can be used again for future use. This is only supported for payment methods that support this feature. There are also a few restrictions on how the flag may be set:  * The flag has to be set to &#x60;true&#x60; when the &#x60;payment_source&#x60; is set to &#x60;recurring&#x60; or &#x60;installment&#x60;, and &#x60;merchant_initiated&#x60; is set to &#x60;false&#x60;.  * The flag has to be set to &#x60;false&#x60; (or not set) when using a previously tokenized payment method.
   * @return store
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not to also try and store the payment method with us so that it can be used again for future use. This is only supported for payment methods that support this feature. There are also a few restrictions on how the flag may be set:  * The flag has to be set to `true` when the `payment_source` is set to `recurring` or `installment`, and `merchant_initiated` is set to `false`.  * The flag has to be set to `false` (or not set) when using a previously tokenized payment method.")

  public Boolean getStore() {
    return store;
  }


  public void setStore(Boolean store) {
    this.store = store;
  }


  public TransactionRequest intent(IntentEnum intent) {
    
    this.intent = intent;
    return this;
  }

   /**
   * Defines the intent of this API call. This determines the desired initial state of the transaction.  * &#x60;authorize&#x60; - (Default) Optionally approves and then authorizes a transaction but does not capture the funds. * &#x60;capture&#x60; - Optionally approves and then authorizes and captures the funds of the transaction.
   * @return intent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "capture", value = "Defines the intent of this API call. This determines the desired initial state of the transaction.  * `authorize` - (Default) Optionally approves and then authorizes a transaction but does not capture the funds. * `capture` - Optionally approves and then authorizes and captures the funds of the transaction.")

  public IntentEnum getIntent() {
    return intent;
  }


  public void setIntent(IntentEnum intent) {
    this.intent = intent;
  }


  public TransactionRequest externalIdentifier(String externalIdentifier) {
    
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


  public TransactionRequest threeDSecureData(ThreeDSecureDataV1V2 threeDSecureData) {
    
    this.threeDSecureData = threeDSecureData;
    return this;
  }

   /**
   * Get threeDSecureData
   * @return threeDSecureData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDSecureDataV1V2 getThreeDSecureData() {
    return threeDSecureData;
  }


  public void setThreeDSecureData(ThreeDSecureDataV1V2 threeDSecureData) {
    this.threeDSecureData = threeDSecureData;
  }


  public TransactionRequest merchantInitiated(Boolean merchantInitiated) {
    
    this.merchantInitiated = merchantInitiated;
    return this;
  }

   /**
   * Indicates whether the transaction was initiated by the merchant (true) or customer (false).
   * @return merchantInitiated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the transaction was initiated by the merchant (true) or customer (false).")

  public Boolean getMerchantInitiated() {
    return merchantInitiated;
  }


  public void setMerchantInitiated(Boolean merchantInitiated) {
    this.merchantInitiated = merchantInitiated;
  }


  public TransactionRequest paymentSource(PaymentSourceEnum paymentSource) {
    
    this.paymentSource = paymentSource;
    return this;
  }

   /**
   * The source of the transaction. Defaults to &#x60;ecommerce&#x60;.
   * @return paymentSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ecommerce", value = "The source of the transaction. Defaults to `ecommerce`.")

  public PaymentSourceEnum getPaymentSource() {
    return paymentSource;
  }


  public void setPaymentSource(PaymentSourceEnum paymentSource) {
    this.paymentSource = paymentSource;
  }


  public TransactionRequest isSubsequentPayment(Boolean isSubsequentPayment) {
    
    this.isSubsequentPayment = isSubsequentPayment;
    return this;
  }

   /**
   * Indicates whether the transaction represents a subsequent payment coming from a setup recurring payment. Please note there are some restrictions on how this flag may be used.  The flag can only be &#x60;false&#x60; (or not set) when the transaction meets one of the following criteria:  * It is not &#x60;merchant_initiated&#x60;. * &#x60;payment_source&#x60; is set to &#x60;card_on_file&#x60;.  The flag can only be set to &#x60;true&#x60; when the transaction meets one of the following criteria:  * It is not &#x60;merchant_initiated&#x60;. * &#x60;payment_source&#x60; is set to &#x60;recurring&#x60; or &#x60;installment&#x60; and &#x60;merchant_initiated&#x60; is set to &#x60;true&#x60;. * &#x60;payment_source&#x60; is set to &#x60;card_on_file&#x60;.
   * @return isSubsequentPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the transaction represents a subsequent payment coming from a setup recurring payment. Please note there are some restrictions on how this flag may be used.  The flag can only be `false` (or not set) when the transaction meets one of the following criteria:  * It is not `merchant_initiated`. * `payment_source` is set to `card_on_file`.  The flag can only be set to `true` when the transaction meets one of the following criteria:  * It is not `merchant_initiated`. * `payment_source` is set to `recurring` or `installment` and `merchant_initiated` is set to `true`. * `payment_source` is set to `card_on_file`.")

  public Boolean getIsSubsequentPayment() {
    return isSubsequentPayment;
  }


  public void setIsSubsequentPayment(Boolean isSubsequentPayment) {
    this.isSubsequentPayment = isSubsequentPayment;
  }


  public TransactionRequest metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public TransactionRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Any additional information about the transaction that you would like to store as key-value pairs. This data is passed to payment service providers that support it. Please visit https://gr4vy.com/docs/ under &#x60;Connections&#x60; for more information on how specific providers support metadata.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "Any additional information about the transaction that you would like to store as key-value pairs. This data is passed to payment service providers that support it. Please visit https://gr4vy.com/docs/ under `Connections` for more information on how specific providers support metadata.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public TransactionRequest statementDescriptor(StatementDescriptor statementDescriptor) {
    
    this.statementDescriptor = statementDescriptor;
    return this;
  }

   /**
   * Get statementDescriptor
   * @return statementDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatementDescriptor getStatementDescriptor() {
    return statementDescriptor;
  }


  public void setStatementDescriptor(StatementDescriptor statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }


  public TransactionRequest cartItems(List<CartItem> cartItems) {
    
    this.cartItems = cartItems;
    return this;
  }

  public TransactionRequest addCartItemsItem(CartItem cartItemsItem) {
    if (this.cartItems == null) {
      this.cartItems = new ArrayList<CartItem>();
    }
    this.cartItems.add(cartItemsItem);
    return this;
  }

   /**
   * An array of cart items that represents the line items of a transaction.
   * @return cartItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of cart items that represents the line items of a transaction.")

  public List<CartItem> getCartItems() {
    return cartItems;
  }


  public void setCartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
  }


  public TransactionRequest previousSchemeTransactionId(String previousSchemeTransactionId) {
    
    this.previousSchemeTransactionId = previousSchemeTransactionId;
    return this;
  }

   /**
   * A scheme&#39;s transaction identifier to use in connecting a merchant initiated transaction to a previous customer initiated transaction.  If not provided, and a qualifying customer initiated transaction has been previously made, then Gr4vy will populate this value with the identifier returned for that transaction.  e.g. the Visa Transaction Identifier, or Mastercard Trace ID.
   * @return previousSchemeTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789012345", value = "A scheme's transaction identifier to use in connecting a merchant initiated transaction to a previous customer initiated transaction.  If not provided, and a qualifying customer initiated transaction has been previously made, then Gr4vy will populate this value with the identifier returned for that transaction.  e.g. the Visa Transaction Identifier, or Mastercard Trace ID.")

  public String getPreviousSchemeTransactionId() {
    return previousSchemeTransactionId;
  }


  public void setPreviousSchemeTransactionId(String previousSchemeTransactionId) {
    this.previousSchemeTransactionId = previousSchemeTransactionId;
  }


  public TransactionRequest browserInfo(BrowserInfo browserInfo) {
    
    this.browserInfo = browserInfo;
    return this;
  }

   /**
   * Get browserInfo
   * @return browserInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BrowserInfo getBrowserInfo() {
    return browserInfo;
  }


  public void setBrowserInfo(BrowserInfo browserInfo) {
    this.browserInfo = browserInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRequest transactionRequest = (TransactionRequest) o;
    return Objects.equals(this.amount, transactionRequest.amount) &&
        Objects.equals(this.currency, transactionRequest.currency) &&
        Objects.equals(this.country, transactionRequest.country) &&
        Objects.equals(this.paymentMethod, transactionRequest.paymentMethod) &&
        Objects.equals(this.store, transactionRequest.store) &&
        Objects.equals(this.intent, transactionRequest.intent) &&
        Objects.equals(this.externalIdentifier, transactionRequest.externalIdentifier) &&
        Objects.equals(this.threeDSecureData, transactionRequest.threeDSecureData) &&
        Objects.equals(this.merchantInitiated, transactionRequest.merchantInitiated) &&
        Objects.equals(this.paymentSource, transactionRequest.paymentSource) &&
        Objects.equals(this.isSubsequentPayment, transactionRequest.isSubsequentPayment) &&
        Objects.equals(this.metadata, transactionRequest.metadata) &&
        Objects.equals(this.statementDescriptor, transactionRequest.statementDescriptor) &&
        Objects.equals(this.cartItems, transactionRequest.cartItems) &&
        Objects.equals(this.previousSchemeTransactionId, transactionRequest.previousSchemeTransactionId) &&
        Objects.equals(this.browserInfo, transactionRequest.browserInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, country, paymentMethod, store, intent, externalIdentifier, threeDSecureData, merchantInitiated, paymentSource, isSubsequentPayment, metadata, statementDescriptor, cartItems, previousSchemeTransactionId, browserInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    threeDSecureData: ").append(toIndentedString(threeDSecureData)).append("\n");
    sb.append("    merchantInitiated: ").append(toIndentedString(merchantInitiated)).append("\n");
    sb.append("    paymentSource: ").append(toIndentedString(paymentSource)).append("\n");
    sb.append("    isSubsequentPayment: ").append(toIndentedString(isSubsequentPayment)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    cartItems: ").append(toIndentedString(cartItems)).append("\n");
    sb.append("    previousSchemeTransactionId: ").append(toIndentedString(previousSchemeTransactionId)).append("\n");
    sb.append("    browserInfo: ").append(toIndentedString(browserInfo)).append("\n");
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

