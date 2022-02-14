package JavaThrowKeyword;
//Let's see the example of throw IOException

//throw new IOException("sorry device error");
//Java throw keyword example

//In this example ,we have created the validated method that takes integer value as a parameter.If the age is less than 18,
//we are throwing the ArithmeticException otherwise print a message welcome to vote.

public class TestThrow1 {
	static void validate(int age) {

	
		if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
			}

public static void main(String[] args) {
	validate(18);
	System.out.println("rest of code");
}

}
