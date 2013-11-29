/**
 * 
 */
package com.nc.ws.publisher.jaxws.dii;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.nc.ws.domain.Card;
import com.nc.ws.domain.CardHolder;
import com.nc.ws.impl.CardHolderProfileDOCLITServiceImpl;
import com.nc.ws.impl.CardHolderProfileRPCENCServiceImpl;
import com.nc.ws.impl.CardHolderProfileRPCLITServiceImpl;
import com.nc.ws.intf.CardHolderProfileDOCLITService;
import com.nc.ws.intf.CardHolderProfileRPCENCService;
import com.nc.ws.intf.CardHolderProfileRPCLITService;

/**
 * @author Nirmalya
 * 
 */
public class WSPublisherTestUsingService {

	static Endpoint epForDOCLIT;
	static Endpoint epForRPCLIT;
	static Endpoint epForRPCENC;

	@BeforeClass
	public static void startup() {

		epForDOCLIT = Endpoint.publish("http://localhost:9001/ws/doclit",
				new CardHolderProfileDOCLITServiceImpl());

		epForRPCENC = Endpoint.publish("http://localhost:9002/ws/rpcenc",
				new CardHolderProfileRPCENCServiceImpl());

		epForRPCLIT = Endpoint.publish("http://localhost:9003/ws/rpclit",
				new CardHolderProfileRPCLITServiceImpl());

	}

	@AfterClass
	public static void cleanUp() {

		epForDOCLIT.stop();
		epForRPCLIT.stop();
		epForRPCENC.stop();
	}

	/**
	 * Bean Validation works.
	 * 
	 * @throws MalformedURLException
	 */
	@Test
	public void testDOCLIT() throws MalformedURLException {

		final URL url = new URL("http://localhost:9001/ws/doclit?wsdl");
		final QName qname = new QName("http://impl.ws.nc.com/",
				"CardHolderProfileDOCLITServiceImplService");

		final Service testws = Service.create(url, qname);

		final CardHolderProfileDOCLITService impl = testws
				.getPort(CardHolderProfileDOCLITService.class);

		final CardHolder ch = createCardHolderData();

		final CardHolder cardHolder = impl.checkProfile(ch);

		System.out.println(cardHolder.getMessage());
		Assert.assertTrue(cardHolder.getMessage() != null);
	}

	/**
	 * Bean Validation does not work
	 * 
	 * @throws MalformedURLException
	 */
	@Test
	public void testRPCENC() throws MalformedURLException {

		final URL url = new URL("http://localhost:9002/ws/rpcenc?wsdl");
		final QName qname = new QName("http://impl.ws.nc.com/",
				"CardHolderProfileRPCENCServiceImplService");

		final Service testws = Service.create(url, qname);

		final CardHolderProfileRPCENCService impl = testws
				.getPort(CardHolderProfileRPCENCService.class);

		final CardHolder ch = createCardHolderData();

		final CardHolder cardHolder = impl.checkProfile(ch);

		System.out.println(cardHolder.getMessage());
		Assert.assertTrue(cardHolder.getMessage() != null);
	}

	/**
	 * Bean Validation does not work.
	 * 
	 * @throws MalformedURLException
	 */
	@Test
	public void testRPCLIT() throws MalformedURLException {

		final URL url = new URL("http://localhost:9003/ws/rpclit?wsdl");
		final QName qname = new QName("http://impl.ws.nc.com/",
				"CardHolderProfileRPCLITServiceImplService");

		final Service testws = Service.create(url, qname);

		final CardHolderProfileRPCLITService impl = testws
				.getPort(CardHolderProfileRPCLITService.class);

		final CardHolder ch = createCardHolderData();

		final CardHolder cardHolder = impl.checkProfile(ch);

		System.out.println(cardHolder.getMessage());
		Assert.assertTrue(cardHolder.getMessage() != null);
	}

	private CardHolder createCardHolderData() {
		final CardHolder ch = getCardHolder(1, "John", 10000d);
		ch.getCards().add(
				getCard(1, "Citi", "John Brian", "Visa", "10-08-2015", 3000));
		ch.getCards()
				.add(getCard(2, "Standard", "John Brian", "Visa", "25-01-2016",
						1000));
		ch.getCards().add(
				getCard(3, "BNP", "John Brian", "Visa", "05-03-2018", 3000));
		return ch;
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
