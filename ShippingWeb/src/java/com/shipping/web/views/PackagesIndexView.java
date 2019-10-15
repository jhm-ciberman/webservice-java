/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import java.util.List;
import com.shipping.server.Package;

/**
 *
 * @author jhmci
 */
public class PackagesIndexView extends IndexView<Package> {

    public PackagesIndexView(List<Package> models) {
        super(models);
    }

    @Override
    String[] getRowValues(Package model) {
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
    String[] getHeaders() {
        return new String[]{
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
    String getTitle() {
        return "Paquetes";
    }

    @Override
    String getResourceName() {
        return "packages";
    }
    
}
