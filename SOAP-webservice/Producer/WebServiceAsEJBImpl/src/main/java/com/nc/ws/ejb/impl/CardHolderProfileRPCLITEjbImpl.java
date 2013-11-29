/**
 * 
 */
package com.nc.ws.ejb.impl;

import javax.ejb.Stateless;
import javax.jws.WebService;

import com.nc.ws.businessRules.ProfileCardHolders;
import com.nc.ws.domain.CardHolder;
import com.nc.ws.ejb.intf.CardHolderProfileRPCLITEjb;

/**
 * @author Nirmalya
 * 
 */
@WebService(endpointInterface = "com.nc.ws.ejb.intf.CardHolderProfileRPCLITEjb")
@Stateless
public class CardHolderProfileRPCLITEjbImpl implements
		CardHolderProfileRPCLITEjb {

	@Override
	public CardHolder checkProfile(final CardHolder cardHolder) {

		final ProfileCardHolders profiler = new ProfileCardHolders();
		return profiler.profile(cardHolder);
	}

}
