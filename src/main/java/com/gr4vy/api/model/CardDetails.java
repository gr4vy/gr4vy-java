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
import com.gr4vy.api.model.RequiredFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about a card.
 */
@ApiModel(description = "Details about a card.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T13:56:38.178267Z[Etc/UTC]")
public class CardDetails {
  /**
   * &#x60;card-detail&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CARD_DETAIL("card-detail");

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

  /**
   * The type of card.
   */
  @JsonAdapter(CardTypeEnum.Adapter.class)
  public enum CardTypeEnum {
    CREDIT("credit"),
    
    DEBIT("debit");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardTypeEnum fromValue(String value) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CardTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CardTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private CardTypeEnum cardType;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_SCHEME_ICON_URL = "scheme_icon_url";
  @SerializedName(SERIALIZED_NAME_SCHEME_ICON_URL)
  private String schemeIconUrl;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_REQUIRED_FIELDS = "required_fields";
  @SerializedName(SERIALIZED_NAME_REQUIRED_FIELDS)
  private RequiredFields requiredFields;


  public CardDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;card-detail&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card-detail", value = "`card-detail`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CardDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The 8 digit BIN of the card. When looking up card details using a &#x60;payment_method_id&#x60; this value will be &#x60;null&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42424242", value = "The 8 digit BIN of the card. When looking up card details using a `payment_method_id` this value will be `null`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CardDetails cardType(CardTypeEnum cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * The type of card.
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "credit", value = "The type of card.")

  public CardTypeEnum getCardType() {
    return cardType;
  }


  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }


  public CardDetails scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * The scheme/brand of the card.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "visa", value = "The scheme/brand of the card.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public CardDetails schemeIconUrl(String schemeIconUrl) {
    
    this.schemeIconUrl = schemeIconUrl;
    return this;
  }

   /**
   * An icon to display for the card scheme.
   * @return schemeIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.sandbox.example.gr4vy.app/assets/card-scheme-definitions/visa.svg", value = "An icon to display for the card scheme.")

  public String getSchemeIconUrl() {
    return schemeIconUrl;
  }


  public void setSchemeIconUrl(String schemeIconUrl) {
    this.schemeIconUrl = schemeIconUrl;
  }


  public CardDetails country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The 2-letter ISO code of the issuing country of the card.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The 2-letter ISO code of the issuing country of the card.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CardDetails requiredFields(RequiredFields requiredFields) {
    
    this.requiredFields = requiredFields;
    return this;
  }

   /**
   * Get requiredFields
   * @return requiredFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequiredFields getRequiredFields() {
    return requiredFields;
  }


  public void setRequiredFields(RequiredFields requiredFields) {
    this.requiredFields = requiredFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetails cardDetails = (CardDetails) o;
    return Objects.equals(this.type, cardDetails.type) &&
        Objects.equals(this.id, cardDetails.id) &&
        Objects.equals(this.cardType, cardDetails.cardType) &&
        Objects.equals(this.scheme, cardDetails.scheme) &&
        Objects.equals(this.schemeIconUrl, cardDetails.schemeIconUrl) &&
        Objects.equals(this.country, cardDetails.country) &&
        Objects.equals(this.requiredFields, cardDetails.requiredFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, cardType, scheme, schemeIconUrl, country, requiredFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    schemeIconUrl: ").append(toIndentedString(schemeIconUrl)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    requiredFields: ").append(toIndentedString(requiredFields)).append("\n");
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

