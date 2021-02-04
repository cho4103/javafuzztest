package test_with_core.test_project_with_core;

import dev.fuzzit.javafuzz.core.AbstractFuzzTarget;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractFuzzTarget {
	public void fuzz(byte[] data) {
	        App.parseComplex(data);
	}
}

