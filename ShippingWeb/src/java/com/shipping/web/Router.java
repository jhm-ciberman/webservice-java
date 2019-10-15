package com.shipping.web;

import com.shipping.web.views.ErrorView;
import com.shipping.web.views.View;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhmci
 */
public class Router {
    
    protected List<Route> routes = new ArrayList<>();
    
    public Router() {
        
    }
    
    public void get(String route, String action) {
        this.route("GET", route, action);
    }
    
    public void post(String route, String action) {
        this.route("POST", route, action);
    }
    
    public void route(String method, String route, String action) {
        this.routes.add(new Route(method, route, action));
    }
    
    public Response handle(Request request) {
        for (Route route : routes) {
            if (match(route, request)) {
                return route.callControllerAction(request);
            }
        }
        return null;
    }

    protected boolean match(Route route, Request request) {

        if (! request.getMethod().equals(route.method)) {
            return false;
        }
        Matcher m = route.regexPattern.matcher(request.getRoute());
        boolean b = m.matches();
        if (! b) {
            return false; 
        }
        return true;
    }
}
