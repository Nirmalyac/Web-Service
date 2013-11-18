/**
 * 
 */
package com.nc.ws.metro;

import com.nc.ws.data.metro.CardHolderData;
import com.nc.ws.impl.metro.CardHolderProfileRPCLITServiceImplService;
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

		final CardHolderProfileRPCLITServiceImplService service = new CardHolderProfileRPCLITServiceImplService();
		final CardHolder ch = service
				.getCardHolderProfileRPCLITServiceImplPort().checkProfile(
						CardHolderData.createCardHolderData());

		System.out.println(ch.getMessage());

	}

}
