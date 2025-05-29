package optionalExample;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Optional;

import org.testng.annotations.Test;

public class CreateOptionalObjectsExample {
	
	@Test
	public void usingEmpty() {
		Optional empty = Optional.empty();
		assertTrue(empty.isEmpty());
	}
	
	@Test
	public void usingOf() {
		String name= "Kishore";
		Optional<String> of = Optional.of(name);
		assertTrue(of.isPresent());
	}
	
	@Test
	public void usingOfNullable() {
		String name = "Kishore";
		name = null;
		Optional<String> nonNullable = Optional.ofNullable(name);
		assertFalse(nonNullable.isPresent());
	}

}
