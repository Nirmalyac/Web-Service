/**
 * 
 */
package com.nc.ws.axis2;

import java.rmi.RemoteException;

import com.nc.ws.data.axis2.CardHolderData;
import com.nc.ws.impl.axis2.CardHolderProfileRPCLITServiceImplServiceStub;
import com.nc.ws.impl.axis2.CardHolderProfileRPCLITServiceImplServiceStub.CheckProfile;
import com.nc.ws.impl.axis2.CardHolderProfileRPCLITServiceImplServiceStub.CheckProfileResponse;

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

		final CardHolderProfileRPCLITServiceImplServiceStub stub = new CardHolderProfileRPCLITServiceImplServiceStub();
		final CheckProfile chkProfile = new CheckProfile();
		chkProfile.setArg0(CardHolderData.createCardHolderData());
		final CheckProfileResponse cpr = stub.checkProfile(chkProfile);

		System.out.println(cpr.get_return().getMessage());

	}

}
