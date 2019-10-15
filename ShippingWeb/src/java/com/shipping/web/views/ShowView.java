/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import java.io.PrintWriter;
import java.util.List;
import com.shipping.server.Model;
import com.shipping.web.URL;

/**
 *
 * @author jhmci
 */
public abstract class ShowView<M extends Model> extends LayoutView {

    private M model;
    
    public ShowView(M model) {
        this.model = model;
    }
    
    protected void content() {
        println("<div class=\"row\">");
        println("<div class=\"col\">");
        println("<h1>" + getTitle(model) + "</h1>");
        println("</div>");
        println("<div class=\"col-auto\">");
        String editUrl = URL.generate(this.getResourceName(), "edit", this.model.getId());
        println("<a class=\"btn btn-primary\" href=\"" + editUrl + "\">Editar</a>");
        println("</div>");
        println("</div>");
        
        String[] headers = getHeaders();
        String[] values = getValues(model); 
        
        println("<div class=\"card shadow border-0\">");
        println("<div class=\"card-body\">");
        for(int i = 0; i < headers.length; i++) {
            println("<div class=\"form-group row\">");
            println("<label class=\"col-sm-3 col-form-label font-weight-bold\">");
            println(headers[i]);
            println("</label>");
            println("<div class=\"col-sm-9\">");
            println(values[i]);
            println("</div>");
            println("</div>");
        }
        println("</div>");
        println("</div>");
    }
    
    protected abstract String[] getHeaders();
    
    protected abstract String[] getValues(M model);
    
    protected abstract String getTitle(M model);
    
    protected abstract String getResourceName();
    
}
