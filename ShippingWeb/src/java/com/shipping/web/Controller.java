/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.web;

import com.shipping.server.ShippingWebService;
import com.shipping.server.ShippingWebService_Service;

/**
 *
 * @author jhmci
 */
public abstract class Controller {
    protected ShippingWebService getWebService() {
        ShippingWebService_Service service = new com.shipping.server.ShippingWebService_Service();
        return service.getShippingWebServicePort();
    }
}
