package Method;
//Method that doesn't have method body is known as abstract method,in other words with out an implementation
//it's always declared in abstract class,it means the class itself must be abstract if it has an abstract method
//To create an abstract method,we use the keyword abstract
abstract class MyClass
{
	//abstract method declaration
	 abstract void display();
	
	}
public class AbstractMethod extends MyClass   //abstract class

{
	//method implementation
			void display() {
				System.out.println("Abstract method is good");
			}
	
	
	public static void main(String[]args)
	{
		//creating object of abstract class
	AbstractMethod obj=new AbstractMethod();
		//invoking object of abstract class
		obj.display();
		
	}
}