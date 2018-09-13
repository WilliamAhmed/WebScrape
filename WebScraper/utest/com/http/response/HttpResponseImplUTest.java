package com.http.response;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author WilliamAhmed
 * @since 13/09/2018
 */
public class HttpResponseImplUTest {

	@Test
	public void testToString() {
		HttpResponseCode code = HttpResponseCode.RESPONSE_200;
		String responseBody = "Hello World!";
		HttpResponse httpResponse = HttpResponse.create(code, responseBody);

		assertNotNull(httpResponse.toString());
	}

	@Test
	public void testToStringAlternateConstructor() {
		int code  = 200;
		String responseBody = "Hello World!";
		HttpResponse httpResponse = HttpResponse.create(code, responseBody);

		assertNotNull(httpResponse.toString());
	}

}
