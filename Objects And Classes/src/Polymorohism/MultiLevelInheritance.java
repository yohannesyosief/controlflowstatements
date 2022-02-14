package Polymorohism;
//Let's see the simple example of Runtime polymorphism with multilevel inheritance
class AnimalNew{
	void eat() {System.out.println("eating");}
}
class DogNew extends AnimalNew{
	void eat() {System.out.println("Eating fruit...");}
}
public class MultiLevelInheritance extends DogNew{
			void eat() {System.out.println("Drinking milk");}
		

	public static void main(String[] args) {
		AnimalNew a1,a2,a3;
		a1=new AnimalNew();
		a2=new DogNew();
		a3=new MultiLevelInheritance();
		a1.eat();
		a2.eat();
		a3.eat();
		}}
