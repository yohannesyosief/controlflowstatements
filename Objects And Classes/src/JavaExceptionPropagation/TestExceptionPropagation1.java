package JavaExceptionPropagation;
//An exception is first thrown from the top of the stack and if not caught,it drops down the call stack to the previous method,
//if not caught there,the exception again drops down to the previous method,and so on until they are caught or 
//until they reach the very bottom  of the call stack.This is called exception propagation.

//Rule:By default Unchecked Exceptions are forwarded in calling chain(propogated).

public class TestExceptionPropagation1 {
	void m() {
	int data=50/0;
}
void n(){
	m();
	}
 void p1() {
	try {
		m();
	}
	catch(Exception e) {System.out.println("exception handled");}
}

public static void main(String args[]) {
	TestExceptionPropagation1 obj= new TestExceptionPropagation1();
	obj.p1();
	System.out.println("normal flow");
	}}
//In the above example exception occurs in m()method ,where it is not handled,so it is propagated to previous n() method,
//where it is not handled,again it is propagated to p() method where exception is handled.

//Exception can be handled in any method in call stack either in main(),p() method,n() method or m() method.

//Rule:By default ,Checked Exceptions are not forwarded in calling chain (propagated)
