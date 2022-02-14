package AutoboxingAndunboxingJavaTpoiny;
//In method overloading ,boxing and unboxing can be performed.There are some rules for method overloading with boxing:
//1,Widening beats boxing 2,Widening beats varargs 3,boxing beats varargs


//if there is possibility of widening and boxing widening beats boxing.
public class AutoboxingWidening {
	static void m(int i) {System.out.println("int");}
	static void m(Integer i) {System.out.println("Integer");}

	public static void main(String[] args) {
		short s=30;
		m(s);
		
	}

}
