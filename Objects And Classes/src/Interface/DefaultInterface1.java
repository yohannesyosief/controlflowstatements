package Interface;
interface Drawable1{
	void draw();
	default void msg() {System.out.println("default method");}
}
class Rectangle1 implements Drawable1{

public void draw() {System.out.println("drawing rectangle");}
//public void msg() {
	//System.out .println("default");}//requires a body intead of semi colon
}
		
public class DefaultInterface1 {

	public static void main(String[] args) {
		Rectangle1 obj=new Rectangle1();
		//Drawable1 obj=new Rectangle1();
		obj.draw();
		obj.msg();
		
			}

}
