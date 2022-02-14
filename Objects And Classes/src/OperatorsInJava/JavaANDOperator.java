package OperatorsInJava;
//The logical && operator doesn't check second condition if first condition is false.It checks second condition only if first 
//one is true

//The bitwise & operator always checks both condition is true or false.

public class JavaANDOperator {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a<b&&a>c);//false && true=false
		System.out.println(a>b&&a<c);//true && true=true
		System.out.println(a>b&&a>c);//true && false=false
		System.out.println(a<b&a<c);//false&true=false
		System.out.println(a>b&&a<b);//false
	System.out.println(a>b&&a<b);//false
	}
}
