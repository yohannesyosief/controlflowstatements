package SuperKeyWord;
//The super keyword is also used to invoke parent class constructo
class Animal4{
	Animal4(){
		System.out.println("Animal is created");
	}
}
	class Dog4 extends Animal4{
		Dog4(){
			super();
			System.out.println("Dog is created");
		}
	}



public class TestConstructor {

	public static void main(String[] args) {
		Dog4 d=new Dog4();
		}	}
//super() is added in each class constructor automatically by compiler if there is no super() or this()


