/**
 * 
 */
package com.nc.ws.impl;

import java.util.Set;

import javax.jws.WebService;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.nc.ws.businessRules.ProfileCardHolders;
import com.nc.ws.domain.CardHolder;
import com.nc.ws.faults.InvalidCardHolderException;
import com.nc.ws.intf.CardHolderProfileDOCLITService;

/**
 * @author Nirmalya
 * 
 */
@WebService(endpointInterface = "com.nc.ws.intf.CardHolderProfileDOCLITService")
public class CardHolderProfileDOCLITServiceImpl implements
		CardHolderProfileDOCLITService {

	@Override
	public CardHolder checkProfile(final CardHolder cardHolder) {

		validateCardHolder(cardHolder);

		final ProfileCardHolders profiler = new ProfileCardHolders();
		return profiler.profile(cardHolder);
	}

	private void validateCardHolder(final CardHolder cardHolder) {

		final ValidatorFactory factory = Validation
				.buildDefaultValidatorFactory();
		final Validator validator = factory.getValidator();
		final Set<ConstraintViolation<CardHolder>> violations = validator
				.validate(cardHolder);

		String message = "";

		if (!violations.isEmpty()) {

			for (final ConstraintViolation<CardHolder> cv : violations) {
				message = message + "\n" + cv.getInvalidValue() + " --->"
						+ cv.getMessage();
			}
			System.out.println("Validation error :" + message);
			throw new InvalidCardHolderException(message);
		}
	}

}
