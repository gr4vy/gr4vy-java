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
import com.gr4vy.api.model.GooglePayRequestAssuranceDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payment method details to use in a transaction or to register a new payment method.
 */
@ApiModel(description = "Payment method details to use in a transaction or to register a new payment method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionPaymentMethodRequest {
  /**
   * The method to use for this request.
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

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_SECURITY_CODE = "security_code";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE)
  private String securityCode;

  public static final String SERIALIZED_NAME_EXTERNAL_IDENTIFIER = "external_identifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDENTIFIER)
  private String externalIdentifier;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private Object token;

  public static final String SERIALIZED_NAME_ASSURANCE_DETAILS = "assurance_details";
  @SerializedName(SERIALIZED_NAME_ASSURANCE_DETAILS)
  private GooglePayRequestAssuranceDetails assuranceDetails;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholder_name";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_CRYPTOGRAM = "cryptogram";
  @SerializedName(SERIALIZED_NAME_CRYPTOGRAM)
  private String cryptogram;


  public TransactionPaymentMethodRequest method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The method to use for this request.
   * @return method
  **/
  @ApiModelProperty(example = "card", required = true, value = "The method to use for this request.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public TransactionPaymentMethodRequest number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The 13-19 digit number for this credit card as it can be found on the front of the card.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4111111111111111", value = "The 13-19 digit number for this credit card as it can be found on the front of the card.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public TransactionPaymentMethodRequest expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date of the card, formatted &#x60;MM/YY&#x60;. If a card has been previously stored with us this value is optional.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11/15", value = "The expiration date of the card, formatted `MM/YY`. If a card has been previously stored with us this value is optional.")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public TransactionPaymentMethodRequest securityCode(String securityCode) {
    
    this.securityCode = securityCode;
    return this;
  }

   /**
   * The 3 or 4 digit security code often found on the card. This often referred to as the CVV or CVD.
   * @return securityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "The 3 or 4 digit security code often found on the card. This often referred to as the CVV or CVD.")

  public String getSecurityCode() {
    return securityCode;
  }


  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  public TransactionPaymentMethodRequest externalIdentifier(String externalIdentifier) {
    
    this.externalIdentifier = externalIdentifier;
    return this;
  }

   /**
   * An external identifier that can be used to match the card against your own records.
   * @return externalIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user-789123", value = "An external identifier that can be used to match the card against your own records.")

  public String getExternalIdentifier() {
    return externalIdentifier;
  }


  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public TransactionPaymentMethodRequest redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The redirect URL to redirect a buyer to after they have authorized their transaction or payment method. This only applies to payment methods that require buyer approval.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/callback", value = "The redirect URL to redirect a buyer to after they have authorized their transaction or payment method. This only applies to payment methods that require buyer approval.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public TransactionPaymentMethodRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An identifier for a previously tokenized payment method or checkout-session. This id can represent any type of payment method or checkout-session.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "77a76f7e-d2de-4bbc-ada9-d6a0015e6bd5", value = "An identifier for a previously tokenized payment method or checkout-session. This id can represent any type of payment method or checkout-session.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransactionPaymentMethodRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 currency code to use this payment method for. This is used to select the payment service to use.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The ISO-4217 currency code to use this payment method for. This is used to select the payment service to use.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionPaymentMethodRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the country to use this payment method for. This is used to select the payment service to use.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The 2-letter ISO code of the country to use this payment method for. This is used to select the payment service to use.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public TransactionPaymentMethodRequest token(Object token) {
    
    this.token = token;
    return this;
  }

   /**
   * The encrypted (opaque) token that was passed to the &#x60;onpaymentauthorized&#x60; callback by the Apple Pay integration.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encrypted (opaque) token that was passed to the `onpaymentauthorized` callback by the Apple Pay integration.")

  public Object getToken() {
    return token;
  }


  public void setToken(Object token) {
    this.token = token;
  }


  public TransactionPaymentMethodRequest assuranceDetails(GooglePayRequestAssuranceDetails assuranceDetails) {
    
    this.assuranceDetails = assuranceDetails;
    return this;
  }

   /**
   * Get assuranceDetails
   * @return assuranceDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GooglePayRequestAssuranceDetails getAssuranceDetails() {
    return assuranceDetails;
  }


  public void setAssuranceDetails(GooglePayRequestAssuranceDetails assuranceDetails) {
    this.assuranceDetails = assuranceDetails;
  }


  public TransactionPaymentMethodRequest cardholderName(String cardholderName) {
    
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * Name of the card holder.
   * @return cardholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the card holder.")

  public String getCardholderName() {
    return cardholderName;
  }


  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  public TransactionPaymentMethodRequest cryptogram(String cryptogram) {
    
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * The cryptogram of the network token.
   * @return cryptogram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cryptogram of the network token.")

  public String getCryptogram() {
    return cryptogram;
  }


  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPaymentMethodRequest transactionPaymentMethodRequest = (TransactionPaymentMethodRequest) o;
    return Objects.equals(this.method, transactionPaymentMethodRequest.method) &&
        Objects.equals(this.number, transactionPaymentMethodRequest.number) &&
        Objects.equals(this.expirationDate, transactionPaymentMethodRequest.expirationDate) &&
        Objects.equals(this.securityCode, transactionPaymentMethodRequest.securityCode) &&
        Objects.equals(this.externalIdentifier, transactionPaymentMethodRequest.externalIdentifier) &&
        Objects.equals(this.redirectUrl, transactionPaymentMethodRequest.redirectUrl) &&
        Objects.equals(this.id, transactionPaymentMethodRequest.id) &&
        Objects.equals(this.currency, transactionPaymentMethodRequest.currency) &&
        Objects.equals(this.country, transactionPaymentMethodRequest.country) &&
        Objects.equals(this.token, transactionPaymentMethodRequest.token) &&
        Objects.equals(this.assuranceDetails, transactionPaymentMethodRequest.assuranceDetails) &&
        Objects.equals(this.cardholderName, transactionPaymentMethodRequest.cardholderName) &&
        Objects.equals(this.cryptogram, transactionPaymentMethodRequest.cryptogram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, number, expirationDate, securityCode, externalIdentifier, redirectUrl, id, currency, country, token, assuranceDetails, cardholderName, cryptogram);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPaymentMethodRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    assuranceDetails: ").append(toIndentedString(assuranceDetails)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
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

