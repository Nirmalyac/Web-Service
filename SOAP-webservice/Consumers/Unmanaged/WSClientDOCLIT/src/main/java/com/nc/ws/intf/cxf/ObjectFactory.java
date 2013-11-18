
package com.nc.ws.intf.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nc.ws.intf package. 
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

    private final static QName _CheckProfileResponse_QNAME = new QName("http://intf.ws.nc.com/", "checkProfileResponse");
    private final static QName _CheckProfile_QNAME = new QName("http://intf.ws.nc.com/", "checkProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nc.ws.intf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckProfile }
     * 
     */
    public CheckProfile createCheckProfile() {
        return new CheckProfile();
    }

    /**
     * Create an instance of {@link CheckProfileResponse }
     * 
     */
    public CheckProfileResponse createCheckProfileResponse() {
        return new CheckProfileResponse();
    }

    /**
     * Create an instance of {@link CardHolder }
     * 
     */
    public CardHolder createCardHolder() {
        return new CardHolder();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.ws.nc.com/", name = "checkProfileResponse")
    public JAXBElement<CheckProfileResponse> createCheckProfileResponse(CheckProfileResponse value) {
        return new JAXBElement<CheckProfileResponse>(_CheckProfileResponse_QNAME, CheckProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://intf.ws.nc.com/", name = "checkProfile")
    public JAXBElement<CheckProfile> createCheckProfile(CheckProfile value) {
        return new JAXBElement<CheckProfile>(_CheckProfile_QNAME, CheckProfile.class, null, value);
    }

}
