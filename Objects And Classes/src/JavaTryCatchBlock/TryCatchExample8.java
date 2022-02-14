package JavaTryCatchBlock;
//In this example,we handle the generated exception (Arithmetic Exception) with a different type of exception class
//(ArayIdexOutOfBoundException).

public class TryCatchExample8 {

	public static void main(String[] args) {
		
		
		try {
			int data=50/0; //may throw exception
		}
		//try to handle the arithmeticException using ArrayIndexOutOfBoundException
		catch(ArrayIndexOutOfBoundsException e)
		//catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
			}

}
