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
import com.gr4vy.api.model.ErrorGeneric;
import com.gr4vy.api.model.PaymentService;
import com.gr4vy.api.model.PaymentServiceRequest;
import com.gr4vy.api.model.PaymentServiceUpdate;
import com.gr4vy.api.model.PaymentServices;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentServicesApi {
    private ApiClient localVarApiClient;

    public PaymentServicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentServicesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addPaymentService
     * @param paymentServiceRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the created payment service. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPaymentServiceCall(PaymentServiceRequest paymentServiceRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = paymentServiceRequest;

        // create path and map variables
        String localVarPath = "/payment-services";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addPaymentServiceValidateBeforeCall(PaymentServiceRequest paymentServiceRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addPaymentServiceCall(paymentServiceRequest, _callback);
        return localVarCall;

    }

    /**
     * New payment service
     * Adds a new payment service by providing a custom name and a value for each of the required fields.
     * @param paymentServiceRequest  (optional)
     * @return PaymentService
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the created payment service. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentService addPaymentService(PaymentServiceRequest paymentServiceRequest) throws ApiException {
        ApiResponse<PaymentService> localVarResp = addPaymentServiceWithHttpInfo(paymentServiceRequest);
        return localVarResp.getData();
    }

    /**
     * New payment service
     * Adds a new payment service by providing a custom name and a value for each of the required fields.
     * @param paymentServiceRequest  (optional)
     * @return ApiResponse&lt;PaymentService&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the created payment service. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentService> addPaymentServiceWithHttpInfo(PaymentServiceRequest paymentServiceRequest) throws ApiException {
        okhttp3.Call localVarCall = addPaymentServiceValidateBeforeCall(paymentServiceRequest, null);
        Type localVarReturnType = new TypeToken<PaymentService>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * New payment service (asynchronously)
     * Adds a new payment service by providing a custom name and a value for each of the required fields.
     * @param paymentServiceRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the created payment service. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPaymentServiceAsync(PaymentServiceRequest paymentServiceRequest, final ApiCallback<PaymentService> _callback) throws ApiException {

        okhttp3.Call localVarCall = addPaymentServiceValidateBeforeCall(paymentServiceRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentService>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePaymentService
     * @param paymentServiceId The ID of the payment service. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returns an empty response. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePaymentServiceCall(String paymentServiceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment-services/{payment_service_id}"
            .replaceAll("\\{" + "payment_service_id" + "\\}", localVarApiClient.escapeString(paymentServiceId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePaymentServiceValidateBeforeCall(String paymentServiceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'paymentServiceId' is set
        if (paymentServiceId == null) {
            throw new ApiException("Missing the required parameter 'paymentServiceId' when calling deletePaymentService(Async)");
        }
        

        okhttp3.Call localVarCall = deletePaymentServiceCall(paymentServiceId, _callback);
        return localVarCall;

    }

    /**
     * Delete payment service
     * Deletes a specific active payment service.
     * @param paymentServiceId The ID of the payment service. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returns an empty response. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public void deletePaymentService(String paymentServiceId) throws ApiException {
        deletePaymentServiceWithHttpInfo(paymentServiceId);
    }

    /**
     * Delete payment service
     * Deletes a specific active payment service.
     * @param paymentServiceId The ID of the payment service. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returns an empty response. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePaymentServiceWithHttpInfo(String paymentServiceId) throws ApiException {
        okhttp3.Call localVarCall = deletePaymentServiceValidateBeforeCall(paymentServiceId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete payment service (asynchronously)
     * Deletes a specific active payment service.
     * @param paymentServiceId The ID of the payment service. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returns an empty response. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePaymentServiceAsync(String paymentServiceId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePaymentServiceValidateBeforeCall(paymentServiceId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPaymentService
     * @param paymentServiceId The ID of the payment service. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment service. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentServiceCall(String paymentServiceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment-services/{payment_service_id}"
            .replaceAll("\\{" + "payment_service_id" + "\\}", localVarApiClient.escapeString(paymentServiceId.toString()));

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
    private okhttp3.Call getPaymentServiceValidateBeforeCall(String paymentServiceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'paymentServiceId' is set
        if (paymentServiceId == null) {
            throw new ApiException("Missing the required parameter 'paymentServiceId' when calling getPaymentService(Async)");
        }
        

        okhttp3.Call localVarCall = getPaymentServiceCall(paymentServiceId, _callback);
        return localVarCall;

    }

    /**
     * Get payment service
     * Retrieves the details of a single configured payment service.
     * @param paymentServiceId The ID of the payment service. (required)
     * @return PaymentService
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment service. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentService getPaymentService(String paymentServiceId) throws ApiException {
        ApiResponse<PaymentService> localVarResp = getPaymentServiceWithHttpInfo(paymentServiceId);
        return localVarResp.getData();
    }

    /**
     * Get payment service
     * Retrieves the details of a single configured payment service.
     * @param paymentServiceId The ID of the payment service. (required)
     * @return ApiResponse&lt;PaymentService&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment service. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentService> getPaymentServiceWithHttpInfo(String paymentServiceId) throws ApiException {
        okhttp3.Call localVarCall = getPaymentServiceValidateBeforeCall(paymentServiceId, null);
        Type localVarReturnType = new TypeToken<PaymentService>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get payment service (asynchronously)
     * Retrieves the details of a single configured payment service.
     * @param paymentServiceId The ID of the payment service. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment service. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentServiceAsync(String paymentServiceId, final ApiCallback<PaymentService> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentServiceValidateBeforeCall(paymentServiceId, _callback);
        Type localVarReturnType = new TypeToken<PaymentService>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPaymentServices
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param method Filters the results to only the items for which the &#x60;method&#x60; has been set to this value. (optional)
     * @param environment Filters the results to only the items available in this environment. (optional, default to production)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of payment services. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaymentServicesCall(Integer limit, String cursor, String method, String environment, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment-services";

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

        if (method != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("method", method));
        }

        if (environment != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("environment", environment));
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
    private okhttp3.Call listPaymentServicesValidateBeforeCall(Integer limit, String cursor, String method, String environment, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listPaymentServicesCall(limit, cursor, method, environment, _callback);
        return localVarCall;

    }

    /**
     * List payment services
     * Lists the currently configured and activated payment services.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param method Filters the results to only the items for which the &#x60;method&#x60; has been set to this value. (optional)
     * @param environment Filters the results to only the items available in this environment. (optional, default to production)
     * @return PaymentServices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of payment services. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentServices listPaymentServices(Integer limit, String cursor, String method, String environment) throws ApiException {
        ApiResponse<PaymentServices> localVarResp = listPaymentServicesWithHttpInfo(limit, cursor, method, environment);
        return localVarResp.getData();
    }

    /**
     * List payment services
     * Lists the currently configured and activated payment services.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param method Filters the results to only the items for which the &#x60;method&#x60; has been set to this value. (optional)
     * @param environment Filters the results to only the items available in this environment. (optional, default to production)
     * @return ApiResponse&lt;PaymentServices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of payment services. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentServices> listPaymentServicesWithHttpInfo(Integer limit, String cursor, String method, String environment) throws ApiException {
        okhttp3.Call localVarCall = listPaymentServicesValidateBeforeCall(limit, cursor, method, environment, null);
        Type localVarReturnType = new TypeToken<PaymentServices>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List payment services (asynchronously)
     * Lists the currently configured and activated payment services.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param method Filters the results to only the items for which the &#x60;method&#x60; has been set to this value. (optional)
     * @param environment Filters the results to only the items available in this environment. (optional, default to production)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of payment services. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaymentServicesAsync(Integer limit, String cursor, String method, String environment, final ApiCallback<PaymentServices> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPaymentServicesValidateBeforeCall(limit, cursor, method, environment, _callback);
        Type localVarReturnType = new TypeToken<PaymentServices>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePaymentService
     * @param paymentServiceId The ID of the payment service. (required)
     * @param paymentServiceUpdate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the updated payment service. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePaymentServiceCall(String paymentServiceId, PaymentServiceUpdate paymentServiceUpdate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = paymentServiceUpdate;

        // create path and map variables
        String localVarPath = "/payment-services/{payment_service_id}"
            .replaceAll("\\{" + "payment_service_id" + "\\}", localVarApiClient.escapeString(paymentServiceId.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePaymentServiceValidateBeforeCall(String paymentServiceId, PaymentServiceUpdate paymentServiceUpdate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'paymentServiceId' is set
        if (paymentServiceId == null) {
            throw new ApiException("Missing the required parameter 'paymentServiceId' when calling updatePaymentService(Async)");
        }
        

        okhttp3.Call localVarCall = updatePaymentServiceCall(paymentServiceId, paymentServiceUpdate, _callback);
        return localVarCall;

    }

    /**
     * Update payment service
     * Updates an existing payment service. Allows all fields to be changed except for the service ID.
     * @param paymentServiceId The ID of the payment service. (required)
     * @param paymentServiceUpdate  (optional)
     * @return PaymentService
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the updated payment service. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentService updatePaymentService(String paymentServiceId, PaymentServiceUpdate paymentServiceUpdate) throws ApiException {
        ApiResponse<PaymentService> localVarResp = updatePaymentServiceWithHttpInfo(paymentServiceId, paymentServiceUpdate);
        return localVarResp.getData();
    }

    /**
     * Update payment service
     * Updates an existing payment service. Allows all fields to be changed except for the service ID.
     * @param paymentServiceId The ID of the payment service. (required)
     * @param paymentServiceUpdate  (optional)
     * @return ApiResponse&lt;PaymentService&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the updated payment service. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentService> updatePaymentServiceWithHttpInfo(String paymentServiceId, PaymentServiceUpdate paymentServiceUpdate) throws ApiException {
        okhttp3.Call localVarCall = updatePaymentServiceValidateBeforeCall(paymentServiceId, paymentServiceUpdate, null);
        Type localVarReturnType = new TypeToken<PaymentService>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update payment service (asynchronously)
     * Updates an existing payment service. Allows all fields to be changed except for the service ID.
     * @param paymentServiceId The ID of the payment service. (required)
     * @param paymentServiceUpdate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the updated payment service. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePaymentServiceAsync(String paymentServiceId, PaymentServiceUpdate paymentServiceUpdate, final ApiCallback<PaymentService> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePaymentServiceValidateBeforeCall(paymentServiceId, paymentServiceUpdate, _callback);
        Type localVarReturnType = new TypeToken<PaymentService>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
