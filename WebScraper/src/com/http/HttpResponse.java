package com.http;

/**
 * @author WilliamAhmed
 * @since 11/09/2018
 */
public class HttpResponse {

	private HttpResponseCode httpResponseCode;
	private String responseBody;

	public HttpResponse(int httpResponseCode, String responseBody) {
		this.httpResponseCode = HttpResponseCode.getHttpResponseCodeForIntegerCode(httpResponseCode);
		this.responseBody = responseBody;
	}

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
