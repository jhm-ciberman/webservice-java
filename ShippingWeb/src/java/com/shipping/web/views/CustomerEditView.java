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
public class CustomerEditView extends EditView<Customer> {

    public CustomerEditView(Customer model) {
        super(model);
    }

    @Override
    protected String getTitle(Customer model) {
        return "Editar cliente";
    }

    @Override
    protected String[] getFields(Customer model) {
        return new String[]{
            this.text("Nombre", "name", model.getName()),
            this.text("Apellido", "surname", model.getSurname()),
            this.text("Teléfono", "phone", model.getPhone()),
            this.text("Calle nombre", "street_name", model.getStreetName()),
            this.text("Calle número", "street_number", model.getStreetNumber()),
        };
    }

    @Override
    protected String formAction() {
        return URL.generate("customers", "", this.model.getId());
    }

}
