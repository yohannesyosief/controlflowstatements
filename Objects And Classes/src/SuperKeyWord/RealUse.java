package SuperKeyWord;
class Person{
	int id;
	String name;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Emp extends Person{
	float salary;
	Emp(int id,String name,float salary){
		super(id,name);//reusing parent constructor
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

public class RealUse {

	public static void main(String[] args) {
		Emp e1=new Emp(120,"Saleh",4500f);
		e1.display();
		
			}

}
