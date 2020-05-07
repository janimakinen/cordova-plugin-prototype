package com.cordovapluginprototype;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestPrototype extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("test".equals(action)) {
            String str = args.getString(0);
            callbackContext.success("Message from plugin prototype: " + str);
            return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }
}
