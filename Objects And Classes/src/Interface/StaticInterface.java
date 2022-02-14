package Interface;
//Since java 8,we can have static method in interface.let's see an example.
interface Drawable3{
	void draw();
	static int cube(int x) {return x*x*x;}
}
class Rectangle3 implements Drawable3{
	public void draw() {System.out.println("drawing rectangle");}
}

public class StaticInterface {

	public static void main(String[] args) {
		Drawable3 obj=new Rectangle3();
		obj.draw();
		System.out.println(Drawable3.cube(3));
		
	}

}
