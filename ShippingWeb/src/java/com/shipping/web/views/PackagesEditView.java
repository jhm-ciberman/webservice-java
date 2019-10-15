/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web.views;

import com.shipping.server.Package; 
import com.shipping.web.URL;

/**
 *
 * @author jhmci
 */
public class PackagesEditView extends EditView<Package> {

    public PackagesEditView(Package model) {
        super(model);
    }

    @Override
    protected String getTitle(Package model) {
        return "Editar paquete";
    }

    @Override
    protected String[] getFields(Package model) {
        return new String[]{
            this.number("Costo de envio (centavos)", "shipping_cost", model.getShippingCost()),
            this.text("Calle nombre", "street_name", model.getStreetName()),
            this.text("Calle número", "street_number", model.getStreetNumber()),
            this.number("Peso (gramos)", "weight", model.getWeight()),
            this.number("Ancho (cm)", "width", model.getWidth()),
            this.number("Alto (cm)", "height", model.getHeight()),
            this.number("Profundidad (cm)", "depth", model.getDepth()),
        };
    }

    @Override
    protected String formAction() {
        return URL.generate("customers", "", this.model.getId());
    }
}
