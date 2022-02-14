package Method;

public class Addition {
	public static void main(String[]args) {
		int a=19;
		int b=5;
		//method calling
		int c=add(a,b); //a and b actual parameters
		System.out.println("the sum of a and b is="+c);
	}
	//user defined method
	public static int add(int n1,int n2) //n1 and n2 are a formal parameters
	{
		int s;
		s=n1+n2;
		return s;
	}
	}
	


