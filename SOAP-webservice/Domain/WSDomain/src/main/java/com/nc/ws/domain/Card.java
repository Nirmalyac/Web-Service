package com.nc.ws.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Card {

	private final int id;
	@NotNull
	private final String issuerName;
	@NotNull
	private final String holdername;
	@NotNull
	private final String cardType;
	@NotNull
	private final Date expiryDate;
	private double creditLimit;

	public Card(final int id, final String issuerName, final String holdername,
			final String cardType, final Date expiryDate) {

		this.id = id;
		this.issuerName = issuerName;
		this.holdername = holdername;
		this.cardType = cardType;
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the creditLimit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @param creditLimit
	 *            the creditLimit to set
	 */
	public void setCreditLimit(final double creditLimit) {
		this.creditLimit = creditLimit;
	}

	/**
	 * @return the holdername
	 */
	public String getHoldername() {
		return holdername;
	}

}
