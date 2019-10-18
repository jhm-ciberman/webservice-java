/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web;

import java.util.List;
import com.shipping.server.Customer;
import com.shipping.web.views.CustomersCreateView;
import com.shipping.web.views.CustomersEditView;
import com.shipping.web.views.CustomersIndexView;
import com.shipping.web.views.CustomersShowView;
/**
 *
 * @author jhmci
 */
public class CustomerController extends Controller {
    
    public Response index(Request request)
    {
        List<Customer> customers = getWebService().indexCustomers();
        
        return Response.make(new CustomersIndexView(customers));
    }

    public Response show(Request request)
    {
        Customer customer = getWebService().showCustomer(request.getInputInt("id"));
        
        return Response.make(new CustomersShowView(customer));
    }
    
    public Response edit(Request request)
    {
        Customer customer = getWebService().showCustomer(request.getInputInt("id"));
        
        return Response.make(new CustomersEditView(customer));
    }
    
    public Response create(Request request)
    {
        return Response.make(new CustomersCreateView());
    }
    
    public Response store(Request request)
    {
        Customer customer = getWebService().storeCustomer(
            request.getInputString("name"),
            request.getInputString("surname"),
            request.getInputString("phone"),
            request.getInputString("dni"),
            request.getInputString("street_name"),
            request.getInputString("street_number")
        );
        
        return Response.redirect(URL.generate("customers", "show", customer.getId()));
    }
    
    public Response update(Request request)
    {
        Customer customer = getWebService().updateCustomer(
            request.getInputInt("id"),
            request.getInputString("name"),
            request.getInputString("surname"),
            request.getInputString("phone"),
            request.getInputString("dni"),
            request.getInputString("street_name"),
            request.getInputString("street_number")
        );
            
        return Response.redirect(URL.generate("customers", "show", customer.getId()));
    }
    
}
