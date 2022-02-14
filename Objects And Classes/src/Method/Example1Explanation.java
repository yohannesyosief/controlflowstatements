package Method;

//A method is way to perform some task
//A method is a block or code or collection of statements or a set of code grouped together to perform a certain task
//we write a method once and we can use it so many times
//Method declaration
 // public int sum(int a,int b)
//access specifier, return type,method name,Parameter list

//                             (method Signature           )
//it's possible that a method has the same name as another n the same class,it's known as method overloading
//two types of methods,1.predefined method,2.User defined method
//Predefined Method,a method that's already defined by the java class libraries ,e.g length(),equals(),compareTo(),sqrt(),
//print()

public class Example1Explanation {
	public static void main(String[]args)
	{
		//using the max() method of Math class
		System.out.println("The Maximum number is:"+Math.max(9, 7));
//we used three predefined methods,main(),max(),print()
	}


//the method written by the user or programmer is known as a user-defined method.
//user defined method
public static void findEvenOdd(int num)
{
	//method body
	if(num==0)
		System.out.println(num+"Even");
	else
		System.out.println(num+"Odd");
}
}
//the method doesn't return any value,tha's why used void.the method contains the steps to check the number is even or odd


