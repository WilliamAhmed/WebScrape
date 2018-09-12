package com.http;

import java.net.URL;

/**
 * @author WilliamAhmed
 * @since 12/09/2018
 */
public interface HttpRequest {

	HttpResponse sendRequest();

	void setConnectionUrl(URL url);

	void setHttpMethod(HttpMethod httpMethod);

	static HttpRequest create(HttpMethod httpMethod, String url) {
		return new HttpRequestProxy(new HttpRequestImpl()).createHttpRequest(httpMethod, url);

	}
}
