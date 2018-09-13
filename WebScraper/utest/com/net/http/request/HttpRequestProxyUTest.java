package com.net.http.request;

import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertNotNull;

/**
 * @author WilliamAhmed
 * @since 13/09/2018
 */
public class HttpRequestProxyUTest {

	@Test
	public void testCreateHttpRequest() {
		HttpRequestMethod httpRequestMethod = HttpRequestMethod.GET;
		String url = "www.google.com";
		HttpRequest httpRequest = HttpRequest.create(httpRequestMethod, url);
		assertNotNull(httpRequest);
	}

	@Test(expected = MalformedURLException.class)
	public void testCreateHttpRequestFail() {
		HttpRequestMethod httpRequestMethod = HttpRequestMethod.GET;
		String url = "badUrl";
		HttpRequest httpRequest = HttpRequest.create(httpRequestMethod, url);
	}
}
