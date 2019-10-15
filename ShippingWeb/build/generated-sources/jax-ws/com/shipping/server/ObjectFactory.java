
package com.shipping.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.shipping.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IndexCustomers_QNAME = new QName("http://server.shipping.com/", "indexCustomers");
    private final static QName _IndexCustomersResponse_QNAME = new QName("http://server.shipping.com/", "indexCustomersResponse");
    private final static QName _IndexPackages_QNAME = new QName("http://server.shipping.com/", "indexPackages");
    private final static QName _IndexPackagesResponse_QNAME = new QName("http://server.shipping.com/", "indexPackagesResponse");
    private final static QName _ShowCustomer_QNAME = new QName("http://server.shipping.com/", "showCustomer");
    private final static QName _ShowCustomerResponse_QNAME = new QName("http://server.shipping.com/", "showCustomerResponse");
    private final static QName _ShowPackage_QNAME = new QName("http://server.shipping.com/", "showPackage");
    private final static QName _ShowPackageResponse_QNAME = new QName("http://server.shipping.com/", "showPackageResponse");
    private final static QName _StoreCustomer_QNAME = new QName("http://server.shipping.com/", "storeCustomer");
    private final static QName _StoreCustomerResponse_QNAME = new QName("http://server.shipping.com/", "storeCustomerResponse");
    private final static QName _StorePackage_QNAME = new QName("http://server.shipping.com/", "storePackage");
    private final static QName _StorePackageResponse_QNAME = new QName("http://server.shipping.com/", "storePackageResponse");
    private final static QName _UpdateCustomer_QNAME = new QName("http://server.shipping.com/", "updateCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://server.shipping.com/", "updateCustomerResponse");
    private final static QName _UpdatePackage_QNAME = new QName("http://server.shipping.com/", "updatePackage");
    private final static QName _UpdatePackageResponse_QNAME = new QName("http://server.shipping.com/", "updatePackageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.shipping.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndexCustomers }
     * 
     */
    public IndexCustomers createIndexCustomers() {
        return new IndexCustomers();
    }

    /**
     * Create an instance of {@link IndexCustomersResponse }
     * 
     */
    public IndexCustomersResponse createIndexCustomersResponse() {
        return new IndexCustomersResponse();
    }

    /**
     * Create an instance of {@link IndexPackages }
     * 
     */
    public IndexPackages createIndexPackages() {
        return new IndexPackages();
    }

    /**
     * Create an instance of {@link IndexPackagesResponse }
     * 
     */
    public IndexPackagesResponse createIndexPackagesResponse() {
        return new IndexPackagesResponse();
    }

    /**
     * Create an instance of {@link ShowCustomer }
     * 
     */
    public ShowCustomer createShowCustomer() {
        return new ShowCustomer();
    }

    /**
     * Create an instance of {@link ShowCustomerResponse }
     * 
     */
    public ShowCustomerResponse createShowCustomerResponse() {
        return new ShowCustomerResponse();
    }

    /**
     * Create an instance of {@link ShowPackage }
     * 
     */
    public ShowPackage createShowPackage() {
        return new ShowPackage();
    }

    /**
     * Create an instance of {@link ShowPackageResponse }
     * 
     */
    public ShowPackageResponse createShowPackageResponse() {
        return new ShowPackageResponse();
    }

    /**
     * Create an instance of {@link StoreCustomer }
     * 
     */
    public StoreCustomer createStoreCustomer() {
        return new StoreCustomer();
    }

    /**
     * Create an instance of {@link StoreCustomerResponse }
     * 
     */
    public StoreCustomerResponse createStoreCustomerResponse() {
        return new StoreCustomerResponse();
    }

    /**
     * Create an instance of {@link StorePackage }
     * 
     */
    public StorePackage createStorePackage() {
        return new StorePackage();
    }

    /**
     * Create an instance of {@link StorePackageResponse }
     * 
     */
    public StorePackageResponse createStorePackageResponse() {
        return new StorePackageResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdatePackage }
     * 
     */
    public UpdatePackage createUpdatePackage() {
        return new UpdatePackage();
    }

    /**
     * Create an instance of {@link UpdatePackageResponse }
     * 
     */
    public UpdatePackageResponse createUpdatePackageResponse() {
        return new UpdatePackageResponse();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexCustomers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexCustomers }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "indexCustomers")
    public JAXBElement<IndexCustomers> createIndexCustomers(IndexCustomers value) {
        return new JAXBElement<IndexCustomers>(_IndexCustomers_QNAME, IndexCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "indexCustomersResponse")
    public JAXBElement<IndexCustomersResponse> createIndexCustomersResponse(IndexCustomersResponse value) {
        return new JAXBElement<IndexCustomersResponse>(_IndexCustomersResponse_QNAME, IndexCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexPackages }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexPackages }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "indexPackages")
    public JAXBElement<IndexPackages> createIndexPackages(IndexPackages value) {
        return new JAXBElement<IndexPackages>(_IndexPackages_QNAME, IndexPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexPackagesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexPackagesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "indexPackagesResponse")
    public JAXBElement<IndexPackagesResponse> createIndexPackagesResponse(IndexPackagesResponse value) {
        return new JAXBElement<IndexPackagesResponse>(_IndexPackagesResponse_QNAME, IndexPackagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "showCustomer")
    public JAXBElement<ShowCustomer> createShowCustomer(ShowCustomer value) {
        return new JAXBElement<ShowCustomer>(_ShowCustomer_QNAME, ShowCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "showCustomerResponse")
    public JAXBElement<ShowCustomerResponse> createShowCustomerResponse(ShowCustomerResponse value) {
        return new JAXBElement<ShowCustomerResponse>(_ShowCustomerResponse_QNAME, ShowCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowPackage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowPackage }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "showPackage")
    public JAXBElement<ShowPackage> createShowPackage(ShowPackage value) {
        return new JAXBElement<ShowPackage>(_ShowPackage_QNAME, ShowPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowPackageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowPackageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "showPackageResponse")
    public JAXBElement<ShowPackageResponse> createShowPackageResponse(ShowPackageResponse value) {
        return new JAXBElement<ShowPackageResponse>(_ShowPackageResponse_QNAME, ShowPackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "storeCustomer")
    public JAXBElement<StoreCustomer> createStoreCustomer(StoreCustomer value) {
        return new JAXBElement<StoreCustomer>(_StoreCustomer_QNAME, StoreCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "storeCustomerResponse")
    public JAXBElement<StoreCustomerResponse> createStoreCustomerResponse(StoreCustomerResponse value) {
        return new JAXBElement<StoreCustomerResponse>(_StoreCustomerResponse_QNAME, StoreCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorePackage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StorePackage }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "storePackage")
    public JAXBElement<StorePackage> createStorePackage(StorePackage value) {
        return new JAXBElement<StorePackage>(_StorePackage_QNAME, StorePackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorePackageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StorePackageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "storePackageResponse")
    public JAXBElement<StorePackageResponse> createStorePackageResponse(StorePackageResponse value) {
        return new JAXBElement<StorePackageResponse>(_StorePackageResponse_QNAME, StorePackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePackage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePackage }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "updatePackage")
    public JAXBElement<UpdatePackage> createUpdatePackage(UpdatePackage value) {
        return new JAXBElement<UpdatePackage>(_UpdatePackage_QNAME, UpdatePackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePackageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePackageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.shipping.com/", name = "updatePackageResponse")
    public JAXBElement<UpdatePackageResponse> createUpdatePackageResponse(UpdatePackageResponse value) {
        return new JAXBElement<UpdatePackageResponse>(_UpdatePackageResponse_QNAME, UpdatePackageResponse.class, null, value);
    }

}
