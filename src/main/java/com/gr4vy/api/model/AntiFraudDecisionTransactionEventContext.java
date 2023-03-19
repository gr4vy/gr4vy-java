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
import java.util.UUID;

/**
 * Anti-fraud decision context.
 */
@ApiModel(description = "Anti-fraud decision context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-19T17:27:23.170866Z[Etc/UTC]")
public class AntiFraudDecisionTransactionEventContext {
  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "response_status_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
  private BigDecimal responseStatusCode;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private String decision;

  public static final String SERIALIZED_NAME_ANTI_FRAUD_SERVICE_ID = "anti_fraud_service_id";
  @SerializedName(SERIALIZED_NAME_ANTI_FRAUD_SERVICE_ID)
  private UUID antiFraudServiceId;

  public static final String SERIALIZED_NAME_ANTI_FRAUD_SERVICE_NAME = "anti_fraud_service_name";
  @SerializedName(SERIALIZED_NAME_ANTI_FRAUD_SERVICE_NAME)
  private String antiFraudServiceName;

  public static final String SERIALIZED_NAME_ANTI_FRAUD_SERVICE_DEFINITION_ID = "anti_fraud_service_definition_id";
  @SerializedName(SERIALIZED_NAME_ANTI_FRAUD_SERVICE_DEFINITION_ID)
  private String antiFraudServiceDefinitionId;


  public AntiFraudDecisionTransactionEventContext request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * The HTTP body sent to fetch a decision.
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP body sent to fetch a decision.")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public AntiFraudDecisionTransactionEventContext response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * The HTTP body received from the anti-fraud provider.
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP body received from the anti-fraud provider.")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }


  public AntiFraudDecisionTransactionEventContext responseStatusCode(BigDecimal responseStatusCode) {
    
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * The HTTP response status code from the anti-fraud provider.
   * @return responseStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP response status code from the anti-fraud provider.")

  public BigDecimal getResponseStatusCode() {
    return responseStatusCode;
  }


  public void setResponseStatusCode(BigDecimal responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public AntiFraudDecisionTransactionEventContext decision(String decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * The parsed decision response from the anti-fraud provider response.
   * @return decision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACCEPT", value = "The parsed decision response from the anti-fraud provider response.")

  public String getDecision() {
    return decision;
  }


  public void setDecision(String decision) {
    this.decision = decision;
  }


  public AntiFraudDecisionTransactionEventContext antiFraudServiceId(UUID antiFraudServiceId) {
    
    this.antiFraudServiceId = antiFraudServiceId;
    return this;
  }

   /**
   * The unique ID of the anti-fraud service used.
   * @return antiFraudServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the anti-fraud service used.")

  public UUID getAntiFraudServiceId() {
    return antiFraudServiceId;
  }


  public void setAntiFraudServiceId(UUID antiFraudServiceId) {
    this.antiFraudServiceId = antiFraudServiceId;
  }


  public AntiFraudDecisionTransactionEventContext antiFraudServiceName(String antiFraudServiceName) {
    
    this.antiFraudServiceName = antiFraudServiceName;
    return this;
  }

   /**
   * The name of the anti-fraud service used.
   * @return antiFraudServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the anti-fraud service used.")

  public String getAntiFraudServiceName() {
    return antiFraudServiceName;
  }


  public void setAntiFraudServiceName(String antiFraudServiceName) {
    this.antiFraudServiceName = antiFraudServiceName;
  }


  public AntiFraudDecisionTransactionEventContext antiFraudServiceDefinitionId(String antiFraudServiceDefinitionId) {
    
    this.antiFraudServiceDefinitionId = antiFraudServiceDefinitionId;
    return this;
  }

   /**
   * The anti-fraud service definition used.
   * @return antiFraudServiceDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The anti-fraud service definition used.")

  public String getAntiFraudServiceDefinitionId() {
    return antiFraudServiceDefinitionId;
  }


  public void setAntiFraudServiceDefinitionId(String antiFraudServiceDefinitionId) {
    this.antiFraudServiceDefinitionId = antiFraudServiceDefinitionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntiFraudDecisionTransactionEventContext antiFraudDecisionTransactionEventContext = (AntiFraudDecisionTransactionEventContext) o;
    return Objects.equals(this.request, antiFraudDecisionTransactionEventContext.request) &&
        Objects.equals(this.response, antiFraudDecisionTransactionEventContext.response) &&
        Objects.equals(this.responseStatusCode, antiFraudDecisionTransactionEventContext.responseStatusCode) &&
        Objects.equals(this.decision, antiFraudDecisionTransactionEventContext.decision) &&
        Objects.equals(this.antiFraudServiceId, antiFraudDecisionTransactionEventContext.antiFraudServiceId) &&
        Objects.equals(this.antiFraudServiceName, antiFraudDecisionTransactionEventContext.antiFraudServiceName) &&
        Objects.equals(this.antiFraudServiceDefinitionId, antiFraudDecisionTransactionEventContext.antiFraudServiceDefinitionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, response, responseStatusCode, decision, antiFraudServiceId, antiFraudServiceName, antiFraudServiceDefinitionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntiFraudDecisionTransactionEventContext {\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    antiFraudServiceId: ").append(toIndentedString(antiFraudServiceId)).append("\n");
    sb.append("    antiFraudServiceName: ").append(toIndentedString(antiFraudServiceName)).append("\n");
    sb.append("    antiFraudServiceDefinitionId: ").append(toIndentedString(antiFraudServiceDefinitionId)).append("\n");
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

