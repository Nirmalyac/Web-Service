/**
 * 
 */
package com.nc.ws.cxf;

import com.nc.ws.data.cxf.CardHolderData;
import com.nc.ws.impl.cxf.CardHolderProfileRPCLITServiceImplService;
import com.nc.ws.intf.cxf.CardHolder;

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
