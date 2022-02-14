package JavaFinallyBlock;
//Case 3
//Let's see the java finally exception occurs and handled

public class TestFinallyBlock3 {

	public static void main(String[] args) {
		try {
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e) {System.out.println(e);}
		catch(NullPointerException e) {System.out.println(e);}
		finally{System.out.println("finally block is always executed");}
		System.out.println("rest of the code...");

	}}
//Rule:For each try block there can be zero or  more catch blocks,but only one finally block.


//Note:The finally block will not be executed if program exits(wither by calling System.exit() or by causing a fatal error that causes
// the process to abort
