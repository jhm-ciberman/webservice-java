/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web;

import com.shipping.web.views.PackagesIndexView;
import java.util.List;
import com.shipping.server.Package;
import com.shipping.web.views.PackagesCreateView;
import com.shipping.web.views.PackagesEditView;
import com.shipping.web.views.PackagesShowView;
/**
 *
 * @author jhmci
 */
public class PackageController extends Controller {
    
    public Response index(Request request)
    {
        List<Package> packages = getWebService().indexPackages();
        
        return Response.make(new PackagesIndexView(packages));
    }
    
    public Response show(Request request)
    {
        Package pack = getWebService().showPackage(request.getInputInt("id"));
        
        return Response.make(new PackagesShowView(pack));
    }
    
    public Response edit(Request request)
    {
        Package pack = getWebService().showPackage(request.getInputInt("id"));
        
        return Response.make(new PackagesEditView(pack));
    }
    
    public Response create(Request request)
    {
        return Response.make(new PackagesCreateView());
    }
    
    public Response store(Request request)
    {
        Package pack = getWebService().storePackage(
            request.getInputInt("shipping_cost"),
            request.getInputInt("weight"),
            request.getInputString("street_name"),
            request.getInputString("street_number"),
            request.getInputInt("width"),
            request.getInputInt("height"),
            request.getInputInt("depth")
        );
        
        return Response.redirect(URL.generate("packages", "show", pack.getId()));
    }
    
    public Response update(Request request)
    {
        Package pack = getWebService().updatePackage(
            request.getInputInt("id"),
            request.getInputInt("shipping_cost"),
            request.getInputInt("weight"),
            request.getInputString("street_name"),
            request.getInputString("street_number"),
            request.getInputInt("width"),
            request.getInputInt("height"),
            request.getInputInt("depth")
        );
            
        return Response.redirect(URL.generate("packages", "show", pack.getId()));
    }
}
