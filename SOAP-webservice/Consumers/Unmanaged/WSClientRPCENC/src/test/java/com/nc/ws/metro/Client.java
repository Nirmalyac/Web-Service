/**
 * 
 */
package com.nc.ws.metro;

import com.nc.ws.data.metro.CardHolderData;
import com.nc.ws.impl.metro.CardHolderProfileRPCENCService;
import com.nc.ws.impl.metro.CardHolderProfileRPCENCServiceImplService;
import com.nc.ws.intf.metro.CardHolder;

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
