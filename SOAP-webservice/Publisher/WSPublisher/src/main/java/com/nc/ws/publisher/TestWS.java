package com.nc.ws.publisher;

import javax.xml.ws.Endpoint;

import com.nc.ws.impl.CardHolderProfileDOCLITServiceImpl;
import com.nc.ws.impl.CardHolderProfileRPCLITServiceImpl;

public class TestWS {

	public static void main(final String[] args) {

		Endpoint.publish("http://localhost:9002/ws/rpclit",
				new CardHolderProfileRPCLITServiceImpl());

		Endpoint.publish("http://localhost:9003/ws/doclit",
				new CardHolderProfileDOCLITServiceImpl());

		System.out.println("Endpoint Published");
	}

}
