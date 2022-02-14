package Interface;
//As we have explained in the inheritance chapter,multiple inheritance is not supported in the case of 
//class because of ambiguity.However,it is supported in case of an interface because there is no ambiguity
//it is because it's implementation is provided by the implementation class.For example.
interface Printable2{
	void print();

}
interface Showable2 {
	void print();}


public class MultipleINTERFACE2 implements Printable2,Showable2 {
	public void print() {System.out.println("Hello");}
	
public static void main(String[] args) {
	MultipleINTERFACE2 obj=new MultipleINTERFACE2();
obj.print();
		}}
//As you can see in the above example,Printable and Showable interface have same methods but it's implementation
//is provided by class MultipleINTERFACE2,so there is no ambiguity
