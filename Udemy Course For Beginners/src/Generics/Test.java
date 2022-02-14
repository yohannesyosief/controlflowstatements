package Generics;
//We can also write generic functions that can be called with different types of arguments based on the type of arguments passed to the generic
//method,the compiler handles each method

public class Test {
	
	//A simple Java program to show working of user defined Generic functions
	
	static<T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() +"= "+element);
	}

	public static void main(String[] args) {
		//Calling generic method with Integer argument
		genericDisplay(11);
		
		//Calling generic method with String argument
		
		genericDisplay("GeeksForGeeks");
		
		//Calling generic method with Double argument
		
		genericDisplay(1);

		
	}

}