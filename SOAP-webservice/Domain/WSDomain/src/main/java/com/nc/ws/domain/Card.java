package com.nc.ws.domain;

import java.util.Date;

public class Card {

	private final int id;
	private final String issuerName;
	private final String holdername;
	private final String cardType;
	private final Date expiryDate;

	public Card(final int id, final String issuerName, final String holdername,
			final String cardType, final Date expiryDate) {

		this.id = id;
		this.issuerName = issuerName;
		this.holdername = holdername;
		this.cardType = cardType;
		this.expiryDate = expiryDate;
	}

}
