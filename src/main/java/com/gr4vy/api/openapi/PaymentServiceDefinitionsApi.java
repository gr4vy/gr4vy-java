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


package com.gr4vy.api.openapi;

import com.gr4vy.api.ApiCallback;
import com.gr4vy.api.ApiClient;
import com.gr4vy.api.ApiException;
import com.gr4vy.api.ApiResponse;
import com.gr4vy.api.Configuration;
import com.gr4vy.api.Pair;
import com.gr4vy.api.ProgressRequestBody;
import com.gr4vy.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.gr4vy.api.model.Error401Unauthorized;
import com.gr4vy.api.model.Error404NotFound;
import com.gr4vy.api.model.PaymentServiceDefinition;
import com.gr4vy.api.model.PaymentServiceDefinitions;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentServiceDefinitionsApi {
    private ApiClient localVarApiClient;

    public PaymentServiceDefinitionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentServiceDefinitionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPaymentServiceDefinition
     * @param paymentServiceDefinitionId The unique ID of the payment service definition. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment service definition. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentServiceDefinitionCall(String paymentServiceDefinitionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment-service-definitions/{payment_service_definition_id}"
            .replaceAll("\\{" + "payment_service_definition_id" + "\\}", localVarApiClient.escapeString(paymentServiceDefinitionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentServiceDefinitionValidateBeforeCall(String paymentServiceDefinitionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'paymentServiceDefinitionId' is set
        if (paymentServiceDefinitionId == null) {
            throw new ApiException("Missing the required parameter 'paymentServiceDefinitionId' when calling getPaymentServiceDefinition(Async)");
        }
        

        okhttp3.Call localVarCall = getPaymentServiceDefinitionCall(paymentServiceDefinitionId, _callback);
        return localVarCall;

    }

    /**
     * Get payment service definition
     * Gets the definition for a payment service.
     * @param paymentServiceDefinitionId The unique ID of the payment service definition. (required)
     * @return PaymentServiceDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment service definition. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentServiceDefinition getPaymentServiceDefinition(String paymentServiceDefinitionId) throws ApiException {
        ApiResponse<PaymentServiceDefinition> localVarResp = getPaymentServiceDefinitionWithHttpInfo(paymentServiceDefinitionId);
        return localVarResp.getData();
    }

    /**
     * Get payment service definition
     * Gets the definition for a payment service.
     * @param paymentServiceDefinitionId The unique ID of the payment service definition. (required)
     * @return ApiResponse&lt;PaymentServiceDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment service definition. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentServiceDefinition> getPaymentServiceDefinitionWithHttpInfo(String paymentServiceDefinitionId) throws ApiException {
        okhttp3.Call localVarCall = getPaymentServiceDefinitionValidateBeforeCall(paymentServiceDefinitionId, null);
        Type localVarReturnType = new TypeToken<PaymentServiceDefinition>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get payment service definition (asynchronously)
     * Gets the definition for a payment service.
     * @param paymentServiceDefinitionId The unique ID of the payment service definition. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment service definition. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentServiceDefinitionAsync(String paymentServiceDefinitionId, final ApiCallback<PaymentServiceDefinition> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentServiceDefinitionValidateBeforeCall(paymentServiceDefinitionId, _callback);
        Type localVarReturnType = new TypeToken<PaymentServiceDefinition>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPaymentServiceDefinitions
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of payment service definitions. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaymentServiceDefinitionsCall(Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment-service-definitions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPaymentServiceDefinitionsValidateBeforeCall(Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listPaymentServiceDefinitionsCall(limit, cursor, _callback);
        return localVarCall;

    }

    /**
     * List payment service definitions
     * Returns a list of all available payment service definitions.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @return PaymentServiceDefinitions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of payment service definitions. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentServiceDefinitions listPaymentServiceDefinitions(Integer limit, String cursor) throws ApiException {
        ApiResponse<PaymentServiceDefinitions> localVarResp = listPaymentServiceDefinitionsWithHttpInfo(limit, cursor);
        return localVarResp.getData();
    }

    /**
     * List payment service definitions
     * Returns a list of all available payment service definitions.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @return ApiResponse&lt;PaymentServiceDefinitions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of payment service definitions. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentServiceDefinitions> listPaymentServiceDefinitionsWithHttpInfo(Integer limit, String cursor) throws ApiException {
        okhttp3.Call localVarCall = listPaymentServiceDefinitionsValidateBeforeCall(limit, cursor, null);
        Type localVarReturnType = new TypeToken<PaymentServiceDefinitions>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List payment service definitions (asynchronously)
     * Returns a list of all available payment service definitions.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of payment service definitions. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaymentServiceDefinitionsAsync(Integer limit, String cursor, final ApiCallback<PaymentServiceDefinitions> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPaymentServiceDefinitionsValidateBeforeCall(limit, cursor, _callback);
        Type localVarReturnType = new TypeToken<PaymentServiceDefinitions>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}