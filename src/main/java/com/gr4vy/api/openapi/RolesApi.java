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
import com.gr4vy.api.model.Error409DuplicateRecord;
import com.gr4vy.api.model.ErrorGeneric;
import com.gr4vy.api.model.RoleAssignment;
import com.gr4vy.api.model.RoleAssignmentRequest;
import com.gr4vy.api.model.RoleAssignments;
import com.gr4vy.api.model.Roles;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RolesApi {
    private ApiClient localVarApiClient;

    public RolesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RolesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addRoleAssignment
     * @param roleAssignmentRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the role assignment that was added. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Returns an error if duplicate resource has been found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addRoleAssignmentCall(RoleAssignmentRequest roleAssignmentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = roleAssignmentRequest;

        // create path and map variables
        String localVarPath = "/roles/assignments";

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
    private okhttp3.Call addRoleAssignmentValidateBeforeCall(RoleAssignmentRequest roleAssignmentRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addRoleAssignmentCall(roleAssignmentRequest, _callback);
        return localVarCall;

    }

    /**
     * New role assignment
     * Adds a role assignment, in effect applying a role to the given assignee. 
     * @param roleAssignmentRequest  (optional)
     * @return RoleAssignment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the role assignment that was added. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Returns an error if duplicate resource has been found. </td><td>  -  </td></tr>
     </table>
     */
    public RoleAssignment addRoleAssignment(RoleAssignmentRequest roleAssignmentRequest) throws ApiException {
        ApiResponse<RoleAssignment> localVarResp = addRoleAssignmentWithHttpInfo(roleAssignmentRequest);
        return localVarResp.getData();
    }

    /**
     * New role assignment
     * Adds a role assignment, in effect applying a role to the given assignee. 
     * @param roleAssignmentRequest  (optional)
     * @return ApiResponse&lt;RoleAssignment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the role assignment that was added. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Returns an error if duplicate resource has been found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RoleAssignment> addRoleAssignmentWithHttpInfo(RoleAssignmentRequest roleAssignmentRequest) throws ApiException {
        okhttp3.Call localVarCall = addRoleAssignmentValidateBeforeCall(roleAssignmentRequest, null);
        Type localVarReturnType = new TypeToken<RoleAssignment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * New role assignment (asynchronously)
     * Adds a role assignment, in effect applying a role to the given assignee. 
     * @param roleAssignmentRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returns the role assignment that was added. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if the request was badly formatted or missing required fields. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Returns an error if duplicate resource has been found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addRoleAssignmentAsync(RoleAssignmentRequest roleAssignmentRequest, final ApiCallback<RoleAssignment> _callback) throws ApiException {

        okhttp3.Call localVarCall = addRoleAssignmentValidateBeforeCall(roleAssignmentRequest, _callback);
        Type localVarReturnType = new TypeToken<RoleAssignment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteRoleAssignment
     * @param roleAssignmentId The unique ID for the role assignment. (required)
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
    public okhttp3.Call deleteRoleAssignmentCall(UUID roleAssignmentId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles/assignments/{role_assignment_id}"
            .replaceAll("\\{" + "role_assignment_id" + "\\}", localVarApiClient.escapeString(roleAssignmentId.toString()));

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
    private okhttp3.Call deleteRoleAssignmentValidateBeforeCall(UUID roleAssignmentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'roleAssignmentId' is set
        if (roleAssignmentId == null) {
            throw new ApiException("Missing the required parameter 'roleAssignmentId' when calling deleteRoleAssignment(Async)");
        }
        

        okhttp3.Call localVarCall = deleteRoleAssignmentCall(roleAssignmentId, _callback);
        return localVarCall;

    }

    /**
     * Delete role assignment
     * Deletes a role assignment. The associated assignee will no longer be assigned the role.
     * @param roleAssignmentId The unique ID for the role assignment. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returns an empty response. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returns an error if the resource can not be found. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteRoleAssignment(UUID roleAssignmentId) throws ApiException {
        deleteRoleAssignmentWithHttpInfo(roleAssignmentId);
    }

    /**
     * Delete role assignment
     * Deletes a role assignment. The associated assignee will no longer be assigned the role.
     * @param roleAssignmentId The unique ID for the role assignment. (required)
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
    public ApiResponse<Void> deleteRoleAssignmentWithHttpInfo(UUID roleAssignmentId) throws ApiException {
        okhttp3.Call localVarCall = deleteRoleAssignmentValidateBeforeCall(roleAssignmentId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete role assignment (asynchronously)
     * Deletes a role assignment. The associated assignee will no longer be assigned the role.
     * @param roleAssignmentId The unique ID for the role assignment. (required)
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
    public okhttp3.Call deleteRoleAssignmentAsync(UUID roleAssignmentId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRoleAssignmentValidateBeforeCall(roleAssignmentId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listRoleAssignments
     * @param roleId Filters for role assignments for the role that has a matching &#x60;id&#x60; value. (optional)
     * @param assigneeType Filters for role assignments for the assignee of the given type. (optional)
     * @param assigneeId Filters for role assignments for the assignee that has a matching &#x60;id&#x60; value. The &#x60;assignee_type&#x60; must also be specified. (optional)
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of role assignments. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listRoleAssignmentsCall(UUID roleId, String assigneeType, UUID assigneeId, Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles/assignments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (roleId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("role_id", roleId));
        }

        if (assigneeType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("assignee_type", assigneeType));
        }

        if (assigneeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("assignee_id", assigneeId));
        }

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
    private okhttp3.Call listRoleAssignmentsValidateBeforeCall(UUID roleId, String assigneeType, UUID assigneeId, Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listRoleAssignmentsCall(roleId, assigneeType, assigneeId, limit, cursor, _callback);
        return localVarCall;

    }

    /**
     * List role assignments
     * Returns a list of role assignments.  Role assignments can be filtered for a given role by providing the &#x60;role_id&#x60; search parameter, or for a given assignee by providing both the &#x60;assignee_type&#x60; and &#x60;assignee_id&#x60; parameters.
     * @param roleId Filters for role assignments for the role that has a matching &#x60;id&#x60; value. (optional)
     * @param assigneeType Filters for role assignments for the assignee of the given type. (optional)
     * @param assigneeId Filters for role assignments for the assignee that has a matching &#x60;id&#x60; value. The &#x60;assignee_type&#x60; must also be specified. (optional)
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @return RoleAssignments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of role assignments. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public RoleAssignments listRoleAssignments(UUID roleId, String assigneeType, UUID assigneeId, Integer limit, String cursor) throws ApiException {
        ApiResponse<RoleAssignments> localVarResp = listRoleAssignmentsWithHttpInfo(roleId, assigneeType, assigneeId, limit, cursor);
        return localVarResp.getData();
    }

    /**
     * List role assignments
     * Returns a list of role assignments.  Role assignments can be filtered for a given role by providing the &#x60;role_id&#x60; search parameter, or for a given assignee by providing both the &#x60;assignee_type&#x60; and &#x60;assignee_id&#x60; parameters.
     * @param roleId Filters for role assignments for the role that has a matching &#x60;id&#x60; value. (optional)
     * @param assigneeType Filters for role assignments for the assignee of the given type. (optional)
     * @param assigneeId Filters for role assignments for the assignee that has a matching &#x60;id&#x60; value. The &#x60;assignee_type&#x60; must also be specified. (optional)
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @return ApiResponse&lt;RoleAssignments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of role assignments. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RoleAssignments> listRoleAssignmentsWithHttpInfo(UUID roleId, String assigneeType, UUID assigneeId, Integer limit, String cursor) throws ApiException {
        okhttp3.Call localVarCall = listRoleAssignmentsValidateBeforeCall(roleId, assigneeType, assigneeId, limit, cursor, null);
        Type localVarReturnType = new TypeToken<RoleAssignments>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List role assignments (asynchronously)
     * Returns a list of role assignments.  Role assignments can be filtered for a given role by providing the &#x60;role_id&#x60; search parameter, or for a given assignee by providing both the &#x60;assignee_type&#x60; and &#x60;assignee_id&#x60; parameters.
     * @param roleId Filters for role assignments for the role that has a matching &#x60;id&#x60; value. (optional)
     * @param assigneeType Filters for role assignments for the assignee of the given type. (optional)
     * @param assigneeId Filters for role assignments for the assignee that has a matching &#x60;id&#x60; value. The &#x60;assignee_type&#x60; must also be specified. (optional)
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of role assignments. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listRoleAssignmentsAsync(UUID roleId, String assigneeType, UUID assigneeId, Integer limit, String cursor, final ApiCallback<RoleAssignments> _callback) throws ApiException {

        okhttp3.Call localVarCall = listRoleAssignmentsValidateBeforeCall(roleId, assigneeType, assigneeId, limit, cursor, _callback);
        Type localVarReturnType = new TypeToken<RoleAssignments>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listRoles
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of roles. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listRolesCall(Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles";

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
    private okhttp3.Call listRolesValidateBeforeCall(Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listRolesCall(limit, cursor, _callback);
        return localVarCall;

    }

    /**
     * List roles
     * Returns a list of roles.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @return Roles
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of roles. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public Roles listRoles(Integer limit, String cursor) throws ApiException {
        ApiResponse<Roles> localVarResp = listRolesWithHttpInfo(limit, cursor);
        return localVarResp.getData();
    }

    /**
     * List roles
     * Returns a list of roles.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @return ApiResponse&lt;Roles&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of roles. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Roles> listRolesWithHttpInfo(Integer limit, String cursor) throws ApiException {
        okhttp3.Call localVarCall = listRolesValidateBeforeCall(limit, cursor, null);
        Type localVarReturnType = new TypeToken<Roles>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List roles (asynchronously)
     * Returns a list of roles.
     * @param limit Defines the maximum number of items to return for this request. (optional, default to 20)
     * @param cursor A cursor that identifies the page of results to return. This is used to paginate the results of this API.  For the first page of results, this parameter can be left out. For additional pages, use the value returned by the API in the &#x60;next_cursor&#x60; field. Similarly the &#x60;previous_cursor&#x60; can be used to reverse backwards in the list. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of roles. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listRolesAsync(Integer limit, String cursor, final ApiCallback<Roles> _callback) throws ApiException {

        okhttp3.Call localVarCall = listRolesValidateBeforeCall(limit, cursor, _callback);
        Type localVarReturnType = new TypeToken<Roles>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}