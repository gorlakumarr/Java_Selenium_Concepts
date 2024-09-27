package mockitoSession;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.mockito.Mockito;

public class MyMockServiceTest {

	@Test
	@DisplayName(value = "Testing Mock Service")
	@RepeatedTest(value = 4)
	public void testMock() {
		MyMockService service = Mockito.mock(MyMockService.class);
		Mockito.when(service.add(10, 20)).thenReturn(30);
		assertEquals(30, service.add(10, 20));
	}
}
