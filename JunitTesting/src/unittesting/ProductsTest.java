package unittesting;

import static org.junit.Assert.assertEquals; 
import org.junit.Test;

public class ProductsTest {
	@Test
	public void testBiggest() {
		assertEquals(8,Products.products(2, 4));
	}
}
