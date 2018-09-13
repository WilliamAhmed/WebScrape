package com.http.request;

import java.util.Map;
import java.util.TreeMap;

/**
 * The type Http request headers.
 *
 * @author WilliamAhmed
 * @since 12 /09/2018
 */
public class HttpRequestHeaders {

	private Map<String, String> requestHeaders;

	/**
	 * Instantiates a new Http request headers.
	 */
	public HttpRequestHeaders() {
		requestHeaders = new TreeMap<>();
	}

	/**
	 * Add header.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	public void addHeader(String key, String value) {
		requestHeaders.put(key, value);
	}

	/**
	 * Gets headers.
	 *
	 * @return the headers
	 */
	public Map<String, String> getHeaders() {
		return requestHeaders;
	}

	public void setHeaders(Map<String, String> headers) {
		this.requestHeaders = headers;
	}

	public String toString() {
		String result = "";
		for(Map.Entry<String, String> entry : requestHeaders.entrySet()) {
			result = entry.getKey() + ":" + entry.getValue();
		}
		return result;
	}

}
