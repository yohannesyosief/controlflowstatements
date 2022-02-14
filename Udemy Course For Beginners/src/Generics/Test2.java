package Generics;

public class Test2<T,U> {
	T obj1;
	U obj2;
	
	
	

	public Test2(T obj1, U obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);

		
	}




	public static void main(String[] args) {
		Test2<String,Integer> obj=new Test2<String,Integer>("Geeks",40);
		obj.print();
	}

}
