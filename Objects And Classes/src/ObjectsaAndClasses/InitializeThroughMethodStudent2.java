package ObjectsaAndClasses;
//3 ways to initialize object
//1.By reference variable
//2.By method
//3.By constructor
//In this example,we are creating the two objects of Student class and,
//initializing the value to these objects by invoking the insertRecord method.Here,
//we are displaying the state(data) of the objects by invoking the displayInformation() method
//object gets memory in heap memory area.The reference variable refers to the object allocated in the heap
//memory area
class Student4{
	int rollno;
	String name;
	void insertRecord(int r,String n) {
		rollno=r;
		name=n;
	}
	void displayInformation() {
		System.out.println(rollno+"  "+name);}
	}

public class InitializeThroughMethodStudent2 {

	public static void main(String []args ) {
		
		Student4 s1=new Student4 ();
		Student4 s2=new  Student4();
		s1.insertRecord(111,"Samu");
		s2.insertRecord(222,"Ahmed");
		s1.displayInformation();
		s2.displayInformation();
		
	}

}

