package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametrs {
	@Parameters({ "osVersion" })
	@Test(enabled = true)
	public void f(@Optional("Windows") String osVersion) {
		System.out.println("OS Version --> " + osVersion);
	}

	@Test(dataProvider = "excelReadData", dataProviderClass = ExcelRead.class)
	public void dataProvider(String name, String age) {
		System.out.println("Name --> " + name + " Age --> " + age);
	}

}
