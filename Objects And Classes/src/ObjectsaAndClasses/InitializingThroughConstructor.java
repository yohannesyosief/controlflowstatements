package ObjectsaAndClasses;
//3 ways to initialize object
//1.By reference variable
//2.By method
//3.By constructor
class Employee{
	int id;
	String name;
	float salary;
	//void insert(int i,String n,float s) 
	Employee(int i,String n,float s) 
	{
		id=i;
		name=n;
		salary=s;
	}
	void displayInformation()
	{System.out.println(id+"  "+name+"  "+salary);}
}


public class InitializingThroughConstructor {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Hassen  ", 45000);
		Employee e2=new Employee(102,"Samrawit",25000);
		Employee e3=new Employee(103,"John    ",60000);
		
		
		//Employee e1=new Employee();
		//Employee e2=new Employee();
		//Employee e3=new Employee();
		
		//e1.insert(101, "Hassen  ", 45000);
		//e2.insert(102, "Samrawit", 25000);
		//e3.insert(103,"John    ",60000);
		e1.displayInformation();
		e2.displayInformation();
		e3.displayInformation();
			}

}
