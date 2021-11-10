package javaConcepts;

import java.net.URI;
import java.net.URISyntaxException;

public class URLCompare {
	// Compare IP address and URl? TRUE

	public static void main(String[] args) throws URISyntaxException {
		System.out.println(new URI("https://www.hcltech.com").equals("https://184.50.173.231"));
	}
}
