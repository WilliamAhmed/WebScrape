package com.webscraper;

import com.net.http.request.HttpRequest;
import com.net.http.request.HttpRequestHeadersBuilder;
import com.net.http.request.HttpRequestMethod;
import com.net.http.response.HttpResponse;

/**
 * The type Web scraper.
 *
 * @author WilliamAhmed
 * @since 11 /09/2018
 */
public class WebScraper {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		if(args.length == 2) {

			HttpRequestMethod httpRequestMethod = HttpRequestMethod.valueOf(args[0]);

			HttpRequest httpRequest = HttpRequest.create(httpRequestMethod, args[1]);

			HttpRequestHeadersBuilder httpRequestHeadersBuilder = new HttpRequestHeadersBuilder();
			httpRequestHeadersBuilder.addAcceptHeader("*/*")
									 .addAcceptEncodingHeader("gzip")
									 .addConnectionHeader("Keep-Alive")
									 .addUserAgentHeader("Mozilla/4.0");

			httpRequest.setHttpRequestHeaders(httpRequestHeadersBuilder.build());

			HttpResponse httpResponse = httpRequest.sendRequest();

			System.out.println(httpResponse.toString());
		}
	}
}
