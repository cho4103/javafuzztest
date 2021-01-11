package hy_java_fuzz_test.example;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	 public void fuzz(byte[] data)
	    {
	        App.parseComplex(data);
	    }
}
