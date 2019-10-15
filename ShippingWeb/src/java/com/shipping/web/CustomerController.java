/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web;

import com.shipping.web.views.View;
import java.util.List;
import com.shipping.server.Customer;
import com.shipping.web.views.CustomerEditView;
import com.shipping.web.views.CustomerIndexView;
import com.shipping.web.views.CustomerShowView;
/**
 *
 * @author jhmci
 */
public class CustomerController extends Controller {
    
    public Response index(Request request)
    {
        List<Customer> customers = getWebService().indexCustomers();
        
        return Response.make(new CustomerIndexView(customers));
    }

    public Response show(Request request)
    {
        Customer customer = getWebService().showCustomer(request.getInputInt("id"));
        
        return Response.make(new CustomerShowView(customer));
    }
    
    public Response edit(Request request)
    {
        Customer customer = getWebService().showCustomer(request.getInputInt("id"));
        
        return Response.make(new CustomerEditView(customer));
    }
}
