package testNGSessions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParametersDemo_1 {

	@Test
	@Parameters({ "demoName", "testName" })
	public void parameter(String demoName, String testName) {
		System.out.println("Name of the Demo is " + demoName + " and Test Name is  " + testName);
		assertEquals("ParametersDemo", demoName);
		assertEquals("ParametersDemoTest", testName);
	}
}
