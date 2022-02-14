package InheritanceInJava;
//When there is a chain of inheritance,it's known as multilevel inheritance

class Animal2{
	void eat() {System.out.println("eating..");}
	}
class Dog2 extends Animal2{
	void bark() {System.out.println("barking..");}
}
class BabyDog extends Dog2{
	void weep() {System.out.println("weeping..");}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		BabyDog d=new BabyDog();
		d.eat();
		d.bark();
		d.weep();
			}

}
