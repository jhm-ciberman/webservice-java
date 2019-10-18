/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import com.shipping.server.Customer; 

/**
 *
 * @author jhmci
 */
public class CustomersShowView extends ShowView<Customer> {

    public CustomersShowView(Customer model) {
        super(model);
    }

    @Override
    protected String getTitle(Customer model) {
        return "Detalles de cliente";
    }

    @Override
    protected String[] getHeaders() {
        return new String[]{
            "Id",
            "Nombre",
            "Apellido",
            "DNI",
            "Teléfono",
            "Dirección",
            "Fecha de creación",
        };
    }

    @Override
    protected String[] getValues(Customer model) {
        return new String[]{
            model.getId().toString(),
            model.getName(),
            model.getSurname(),
            model.getDni(),
            model.getPhone(),
            model.getStreetName() + " " + model.getStreetNumber(),
            model.getCreatedAt().toString(),
        };
    }
    
    @Override
    protected String getResourceName() {
       return "customers";
    }
}
