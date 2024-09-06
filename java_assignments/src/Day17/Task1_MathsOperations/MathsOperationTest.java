/*
 * Task 1: Write a set of JUnit tests for a given class with simple mathematical 
 * operations (add, subtract, multiply, divide) using the basic @Test annotation.
 */

package Day17.Task1_MathsOperations;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;

public class MathsOperationTest {
	
	@Test
	public void testAddition() {
		assertEquals(5,MathsOperation.addition(2, 3));
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(10, MathsOperation.subtraction(20, 10));
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(15, MathsOperation.multiplication(3, 5));
	}
	
	
	@Test
	public void testDivision() {
		assertEquals(5, MathsOperation.division(25, 5));
	}
	
}
