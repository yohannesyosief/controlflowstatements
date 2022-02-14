package JavaFinallyBlock;
//Usage of java finally 
//Let's see the different cases where java finally finally block can be used.
//Case 1
//Let's see the java example where exception doesn't occur
public class TestFinallyBlock {
	public static void main(String[]args)
	{
		try {
			int data=25/5;
			System.out.println(data);
		}
		catch(NullPointerException e) {System.out.println(e);}
		finally{System.out.println("finally block is always executed");}
		System.out.println("rest of the code...");
	}

}
