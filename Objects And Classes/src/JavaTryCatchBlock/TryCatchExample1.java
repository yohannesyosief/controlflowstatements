package JavaTryCatchBlock;
//Let's try to understand the problem if we don't use a try-catch block

public class TryCatchExample1 {

	public static void main(String[] args) {
		int data=50/0; //may throw exception
		System.out.println("rest of the code");
		}}
//As displayed in the above example,the rest of the code is not executed (in such case,the rest of the code statement is printed).
//There can be 100 lines of code after exception.So all the code after exception after exception will not be executed.
