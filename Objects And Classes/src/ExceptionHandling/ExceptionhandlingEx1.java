package ExceptionHandling;
//Let's see an example of Java Exception handling where we using a try-catch statement to handle the exception

public class ExceptionhandlingEx1 {

	public static void main(String[] args) {
		try {//code that may raise exception
			int data=100/0;
		}
		catch(ArithmeticException e) 
		{System.out.println(e);}
		//rest of the program
		System.out.println("rest of the code...");
		}}
//In the given example,100/0 raises an ArithmeticException which is handled by a try-catch block
