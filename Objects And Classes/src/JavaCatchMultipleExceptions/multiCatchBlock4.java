package JavaCatchMultipleExceptions;
//In this example,we generate NullPointerException.But didn't provide the corresponding exception type.
//In such case,the catch block containing the parent exception class Exception will be invoked.

public class multiCatchBlock4 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{System.out.println("Arithmetic Exception occurs");}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("ArrayIndexOutOfBound Exceptions occurs");}
		catch(Exception e)
		{System.out.println("Parent Exceptionoccurs");}
		System.out.println("rest of the code");

	}}
