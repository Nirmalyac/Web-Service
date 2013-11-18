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

		final ProfileCardHolders profiler = new ProfileCardHolders();
		return profiler.profile(cardHolder);
	}

}
