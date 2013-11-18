/**
 * 
 */
package com.nc.ws.axis2;

import java.rmi.RemoteException;

import com.nc.ws.data.axis2.CardHolderData;
import com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub;
import com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CardHolder;
import com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfile;
import com.nc.ws.impl.axis2.CardHolderProfileRPCENCServiceImplServiceStub.CheckProfileResponse;

/**
 * @author Nirmalya
 * 
 */
public class Client {

	/**
	 * @param args
	 * @throws RemoteException
	 */
	public static void main(final String[] args) throws RemoteException {

		final CardHolderProfileRPCENCServiceImplServiceStub stub = new CardHolderProfileRPCENCServiceImplServiceStub();
		final CheckProfile profile = new CheckProfile();
		profile.setArg0(CardHolderData.createCardHolderData());
		final CheckProfileResponse cpr = stub.checkProfile(profile);

		final CardHolder ch = cpr.get_return();

		System.out.println(ch.getMessage());

	}

}
