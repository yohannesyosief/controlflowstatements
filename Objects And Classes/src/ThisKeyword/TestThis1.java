package ThisKeyword;
//can be used to refer current class instance variable
//if there is ambiguity between the instance variable and parameters,this keyword resolves the problem of ambiguity
//if local variable and instance variable are the same name,we have to use this keyword
class Student{
	int rollno;
	String name;
	float fee;
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
	    this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class TestThis1 {

	public static void main(String[] args) {
		Student s1=new Student(111,"Sami",2500);
		Student s2=new Student(222,"Gebray",6000);
		s1.display();
		s2.display();
	}
			}
//if local variable and instance variable are different ,there is no need to use this keyword
//calss stident
//int rollno;
//String name;
//float fee;
//Student(int r,String n,float f)
//rollno=r;
//name=n;
//fee=f;


