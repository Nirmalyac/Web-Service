package com.nc.ws.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Card {

	private int id;
	@NotNull
	private String issuerName;
	@NotNull
	private String holdername;
	@NotNull
	private String cardType;
	@NotNull
	private Date expiryDate;
	private double creditLimit;

	public Card() {

	}

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

	public int getId() {
		return id;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public String getCardType() {
		return cardType;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @param issuerName
	 *            the issuerName to set
	 */
	public void setIssuerName(final String issuerName) {
		this.issuerName = issuerName;
	}

	/**
	 * @param holdername
	 *            the holdername to set
	 */
	public void setHoldername(final String holdername) {
		this.holdername = holdername;
	}

	/**
	 * @param cardType
	 *            the cardType to set
	 */
	public void setCardType(final String cardType) {
		this.cardType = cardType;
	}

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	public void setExpiryDate(final Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
