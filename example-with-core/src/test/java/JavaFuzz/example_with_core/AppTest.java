package JavaFuzz.example_with_core;



import JavaFuzz.example_with_core.App;
import dev.fuzzit.javafuzz.core.AbstractFuzzTarget;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractFuzzTarget {
	public void fuzz(byte[] data) {
	        App.parseComplex(data);
	}
}

