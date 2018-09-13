package com.util;

import com.exception.RequiredDataMissingException;
import org.junit.Test;


/**
 * @author WilliamAhmed
 * @since 13/09/2018
 */
public class ValidationUtilUTest {


	@Test
	public void testValidateNotNull() {
		Object obj = new Object();
		try {
			ValidationUtil.validateNotNull(obj);
		} catch (RequiredDataMissingException e) {
		}
	}

	@Test(expected = RequiredDataMissingException.class)
	public void testValidateNotNullFail() {
		Object obj = null;
		try {
			ValidationUtil.validateNotNull(obj);
		} catch (RequiredDataMissingException e) {
		}
	}

	@Test
	public void testValidateNotNullEmptyString() {
		String str = "This is not an empty string";
		try {
			ValidationUtil.validateNotNull(str);
		} catch (RequiredDataMissingException e) {
		}
	}

	@Test(expected = RequiredDataMissingException.class)
	public void testValidteNotNullEmptyStringFail() {
		String str = "";
		try {
			ValidationUtil.validateNotNull(str);
		} catch (RequiredDataMissingException e) {
		}
	}
}
