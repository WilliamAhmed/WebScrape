package com.io.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * The type Web scraper input stream reader.
 *
 * @author WilliamAhmed
 * @since 12 /09/2018
 */
public class WebScraperInputStreamReader {


	/**
	 * Read string.
	 *
	 * @param inputStream the input stream
	 * @return the string
	 */
	public static String read(InputStream inputStream) {
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String inputLine;
		StringBuffer stringBuffer = new StringBuffer();

		try {

			while((inputLine = bufferedReader.readLine()) != null) {
				stringBuffer.append(inputLine);
			}

			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return stringBuffer.toString();
	}



}
