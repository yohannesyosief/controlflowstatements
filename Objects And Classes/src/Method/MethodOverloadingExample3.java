package Method;
//Why method overloading is not possible by changing the return type of method only
//in java it's not possible because of ambiguity
class adder3{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(int a,int b)
	{
		return a+b;
	}
}

public class MethodOverloadingExample3 {
	
public static void main(String[] args) {
	System.out.println(adder3.add(11,11));
			}

}
