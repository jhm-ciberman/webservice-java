/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shipping.server;

import com.shipping.server.MemoryRepository;
import com.shipping.server.models.Package;
import com.shipping.server.models.Customer;

/**
 *
 * @author jhmci
 */
public class DatabaseSeeder {
    
    public void seedPackages(MemoryRepository<Package> rep) {
        
        for (int i = 0; i < 100; i++) {
            
            Integer shippingCost = this.randomInt(100, 10000);
            Integer weight = this.randomInt(100, 10000);
            
            String streetName = "Calle falsa";
            String stretNumber = "123a";

            Integer width = this.randomInt(10, 100);
            Integer height = this.randomInt(10, 100);
            Integer depth = this.randomInt(10, 100);
            
            Package p = new Package(shippingCost, weight, streetName, stretNumber, width, height, depth);
            rep.save(p);
        }
    }
    
    public void seedCustomers(MemoryRepository<Customer> rep) {
        
        for (int i = 0; i < 50; i++) {
            
            String name = "Juan";
            String surname = "Rodriguez";
            
            String phone = "+54 " + Integer.toString(this.randomInt(1000000, 9999999));
            
            String streetName = "Calle falsa";
            String stretNumber = Integer.toString(this.randomInt(10, 10000));

            String dni = Integer.toString(this.randomInt(20000000, 60000000));
            
            Customer p = new Customer(name, surname, phone, dni, streetName, stretNumber);
            rep.save(p);
        }
    }
    
    protected int randomInt(int min, int max) {
        return (int) (min + Math.random() * max);
    }
    
}
