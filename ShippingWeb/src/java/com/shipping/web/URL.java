package com.shipping.web;

/**
 *
 * @author jhmci
 */
public class URL {
    
    public static String make(String url) {
        if (! url.startsWith("/")) {
            url = "/" + url;
        }
        return "/ShippingWeb" + url;
    }
    
    public static String generate(String resource, String action) {
        if (action.isEmpty()) {
            return make(resource);
        }
        return make(resource + "/" + action);
    }
    
    public static String generate(String resource, String action, Integer id) {
        return generate(resource, action) + "?id=" + id.toString();
    }
    
}
