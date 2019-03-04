package com.in28minutes.unitesting.unittesting.mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.in28minutes.unittesting.unitesting.data.SomeDataService;
import com.in28minutes.unittesting.unittesting.business.SomeBusinessImpl;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
	
	@Mock
	private SomeDataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl business;
	
	public void testCalculateSumUsingDataService_basic() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3}); // interface method gets called for actual value
		assertEquals(6, business.calculateSumUsingDataService());//actual class gets the value stored and compared with the expected
	}
	
	public void testCalculateSumUsingDataService_empty() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { }); // interface method gets called for actual value
		assertEquals(0, business.calculateSumUsingDataService());//actual class gets the value stored and compared with the expected
	}
	
	public void testCalculateSumUsingDataService_oneElement() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {10}); // interface method gets called for actual value
		assertEquals(10, business.calculateSumUsingDataService());//actual class gets the value stored and compared with the expected
	}
}
