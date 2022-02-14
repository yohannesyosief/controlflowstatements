package JavaTryCatchBlock;
//Let's see the solution of TryCatchexample1

public class TryCatchExample2 {

	public static void main(String[] args) {
		try {
			int data=50/0; //may throw exception
		}
		//handling the exception
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
			
	System.out.println("rest of the code");

}}

//Now,as displayed in the above ,the rest of the code is executed.i.e the rest of the code statement is printed
