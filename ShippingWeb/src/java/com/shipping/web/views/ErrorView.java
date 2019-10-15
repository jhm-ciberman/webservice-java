/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

/**
 *
 * @author jhmci
 */
public class ErrorView extends LayoutView {
    
    protected String message;
    
    public ErrorView(String message) {
        this.message = message;
    }
    
    public void content() {
        println("<h1>" + this.message + "</h1>");
    }
}
