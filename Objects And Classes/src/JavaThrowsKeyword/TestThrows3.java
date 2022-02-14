package JavaThrowsKeyword;
//Case 2:You declare the exception

//A)In case you declare the exception,if exception doe not occur,the code will be executed fine.
//B) in case you declare the exception if exception occurs, an exception will be thrown at runtime because throws
//does not handle the exception
import java.io.IOException;
class M1{
	void method()throws IOException{
		System.out.println("device operation performed");
	}
}


public class TestThrows3 {
	public static void main(String[] args) {
		try {
			M1 m=new M1();
			m.method();
		}
		catch(Exception e) {System.out.println("exception handled");}
		System.out.println("normal flow");
			}

}
