package Method;
//A method that has static keyword is known as static method
//In other words a method that belongs to a class rather than an instance of a class is known as a static method
//we can create a static method by using the keyword static before the method name
//the main advantage of a static method is we can call it with out creating an object;it can also access static data members
//and change the value of it
//it's used to create an instance method.it's invoked by using the class name
//The best example of static method is main method
public class DisplayStatic {

	public static void main(String[] args) {
		 show();
		
	}
	static void show() {
		System.out.println("it is an example of static method");
	}

}
