package hy_java_fuzz_test.example4;


import dev.fuzzit.javafuzz.core.AbstractFuzzTarget;
import hy_java_fuzz_test.example4.App;

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
