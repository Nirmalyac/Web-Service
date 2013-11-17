/**
 * 
 */
package com.nc.ws.domain;

import java.util.List;

/**
 * @author Nirmalya
 * 
 */
public class CardHolder {

	private final int id;
	private final String name;
	private List<Card> cards;
	private final double overallCreditLimit;
	private final double annualIncome;
	private Status status;
	private String message;

	public CardHolder(final int id, final String name, final double cl,
			final double inc) {
		this.id = id;
		this.name = name;
		this.overallCreditLimit = cl;
		this.annualIncome = inc;
	}

	public List<Card> getCards() {
		return cards;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(final Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

}
