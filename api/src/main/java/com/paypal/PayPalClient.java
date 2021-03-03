package com.paypal;

import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class PayPalClient {

    /**
     *Set up the PayPal Java SDK environment with PayPal access credentials.
     *This sample uses SandboxEnvironment. In production, use LiveEnvironment.
     */
    private PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
            "AS6ai-fj6adb4_EWQYL7HVMGbvIWQCc7JR5TDbr3ksVFajZOqItNqdP3vQIRVebuxTFUIl7TiYNbNpN3",
            "EPG75xEXE_5OkuMiPQjZJs5kIZaHoVgI7bvng-N32M-p3qumHPylsjYDF-0oZufh5e0vlySA9ddo_R99");

    /**
     *PayPal HTTP client instance with environment that has access
     *credentials context. Use to invoke PayPal APIs.
     */
    PayPalHttpClient client = new PayPalHttpClient(environment);

    /**
     *Method to get client object
     *
     *@return PayPalHttpClient client
     */
    public PayPalHttpClient client() {
        return this.client;
    }
}