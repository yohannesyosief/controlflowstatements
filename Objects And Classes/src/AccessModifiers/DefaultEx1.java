package AccessModifiers;
//If we don't use any modifier, it is treated as Default by default,
//Default modifiers is accessible inly with in package.It cannot be accesed from outside the package.
//it provides more accessibilty than private.But ,ore restrictive than protected and public
import pack.*;

public class DefaultEx1 {

	public static void main(String[] args) {
		DefaultEx1 obj=new DefaultEx1();//Compile time error
		obj.msg();//Compile time error
		//In this example,the scope of the class A and its method msg() is default,so it cannot be 
		//accessed from  outside the package
	}

}
