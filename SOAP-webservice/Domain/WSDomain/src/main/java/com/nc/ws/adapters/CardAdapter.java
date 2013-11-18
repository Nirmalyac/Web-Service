/**
 * 
 */
package com.nc.ws.adapters;

import java.util.Date;

/**
 * @author Nirmalya
 * 
 */
public class CardAdapter {

	private int id;
	private String issuerName;
	private String holdername;
	private String cardType;
	private Date expiryDate;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(final String issuerName) {
		this.issuerName = issuerName;
	}

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(final String holdername) {
		this.holdername = holdername;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(final String cardType) {
		this.cardType = cardType;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(final Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
