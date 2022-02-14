package JavaVariables;
//A variable is a container which holds the value while the Java program is executed.A variable is assigned with a data type.
//variable is a name of memory location.There are three types of variables in java:local,instance and static.

//There are two types of data types in java:primitive and non-primitive.

//Variable
//variable is name of reserved area located in memory.In other words,it is a name of memory location.
//It is a comobination of "vary + able"that means its value can be changed.
//int data=50,//here data is variable

//Types of Variables
//There are three types of variables in java:
//1..local variable
//2..instance variable
//3..static variable

//1.Local Variable

//A variable declared inside the body of the method is called local variable.you can use this variable only with in that method and
//other methods in the class aren't even aware that the variable exists.
//A local variable cannot be defined with "static" keyword.

//2.Instance Variable
//A variable declared inside the class but outside the body of the method.It's not declared as static
//It is called instance variable because its value is instance specific and is not shared among instances.

//3.Static Variable
//A variable which is decared as static is called static variable.It cannot be local.We can create a single copy of 
//static variable and share among all the instance of the class.Memory allocation for static variable happens only once 
//when the class is loaded in the memory

//Exampe to understand the types of variables in java
class A{
	int data=50; //instance variable
	static int m=100; //static variable
	void method() {
		int n=90;//local variable
	}
	} //end of class

//Java Variable Example:Add Two Numbers
class Simple{
	public static void main(String[]args)
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
}
//Java Variable Example:widening
class Simple1{
	public static void main(String[]args) {
		int a=10;
		float f=a;
		System.out.println(a);
		System.out.println(f);
	}
}
//Java Variable Example:Narrowing (Typecasting)
class Simple2{
	public static void main(String []args) {
		float f=10.5f;
		//int a=f;// Compile time error
		int a=(int)f;
		System.out.println(f);
		System.out.println(a);
	}
}
//Java variable Example:Overflow
class Simple3{
	public static void main(String[]args) {
		//Overflow
		int a=130;
		byte b=(byte)a;
		System.out.println(a);
		System.out.println(b);
	}
}
//Java variable Example:Adding lower Type
class Simple4{
	public static void main(String[]args) {
		byte a=10;
		byte b=10;
		//byte c=a+b;//Compile Time Error:because a+b=20 will be int
		byte c=(byte)(a+b);
		System.out.println(c);
	}
}



public class BasicConcepts {

}
