/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shipping.server.models;

/**
 *
 * @author jhmci
 */
public class Customer extends Model {
    
    private String name;
    
    private String surname;
    
    private String phone;
    
    private String dni;
    
    private String streetName;
    
    private String streetNumber;

    public Customer(String name, String surname, String phone, String dni, String streetName, String streetNumber) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.dni = dni;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    
}
