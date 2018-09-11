package com.http.factory;

import com.http.HttpMethod;
import com.http.HttpRequest;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author WilliamAhmed
 * @since 11/09/2018
 */
public class HttpRequestFactory {

	public HttpRequest createHttpRequest(HttpMethod httpMethod, String url) {
		HttpRequest httpRequest = null;
		url = normalizeUrl(url);

		try {
			URL urlObj = new URL(url);

			httpRequest = createHttpRequest(httpMethod, urlObj);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return httpRequest;
	}

	public HttpRequest createHttpRequest(HttpMethod httpMethod, URL url) {
		return new HttpRequest(httpMethod, url);
	}

	private String normalizeUrl(String url) {
		String resultUrl = "";
		if(!(url.startsWith("http://") || url.startsWith("https://"))) {
			resultUrl = "http://" + url;
		}

		return resultUrl;
	}

}
