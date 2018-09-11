package com.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @author WilliamAhmed
 * @since 11/09/2018
 */
public class HttpRequest {

	private HttpURLConnection httpURLConnection;
	private URL connectionUrl;
	private HttpMethod httpMethod;


	public HttpRequest(HttpMethod httpMethod, URL url) {
		this.connectionUrl = url;
		this.httpMethod = httpMethod;
	}

	public HttpResponse sendRequest() {

		HttpResponse httpResponse = null;

		if(connectionUrl != null) {
			try {

				URLConnection urlConnection = connectionUrl.openConnection();
				httpURLConnection = (HttpURLConnection) urlConnection;

				httpURLConnection.setRequestMethod(httpMethod.name());

				httpURLConnection.setRequestProperty("Accept", "text/html");
				httpURLConnection.setRequestProperty("Accept-Language", "en");
				httpURLConnection.setRequestProperty("Date", new Date().toString());
				httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0");

				int responseCode = httpURLConnection.getResponseCode();
				String responseBody = retrieveHttpResponseBody(httpURLConnection.getInputStream());

				httpResponse = buildHttpResponse(responseCode, responseBody);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return httpResponse;
	}

	private String retrieveHttpResponseBody(InputStream responseInputStream) {

		InputStreamReader inputStreamReader = new InputStreamReader(responseInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String inputLine;
		StringBuffer response = new StringBuffer();

		try {

			while((inputLine = bufferedReader.readLine()) != null) {
				response.append(inputLine);
			}

			bufferedReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return response.toString();

	}

	private HttpResponse buildHttpResponse(int httpResponseCode, String responseBody) {
		return new HttpResponse(httpResponseCode, responseBody);
	}

	public void setConnectionUrl(URL url) {
		this.connectionUrl = url;
	}

}
