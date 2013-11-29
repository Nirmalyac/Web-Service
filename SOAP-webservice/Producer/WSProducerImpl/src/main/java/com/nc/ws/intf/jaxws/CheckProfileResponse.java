
package com.nc.ws.intf.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "checkProfileResponse", namespace = "http://intf.ws.nc.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkProfileResponse", namespace = "http://intf.ws.nc.com/")
public class CheckProfileResponse {

    @XmlElement(name = "return", namespace = "")
    private com.nc.ws.domain.CardHolder _return;

    /**
     * 
     * @return
     *     returns CardHolder
     */
    public com.nc.ws.domain.CardHolder getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.nc.ws.domain.CardHolder _return) {
        this._return = _return;
    }

}
