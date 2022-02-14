package Polymorohism;
//In this example,we are creating two classes Bike and Example1>Example1 class extends Bike class and oveeride its run() method.
//We are calling the run method b by the reference variable of parent class.
//Since it refers to the subclass object and subclass method overrides the Parent class method,
//the subclass method is invoked at runtime
class Bike{
	void run() {System.out.println("running");}
}

public class Example1 extends Bike{
	public void run() {System.out.println("Running safely with 60Km/Hr");}
	
	
	

	public static void main(String[] args) {
		//Example1 b=new Example1();
		Bike b=new Example1();
		b.run();
		
		}

}
