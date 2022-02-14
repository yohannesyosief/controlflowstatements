package Method;
//Changing data type of arguments
class Adder2{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b,double c)
	{
		return a+b+c;
	}
}

public class MethodOverLoadingExample2 {

	public static void main(String[] args) {
		System.out.println(Adder2.add(11, 11));
		System.out.println(Adder2.add(12.3, 14.5,13.2));
		
	}

}
