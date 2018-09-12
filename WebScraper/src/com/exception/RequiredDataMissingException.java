package com.exception;

/**
 * The type Required data missing exception.
 *
 * @author WilliamAhmed
 * @since 12 /09/2018
 */
public class RequiredDataMissingException extends Exception {

	/**
	 * Instantiates a new Required data missing exception.
	 */
	public RequiredDataMissingException() {
	}

	/**
	 * Instantiates a new Required data missing exception.
	 *
	 * @param message the message
	 */
	public RequiredDataMissingException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new Required data missing exception.
	 *
	 * @param message the message
	 * @param cause   the cause
	 */
	public RequiredDataMissingException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new Required data missing exception.
	 *
	 * @param cause the cause
	 */
	public RequiredDataMissingException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new Required data missing exception.
	 *
	 * @param message            the message
	 * @param cause              the cause
	 * @param enableSuppression  the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public RequiredDataMissingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}


}
