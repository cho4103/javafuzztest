package hy_java_fuzz_test.example5;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String parseComplex (byte[] data) {
        if (data.length < 3) {
	         return "no";
        }
        return  "ok";
    }

	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
