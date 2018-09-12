package com.exception.constants;

/**
 * The enum Web scraper exception keys.
 *
 * @author WilliamAhmed
 * @since 12 /09/2018
 */
public enum WebScraperExceptionKeys {

	/**
	 * The Data missing null value.
	 */
	DATA_MISSING_NULL_VALUE("Required data has been found as null");

	private final String errorMessage;

	WebScraperExceptionKeys(String message) {
		this.errorMessage = message;
	}

	/**
	 * Gets error message.
	 *
	 * @return the error message
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}
}
