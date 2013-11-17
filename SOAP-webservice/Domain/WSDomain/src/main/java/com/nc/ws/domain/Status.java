/**
 * 
 */
package com.nc.ws.domain;

/**
 * @author Nirmalya
 * 
 */
public enum Status {

	HIGH_RISK("High Risk Profile"), LOW_RISK("Low Risk Profile"), MODERATE_RISK(
			"Moderate Risk Profile"), NORMAL("No Risk Profile");

	private final String statusValue;

	Status(final String riskProfile) {
		statusValue = riskProfile;
	}

	@Override
	public String toString() {
		return statusValue;
	}

}
