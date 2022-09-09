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


import com.gr4vy.api.model.AuditLogs;
import com.gr4vy.api.model.Error401Unauthorized;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditLogsApi {
    private ApiClient localVarApiClient;

    public AuditLogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuditLogsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listAuditLogs
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of audit logs. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAuditLogsCall(Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/audit-logs";

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
    private okhttp3.Call listAuditLogsValidateBeforeCall(Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listAuditLogsCall(limit, cursor, _callback);
        return localVarCall;

    }

    /**
     * List Audit Logs
     * Returns a list of audit logs.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @return AuditLogs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of audit logs. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public AuditLogs listAuditLogs(Integer limit, String cursor) throws ApiException {
        ApiResponse<AuditLogs> localVarResp = listAuditLogsWithHttpInfo(limit, cursor);
        return localVarResp.getData();
    }

    /**
     * List Audit Logs
     * Returns a list of audit logs.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @return ApiResponse&lt;AuditLogs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of audit logs. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AuditLogs> listAuditLogsWithHttpInfo(Integer limit, String cursor) throws ApiException {
        okhttp3.Call localVarCall = listAuditLogsValidateBeforeCall(limit, cursor, null);
        Type localVarReturnType = new TypeToken<AuditLogs>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Audit Logs (asynchronously)
     * Returns a list of audit logs.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of audit logs. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAuditLogsAsync(Integer limit, String cursor, final ApiCallback<AuditLogs> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAuditLogsValidateBeforeCall(limit, cursor, _callback);
        Type localVarReturnType = new TypeToken<AuditLogs>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
