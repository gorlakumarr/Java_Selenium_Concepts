package seleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Check_LinkBroken {

	public static void main(String[] args) {
		brokenURL("https://www.google.co.in/");
	}

	public static String brokenURL(String urlnew) {
		String str = null;

		try {

			URL url = new URL(urlnew);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setConnectTimeout(3000);
			str = connection.getResponseMessage();

			if (connection.getResponseCode() == 200) {
				System.out.println(str);

			} else if (connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;

	}
}
