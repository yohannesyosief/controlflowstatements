package InheritanceInJava;
//Types of inheritance in java
//there are three types of inheritance,single,multilevel and hierarchical
//i java programming ,multiple and hybrid inheritance are supported through interface only
//when one class inherits multiple classes,it is known as multiple inheritance
//Single Inheritance Example
//When a class inherits another class,it's known as single inheritance
class Animal{
	void eat() {
		System.out.println("eating...");
	}
	}
class Dog extends Animal{
	void bark() {System.out.println("barking...");}
}

public class TypesOfInheritanceSingle {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
			}
	}
