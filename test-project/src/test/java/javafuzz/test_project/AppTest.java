package javafuzz.test_project;

import com.gitlab.javafuzz.core.AbstractFuzzTarget;

import javafuzz.test_project.App;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractFuzzTarget {
	public void fuzz(byte[] data) {
	        App.parseComplex(data);
	}
}

