package hy_java_fuzz_test.example5;

import com.gitlab.javafuzz.core.AbstractFuzzTarget;

import hy_java_fuzz_test.example5.App;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractFuzzTarget {
	public void fuzz(byte[] data) {
	        App.parseComplex(data);
	}
}

