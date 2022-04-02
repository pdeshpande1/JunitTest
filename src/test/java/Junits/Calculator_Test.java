package Junits;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Calculator_Test {
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("Inside beforeAll");
	}
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("Inside Before Each");
	}

	@Test
	public void CalcTest_add()
	{
		assertEquals(24,Calculator.add(12,12));
		
		String arr1[]= {"one", "two", "three"};
		String arr2[]= {"one", "two", "three"};
		
		Assert.assertArrayEquals(arr1, arr2);
		
		System.out.println("Inside Test1");
		
	}
	
	@Test
	public void ClacTest_sub()
	{
		assertEquals(9, Calculator.sub(15, 6));
	}
	
	@AfterEach
	public void afterEach()
	{
		System.out.println("Inside afterEach");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("Inside afterAll");
	}
}
