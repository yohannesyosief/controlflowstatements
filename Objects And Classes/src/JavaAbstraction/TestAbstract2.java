package JavaAbstraction;
//An abstract class can have a data member,abstract method ,method body(non-abstract method);
//constructor ,and even main() method
abstract class Biken{
	Biken(){System.out.println("bike is created");}
	abstract void run();
	void changeGear() {System.out.println("gear changed");}
	}
//Creating a child class which inherits Abstract class and non abstract methods
class Honda extends Biken{
	void run() {System.out.println("running safely");}
}
//Creating a test class which calls abstract and non abstract methods

public class TestAbstract2 {

	public static void main(String[] args) {
		//Honda obj=new Honda();
		Biken obj=new Honda();  //or we can use also
		obj.run();
		obj.changeGear();
			}}
//If there is an abstract method in a class,that class must be abstract
//If we are extending an abstract class that has an abstract method,you must either provide the
//implementation of the method or make this class abstract
