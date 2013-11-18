/**
 * 
 */
package com.nc.ws.data.metro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import com.nc.ws.intf.metro.Card;
import com.nc.ws.intf.metro.CardHolder;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

/**
 * @author Nirmalya
 * 
 */
public class CardHolderData {

	public static CardHolder createCardHolderData() {
		final CardHolder ch = getCardHolder(1, "John", 10000d);
		ch.getCards().add(
				getCard(1, "Citi", "John Brian", "Visa", "10-08-2015", 3000));
		ch.getCards()
				.add(getCard(2, "Standard", "John Brian", "Visa", "25-02-2016",
						1000));
		ch.getCards().add(
				getCard(3, "BNP", "John Brian", "Visa", "05-03-2018", 3000));
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

	public static XMLGregorianCalendar getCalendar(final String strdt) {

		final XMLGregorianCalendarImpl impl = new XMLGregorianCalendarImpl();
		final Date dt = getDate(strdt);
		final Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		impl.setDay(cal.get(Calendar.DAY_OF_MONTH));
		impl.setMonth(cal.get(Calendar.MONTH));
		impl.setYear(cal.get(Calendar.YEAR));

		return impl;
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
