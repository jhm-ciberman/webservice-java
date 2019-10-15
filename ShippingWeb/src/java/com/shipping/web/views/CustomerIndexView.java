/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import java.util.List;
import com.shipping.server.Customer;

/**
 *
 * @author jhmci
 */
public class CustomerIndexView extends IndexView<Customer> {

    public CustomerIndexView(List<Customer> models) {
        super(models);
    }

    @Override
    String[] getRowValues(Customer model) {
        return new String[]{
            model.getId().toString(),
            model.getName(),
            model.getSurname(),
            model.getPhone(),
            model.getStreetName() + " " + model.getStreetNumber(),
            model.getCreatedAt().toString(),
        };
    }

    @Override
    String[] getHeaders() {
        return new String[]{
            "Id",
            "Nombre",
            "Apellido",
            "Teléfono",
            "Calle",
            "Fecha de creación",
        };
    }

    @Override
    String getTitle() {
        return "Clientes";
    }

    @Override
    String getResourceName() {
        return "customers";
    }
    
}
