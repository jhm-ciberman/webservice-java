/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import com.shipping.server.models.Package;
import com.shipping.server.models.Customer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 *
 * @author jhmci
 */
@WebService(serviceName = "ShippingWebService")
public class ShippingWebService {

    private MemoryRepository<Customer> customerRepository = new MemoryRepository();
    private MemoryRepository<Package> packagesRepository = new MemoryRepository();
    
    
    public ShippingWebService() {
        DatabaseSeeder seeder = new DatabaseSeeder();
        seeder.seedPackages(packagesRepository);
        seeder.seedCustomers(customerRepository);
    }

    // ------------------------------------
    // Package
    // ------------------------------------
    
    @WebResult(name = "Package")
    @WebMethod(operationName = "showPackage")
    public Package showPackage(@WebParam(name = "id") Integer id) {
        return this.packagesRepository.find(id);
    }
    
    
    @WebResult(name = "Package")
    @WebMethod(operationName = "indexPackages")
    public Collection<Package> indexPackages() {
        return this.packagesRepository.getAll();
    }
    
    @WebResult(name = "Package")
    @WebMethod(operationName = "storePackage")
    public Package storePackage(
            @WebParam(name = "shippingCost") int shippingCost,
            @WebParam(name = "weight") int weight,
            @WebParam(name = "streetName") String streetName,
            @WebParam(name = "stretNumber") String stretNumber,
            @WebParam(name = "width") int width,
            @WebParam(name = "height") int height,
            @WebParam(name = "depth") int depth
    ) {
        Package pack = new Package(shippingCost, weight, streetName, stretNumber, width, height, depth);
        this.packagesRepository.save(pack);
        return pack;
    }
    
    @WebResult(name = "Package")
    @WebMethod(operationName = "updatePackage")
    public Package updatePackage(
            @WebParam(name = "id") int id,
            @WebParam(name = "shippingCost") int shippingCost,
            @WebParam(name = "weight") int weight,
            @WebParam(name = "streetName") String streetName,
            @WebParam(name = "stretNumber") String stretNumber,
            @WebParam(name = "width") int width,
            @WebParam(name = "height") int height,
            @WebParam(name = "depth") int depth
    ) {
        Package pack = this.packagesRepository.find(id);
        if (pack != null) {
            pack.setShippingCost(shippingCost);
            pack.setWeight(weight);
            pack.setStreetName(streetName);
            pack.setStreetNumber(stretNumber);
            pack.setWidth(width);
            pack.setWidth(width);
            pack.setHeight(height);
            pack.setDepth(depth);
            this.packagesRepository.save(pack);
        }
        return pack;
    }
    
    // ------------------------------------
    // Customer
    // ------------------------------------
    
    @WebResult(name = "Customer")
    @WebMethod(operationName = "showCustomer")
    public Customer showCustomer(@WebParam(name = "id") Integer id) {
        return this.customerRepository.find(id);
    }
    
    
    @WebResult(name = "Customer")
    @WebMethod(operationName = "indexCustomers")
    public Collection<Customer> indexCustomers() {
        return this.customerRepository.getAll();
    }
    
    @WebResult(name = "Customer")
    @WebMethod(operationName = "storeCustomer")
    public Customer storeCustomer(
        @WebParam(name = "name") String name,
        @WebParam(name = "surname") String surname,
        @WebParam(name = "phone") String phone,
        @WebParam(name = "dni") String dni,
        @WebParam(name = "streetName") String streetName,
        @WebParam(name = "streetNumber") String streetNumber
    ) {
        Customer customer = new Customer(name, surname, phone, dni, streetName, streetNumber);
        this.customerRepository.save(customer);
        return customer;
    }
    
    @WebResult(name = "Customer")
    @WebMethod(operationName = "updateCustomer")
    public Customer updateCustomer(
            @WebParam(name = "id") int id,
            @WebParam(name = "name") String name,
            @WebParam(name = "surname") String surname,
            @WebParam(name = "phone") String phone,
            @WebParam(name = "dni") String dni,
            @WebParam(name = "streetName") String streetName,
            @WebParam(name = "streetNumber") String streetNumber
    ) {
        Customer customer = this.customerRepository.find(id);
        if (customer != null) {
            
            customer.setName(name);
            customer.setSurname(surname);
            customer.setPhone(phone);
            customer.setDni(dni);
            customer.setStreetName(streetName);
            customer.setStreetNumber(streetNumber);
            this.customerRepository.save(customer);
        }
        return customer;
    }
    
    
}
