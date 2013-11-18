/**
 * 
 */
package com.nc.ws.impl;

import javax.jws.WebService;

import com.nc.ws.businessRules.ProfileCardHolders;
import com.nc.ws.domain.CardHolder;
import com.nc.ws.intf.CardHolderProfileRPCENCService;

/**
 * @author Nirmalya
 * 
 */
@WebService(endpointInterface = "com.nc.ws.intf.CardHolderProfileRPCENCService")
public class CardHolderProfileRPCENCServiceImpl implements
		CardHolderProfileRPCENCService {

	@Override
	public CardHolder checkProfile(final CardHolder cardHolder) {
		System.out.println("Entering the server side "
				+ cardHolder.getAnnualIncome());
		final ProfileCardHolders profiler = new ProfileCardHolders();
		System.out.println("Completed profiling");
		return profiler.profile(cardHolder);
	}

}
