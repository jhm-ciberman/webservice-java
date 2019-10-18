/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import com.shipping.server.Customer;
import com.shipping.web.URL;

/**
 *
 * @author jhmci
 */
public class CustomersCreateView extends EditView<Customer> {

    public CustomersCreateView() {
        super(new Customer());
    }

    @Override
    protected String getTitle(Customer model) {
        return "Nuevo cliente";
    }
    
    @Override
    protected String[] getFields(Customer model) {
        return new String[]{
            this.text("Nombre", "name", ""),
            this.text("Apellido", "surname", ""),
            this.text("DNI", "dni", model.getDni()),
            this.text("Teléfono", "phone", ""),
            this.text("Calle nombre", "street_name", ""),
            this.text("Calle número", "street_number", ""),
        };
    }

    @Override
    protected String formAction() {
        return URL.generate("customers", "");
    }
}
