
package com.nc.ws.intf.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "checkProfile", namespace = "http://intf.ws.nc.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkProfile", namespace = "http://intf.ws.nc.com/")
public class CheckProfile {

    @XmlElement(name = "arg0", namespace = "")
    private com.nc.ws.domain.CardHolder arg0;

    /**
     * 
     * @return
     *     returns CardHolder
     */
    public com.nc.ws.domain.CardHolder getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.nc.ws.domain.CardHolder arg0) {
        this.arg0 = arg0;
    }

}
