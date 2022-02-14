package Aggregation;

public class Emp {
	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
		}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.country+" "+address.state);
	
	}

	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india");
		Address address2=new Address("ASMARA"," Eritrea"," Maekel");
		
		Emp e=new Emp(754,"John",address1);
		Emp e2=new Emp(1086,"Ahmed",address2);
	e.display();
	e2.display();
		
	}

}
