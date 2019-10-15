/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jhmci
 */
public class Request {
    
    protected HttpServletRequest originalRequest;
    
    protected Map<String, String[]> inputs; 
    
    public Request(HttpServletRequest request) {
        this.originalRequest = request;
        this.inputs = this.originalRequest.getParameterMap();    
    }
    
    protected String getRoute() {
        return this.originalRequest.getServletPath();
    }
    
    protected String getMethod() {
        return this.originalRequest.getMethod();
    }
    
    protected String getInputString(String name) {
        return this.inputs.get(name)[0];
    }
    
    protected Integer getInputInt(String name) {
        return Integer.parseInt(getInputString(name));
    }
    
    public void addInput(String name, String value) {
        this.inputs.put(name, new String[]{value});
    }
    
}
