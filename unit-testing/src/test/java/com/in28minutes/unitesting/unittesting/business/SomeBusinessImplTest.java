package com.in28minutes.unitesting.unittesting.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.in28minutes.unittesting.unittesting.business.SomeBusinessImpl;

public class SomeBusinessImplTest {

	@Test
	public void testCalculateSum() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] {1,2,3});
		int expectedResult =6;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testCalculateEmpty(){
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] { });
		int expectedResult =0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculatesingleElement(){
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new int[] {10 });
		int expectedResult =10;
		assertEquals(expectedResult, actualResult);
		}
	}
