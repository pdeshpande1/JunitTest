package Junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTest_example {

	/*@RepeatedTest(3)
	public void CalcTest_add()
	{
		assertEquals(24,Calculator.add(12,12));
	}*/
	
	@Test
	public void palindrome_Test()
	{
		Assert.assertTrue(Ispalindrome.Verify_palindrome("MadaM"));
	}
	
	@Test
	public void palindrome_Test1()
	{
		Assert.assertFalse(Ispalindrome.Verify_palindrome("Prachi"));
	}
}
