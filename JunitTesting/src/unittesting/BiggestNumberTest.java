package unittesting;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;

public class BiggestNumberTest {
	
	@Test
	public void testBiggest() {
		int[] arr = {12,34,22,5,3};
		assertEquals(34,BiggestNumber.biggestNumber(arr));
	}

}


	
																		