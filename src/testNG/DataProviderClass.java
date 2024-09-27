package testNG;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "testdata")
	public static Object[][] testData() {
		return new Object[][] { { "gk" }, { "km" }, };
	}
}
