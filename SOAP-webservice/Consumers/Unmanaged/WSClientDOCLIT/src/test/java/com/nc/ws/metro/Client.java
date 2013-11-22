/**
 * 
 */
package com.nc.ws.metro;

import com.nc.ws.data.metro.CardHolderData;
import com.nc.ws.impl.metro.CardHolderProfileDOCLITService;
import com.nc.ws.impl.metro.CardHolderProfileDOCLITServiceImplService;
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

		final CardHolderProfileDOCLITServiceImplService serviceImpl = new CardHolderProfileDOCLITServiceImplService();
		final CardHolderProfileDOCLITService service = serviceImpl
				.getCardHolderProfileDOCLITServiceImplPort();
		final CardHolder ch = service.checkProfile(CardHolderData
				.createCardHolderData());
		System.out.println(ch.getMessage());

	}

}
