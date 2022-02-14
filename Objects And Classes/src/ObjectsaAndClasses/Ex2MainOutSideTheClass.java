package ObjectsaAndClasses;
//In real time development,we create classes and use it from another class.It is a better approach than previous one.
//Let's see a simple example,where we are having main() method in another class.
//We can have multiple classes in different java files or single Java file.If you define multiple classes in a
//single java sources file,it is a good ides to save the file name with the class name which has main() method
//Creating Student1 Class
class Student1{
	int id=10;
	String name="Nasser";
	
}

public class Ex2MainOutSideTheClass {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		System.out.println(s1.id);
		System.out.println(s1.name);
		
	}

}
