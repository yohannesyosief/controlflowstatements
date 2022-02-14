package Polymorohism;
class Animal{
	void eat() {System.out.println("eating...");}
}
class Dog extends Animal{
 void eat() {System.out.println("Eating bread...");}
}
 class Cat extends Animal{
	 void eat() {System.out.println("Eating Rat....");}
 }
	 class Lion extends Animal{
		 void eat() {System.out.println("eating meat...");}
	 }

public class TestPolymorphism2 {

	public static void main(String[] args) {
		Animal
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
		a=new Lion();
		a.eat();
		
	}
			}


