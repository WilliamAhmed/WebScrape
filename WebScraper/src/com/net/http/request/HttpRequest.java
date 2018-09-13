package com.net.http.request;

import com.net.http.response.HttpResponse;

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
	 * @param httpRequestMethod the http method
	 */
	void setHttpRequestMethod(HttpRequestMethod httpRequestMethod);

	/**
	 * Sets http request headers.
	 *
	 * @param requestHeaders the request headers
	 */
	void setHttpRequestHeaders(HttpRequestHeaders requestHeaders);

	/**
	 * Create http request.
	 *
	 * @param httpRequestMethod the http method
	 * @param url        the url
	 * @return the http request
	 */
	static HttpRequest create(HttpRequestMethod httpRequestMethod, String url) {
		return new HttpRequestProxy(new HttpRequestImpl()).createHttpRequest(httpRequestMethod, url);

	}
}
