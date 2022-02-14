package AccessModifiers;
//The protected access modifier is accessible with in the package and outside the package but 
//through inheritance only
//The protected access modifier can be aplied on the data memeber,method and constructor.It can't be 
//applied on the class
//It provides more accessibility than default modifier
import pack.*;

public class ProtectedEx1 extends A{

	public static void main(String[] args) {
		ProtectedEx1 obj=new ProtectedEx1();
		obj.msg();
		
	}

}
