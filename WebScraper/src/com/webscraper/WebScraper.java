package com.webscraper;

import com.http.request.HttpRequest;
import com.http.request.HttpRequestHeaders;
import com.http.request.HttpRequestHeadersBuilder;
import com.http.request.HttpRequestMethod;
import com.http.response.HttpResponse;

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
			httpRequestHeadersBuilder.addAcceptHeader("*/*");
			httpRequestHeadersBuilder.addAcceptEncodingHeader("gzip");
			httpRequestHeadersBuilder.addConnectionHeader("Keep-Alive");
			httpRequestHeadersBuilder.addUserAgentHeader("Mozilla/4.0");

			httpRequest.setHttpRequestHeaders(httpRequestHeadersBuilder.build());

			HttpResponse httpResponse = httpRequest.sendRequest();

			System.out.println(httpResponse.toString());
		}
	}
}
