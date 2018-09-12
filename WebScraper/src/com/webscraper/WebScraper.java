package com.webscraper;

import com.http.HttpMethod;
import com.http.HttpRequest;
import com.http.HttpRequestImpl;
import com.http.HttpResponse;

/**
 * @author WilliamAhmed
 * @since 11/09/2018
 */
public class WebScraper {

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
