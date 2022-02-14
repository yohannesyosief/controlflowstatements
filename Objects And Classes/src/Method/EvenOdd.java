package Method;
//once we have defined a method it should be called
//when we call or invoke a user-defined method,the program control transfer to the called method.
import java.util.Scanner;

public class EvenOdd {
	
public static void main(String[] args) {
	//creating Scanner class object
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=scan.nextInt();
	//method calling
	findEvenOdd(num);
	//as soon as the compiler reaches at line findEvenOdd(num),the control transfers to the method and gives the 
	//output accordingly
		
	}
//user defined method
public static void findEvenOdd(int num) {
	if(num%2==0)
		System.out.println(num+" is even");
	else
		System.out.println(num+" is odd");
	
}

}
