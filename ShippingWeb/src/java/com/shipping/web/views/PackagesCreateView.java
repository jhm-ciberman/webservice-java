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
public class PackagesCreateView extends EditView<Package> {

    public PackagesCreateView() {
        super(new Package());
    }

    @Override
    protected String getTitle(Package model) {
        return "Nuevo paquete";
    }
    
    @Override
    protected String[] getFields(Package model) {
        return new String[]{
            this.number("Costo de envio (centavos)", "shipping_cost", null),
            this.text("Calle nombre", "street_name", ""),
            this.text("Calle número", "street_number", ""),
            this.number("Peso (gramos)", "weight", null),
            this.number("Ancho (cm)", "width", null),
            this.number("Alto (cm)", "height", null),
            this.number("Profundidad (cm)", "depth", null),
        };
    }

    @Override
    protected String formAction() {
        return URL.generate("packages", "");
    }
}
