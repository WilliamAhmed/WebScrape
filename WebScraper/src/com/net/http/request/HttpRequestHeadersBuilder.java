package com.net.http.request;

import java.util.Map;
import java.util.TreeMap;

/**
 * The type Http request headers builder.
 *
 * @author WilliamAhmed
 * @since 13 /09/2018
 */
public class HttpRequestHeadersBuilder {

	private Map<String, String> headers = new TreeMap<>();

	private interface HttpHeaderKeys {
		/**
		 * The constant ACCEPT.
		 */
		String ACCEPT = "Accept";
		/**
		 * The constant ACCEPT_ENCODING.
		 */
		String ACCEPT_ENCODING = "Accept-Encoding";
		/**
		 * The constant CONNECTION.
		 */
		String CONNECTION = "Connection";
		/**
		 * The constant COOKIE.
		 */
		String COOKIE = "Cookie";
		/**
		 * The constant HOST.
		 */
		String HOST = "Host";
		/**
		 * The constant REFERER.
		 */
		String REFERER = "Referer";
		/**
		 * The constant USER_AGENT.
		 */
		String USER_AGENT = "User-Agent";
	}

	/**
	 * Add accept header http request headers builder.
	 *
	 * @param value the value
	 * @return the http request headers builder
	 */
	public HttpRequestHeadersBuilder addAcceptHeader(String value) {
		headers.put(HttpHeaderKeys.ACCEPT, value);
		return this;
	}

	/**
	 * Add accept encoding header http request headers builder.
	 *
	 * @param value the value
	 * @return the http request headers builder
	 */
	public HttpRequestHeadersBuilder addAcceptEncodingHeader(String value) {
		headers.put(HttpHeaderKeys.ACCEPT_ENCODING, value);
		return this;
	}

	/**
	 * Add connection header http request headers builder.
	 *
	 * @param value the value
	 * @return the http request headers builder
	 */
	public HttpRequestHeadersBuilder addConnectionHeader(String value) {
		headers.put(HttpHeaderKeys.CONNECTION, value);
		return this;
	}

	/**
	 * Add cookie header http request headers builder.
	 *
	 * @param value the value
	 * @return the http request headers builder
	 */
	public HttpRequestHeadersBuilder addCookieHeader(String value) {
		headers.put(HttpHeaderKeys.COOKIE, value);
		return this;
	}

	/**
	 * Add host header http request headers builder.
	 *
	 * @param value the value
	 * @return the http request headers builder
	 */
	public HttpRequestHeadersBuilder addHostHeader(String value) {
		headers.put(HttpHeaderKeys.HOST, value);
		return this;
	}

	/**
	 * Add referer header http request headers builder.
	 *
	 * @param value the value
	 * @return the http request headers builder
	 */
	public HttpRequestHeadersBuilder addRefererHeader(String value) {
		headers.put(HttpHeaderKeys.REFERER, value);
		return this;
	}

	/**
	 * Add user agent header http request headers builder.
	 *
	 * @param value the value
	 * @return the http request headers builder
	 */
	public HttpRequestHeadersBuilder addUserAgentHeader(String value) {
		headers.put(HttpHeaderKeys.USER_AGENT, value);
		return this;
	}

	/**
	 * Add custom header http request headers builder.
	 *
	 * @param key   the key
	 * @param value the value
	 * @return the http request headers builder
	 */
	public HttpRequestHeadersBuilder addCustomHeader(String key, String value) {
		headers.put(key, value);
		return this;
	}

	/**
	 * Build http request headers.
	 *
	 * @return the http request headers
	 */
	public HttpRequestHeaders build() {
		HttpRequestHeaders httpRequestHeaders = new HttpRequestHeaders();
		httpRequestHeaders.setHeaders(this.headers);
		return httpRequestHeaders;
	}





}
