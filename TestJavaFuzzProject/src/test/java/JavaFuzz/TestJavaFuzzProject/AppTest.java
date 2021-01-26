package JavaFuzz.TestJavaFuzzProject;

import com.gitlab.javafuzz.core.AbstractFuzzTarget;

import JavaFuzz.TestJavaFuzzProject.App;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractFuzzTarget {
	public void fuzz(byte[] data) {
	        App.parseComplex(data);
	}
}

