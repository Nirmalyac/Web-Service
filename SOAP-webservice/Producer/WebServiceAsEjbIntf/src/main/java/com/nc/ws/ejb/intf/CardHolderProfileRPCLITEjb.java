/**
 * 
 */
package com.nc.ws.ejb.intf;

import javax.ejb.Remote;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.nc.ws.domain.CardHolder;

/**
 * @author Nirmalya
 * 
 */
@WebService
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
@Remote
public interface CardHolderProfileRPCLITEjb {

	public CardHolder checkProfile(CardHolder cardHolder);

}
