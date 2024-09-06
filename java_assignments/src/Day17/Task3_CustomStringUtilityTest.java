package Day17;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Task3_CustomStringUtilityTest {
	
	@Test
	public void testOne() {
		String str = "Hi everyone";
		assertEquals(str, "Hi everyone");
		//assertEquals(str, "Hi");//false
	}
	
	@Test
	public void testTwo() {
		String str = "Good morning";
		assertTrue(str.charAt(0) == 'G');
		assertTrue(str.contains("morning"));
		assertFalse(str.charAt(0) == 'v');
	}
}
