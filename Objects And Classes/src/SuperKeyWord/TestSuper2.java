package SuperKeyWord;
//Super keyword is also used to invoke parent class method.It should be used if subclass contains 
//the same method as parent class.In other words,it is used if method is overriden
class Animal3{
	void eat() {System.out.println("eating....");}
}
class Dog3 extends Animal3{
	void eat() {System.out.println("eating bread");}
	void bark() {System.out.println("barking...");}
	void work() {
		super.eat();
	 bark();
		
	}
}

public class TestSuper2 {
	public static void main(String[]args)
	{
		Dog3 d=new Dog3();
		d.work();
		d.eat();
	}}
//in the above example Animal and Dog both classes have eat() method if we call eat() method from dog class
//it will call the eat() method of Dog class by default because priority is given to local
//To call the parent class method ,we need to use super keyword
