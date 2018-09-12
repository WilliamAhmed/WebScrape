package com.http;

import java.net.URL;

/**
 * The interface Http request.
 *
 * @author WilliamAhmed
 * @since 12 /09/2018
 */
public interface HttpRequest {

	/**
	 * Send request http response.
	 *
	 * @return the http response
	 */
	HttpResponse sendRequest();

	/**
	 * Sets connection url.
	 *
	 * @param url the url
	 */
	void setConnectionUrl(URL url);

	/**
	 * Sets http method.
	 *
	 * @param httpMethod the http method
	 */
	void setHttpMethod(HttpMethod httpMethod);

	/**
	 * Create http request.
	 *
	 * @param httpMethod the http method
	 * @param url        the url
	 * @return the http request
	 */
	static HttpRequest create(HttpMethod httpMethod, String url) {
		return new HttpRequestProxy(new HttpRequestImpl()).createHttpRequest(httpMethod, url);

	}
}
