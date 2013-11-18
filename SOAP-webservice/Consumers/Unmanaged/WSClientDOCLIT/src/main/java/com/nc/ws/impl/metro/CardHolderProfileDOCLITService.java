
package com.nc.ws.impl.metro;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.nc.ws.intf.metro.CardHolder;
import com.nc.ws.intf.metro.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CardHolderProfileDOCLITService", targetNamespace = "http://intf.ws.nc.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CardHolderProfileDOCLITService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.nc.ws.intf.CardHolder
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkProfile", targetNamespace = "http://intf.ws.nc.com/", className = "com.nc.ws.intf.CheckProfile")
    @ResponseWrapper(localName = "checkProfileResponse", targetNamespace = "http://intf.ws.nc.com/", className = "com.nc.ws.intf.CheckProfileResponse")
    @Action(input = "http://intf.ws.nc.com/CardHolderProfileDOCLITService/checkProfileRequest", output = "http://intf.ws.nc.com/CardHolderProfileDOCLITService/checkProfileResponse")
    public CardHolder checkProfile(
        @WebParam(name = "arg0", targetNamespace = "")
        CardHolder arg0);

}
