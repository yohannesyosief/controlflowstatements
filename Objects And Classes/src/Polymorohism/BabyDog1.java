package Polymorohism;
class AnimalRocky{
	void eat() {System.out.println("Animal is eating...");}
}
class DogRocky extends AnimalRocky{
	void eat() {System.out.println("Dog is eating...");}
}

public class BabyDog1 extends DogRocky{

	public static void main(String[] args) {
		AnimalRocky a=new BabyDog1();
		a.eat();
		}}
//Since,babyDog is not overriding the eat() method,so eat() method of Dog class is invoked
