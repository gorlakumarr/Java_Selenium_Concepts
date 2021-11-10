package mockitoSession;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class InjectMockitoTest {

	@Mock
	List<String> mockList;

	@InjectMocks
	Employee mockEmployee;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void employeeMockTest() {
		when(mockList.get(0)).thenReturn("Naveen");
		when(mockList.size()).thenReturn(1);
		assertEquals("Naveen", mockList.get(0));
		assertEquals(1, mockList.size());

		assertEquals("Naveen", mockEmployee.getEmpName().get(0));
		assertEquals(1, mockEmployee.getEmpName().size());

		mockList.add(1, "Tom");
		System.out.println(mockList.get(1));
	}
}
