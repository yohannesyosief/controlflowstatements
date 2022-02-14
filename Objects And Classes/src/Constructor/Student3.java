package Constructor;
//Example of default constructor that displays the default values

public class Student3 {
	int id;
	String name;
	//method to display the value of id and names
	void display() {
		System.out.println(id+" "+name);
	}
	

	public static void main(String[] args) {
		//Creating objects
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		//displaying values of the object
		s1.display();
		s2.display();
		
		
	}

}
