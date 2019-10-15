/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import com.shipping.web.Response;
import com.shipping.web.Response;
import java.io.PrintWriter;

/**
 *
 * @author jhmci
 */
public abstract class View {
  
    private PrintWriter out;
    
    public void setPrintWriter(PrintWriter out) {
        this.out = out;
    }

    public abstract void render();
    
    protected void println(String str) {
        out.println(str);
    }
    
    protected void print(String str) {
        out.print(str);
    }
}
