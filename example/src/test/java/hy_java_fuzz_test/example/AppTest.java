package hy_java_fuzz_test.example;

import dev.fuzzit.javafuzz.core.AbstractFuzzTarget;

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
