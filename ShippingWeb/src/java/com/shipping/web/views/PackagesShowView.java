/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import com.shipping.server.Package; 

/**
 *
 * @author jhmci
 */
public class PackagesShowView extends ShowView<Package> {

    public PackagesShowView(Package model) {
        super(model);
    }

    @Override
    protected String getTitle(Package model) {
        return "Detalle de paquete";
    }

    @Override
    protected String[] getHeaders() {
        return new String[] {
            "Id",
            "Costo de envio",
            "Calle",
            "Peso",
            "Ancho",
            "Alto",
            "Profundidad",
            "Fecha de creación",
        };
    }

    @Override
    protected String[] getValues(Package model) {
        return new String[]{
            model.getId().toString(),
            "$ " + model.getShippingCost(),
            model.getStreetName() + " " + model.getStreetNumber(),
            Integer.toString(model.getWeight()) + " g",
            Integer.toString(model.getWidth()) + " cm",
            Integer.toString(model.getHeight()) + " cm",
            Integer.toString(model.getDepth()) + " cm",
            model.getCreatedAt().toString(),
        };
    }

    @Override
    protected String getResourceName() {
       return "packages";
    }
    
}
