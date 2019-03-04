package com.in28minutes.unitesting.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListMockTest {

	@Test
	public void actualTest() {
		List list = mock(List.class);
		when(list.size()).thenReturn(5);
		assertEquals(5, list.size());
	}
	
	@Test
	public void returnDiffValues() {
		List list = mock(List.class);
		when(list.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, list.size());
		assertEquals(10, list.size());
	}
	
}
