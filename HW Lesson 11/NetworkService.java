package hwnetwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class NetworkService {

	public static String getStringFromURL(String spec, String code) throws IOException {
		URL url = new URL(spec);
		URLConnection connection = url.openConnection();
		String result = "";

		try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), code))) {
			String temp = "";
			for (;;) {
				temp = br.readLine();
				if (temp == null) {
					break;
				}
				result += temp + System.lineSeparator();
			}
			return result;
		}
	}

	public static void saveURLToFile(String spec, File file) throws IOException {
		try (PrintWriter pw = new PrintWriter(file)) {
			String[] tempArray = spec.split("http");
			for (int i = 1; i < tempArray.length; i++) {
				pw.print("http" + tempArray[i].substring(0, tempArray[i].indexOf('\"')) + System.lineSeparator());
			}
		}
	}

	public static void getHeadersFromURL(String spec) throws IOException {
		URL url = new URL(spec);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		if (connection.getResponseCode() == 200) {
			System.out.println("The site: " + spec + " - IS AVAILABLE");
		} else {
			System.out.println("The site: " + spec + " - IS NOT AVAILABLE");
		}

	}

	public static void checkURL(File file) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String temp = "";
			for (;;) {
				temp = br.readLine();
				if (temp == null) {
					break;
				}
				getHeadersFromURL(temp);
			}
		}
	}
}
