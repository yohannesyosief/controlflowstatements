package OperatorsInJava;
//The logical || operator doesn't check second condition if first condition is true.It checks second condition only if 
//first one is false.

//The bitwise | operator always checks both conditions whether first condition is true or false.

public class OROperatorEx1 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a>b||a<c); //true||true=true
		System.out.println(a>b||a>c); //true||false=true
		System.out.println(a>b|a<c); //true|true=true
		System.out.println(a>b||a>c); //true||false=true

		// ||vs|
		System.out.println(a>b||a++<c);//true||true=true
		System.out.println(a); //10 because second condition is not checked
		System.out.println(a>b|a++<c); //true|true=true
		System.out.println(a);//11 because second condition is checked
			}

}
