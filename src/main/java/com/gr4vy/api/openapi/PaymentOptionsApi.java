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


import com.gr4vy.api.model.Error400BadRequest;
import com.gr4vy.api.model.Error401Unauthorized;
import com.gr4vy.api.model.PaymentOptions;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentOptionsApi {
    private ApiClient localVarApiClient;

    public PaymentOptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentOptionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listPaymentOptions
     * @param country Filters the results to only the items which support this country code. A country is formatted as 2-letter ISO country code. (optional)
     * @param currency Filters the results to only the items which support this currency code. A currency is formatted as 3-letter ISO currency code. (optional)
     * @param environment Filters the results to only the items available in this environment. (optional, default to production)
     * @param locale An ISO 639-1 Language Code and optional ISO 3166 Country Code. This locale determines the language for the labels returned for every payment option. (optional, default to en-US)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of available payment options for the given query parameters. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if  any of the query parameters are not recognised. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaymentOptionsCall(String country, String currency, String environment, String locale, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment-options";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (environment != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("environment", environment));
        }

        if (locale != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("locale", locale));
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
    private okhttp3.Call listPaymentOptionsValidateBeforeCall(String country, String currency, String environment, String locale, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listPaymentOptionsCall(country, currency, environment, locale, _callback);
        return localVarCall;

    }

    /**
     * List payment options
     * Returns a list of available payment method options for a currency and country.
     * @param country Filters the results to only the items which support this country code. A country is formatted as 2-letter ISO country code. (optional)
     * @param currency Filters the results to only the items which support this currency code. A currency is formatted as 3-letter ISO currency code. (optional)
     * @param environment Filters the results to only the items available in this environment. (optional, default to production)
     * @param locale An ISO 639-1 Language Code and optional ISO 3166 Country Code. This locale determines the language for the labels returned for every payment option. (optional, default to en-US)
     * @return PaymentOptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of available payment options for the given query parameters. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if  any of the query parameters are not recognised. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentOptions listPaymentOptions(String country, String currency, String environment, String locale) throws ApiException {
        ApiResponse<PaymentOptions> localVarResp = listPaymentOptionsWithHttpInfo(country, currency, environment, locale);
        return localVarResp.getData();
    }

    /**
     * List payment options
     * Returns a list of available payment method options for a currency and country.
     * @param country Filters the results to only the items which support this country code. A country is formatted as 2-letter ISO country code. (optional)
     * @param currency Filters the results to only the items which support this currency code. A currency is formatted as 3-letter ISO currency code. (optional)
     * @param environment Filters the results to only the items available in this environment. (optional, default to production)
     * @param locale An ISO 639-1 Language Code and optional ISO 3166 Country Code. This locale determines the language for the labels returned for every payment option. (optional, default to en-US)
     * @return ApiResponse&lt;PaymentOptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of available payment options for the given query parameters. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if  any of the query parameters are not recognised. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentOptions> listPaymentOptionsWithHttpInfo(String country, String currency, String environment, String locale) throws ApiException {
        okhttp3.Call localVarCall = listPaymentOptionsValidateBeforeCall(country, currency, environment, locale, null);
        Type localVarReturnType = new TypeToken<PaymentOptions>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List payment options (asynchronously)
     * Returns a list of available payment method options for a currency and country.
     * @param country Filters the results to only the items which support this country code. A country is formatted as 2-letter ISO country code. (optional)
     * @param currency Filters the results to only the items which support this currency code. A currency is formatted as 3-letter ISO currency code. (optional)
     * @param environment Filters the results to only the items available in this environment. (optional, default to production)
     * @param locale An ISO 639-1 Language Code and optional ISO 3166 Country Code. This locale determines the language for the labels returned for every payment option. (optional, default to en-US)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of available payment options for the given query parameters. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returns an error if  any of the query parameters are not recognised. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returns an error if no valid authentication was provided. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaymentOptionsAsync(String country, String currency, String environment, String locale, final ApiCallback<PaymentOptions> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPaymentOptionsValidateBeforeCall(country, currency, environment, locale, _callback);
        Type localVarReturnType = new TypeToken<PaymentOptions>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
