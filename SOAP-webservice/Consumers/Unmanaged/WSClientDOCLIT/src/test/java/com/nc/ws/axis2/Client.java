/**
 * 
 */
package com.nc.ws.axis2;

import java.rmi.RemoteException;

import com.nc.ws.data.axis2.CardHolderData;
import com.nc.ws.impl.axis2.CardHolderProfileDOCLITServiceImplServiceStub;
import com.nc.ws.impl.axis2.CardHolderProfileDOCLITServiceImplServiceStub.CardHolder;
import com.nc.ws.impl.axis2.CardHolderProfileDOCLITServiceImplServiceStub.CheckProfile;
import com.nc.ws.impl.axis2.CardHolderProfileDOCLITServiceImplServiceStub.CheckProfileE;
import com.nc.ws.impl.axis2.CardHolderProfileDOCLITServiceImplServiceStub.CheckProfileResponseE;

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

		final CardHolderProfileDOCLITServiceImplServiceStub stub = new CardHolderProfileDOCLITServiceImplServiceStub();
		final CheckProfile profile = new CheckProfile();
		profile.setArg0(CardHolderData.createCardHolderData());

		final CheckProfileE checkProfileE = new CheckProfileE();

		checkProfileE.setCheckProfile(profile);

		final CheckProfileResponseE cpr = stub.checkProfile(checkProfileE);

		final CardHolder ch = cpr.getCheckProfileResponse().get_return();

		System.out.println(ch.getMessage());

	}

}
