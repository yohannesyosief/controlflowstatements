package SuperKeyWord;
//As we know well that default constructor is provided by compiler automatically if there is no constructor.
//But,it also adds super() as the first statement
//Another example of super keyword where super() is provided by the compiler implicitly
class Animal5{
	Animal5(){System.out.println("animal is created");
}
}
	class Dog5 extends Animal5{
		Dog5(){System.out.println("dog is created");
	}
	}

public class TestCOnstructorWithOutSuper {

	public static void main(String[] args) {
		Dog5 d=new Dog5();
	}
		
}
			


