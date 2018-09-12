package com.http;

/**
 * The type Http response.
 *
 * @author WilliamAhmed
 * @since 11 /09/2018
 */
public class HttpResponseImpl implements HttpResponse {

	private HttpResponseCode httpResponseCode;
	private String responseBody;

	/**
	 * Instantiates a new Http response.
	 *
	 * @param httpResponseCode the http response code
	 * @param responseBody     the response body
	 */
	public HttpResponseImpl(int httpResponseCode, String responseBody) {
		this.httpResponseCode = HttpResponseCode.getHttpResponseCodeForIntegerCode(httpResponseCode);
		this.responseBody = responseBody;
	}

	/**
	 * Instantiates a new Http response.
	 *
	 * @param httpResponseCode the http response code
	 * @param responseBody     the response body
	 */
	public HttpResponseImpl(HttpResponseCode httpResponseCode, String responseBody) {
		this.httpResponseCode = httpResponseCode;
		this.responseBody = responseBody;
	}

	public String toString() {
		return  "Response Code: " + httpResponseCode.getCode() + " " + httpResponseCode.getCodeDescription() + "\n" +
				"Response Body: \n" +
				responseBody;
	}
}
