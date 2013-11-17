package com.nc.ws.businessRules;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.nc.ws.domain.Card;
import com.nc.ws.domain.CardHolder;

public class TestProfileCardHolders {

	@Test
	public final void testProfile() {

		CardHolder ch = getCardHolder(1, "John", 10000d);
		ch.getCards().add(
				getCard(1, "Citi", "John Brian", "Visa", "10-08-2015", 3000));
		ch.getCards()
				.add(getCard(2, "Standard", "John Brian", "Visa", "25-01-2016",
						1000));
		ch.getCards().add(
				getCard(3, "BNP", "John Brian", "Visa", "05-03-2018", 3000));

		final ProfileCardHolders pch = new ProfileCardHolders();
		ch = pch.profile(ch);

		System.out.println(ch.getMessage());

		Assert.assertNotNull(ch.getMessage());
		Assert.assertTrue(ch.getOverallCreditLimit() > 0);

	}

	private CardHolder getCardHolder(final int id, final String name,
			final double inc) {

		final CardHolder cardHolder = new CardHolder(id, name, inc);

		return cardHolder;
	}

	private Card getCard(final int id, final String issuerName,
			final String holdername, final String cardType,
			final String expiryDate, final double creditLimit) {

		final Card card = new Card(id, issuerName, holdername, cardType,
				getDate(expiryDate));

		card.setCreditLimit(creditLimit);

		return card;
	}

	private Date getDate(final String date) {

		final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");

		try {
			return DATE_FORMAT.parse(date);
		} catch (final ParseException e) {
			e.printStackTrace();
			return null;
		}

	}

}
