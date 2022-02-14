package Interface;
//If a class implements multiple interfaces,or an interface extends multiple interfaces,
//it's know as multiple inheritance
interface Printable{
	void print();
	}
interface Showable{
	void show();
}


public class MultipleInterface implements Printable,Showable {
	public void print() {System.out.println("Hello");}
	public void show() {System.out.println("Welcome");}


	public static void main(String[] args) {
		MultipleInterface m=new MultipleInterface();
		m.print();
		m.show();
		}}
