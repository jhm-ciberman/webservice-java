package com.shipping.web;

import com.shipping.web.views.View;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Response {

    protected View view;
    
    protected Map<String, String> headers = new HashMap<>();
    
    protected int status = 200;
    
    public Response() {}
    
    public Response(View view) {
        this.setView(view);
    }
    
    public static Response make() {
        return new Response();
    }
    
    public static Response make(View view) {
        return new Response(view);
    }
    
    public static Response redirect(String location) {
        return make().setRedirect(location);
    }
    
    public static Response make(int status, View view) {
        return make().setStatus(status);
    }
    
    public Response setView(View view) {
        this.view = view;
        return this;
    }
    
    public Response setStatus(int status) {
        this.status = status;
        return this;
    }
    
    public Response setRedirect(String location) {
        return this.setStatus(303).setHeader("Location", location);
    }
    
    public Response setHeader(String header, String value) {
        this.headers.put(header, value);
        return this;
    }
    
    public void render(HttpServletResponse response) {
        response.setStatus(this.status);
        
        headers.keySet().forEach((header) -> {
            response.setHeader(header, headers.get(header));
        });
        
        if (this.view != null) {
            this.renderView(response);
        }
    }
    
    protected void renderView(HttpServletResponse originalResponse) {
        try (PrintWriter out = originalResponse.getWriter()) {
            originalResponse.setContentType("text/html;charset=UTF-8");
            view.setPrintWriter(out);
            view.render();
        } catch (IOException ex) {
            Logger.getLogger(Response.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
