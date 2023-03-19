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
import com.gr4vy.api.model.MerchantAccount;
import com.gr4vy.api.model.MerchantAccountCreate;
import com.gr4vy.api.model.MerchantAccountUpdate;
import com.gr4vy.api.model.MerchantAccounts;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MerchantAccountsApi {
    private ApiClient localVarApiClient;

    public MerchantAccountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MerchantAccountsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createMerchantAccount
     * @param merchantAccountCreate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the created merchant account. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMerchantAccountCall(MerchantAccountCreate merchantAccountCreate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = merchantAccountCreate;

        // create path and map variables
        String localVarPath = "/merchant-accounts";

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
    private okhttp3.Call createMerchantAccountValidateBeforeCall(MerchantAccountCreate merchantAccountCreate, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createMerchantAccountCall(merchantAccountCreate, _callback);
        return localVarCall;

    }

    /**
     * Create merchant account
     * Create a merchant account. Optionally, provide an &#x60;outbound_webhook_url&#x60;, and if HTTP Basic Authentication is required, provide the &#x60;outbound_webhook_username&#x60; and &#x60;outbound_webhook_password&#x60;. When retrieving a Merchant Account the &#x60;outbound_webhook_password&#x60; will be omitted.
     * @param merchantAccountCreate  (optional)
     * @return MerchantAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the created merchant account. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public MerchantAccount createMerchantAccount(MerchantAccountCreate merchantAccountCreate) throws ApiException {
        ApiResponse<MerchantAccount> localVarResp = createMerchantAccountWithHttpInfo(merchantAccountCreate);
        return localVarResp.getData();
    }

    /**
     * Create merchant account
     * Create a merchant account. Optionally, provide an &#x60;outbound_webhook_url&#x60;, and if HTTP Basic Authentication is required, provide the &#x60;outbound_webhook_username&#x60; and &#x60;outbound_webhook_password&#x60;. When retrieving a Merchant Account the &#x60;outbound_webhook_password&#x60; will be omitted.
     * @param merchantAccountCreate  (optional)
     * @return ApiResponse&lt;MerchantAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the created merchant account. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerchantAccount> createMerchantAccountWithHttpInfo(MerchantAccountCreate merchantAccountCreate) throws ApiException {
        okhttp3.Call localVarCall = createMerchantAccountValidateBeforeCall(merchantAccountCreate, null);
        Type localVarReturnType = new TypeToken<MerchantAccount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create merchant account (asynchronously)
     * Create a merchant account. Optionally, provide an &#x60;outbound_webhook_url&#x60;, and if HTTP Basic Authentication is required, provide the &#x60;outbound_webhook_username&#x60; and &#x60;outbound_webhook_password&#x60;. When retrieving a Merchant Account the &#x60;outbound_webhook_password&#x60; will be omitted.
     * @param merchantAccountCreate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the created merchant account. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMerchantAccountAsync(MerchantAccountCreate merchantAccountCreate, final ApiCallback<MerchantAccount> _callback) throws ApiException {

        okhttp3.Call localVarCall = createMerchantAccountValidateBeforeCall(merchantAccountCreate, _callback);
        Type localVarReturnType = new TypeToken<MerchantAccount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteMerchantAccuont
     * @param merchantAccountId The unique ID for a merchant account. (required)
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
    public okhttp3.Call deleteMerchantAccuontCall(String merchantAccountId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merchant-accounts/{merchant_account_id}"
            .replaceAll("\\{" + "merchant_account_id" + "\\}", localVarApiClient.escapeString(merchantAccountId.toString()));

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
    private okhttp3.Call deleteMerchantAccuontValidateBeforeCall(String merchantAccountId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantAccountId' is set
        if (merchantAccountId == null) {
            throw new ApiException("Missing the required parameter 'merchantAccountId' when calling deleteMerchantAccuont(Async)");
        }
        

        okhttp3.Call localVarCall = deleteMerchantAccuontCall(merchantAccountId, _callback);
        return localVarCall;

    }

    /**
     * Delete merchant account
     * Deletes a specific merchant account.
     * @param merchantAccountId The unique ID for a merchant account. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returns an empty response. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteMerchantAccuont(String merchantAccountId) throws ApiException {
        deleteMerchantAccuontWithHttpInfo(merchantAccountId);
    }

    /**
     * Delete merchant account
     * Deletes a specific merchant account.
     * @param merchantAccountId The unique ID for a merchant account. (required)
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
    public ApiResponse<Void> deleteMerchantAccuontWithHttpInfo(String merchantAccountId) throws ApiException {
        okhttp3.Call localVarCall = deleteMerchantAccuontValidateBeforeCall(merchantAccountId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete merchant account (asynchronously)
     * Deletes a specific merchant account.
     * @param merchantAccountId The unique ID for a merchant account. (required)
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
    public okhttp3.Call deleteMerchantAccuontAsync(String merchantAccountId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteMerchantAccuontValidateBeforeCall(merchantAccountId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listMerchantAccounts
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paginated list of merchant accounts. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listMerchantAccountsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/merchant-accounts";

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
    private okhttp3.Call listMerchantAccountsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listMerchantAccountsCall(_callback);
        return localVarCall;

    }

    /**
     * List merchant accounts
     * Lists all merchant accounts in an instance.
     * @return MerchantAccounts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paginated list of merchant accounts. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public MerchantAccounts listMerchantAccounts() throws ApiException {
        ApiResponse<MerchantAccounts> localVarResp = listMerchantAccountsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List merchant accounts
     * Lists all merchant accounts in an instance.
     * @return ApiResponse&lt;MerchantAccounts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paginated list of merchant accounts. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerchantAccounts> listMerchantAccountsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listMerchantAccountsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<MerchantAccounts>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List merchant accounts (asynchronously)
     * Lists all merchant accounts in an instance.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a paginated list of merchant accounts. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listMerchantAccountsAsync(final ApiCallback<MerchantAccounts> _callback) throws ApiException {

        okhttp3.Call localVarCall = listMerchantAccountsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<MerchantAccounts>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateMerchantAccount
     * @param merchantAccountId The unique ID for a merchant account. (required)
     * @param merchantAccountUpdate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the updated merchant account. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMerchantAccountCall(String merchantAccountId, MerchantAccountUpdate merchantAccountUpdate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = merchantAccountUpdate;

        // create path and map variables
        String localVarPath = "/merchant-accounts/{merchant_account_id}"
            .replaceAll("\\{" + "merchant_account_id" + "\\}", localVarApiClient.escapeString(merchantAccountId.toString()));

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
    private okhttp3.Call updateMerchantAccountValidateBeforeCall(String merchantAccountId, MerchantAccountUpdate merchantAccountUpdate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantAccountId' is set
        if (merchantAccountId == null) {
            throw new ApiException("Missing the required parameter 'merchantAccountId' when calling updateMerchantAccount(Async)");
        }
        

        okhttp3.Call localVarCall = updateMerchantAccountCall(merchantAccountId, merchantAccountUpdate, _callback);
        return localVarCall;

    }

    /**
     * Update merchant account
     * Update an existing merchant account. Optionally, provide an &#x60;outbound_webhook_url&#x60;, and if HTTP Basic Authentication is required, provide the &#x60;outbound_webhook_username&#x60; and &#x60;outbound_webhook_password&#x60;. When retrieving a Merchant Account the &#x60;outbound_webhook_password&#x60; will be omitted.
     * @param merchantAccountId The unique ID for a merchant account. (required)
     * @param merchantAccountUpdate  (optional)
     * @return MerchantAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the updated merchant account. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public MerchantAccount updateMerchantAccount(String merchantAccountId, MerchantAccountUpdate merchantAccountUpdate) throws ApiException {
        ApiResponse<MerchantAccount> localVarResp = updateMerchantAccountWithHttpInfo(merchantAccountId, merchantAccountUpdate);
        return localVarResp.getData();
    }

    /**
     * Update merchant account
     * Update an existing merchant account. Optionally, provide an &#x60;outbound_webhook_url&#x60;, and if HTTP Basic Authentication is required, provide the &#x60;outbound_webhook_username&#x60; and &#x60;outbound_webhook_password&#x60;. When retrieving a Merchant Account the &#x60;outbound_webhook_password&#x60; will be omitted.
     * @param merchantAccountId The unique ID for a merchant account. (required)
     * @param merchantAccountUpdate  (optional)
     * @return ApiResponse&lt;MerchantAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the updated merchant account. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MerchantAccount> updateMerchantAccountWithHttpInfo(String merchantAccountId, MerchantAccountUpdate merchantAccountUpdate) throws ApiException {
        okhttp3.Call localVarCall = updateMerchantAccountValidateBeforeCall(merchantAccountId, merchantAccountUpdate, null);
        Type localVarReturnType = new TypeToken<MerchantAccount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update merchant account (asynchronously)
     * Update an existing merchant account. Optionally, provide an &#x60;outbound_webhook_url&#x60;, and if HTTP Basic Authentication is required, provide the &#x60;outbound_webhook_username&#x60; and &#x60;outbound_webhook_password&#x60;. When retrieving a Merchant Account the &#x60;outbound_webhook_password&#x60; will be omitted.
     * @param merchantAccountId The unique ID for a merchant account. (required)
     * @param merchantAccountUpdate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the updated merchant account. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMerchantAccountAsync(String merchantAccountId, MerchantAccountUpdate merchantAccountUpdate, final ApiCallback<MerchantAccount> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateMerchantAccountValidateBeforeCall(merchantAccountId, merchantAccountUpdate, _callback);
        Type localVarReturnType = new TypeToken<MerchantAccount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
