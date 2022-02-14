package MethodOverRidding;
//IN this example we have defined the run method in the subclass as defined in the parent class but it has
//some specific implementation.
//THe name and parameters of the method are the same and there is IS-A relationship between the classes,
//ther's method overriding
//creating parent class
class Vehicle2{
	void run() {System.out.println("Vehicle is running");}
}
class Bike2 extends Vehicle{
	void run() {System.out.println("Bike is running");}
}

public class BasicExample2 {

	public static void main(String[] args) {
		Bike2 obj=new Bike2();
		obj.run();
			}

}
