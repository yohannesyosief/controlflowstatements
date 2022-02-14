package AutoboxingAndunboxingJavaTpoiny;
//Autoboxing can be performed with comparison operators.Let's see the example of boxing with comparison operator:


public class UnboxingExample3 {

	public static void main(String[] args) {
		Integer i=new Integer(50);
		if(i<100) {   //unboxing internally
			System.out.println(i);
		}
			}

}
