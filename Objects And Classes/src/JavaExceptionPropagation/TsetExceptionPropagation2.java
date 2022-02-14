package JavaExceptionPropagation;
//Program which describes that checked exceptions are not propagated

public class TsetExceptionPropagation2 {
	void m() {
		throw new java.io.IOException("device error");//checked exception
	}
	void n(){
		m();
		}
	void p() {
		try {
			m();
		}
		catch(Exception e) {System.out.println("exception handled");}
	}

	public static void main(String args[]) {
		TsetExceptionPropagation2 obj= new TsetExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
		}}


