package JavaAbstraction;
//The abstract class can also be used to provide some implementation of the interface
//in such case,the end user may not be forced to override all the methods of the interface
interface A{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A{
	public void c() {System.out.println("i am C");}
}
class M extends B{
	public void a() {System.out.println("I am a");}
	public void b() {System.out.println("I am b");}
	public void d() {System.out.println("I am d");}

	
}

public class TestInterface {

	public static void main(String[] args) {
	//M a=new M();
		A a=new M();
		a.a();
		a.b();
		a.c();
		a.d();
			
	}}
