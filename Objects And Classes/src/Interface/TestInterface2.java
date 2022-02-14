package Interface;
//Interface declaration ;by first user
interface Drawable{
	void draw();
}
//Implementation by second user
class Rectangle implements Drawable{
	
	public void draw() {
		System.out.println("Drawing rectangle");
		}}
class Circle implements Drawable{

	public void draw() {
		System.out.println("drawing circle");
			}}
//Using interface by third user

public class TestInterface2 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Circle c=new Circle();//in real scenario,object is provided by method e.g getDrawable()
		r.draw();
		c.draw();
			}}
