package com.paypal;
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
public class Credentials {
    static String clientId = "AS6ai-fj6adb4_EWQYL7HVMGbvIWQCc7JR5TDbr3ksVFajZOqItNqdP3vQIRVebuxTFUIl7TiYNbNpN3";
    static String secret = "EPG75xEXE_5OkuMiPQjZJs5kIZaHoVgI7bvng-N32M-p3qumHPylsjYDF-0oZufh5e0vlySA9ddo_R99";

    // Creating a sandbox environment
    private static PayPalEnvironment environment = new PayPalEnvironment.Sandbox(clientId, secret);

    // Creating a client for the environment
    static PayPalHttpClient client = new PayPalHttpClient(environment);
}