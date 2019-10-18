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
public abstract class EditView<M extends Model> extends LayoutView {

    protected M model;
    
    public EditView(M model) {
        this.model = model;
    }
    
    protected void content() {
        println("<h1>" + getTitle(model) + "</h1>");
        
        String[] fields = getFields(model); 
        
        println("<form method=\"POST\" action=\"" + formAction() + "\">");
        println("<div class=\"card shadow border-0\">");
        println("<div class=\"card-body\">");
        for(String fieldHtml : fields) {
            println(fieldHtml);
        }
        println("<button class=\"px-4 float-right btn btn-lg btn-success\" type=\"submit\">" + submitText() + "</button>");
        
        println("</div>");
        
        println("</div>");

        println("</form>");
    }
    
    protected abstract String formAction();
    
    protected String submitText() {
        return "Enviar";
    }
    
    protected String makeFormGroup(String label, String fieldHtml)
    {
        return "<div class=\"form-group row\">" 
                + "<label class=\"col-sm-3 col-form-label font-weight-bold\">" 
                + label 
                + "</label>"
                + "<div class=\"col-sm-9\">"
                + fieldHtml
                + "</div>"
                + "</div>";
    }
    
        
    protected String number(String label, String name, Integer value) {
        return this.makeInput(label, "number", name, value == null ? "" : Integer.toString(value));
    }
    
    protected String text(String label, String name, String value) {
        return this.makeInput(label, "text", name, value);
    }
    
    protected String makeInput(String label, String type, String name, String value) {
        return this.makeFormGroup(label, "<input "
                + "class=\"form-control\" "
                + "id=\"" + name + "\" "
                + "name=\"" + name + "\" "
                + "type=\"" + type + "\" "
                + "value=\"" + (value == null ? "" : value) + "\">");
    }
    
    
    protected abstract String[] getFields(M model);
    
    protected abstract String getTitle(M model);
    
}
