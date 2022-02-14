package ThisKeyword;
//We may invoke the the method of the current class by using the this keyword
class A{
	void m() {
		System.out.println("hello m");
	}
		void n() {
			System.out.println("hello n");
			//m()://same as this m()
			this.m();
		}
	}


public class ToInvokeCurrentClass {

	public static void main(String[] args) {
		A a=new A();
		a.n();
		
			}}
