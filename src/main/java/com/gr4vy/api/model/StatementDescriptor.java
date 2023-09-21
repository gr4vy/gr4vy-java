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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The statement descriptor is the text to be shown on the buyer&#39;s statements.  The specific usage of these fields will depend on the capabilities of the underlying PSP and bank. As a typical example, &#39;name&#39; and &#39;description&#39; could be concatenated using &#39;* &#39; as a separator, and then the resulting descriptor would be truncated to 22 characters by the issuing bank.
 */
@ApiModel(description = "The statement descriptor is the text to be shown on the buyer's statements.  The specific usage of these fields will depend on the capabilities of the underlying PSP and bank. As a typical example, 'name' and 'description' could be concatenated using '* ' as a separator, and then the resulting descriptor would be truncated to 22 characters by the issuing bank.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatementDescriptor {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public StatementDescriptor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Reflects your doing business as (DBA) name.  Other validations:  1. Contains only Latin characters. 2. Contain at least one letter 3. Does not contain any of the special characters &#x60;&lt; &gt; \\ &#39; \&quot; *&#x60; 4. Supports:   1. Lower case: &#x60;a-z&#x60;   2. Upper case: &#x60;A-Z&#x60;   3. Numbers: &#x60;0-9&#x60;   4. Spaces: &#x60; &#x60;   5. Special characters: &#x60;. , _ - ? + /&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GR4VY", value = "Reflects your doing business as (DBA) name.  Other validations:  1. Contains only Latin characters. 2. Contain at least one letter 3. Does not contain any of the special characters `< > \\ ' \" *` 4. Supports:   1. Lower case: `a-z`   2. Upper case: `A-Z`   3. Numbers: `0-9`   4. Spaces: ` `   5. Special characters: `. , _ - ? + /`.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StatementDescriptor description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A short description about the purchase.  Other validations: 1. Contains only Latin characters. 2. Contain at least one letter 3. Does not contain any of the special characters &#x60;&lt; &gt; \\ &#39; \&quot; *&#x60; 4. Supports:   1. Lower case: &#x60;a-z&#x60;   2. Upper case: &#x60;A-Z&#x60;   3. Numbers: &#x60;0-9&#x60;   4. Spaces: &#x60; &#x60;   5. Special characters: &#x60;. , _ - ? + /&#x60;.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Card payment", value = "A short description about the purchase.  Other validations: 1. Contains only Latin characters. 2. Contain at least one letter 3. Does not contain any of the special characters `< > \\ ' \" *` 4. Supports:   1. Lower case: `a-z`   2. Upper case: `A-Z`   3. Numbers: `0-9`   4. Spaces: ` `   5. Special characters: `. , _ - ? + /`.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public StatementDescriptor city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City from which the charge originated.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "London", value = "City from which the charge originated.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public StatementDescriptor phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The value in the phone number field of a customer&#39;s statement which should be formatted according to the [E164 number standard](https://www.twilio.com/docs/glossary/what-e164).
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1234567890", value = "The value in the phone number field of a customer's statement which should be formatted according to the [E164 number standard](https://www.twilio.com/docs/glossary/what-e164).")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public StatementDescriptor url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The value in the URL/web address field of a customer&#39;s statement.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "www.gr4vy.com", value = "The value in the URL/web address field of a customer's statement.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementDescriptor statementDescriptor = (StatementDescriptor) o;
    return Objects.equals(this.name, statementDescriptor.name) &&
        Objects.equals(this.description, statementDescriptor.description) &&
        Objects.equals(this.city, statementDescriptor.city) &&
        Objects.equals(this.phoneNumber, statementDescriptor.phoneNumber) &&
        Objects.equals(this.url, statementDescriptor.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, city, phoneNumber, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementDescriptor {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

