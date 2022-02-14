package SuperKeyWord;
//Super keyword in java is reference variable which is used to refer immediate parent class object
//Whenever you create the instance of subclass,an instance of parent class is created implicitly which
//is referred by super reference variable
//Usage of java  Super keyword
//1..super can be used to refer immediate parent class instance variable
//2..super can be used to invoke immediate parent class method
//3..super() can be used to invoke immediate parent class constructor
//We can use super keyword to access the data member or field of parent class,it's used if parent class
//and child class have same fields
class Animal{
	String color="White";
}
class Dog extends Animal{
	String color="Black";
	void printColor() {
		System.out.println(color);//prints color of Dog class
	System.out.println(super.color);
	}
}
public class BasicConcepts {
	public static void main(String []args) {
		Dog d=new Dog();
		d.printColor();
	}}
//In the above example,Animal and Dog,both classes have a common property color.If we print color property
//,it will print the color of current class by default.To access the parent property,
//we need to use super keyword
