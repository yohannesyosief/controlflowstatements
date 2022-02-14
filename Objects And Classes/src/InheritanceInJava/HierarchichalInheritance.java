package InheritanceInJava;
//When two or more classes inherits a single class,it's known as hierarchical inheritance
class Animal3{
	void eat() {System.out.println("eating..");}
}
class Dog3 extends Animal{
	void bark() {System.out.println("barking...");};
}
	class Cat extends Animal{
		void meow() {System.out.println("meowing...");}
	}

public class HierarchichalInheritance {

	public static void main(String[] args) {
		Cat c=new Cat();
		Dog3 d=new Dog3();
		c.meow();
		c.eat();
		d.eat();
		d.bark();
	}
		
	}


