package Interface;
interface printable{
	void print();
}

public class Test1 implements printable{
	
	public void  print(){System.out.println("Hello");}

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.print();
	}
		
	}


