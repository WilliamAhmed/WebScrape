package com.net.http.response;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author WilliamAhmed
 * @since 11/09/2018
 */
public class HttpResponseCodeUTest {

	private HttpResponseCode httpResponseCode;
	private int code;
	private String description;

	@Before
	public void setUp() {
		httpResponseCode = HttpResponseCode.RESPONSE_404;
		code = 404;
		description = "Not Found";
	}

	@Test
	public void testCode() {
		assertEquals(code, httpResponseCode.getCode());
	}

	@Test
	public void testIncorrectCode() {
		assertFalse(200 == httpResponseCode.getCode());
	}

	@Test
	public void testCodeDescription() {
		assertEquals(description, httpResponseCode.getCodeDescription());
	}

	@Test
	public void testIncorrectCodeDescription() {
		assertFalse("Incorrect".equals(httpResponseCode.getCodeDescription()));
	}

	@Test
	public void testHttpResponseCodeForIntegerCode() {
		assertEquals(httpResponseCode, HttpResponseCode.getHttpResponseCodeForIntegerCode(code));
	}

	@Test
	public void testHttpResponseCodeForIncorrectIntegerCode() {
		assertFalse(httpResponseCode == HttpResponseCode.getHttpResponseCodeForIntegerCode(501));
	}
}
