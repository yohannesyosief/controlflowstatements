package JavaCatchMultipleExceptions;

public class MultiCatchBlockEx2 {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			System.out.println(a[10]);
			
		}
		catch(ArithmeticException e)
		{System.out.println("Arithmetic Exception occurs");}

		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("ArrayIndexOutOfBound Exceptions occurs");}
		catch(Exception e)
		{System.out.println("Parent Exceptionoccurs");}
		System.out.println("rest of the code");
	}}



