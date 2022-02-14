package JavaTryCatchBlock;
//Let's see an example to print a custom message on exception

public class TryCatchExample5 {

	public static void main(String[] args) {
		try
		{
			int data=50/0;//may throw exception
			
		}
		catch(Exception e)
		{		
			System.out.println("Can't divide by zero");
			}

	}}
