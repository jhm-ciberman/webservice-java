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
public class Package extends Model {
    
    private int shippingCost;
    
    private int weight;
    
    private String streetName;
    
    private String stretNumber;
    
    private int width;
    
    private int height;
    
    private int depth;

    public Package(int shippingCost, int weight, String streetName, String stretNumber, int width, int height, int depth) {
        this.shippingCost = shippingCost;
        this.weight = weight;
        this.streetName = streetName;
        this.stretNumber = stretNumber;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public int getVolume() {
        return this.width * this.height * this.height;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStretNumber() {
        return stretNumber;
    }

    public void setStretNumber(String stretNumber) {
        this.stretNumber = stretNumber;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
}
