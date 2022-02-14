package JavaCatchMultipleExceptions;
//In this example,try  lock contains two exceptions.But at a time only one exception occurs and its 
//corresponding catch block is invoked

public class MultiplecatchBlock3 {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
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



