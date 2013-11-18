package com.nc.ws.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.nc.ws.domain.Card;

public class CardXmlAdapter extends XmlAdapter<CardAdapter, Card> {

	@Override
	public CardAdapter marshal(final Card card) throws Exception {

		final CardAdapter ca = new CardAdapter();
		ca.setId(card.getId());
		ca.setIssuerName(card.getIssuerName());
		ca.setCardType(card.getCardType());
		ca.setExpiryDate(card.getExpiryDate());
		ca.setHoldername(card.getHoldername());

		return ca;
	}

	@Override
	public Card unmarshal(final CardAdapter ca) throws Exception {

		final Card card = new Card(ca.getId(), ca.getIssuerName(),
				ca.getHoldername(), ca.getCardType(), ca.getExpiryDate());

		return card;
	}

}
