package com.net.http.response;

/**
 * The interface Http response.
 *
 * @author WilliamAhmed
 * @since 12 /09/2018
 */
public interface HttpResponse {

	/**
	 * Create http response.
	 *
	 * @param code         the code
	 * @param responseBody the response body
	 * @return the http response
	 */
	static HttpResponse create(int code, String responseBody) {
		return new HttpResponseImpl(code, responseBody);
	}

	/**
	 * Create http response.
	 *
	 * @param code         the code
	 * @param responseBody the response body
	 * @return the http response
	 */
	static HttpResponse create(HttpResponseCode code, String responseBody) {
		return new HttpResponseImpl(code, responseBody);
	}

}
