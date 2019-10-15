
package com.shipping.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para storePackage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="storePackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stretNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storePackage", propOrder = {
    "shippingCost",
    "weight",
    "streetName",
    "stretNumber",
    "width",
    "height",
    "depth"
})
public class StorePackage {

    protected int shippingCost;
    protected int weight;
    protected String streetName;
    protected String stretNumber;
    protected int width;
    protected int height;
    protected int depth;

    /**
     * Obtiene el valor de la propiedad shippingCost.
     * 
     */
    public int getShippingCost() {
        return shippingCost;
    }

    /**
     * Define el valor de la propiedad shippingCost.
     * 
     */
    public void setShippingCost(int value) {
        this.shippingCost = value;
    }

    /**
     * Obtiene el valor de la propiedad weight.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Define el valor de la propiedad weight.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

    /**
     * Obtiene el valor de la propiedad streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Define el valor de la propiedad streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Obtiene el valor de la propiedad stretNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStretNumber() {
        return stretNumber;
    }

    /**
     * Define el valor de la propiedad stretNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStretNumber(String value) {
        this.stretNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad depth.
     * 
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Define el valor de la propiedad depth.
     * 
     */
    public void setDepth(int value) {
        this.depth = value;
    }

}
