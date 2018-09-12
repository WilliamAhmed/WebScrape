package com.webscraper;

import com.http.*;

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

			HttpMethod httpMethod = HttpMethod.valueOf(args[0]);

			HttpRequest httpRequest = HttpRequest.create(httpMethod, args[1]);
//			HttpRequestImpl httpRequest = new HttpRequestImpl(httpMethod, args[1]);
			HttpResponse httpResponse = httpRequest.sendRequest();

			System.out.println(httpResponse.toString());
		}
	}
}
