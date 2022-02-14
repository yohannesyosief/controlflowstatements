package Constructor;
//Rules for creating java constructor
//1.Constructor name must be the same as its class name
//2.A Constructor must have no explicit return type
//3.A java constructor cannot be abstract,static,final and synchronized
//Types of java constructor
//1.Default Constructor(no-arg constructor)
//2.Parameterized constructor

public class Bike1 {
	
		//creating a default constructor
		Bike1(){
			System.out.println("Bike is created");
		}

	public static void main(String[] args) {
		//calling a default constructor
		Bike1 b=new Bike1();
			}

}
