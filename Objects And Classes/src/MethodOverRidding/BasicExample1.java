package MethodOverRidding;
//let's understand the problem that we may face in the program if we don't use method overriding
//creating a parent class
class Vehicle{
	void run() {System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike extends Vehicle{
	
}

public class BasicExample1 {

	public static void main(String[] args) {
		//crating an instance of Bike (child)class
		Bike obj=new Bike();
		obj.run();
	}

}
//Problem is that we have to provide a specific implementation of run() method in subclass Bike that's why
//we use method overriding
