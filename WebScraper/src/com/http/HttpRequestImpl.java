package com.http;

import com.exception.RequiredDataMissingException;
import com.reader.WebScraperInputStreamReader;
import com.util.ValidationUtil;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/**
 * The type Http request.
 *
 * @author WilliamAhmed
 * @since 11 /09/2018
 */
public class HttpRequestImpl implements HttpRequest{

	private HttpURLConnection httpURLConnection;
	private URL connectionUrl;
	private HttpMethod httpMethod;
	private HttpRequestHeaders requestHeaders;

	/**
	 * Instantiates a new Http request.
	 */
	public HttpRequestImpl() {
	}

	public HttpResponse sendRequest() {
		HttpResponse httpResponse = null;

		try {
			ValidationUtil.validateNotNull(httpMethod);
			ValidationUtil.validateNotNull(connectionUrl);

			URLConnection urlConnection = connectionUrl.openConnection();

			httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.setRequestMethod(httpMethod.name());

			populateHttpConnectionRequestProperties();

			httpResponse = buildHttpResponse(httpURLConnection.getResponseCode(), WebScraperInputStreamReader.read(httpURLConnection.getInputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (RequiredDataMissingException e) {
			e.printStackTrace();
		}


		return httpResponse;
	}

	@Override
	public void setConnectionUrl(URL url) {
		this.connectionUrl = url;
	}

	@Override
	public void setHttpMethod(HttpMethod httpMethod) {
		this.httpMethod = httpMethod;
	}

	@Override
	public void setHttpRequestHeaders(HttpRequestHeaders requestHeaders) {
		this.requestHeaders = requestHeaders;
	}


	private HttpResponse buildHttpResponse(int httpResponseCode, String responseBody) {
		return HttpResponse.create(httpResponseCode, responseBody);
	}

	private void populateHttpConnectionRequestProperties() {
		if (this.requestHeaders != null && this.connectionUrl != null) {

			for (Map.Entry<String, String> requestHeader : this.requestHeaders.getHeaders().entrySet()) {
				httpURLConnection.setRequestProperty(requestHeader.getKey(), requestHeader.getValue());
			}

		}
	}
}
