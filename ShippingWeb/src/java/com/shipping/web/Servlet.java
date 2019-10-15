/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web;

import com.shipping.web.views.View;
import com.shipping.web.views.ErrorView;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jhmci
 */
public class Servlet extends HttpServlet {
    
    protected Router router;
    
    public Servlet() {
        this.router = new Router();
        this.router.get("/customers", "CustomerController@index");
        this.router.get("/customers/show", "CustomerController@show");
        this.router.get("/customers/edit", "CustomerController@edit");
        
        this.router.get("/packages", "PackageController@index");
        this.router.get("/packages/show", "PackageController@show");
        this.router.get("/packages/edit", "PackageController@edit");
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest originalRequest, HttpServletResponse originalResponse)
            throws ServletException, IOException {
        
        Request request = new Request(originalRequest);
        Response response = this.router.handle(request);
        
        if (response == null) {
            response = Response.make(404, new ErrorView("Error 404: No encontrado"));
        }
        
        response.render(originalResponse);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
