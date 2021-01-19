package hy_java_fuzz_test.example5;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String parseComplex (byte[] data) {
        if (data.length >= 3) {
        	System.out.println(data[0]);
        	return "no";
        }
        return  "ok";
    }

	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
