package JavaAbstraction;
//In this example ,shape is abstract class,and its implementation is provided by the rectangle
//and circle class
//Mostly we don't know about the implementation class(which is hidden to the end user),and an object of the
//implementation class is provided by the factory method
//a factory method is a method that returns the instance of the class.We will learn about the factory method later
//In this example ,if you create the instance of Rectangle class,draw() method of Rectangle class will be invoked
abstract class Shape{
	abstract void draw();
}
//in real scenario,implementation is provided buy others.i.e unknown by end user
class Rectangle extends Shape{
	void draw() {System.out.println("drawing rectangle");}
}
class Circle extends Shape{
	void draw() {System.out.println("draw circle");}
}

public class TestAbstraction1 {

	public static void main(String[] args) {
		Shape s=new Circle();// in real scenario,object is provided through method e.g getShape() method
		Shape r=new Rectangle();
		//Circle s=new Circle();
		//Rectangle r=new Rectangle();
		s.draw();
		r.draw();
			}

}
