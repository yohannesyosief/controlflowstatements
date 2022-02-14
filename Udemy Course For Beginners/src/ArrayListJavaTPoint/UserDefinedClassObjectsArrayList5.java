package ArrayListJavaTPoint;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
import java.util.*;

//let us see an example where we are storing Student class object in any array list.
class Student{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
}

public class UserDefinedClassObjectsArrayList5 {

	public static void main(String[] args) {
		//Creating user-defined class objects
		
		Student s1=new Student(54,"John",34);
		Student s2=new Student(60,"Samsom",36);
		Student s3=new Student(45,"Habtom",35);
		
		//creating arraylist
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		//Getting Iterator
		Iterator itr=al.iterator();
		
		//traversing elements of ArrayList object
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println("Student with Roll no "+st.rollno+" and Name is "+st.name+"  and he is "+st.age+" years old");
		}
		}}
