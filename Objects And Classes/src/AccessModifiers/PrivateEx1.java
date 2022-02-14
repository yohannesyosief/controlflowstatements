package AccessModifiers;
//In this example ,we have created two classes A and PrivateEx1,A class contains private data member and private
//method.We r accesing this private memebers from outside the class,so there's a compile-time error
//If we make any class constructor private,you cannot create the instance of that class from outside the class.For
class A1{
	private A1() {}//private constructor
	private int data=40;
	protected void msg() {System.out.println("Hello java");}
}

public class PrivateEx1 {

	public static void main(String[] args) {
		A1 obj=new A1();
		System.out.println(obj.data);  //Compile Time Error
		obj.msg();//Compile time Error
	}}
//Note;A class cannot be private or protected except nested class
