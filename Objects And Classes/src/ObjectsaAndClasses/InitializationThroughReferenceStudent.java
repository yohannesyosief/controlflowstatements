package ObjectsaAndClasses;

//3 ways to initialize object
//1.By reference variable
//2.By method
//3.By constructor
//Initializing an object means storing data into the object.Let's see a simple example,
//where we are going to initialize the object through a reference variable

class Student{
	int id;
	String name;
}


public class InitializationThroughReferenceStudent {

	public static void main(String[] args) {
		//we can also create multiple objects and store info in it
		Student s1=new Student();
		Student s2=new Student();
		s1.id=101;
		s1.name="Sonoo";
		s2.id=102;
		s2.name="Amit";
		
		System.out.println(s1.id+ "  "+s1.name);
		System.out.println(s2.id+"  "+s2.name);
		
		
			}

}
