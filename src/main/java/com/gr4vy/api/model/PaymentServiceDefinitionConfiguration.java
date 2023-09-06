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
 * Configuration items for the payment service.
 */
@ApiModel(description = "Configuration items for the payment service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-06T16:38:13.632050Z[Etc/UTC]")
public class PaymentServiceDefinitionConfiguration {
  public static final String SERIALIZED_NAME_APPROVAL_UI_HEIGHT = "approval_ui_height";
  @SerializedName(SERIALIZED_NAME_APPROVAL_UI_HEIGHT)
  private String approvalUiHeight;

  public static final String SERIALIZED_NAME_APPROVAL_UI_WIDTH = "approval_ui_width";
  @SerializedName(SERIALIZED_NAME_APPROVAL_UI_WIDTH)
  private String approvalUiWidth;

  /**
   * The browser target that an approval URL must be opened in. If &#x60;any&#x60; or &#x60;null&#x60;, then there is no specific requirement.
   */
  @JsonAdapter(ApprovalUiTargetEnum.Adapter.class)
  public enum ApprovalUiTargetEnum {
    ANY("any"),
    
    NEW_WINDOW("new_window");

    private String value;

    ApprovalUiTargetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApprovalUiTargetEnum fromValue(String value) {
      for (ApprovalUiTargetEnum b : ApprovalUiTargetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApprovalUiTargetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApprovalUiTargetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApprovalUiTargetEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApprovalUiTargetEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPROVAL_UI_TARGET = "approval_ui_target";
  @SerializedName(SERIALIZED_NAME_APPROVAL_UI_TARGET)
  private ApprovalUiTargetEnum approvalUiTarget;


  public PaymentServiceDefinitionConfiguration approvalUiHeight(String approvalUiHeight) {
    
    this.approvalUiHeight = approvalUiHeight;
    return this;
  }

   /**
   * Height of the approval interface in either pixels or view height (vh).
   * @return approvalUiHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300px", value = "Height of the approval interface in either pixels or view height (vh).")

  public String getApprovalUiHeight() {
    return approvalUiHeight;
  }


  public void setApprovalUiHeight(String approvalUiHeight) {
    this.approvalUiHeight = approvalUiHeight;
  }


  public PaymentServiceDefinitionConfiguration approvalUiWidth(String approvalUiWidth) {
    
    this.approvalUiWidth = approvalUiWidth;
    return this;
  }

   /**
   * Width of the approval interface in either pixels or view width (vw).
   * @return approvalUiWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300px", value = "Width of the approval interface in either pixels or view width (vw).")

  public String getApprovalUiWidth() {
    return approvalUiWidth;
  }


  public void setApprovalUiWidth(String approvalUiWidth) {
    this.approvalUiWidth = approvalUiWidth;
  }


  public PaymentServiceDefinitionConfiguration approvalUiTarget(ApprovalUiTargetEnum approvalUiTarget) {
    
    this.approvalUiTarget = approvalUiTarget;
    return this;
  }

   /**
   * The browser target that an approval URL must be opened in. If &#x60;any&#x60; or &#x60;null&#x60;, then there is no specific requirement.
   * @return approvalUiTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "any", value = "The browser target that an approval URL must be opened in. If `any` or `null`, then there is no specific requirement.")

  public ApprovalUiTargetEnum getApprovalUiTarget() {
    return approvalUiTarget;
  }


  public void setApprovalUiTarget(ApprovalUiTargetEnum approvalUiTarget) {
    this.approvalUiTarget = approvalUiTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentServiceDefinitionConfiguration paymentServiceDefinitionConfiguration = (PaymentServiceDefinitionConfiguration) o;
    return Objects.equals(this.approvalUiHeight, paymentServiceDefinitionConfiguration.approvalUiHeight) &&
        Objects.equals(this.approvalUiWidth, paymentServiceDefinitionConfiguration.approvalUiWidth) &&
        Objects.equals(this.approvalUiTarget, paymentServiceDefinitionConfiguration.approvalUiTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalUiHeight, approvalUiWidth, approvalUiTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentServiceDefinitionConfiguration {\n");
    sb.append("    approvalUiHeight: ").append(toIndentedString(approvalUiHeight)).append("\n");
    sb.append("    approvalUiWidth: ").append(toIndentedString(approvalUiWidth)).append("\n");
    sb.append("    approvalUiTarget: ").append(toIndentedString(approvalUiTarget)).append("\n");
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

