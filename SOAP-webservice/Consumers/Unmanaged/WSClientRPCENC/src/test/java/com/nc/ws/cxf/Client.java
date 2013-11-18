/**
 * 
 */
package com.nc.ws.cxf;

import com.nc.ws.data.cxf.CardHolderData;
import com.nc.ws.impl.cxf.CardHolderProfileRPCENCServiceImplService;
import com.nc.ws.intf.cxf.CardHolder;
import com.nc.ws.intf.cxf.CardHolderProfileRPCENCService;

/**
 * @author Nirmalya
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final CardHolderProfileRPCENCServiceImplService serviceImpl = new CardHolderProfileRPCENCServiceImplService();
		final CardHolderProfileRPCENCService service = serviceImpl
				.getCardHolderProfileRPCENCServiceImplPort();

		final CardHolder ch = service.checkProfile(CardHolderData
				.createCardHolderData());
		System.out.println(ch.getMessage());

	}

}
