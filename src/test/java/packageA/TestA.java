package packageA;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestA {
	
	@Tag("Sanity")
	@Test
	public void Test1()
	{
		System.out.println("Inside Test 1");
	}

}
