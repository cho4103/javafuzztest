package hy_java_fuzz_test.example3;

import com.gitlab.javafuzz.core.AbstractFuzzTarget;

import hy_java_fuzz_test.example3.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public class FuzzParseComplex extends AbstractFuzzTarget
	{
	    public void fuzz(byte[] data)
	    {
	        App.parseComplex(data);
	    }
	}
}

