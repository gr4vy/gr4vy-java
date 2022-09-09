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
import java.math.BigDecimal;

/**
 * BrowserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:46:45.100086Z[Etc/UTC]")
public class BrowserInfo {
  public static final String SERIALIZED_NAME_JAVA_ENABLED = "java_enabled";
  @SerializedName(SERIALIZED_NAME_JAVA_ENABLED)
  private Boolean javaEnabled;

  public static final String SERIALIZED_NAME_JAVASCRIPT_ENABLED = "javascript_enabled";
  @SerializedName(SERIALIZED_NAME_JAVASCRIPT_ENABLED)
  private Boolean javascriptEnabled;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_COLOR_DEPTH = "color_depth";
  @SerializedName(SERIALIZED_NAME_COLOR_DEPTH)
  private BigDecimal colorDepth;

  public static final String SERIALIZED_NAME_SCREEN_HEIGHT = "screen_height";
  @SerializedName(SERIALIZED_NAME_SCREEN_HEIGHT)
  private BigDecimal screenHeight;

  public static final String SERIALIZED_NAME_SCREEN_WIDTH = "screen_width";
  @SerializedName(SERIALIZED_NAME_SCREEN_WIDTH)
  private BigDecimal screenWidth;

  public static final String SERIALIZED_NAME_TIME_ZONE_OFFSET = "time_zone_offset";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_OFFSET)
  private BigDecimal timeZoneOffset;

  /**
   * The platform that is being used to access the website.
   */
  @JsonAdapter(UserDeviceEnum.Adapter.class)
  public enum UserDeviceEnum {
    DESKTOP("desktop"),
    
    MOBILE("mobile");

    private String value;

    UserDeviceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserDeviceEnum fromValue(String value) {
      for (UserDeviceEnum b : UserDeviceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserDeviceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserDeviceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserDeviceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserDeviceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USER_DEVICE = "user_device";
  @SerializedName(SERIALIZED_NAME_USER_DEVICE)
  private UserDeviceEnum userDevice;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;

  public static final String SERIALIZED_NAME_ACCEPT_HEADER = "accept_header";
  @SerializedName(SERIALIZED_NAME_ACCEPT_HEADER)
  private String acceptHeader;


  public BrowserInfo javaEnabled(Boolean javaEnabled) {
    
    this.javaEnabled = javaEnabled;
    return this;
  }

   /**
   * Indicates whether the client browser supports Java.
   * @return javaEnabled
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates whether the client browser supports Java.")

  public Boolean getJavaEnabled() {
    return javaEnabled;
  }


  public void setJavaEnabled(Boolean javaEnabled) {
    this.javaEnabled = javaEnabled;
  }


  public BrowserInfo javascriptEnabled(Boolean javascriptEnabled) {
    
    this.javascriptEnabled = javascriptEnabled;
    return this;
  }

   /**
   * Indicates whether the client browser supports JavaScript.
   * @return javascriptEnabled
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates whether the client browser supports JavaScript.")

  public Boolean getJavascriptEnabled() {
    return javascriptEnabled;
  }


  public void setJavascriptEnabled(Boolean javascriptEnabled) {
    this.javascriptEnabled = javascriptEnabled;
  }


  public BrowserInfo language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The preferred language of the buyer, usually the language of the browser UI.
   * @return language
  **/
  @ApiModelProperty(example = "en-GB", required = true, value = "The preferred language of the buyer, usually the language of the browser UI.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public BrowserInfo colorDepth(BigDecimal colorDepth) {
    
    this.colorDepth = colorDepth;
    return this;
  }

   /**
   * The color depth of the screen.
   * @return colorDepth
  **/
  @ApiModelProperty(example = "32", required = true, value = "The color depth of the screen.")

  public BigDecimal getColorDepth() {
    return colorDepth;
  }


  public void setColorDepth(BigDecimal colorDepth) {
    this.colorDepth = colorDepth;
  }


  public BrowserInfo screenHeight(BigDecimal screenHeight) {
    
    this.screenHeight = screenHeight;
    return this;
  }

   /**
   * The height of the screen in pixels.
   * @return screenHeight
  **/
  @ApiModelProperty(example = "1080", required = true, value = "The height of the screen in pixels.")

  public BigDecimal getScreenHeight() {
    return screenHeight;
  }


  public void setScreenHeight(BigDecimal screenHeight) {
    this.screenHeight = screenHeight;
  }


  public BrowserInfo screenWidth(BigDecimal screenWidth) {
    
    this.screenWidth = screenWidth;
    return this;
  }

   /**
   * The width of the screen in pixels.
   * @return screenWidth
  **/
  @ApiModelProperty(example = "1920", required = true, value = "The width of the screen in pixels.")

  public BigDecimal getScreenWidth() {
    return screenWidth;
  }


  public void setScreenWidth(BigDecimal screenWidth) {
    this.screenWidth = screenWidth;
  }


  public BrowserInfo timeZoneOffset(BigDecimal timeZoneOffset) {
    
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

   /**
   * Time-zone offset in minutes between UTC and buyer location.
   * @return timeZoneOffset
  **/
  @ApiModelProperty(example = "60", required = true, value = "Time-zone offset in minutes between UTC and buyer location.")

  public BigDecimal getTimeZoneOffset() {
    return timeZoneOffset;
  }


  public void setTimeZoneOffset(BigDecimal timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }


  public BrowserInfo userDevice(UserDeviceEnum userDevice) {
    
    this.userDevice = userDevice;
    return this;
  }

   /**
   * The platform that is being used to access the website.
   * @return userDevice
  **/
  @ApiModelProperty(example = "desktop", required = true, value = "The platform that is being used to access the website.")

  public UserDeviceEnum getUserDevice() {
    return userDevice;
  }


  public void setUserDevice(UserDeviceEnum userDevice) {
    this.userDevice = userDevice;
  }


  public BrowserInfo userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The user agent string for the current browser.
   * @return userAgent
  **/
  @ApiModelProperty(example = "Mozilla/5.0 (darwin) AppleWebKit/537.36 (KHTML, like Gecko) jsdom/16.7.0", required = true, value = "The user agent string for the current browser.")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  public BrowserInfo acceptHeader(String acceptHeader) {
    
    this.acceptHeader = acceptHeader;
    return this;
  }

   /**
   * The &#x60;Accept&#x60; header of the request from the buyer&#39;s browser.
   * @return acceptHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*_/_*", value = "The `Accept` header of the request from the buyer's browser.")

  public String getAcceptHeader() {
    return acceptHeader;
  }


  public void setAcceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserInfo browserInfo = (BrowserInfo) o;
    return Objects.equals(this.javaEnabled, browserInfo.javaEnabled) &&
        Objects.equals(this.javascriptEnabled, browserInfo.javascriptEnabled) &&
        Objects.equals(this.language, browserInfo.language) &&
        Objects.equals(this.colorDepth, browserInfo.colorDepth) &&
        Objects.equals(this.screenHeight, browserInfo.screenHeight) &&
        Objects.equals(this.screenWidth, browserInfo.screenWidth) &&
        Objects.equals(this.timeZoneOffset, browserInfo.timeZoneOffset) &&
        Objects.equals(this.userDevice, browserInfo.userDevice) &&
        Objects.equals(this.userAgent, browserInfo.userAgent) &&
        Objects.equals(this.acceptHeader, browserInfo.acceptHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(javaEnabled, javascriptEnabled, language, colorDepth, screenHeight, screenWidth, timeZoneOffset, userDevice, userAgent, acceptHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserInfo {\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    javascriptEnabled: ").append(toIndentedString(javascriptEnabled)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    colorDepth: ").append(toIndentedString(colorDepth)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
    sb.append("    userDevice: ").append(toIndentedString(userDevice)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
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

