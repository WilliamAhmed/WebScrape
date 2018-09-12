package com.util;

import com.exception.RequiredDataMissingException;
import com.exception.constants.WebScraperExceptionKeys;

/**
 * The type Validation util.
 *
 * @author WilliamAhmed
 * @since 12 /09/2018
 */
public class ValidationUtil {

	/**
	 * Validate not n ull.
	 *
	 * @param object the object
	 * @throws RequiredDataMissingException the required data missing exception
	 */
	public static void validateNotNull(final Object object) throws RequiredDataMissingException {
		if(null == object) {
			throw new RequiredDataMissingException(WebScraperExceptionKeys.DATA_MISSING_NULL_VALUE.getErrorMessage());
		} else if(object instanceof String) {
			if(((String) object).isEmpty()) {
				throw new RequiredDataMissingException(WebScraperExceptionKeys.DATA_MISSING_NULL_VALUE.getErrorMessage());
			}
		}
	}
}
