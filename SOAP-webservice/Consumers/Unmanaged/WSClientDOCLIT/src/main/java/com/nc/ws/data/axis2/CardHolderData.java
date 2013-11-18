/**
 * 
 */
package com.nc.ws.data.axis2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.nc.ws.impl.axis2.CardHolderProfileDOCLITServiceImplServiceStub.Card;
import com.nc.ws.impl.axis2.CardHolderProfileDOCLITServiceImplServiceStub.CardHolder;

/**
 * @author Nirmalya
 * 
 */
public class CardHolderData {

	public static CardHolder createCardHolderData() {
		final CardHolder ch = getCardHolder(1, "John", 10000d);
		final Card[] cards = new Card[3];

		final Card card1 = getCard(1, "Citi", "John Brian", "Visa",
				"10-08-2015", 3000);
		final Card card2 = getCard(2, "Standard", "John Brian", "Visa",
				"25-02-2016", 5000);
		final Card card3 = getCard(3, "BNP", "John Brian", "Visa",
				"05-03-2018", 3000);

		cards[0] = card1;
		cards[1] = card2;
		cards[2] = card3;

		ch.setCards(cards);

		return ch;
	}

	public static CardHolder getCardHolder(final int id, final String name,
			final double inc) {

		final CardHolder cardHolder = new CardHolder();
		cardHolder.setId(id);
		cardHolder.setName(name);
		cardHolder.setAnnualIncome(inc);

		return cardHolder;
	}

	public static Card getCard(final int id, final String issuerName,
			final String holdername, final String cardType,
			final String expiryDate, final double creditLimit) {

		final Card card = new Card();

		card.setCardType(cardType);
		card.setExpiryDate(getCalendar(expiryDate));
		card.setId(id);
		card.setIssuerName(issuerName);
		card.setHoldername(holdername);
		card.setCreditLimit(creditLimit);

		return card;
	}

	public static Calendar getCalendar(final String strdt) {

		final Date dt = getDate(strdt);
		final Calendar cal = Calendar.getInstance();
		cal.setTime(dt);

		return cal;
	}

	public static Date getDate(final String date) {

		final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");

		try {
			return DATE_FORMAT.parse(date);
		} catch (final ParseException e) {
			e.printStackTrace();
			return null;
		}

	}

}
