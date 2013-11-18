
package com.nc.ws.impl.metro;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CardHolderProfileRPCLITServiceImplService", targetNamespace = "http://impl.ws.nc.com/", wsdlLocation = "http://localhost:9002/ws/rpclit?wsdl")
public class CardHolderProfileRPCLITServiceImplService
    extends Service
{

    private final static URL CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_QNAME = new QName("http://impl.ws.nc.com/", "CardHolderProfileRPCLITServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9002/ws/rpclit?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CardHolderProfileRPCLITServiceImplService() {
        super(__getWsdlLocation(), CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_QNAME);
    }

    public CardHolderProfileRPCLITServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_QNAME, features);
    }

    public CardHolderProfileRPCLITServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_QNAME);
    }

    public CardHolderProfileRPCLITServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_QNAME, features);
    }

    public CardHolderProfileRPCLITServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardHolderProfileRPCLITServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CardHolderProfileRPCLITService
     */
    @WebEndpoint(name = "CardHolderProfileRPCLITServiceImplPort")
    public CardHolderProfileRPCLITService getCardHolderProfileRPCLITServiceImplPort() {
        return super.getPort(new QName("http://impl.ws.nc.com/", "CardHolderProfileRPCLITServiceImplPort"), CardHolderProfileRPCLITService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardHolderProfileRPCLITService
     */
    @WebEndpoint(name = "CardHolderProfileRPCLITServiceImplPort")
    public CardHolderProfileRPCLITService getCardHolderProfileRPCLITServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.ws.nc.com/", "CardHolderProfileRPCLITServiceImplPort"), CardHolderProfileRPCLITService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CARDHOLDERPROFILERPCLITSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}