package JavaTryCatchBlock;
//In this example,along with try block,we also enclose exception code in a catch block

public class TryCatchExample7 {

	public static void main(String[] args) {
		try {
			int data=50/0; //may throw exception
		}
		catch(Exception e)
		{
			int data2=20/0; //may throw exception
		}
		System.out.println("rest of the code");
		}}
//Here,we can see that the catch block didn't contain the exception code.So,enclose exception code with in a try block and use
// catch block only to handle the exception