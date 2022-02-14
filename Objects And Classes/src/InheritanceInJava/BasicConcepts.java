package InheritanceInJava;
//is  a mechanism in which one object acquires all properties and behavior of a parent class
//it is an important part of OOPs
//The idea behind inheritance in java is that you can create new classes that are built up on existing classes
//When you inherit from an existing class,you can reuse methods and fields of parent class
//moreover,you can add new methods and fields in your current class also
//Inheritance represents the IS-A relationship which is also known as a parent-child relationship
//Why use inheritance in java
//1.for Method Overriding(so runtime polymorphism can be achieved)
//2.code Reusabilty
//Terms used in Inheritance
//1. Class:a class is a group of objects which have common properties,it's a template or blue print from which objects
//are created
//2.Sub Class/Child class:Subclass is a class which inherits the other class.it's called a derived class,extended class,or child class
//Super class/Parent class:Superclass is the class from where a subclass inherits the features.it is also called a base class
//or parent class
//ReUsability:as the name specifies,reusability is a mechanism which facilitates you to reuse the fields and methods of existing class
//when you create a new class.You can use the same fields and methods already defined in the previous class

//class SubClass-name extends Superclass-name  {
	//methods and fields
//}
//The extends keyword indicates that you are making a new class that derives from and existing class.
//the meaning of "extends" is to increase the functionality//
//in terminology of java,a class which is inherited is called a parent or superclass,and the new class is called child or subclass
class Employee{
	float salary=40000;
	
}
class Programmer extends Employee{
	int bonus=10000;
}
	public class BasicConcepts{
	public static void main(String[]args) {
		Programmer p=new Programmer();
		System.out.println("Programmer salary is:"+p.salary);
		System.out.println("Bonus of programmer is:"+p.bonus);
	}
}

