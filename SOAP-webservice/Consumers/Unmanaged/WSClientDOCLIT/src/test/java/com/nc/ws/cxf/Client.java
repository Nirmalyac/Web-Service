/**
 * 
 */
package com.nc.ws.cxf;

import com.nc.ws.data.cxf.CardHolderData;
import com.nc.ws.impl.cxf.CardHolderProfileDOCLITServiceImplService;
import com.nc.ws.intf.cxf.CardHolder;
import com.nc.ws.intf.cxf.CardHolderProfileDOCLITService;

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
