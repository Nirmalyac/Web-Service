/**
 * 
 */
package com.nc.ws.businessRules;

import com.nc.ws.domain.Card;
import com.nc.ws.domain.CardHolder;
import com.nc.ws.domain.Status;

/**
 * @author Nirmalya
 * 
 */
public class ProfileCardHolders {

	public CardHolder profile(final CardHolder cardHolder) {

		double creditLimit = 0;

		for (final Card card : cardHolder.getCards()) {

			creditLimit = creditLimit + card.getCreditLimit();
		}

		return setRiskProfile(cardHolder, creditLimit);
	}

	private CardHolder setRiskProfile(final CardHolder cardHolder,
			final double creditLimit) {

		cardHolder.setOverallCreditLimit(creditLimit);

		if (cardHolder.getAnnualIncome() < cardHolder.getOverallCreditLimit()) {

			setRiskStatusOfCardHolder(cardHolder, Status.HIGH_RISK);
		}

		if (between(cardHolder.getOverallCreditLimit(),
				0.6 * cardHolder.getAnnualIncome(),
				0.8 * cardHolder.getAnnualIncome())) {

			setRiskStatusOfCardHolder(cardHolder, Status.MODERATE_RISK);
		}

		if (between(cardHolder.getOverallCreditLimit(),
				0.4 * cardHolder.getAnnualIncome(),
				0.6 * cardHolder.getAnnualIncome())) {

			setRiskStatusOfCardHolder(cardHolder, Status.NORMAL);
		}

		if (between(cardHolder.getOverallCreditLimit(),
				0.2 * cardHolder.getAnnualIncome(),
				0.4 * cardHolder.getAnnualIncome())) {

			setRiskStatusOfCardHolder(cardHolder, Status.LOW_RISK);
		}

		return cardHolder;

	}

	private boolean between(final double principle, final double min,
			final double max) {

		if (principle > min && principle < max) {

			return true;
		}

		return false;
	}

	private void setRiskStatusOfCardHolder(final CardHolder cardHolder,
			final Status status) {
		cardHolder.setStatus(status);
		cardHolder.setMessage("The risk profile of the " + cardHolder.getName()
				+ " is : " + status.toString());
	}
}
