package com.http;

/**
 * The type Http response.
 *
 * @author WilliamAhmed
 * @since 11 /09/2018
 */
public class HttpResponse {

	private HttpResponseCode httpResponseCode;
	private String responseBody;

	/**
	 * Instantiates a new Http response.
	 *
	 * @param httpResponseCode the http response code
	 * @param responseBody     the response body
	 */
	public HttpResponse(int httpResponseCode, String responseBody) {
		this.httpResponseCode = HttpResponseCode.getHttpResponseCodeForIntegerCode(httpResponseCode);
		this.responseBody = responseBody;
	}

	/**
	 * Instantiates a new Http response.
	 *
	 * @param httpResponseCode the http response code
	 * @param responseBody     the response body
	 */
	public HttpResponse(HttpResponseCode httpResponseCode, String responseBody) {
		this.httpResponseCode = httpResponseCode;
		this.responseBody = responseBody;
	}

	public String toString() {
		return  "Response Code: " + httpResponseCode.getCode() + " " + httpResponseCode.getCodeDescription() + "\n" +
				"Response Body: \n" +
				responseBody;
	}
}
