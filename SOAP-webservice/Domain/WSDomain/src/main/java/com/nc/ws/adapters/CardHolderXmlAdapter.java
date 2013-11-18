/**
 * 
 */
package com.nc.ws.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.nc.ws.domain.CardHolder;

/**
 * @author Nirmalya
 * 
 */
public class CardHolderXmlAdapter extends
		XmlAdapter<CardHolderAdapter, CardHolder> {

	@Override
	public CardHolderAdapter marshal(final CardHolder ch) throws Exception {

		final CardHolderAdapter ca = new CardHolderAdapter();
		ca.setAnnualIncome(ch.getAnnualIncome());
		ca.setId(ch.getId());
		ca.setName(ch.getName());

		return ca;
	}

	@Override
	public CardHolder unmarshal(final CardHolderAdapter cha) throws Exception {

		final CardHolder cardHolder = new CardHolder(cha.getId(),
				cha.getName(), cha.getAnnualIncome());
		return cardHolder;
	}

}
