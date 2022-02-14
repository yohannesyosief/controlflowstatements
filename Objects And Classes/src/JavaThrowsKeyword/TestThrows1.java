package JavaThrowsKeyword;
//Let's see the example of java throws clause which describes that checked exceptions can be propagated by throw keyword
import java.io.IOException;

public class TestThrows1 {
	void m()throws IOException {
	throw new IOException("device error");//checked exception
}
void n()throws IOException{
	m();
	}
void p() {
	try {
		m();
	}
	catch(Exception e) {System.out.println("exception handled");}
}

public static void main(String args[]) {
	TestThrows1 obj= new TestThrows1();
	obj.p();
	System.out.println("normal flow");
	}}


