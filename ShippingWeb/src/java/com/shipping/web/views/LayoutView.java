/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import com.shipping.web.URL;

/**
 *
 * @author jhmci
 */
public class LayoutView extends View {

    
    @Override
    public void render() {
        println("<!DOCTYPE html>");
        println("<html>");
        println("<head>");
        println("<title>Package distribution</title>");
        
        // Bootstrap css
        print("<link rel=\"stylesheet\" ");
        print("href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"");
        print("integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
       
        
        // Nunito font
        println("<link href=\"https://fonts.googleapis.com/css?family=Nunito&display=swap\" rel=\"stylesheet\">");
        
        println("<style>");
        println("body {font-family: 'Nunito', sans-serif;background:#EFF1F4;}");
        println("th {border-top:0!important;}");
        styles();
        println("</style>");
        
        println("</head>");
        println("<body>");
        
        navbar();
        
        println("<div class=\"mt-3 container\">");

            content();
               
        println("</div>");
        
        // Javascript 
        println("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>");
        println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>");
        println("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
        
        println("</body>");
        println("</html>");
    }
    
    protected void content() {
        
    }
    
    protected void styles() {
        
    }
    
    protected void navbar() {
        println("<nav class=\"navbar navbar-dark bg-dark shadow-sm navbar-expand-md\">");
        println("<a class=\"navbar-brand\" href=\"#\">Administración</a>");
        println("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
        println("<span class=\"navbar-toggler-icon\"></span>");
        println("</button>");
        println("<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">");
        println("<ul class=\"navbar-nav mr-auto\">");

        navbarLink("Paquetes", "/packages");
        navbarLink("Clientes", "/customers");
        
        println("</ul>");
        println("</div>");
        println("</nav>");
    }
    
    protected void navbarLink(String label, String url) {
        println("<li class=\"nav-item\">");
        println("<a class=\"nav-link\" href=\"" + URL.make(url) + "\">" + label + "</a>");
        println("</li>");     
    }
}
