package JavaCatchMultipleExceptions;
//let's see a simple example of java multi-catch block

public class Multicatchblock1Ex1 {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{System.out.println("Arithmetic Exception occurs");}

		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("ArrayIndexOutOfBound Exceptions occurs");}
		catch(Exception e)
		{System.out.println("Parent Exceptionoccurs");}
		System.out.println("rest of the code");
	}}
