/**
 * 
 */
package com.nc.ws.intf;

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
public interface CardHolderProfileRPCLITService {

	public CardHolder checkProfile(CardHolder cardHolder);

}
