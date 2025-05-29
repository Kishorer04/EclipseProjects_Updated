package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	@Test
	public void assertDemo() {
		String name="Kishore";
		boolean value =false;
		
		Assert.assertEquals(name, "Kishore");
//		Assert.assertNotEquals(name, "Kishore");
		Assert.assertTrue(value, "This should be true");
//		Assert.assertFalse(value, "This should be true");
	}

}
