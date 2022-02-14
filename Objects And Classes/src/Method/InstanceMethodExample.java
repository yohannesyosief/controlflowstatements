package Method;
import java.util.Scanner;

public class InstanceMethodExample {

	public static void main(String[] args) {
		
		//Creating an object of a class
		InstanceMethodExample obj=new InstanceMethodExample();
		//invoking instance method
		System.out.println("The sum is:"+obj.add(12,13));
		
			}
	//int s;
	//user-defined method because we have not used static keyword
	public int add(int a,int b) {
		int s;
		s=a+b;
		//Scanner input=new Scanner(System.in);
		//System.out.println("Enter first number");
		//c=input.nextInt();
		//System.out.println("Enter second number");
		//d=input.nextInt();
		//returning the sum
		return s;
	}

}
