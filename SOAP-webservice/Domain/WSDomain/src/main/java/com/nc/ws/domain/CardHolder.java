/**
 * 
 */
package com.nc.ws.domain;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author Nirmalya
 * 
 */

public class CardHolder {

	private int id;
	@NotNull
	private String name;
	@Valid
	private List<Card> cards;
	private double overallCreditLimit;
	private double annualIncome;
	private Status status;
	private String message;

	public CardHolder() {

	}

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

	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param cards
	 *            the cards to set
	 */
	public void setCards(final List<Card> cards) {
		this.cards = cards;
	}

	/**
	 * @param annualIncome
	 *            the annualIncome to set
	 */
	public void setAnnualIncome(final double annualIncome) {
		this.annualIncome = annualIncome;
	}

}
