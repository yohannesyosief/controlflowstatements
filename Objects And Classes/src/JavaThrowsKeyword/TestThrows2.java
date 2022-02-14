package JavaThrowsKeyword;

//Rule:-if you are calling a method that declares an exception,you must either catch or declare the exception

//there are tow cases:
//1.Case 1:You caught the exception i.e handle the exception using try/catch.
//2.case2:You declare the exception i.e.specifying throws with the ,method.


// Case 1:You handle the exception 
//.. In case you handle the exception,the code will be executed fine whether exception occurs during the program or not.
import java.io.*;
class M{
	void method()throws IOException{
		throw new IOException("device error");
	}
}


public class TestThrows2 {

	public static void main(String[] args) {
		try {
			M m=new M();
			m.method();
		}
		catch(Exception e) {System.out.println("exception handled");}
		System.out.println("normal flow");
			}

}
