package Junits;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParamerTest_example {

	
	@ParameterizedTest
	@ValueSource(strings= {"Madam", "Prachi", "RaceCar"})
	public void palindrome_Test(String name)
	{
		assertTrue(Ispalindrome.Verify_palindrome(name));
	}
}
