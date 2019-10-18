/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import java.util.List;
import com.shipping.server.Model;
import com.shipping.web.URL;

/**
 *
 * @author jhmci
 */
public abstract class IndexView<M extends Model> extends LayoutView {

    private List<M> models;
    
    public IndexView(List<M> models) {
        this.models = models;
    }
    
    protected void content() {
        println("<div class=\"row\">");
        println("<div class=\"col\">");
        println("<h1>" + getTitle() + "</h1>");
        println("</div>");
        println("<div class=\"col-auto\">");
        String createUrl = URL.generate(this.getResourceName(), "create");
        println("<a class=\"btn btn-primary\" href=\"" + createUrl + "\">Nuevo</a>");
        println("</div>");
        println("</div>");
        
        println("<div class=\"card shadow border-0\">");
        println("<table class=\"table table-hover\">");
        println("<thead>");
        println("<tr>");
        for(String title : getHeaders()) {
            println("<th>" + title + "</th>");
        }
        println("<th></th>");
        println("</tr>");
        println("</thead>");
        
        println("<tbody>");
        for(M model : models) {
            println("<tr>");
            for(String value : getRowValues(model)) {
                println("<td>" + value + "</td>");
            }
            String link = URL.generate(getResourceName(), "show", model.getId());
            println("<td><a href=\"" + link + "\">Ver</a></td>");
            println("</tr>");
        }
        println("</tbody>");
        println("</table>");
        println("</div>");
    }
    
    abstract String[] getRowValues(M model);
    
    abstract String[] getHeaders();
    
    abstract String getTitle();
    
    abstract String getResourceName();
}
