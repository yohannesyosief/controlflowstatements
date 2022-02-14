package JavaTryCatchBlock;
//In this example,we also kept the code in a try block that will not throw an exception

public class TryCatchExample3 {

	public static void main(String[] args) {
		try{
			int data= 50/0;//may throw exception
			//If exception occurs the remaining statement will not execute
			System.out.println("rest of the code");
			
		}
		//handling the exception
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		}}
//Here we can see that if an exception occurs in the try block,the rest of the block code will not execute.