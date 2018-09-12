package com.http;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * The type Http request proxy.
 *
 * @author WilliamAhmed
 * @since 11 /09/2018
 */
public class HttpRequestProxy implements HttpRequest{

	private final HttpRequest target;

	/**
	 * Instantiates a new Http request proxy.
	 *
	 * @param target the target
	 */
	public HttpRequestProxy(HttpRequest target) {
		this.target = target;
	}

	@Override
	public HttpResponse sendRequest() {
		return target.sendRequest();
	}

	@Override
	public void setConnectionUrl(URL url) {
		target.setConnectionUrl(url);
	}

	@Override
	public void setHttpMethod(HttpMethod httpMethod) {
		target.setHttpMethod(httpMethod);
	}

	@Override
	public void setHttpRequestHeaders(HttpRequestHeaders requestHeaders) {
		target.setHttpRequestHeaders(requestHeaders);
	}

	/**
	 * Create http request http request.
	 *
	 * @param httpMethod the http method
	 * @param url        the url
	 * @return the http request
	 */
	public HttpRequest createHttpRequest(HttpMethod httpMethod, String url) {
		url = normalizeUrl(url);
		setHttpMethod(httpMethod);

		try {
			URL urlObj = new URL(url);
			setConnectionUrl(urlObj);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return target;
	}

	private String normalizeUrl(String url) {
		String resultUrl = url;
		if(!(url.startsWith("http://") || url.startsWith("https://"))) {
			resultUrl = "http://" + url;
		}

		return resultUrl;
	}

}
