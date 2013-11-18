/**
 * 
 */
package com.nc.ws.domain;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

/**
 * @author Nirmalya
 * 
 */
public class CardHolder {

	private final int id;
	@NotNull
	private final String name;
	private List<Card> cards;
	private double overallCreditLimit;
	private final double annualIncome;
	private Status status;
	private String message;

	public CardHolder(final int id, final String name, final double inc) {
		this.id = id;
		this.name = name;
		this.annualIncome = inc;
	}

	public List<Card> getCards() {
		if (cards == null) {

			cards = new ArrayList<Card>();

		}
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

	/**
	 * @return the annualIncome
	 */
	public double getAnnualIncome() {
		return annualIncome;
	}

	/**
	 * @return the overallCreditLimit
	 */
	public double getOverallCreditLimit() {
		return overallCreditLimit;
	}

	/**
	 * @param overallCreditLimit
	 *            the overallCreditLimit to set
	 */
	public void setOverallCreditLimit(final double overallCreditLimit) {
		this.overallCreditLimit = overallCreditLimit;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
