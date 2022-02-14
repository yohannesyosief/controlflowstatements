package StaticKeyWord;
//1.The static method can not use non static data member or call non-static method directly
//2.this and super cannot be used in static context
public class RestrictionForStatic {
	//
		 
			  int a=40;//non static//but if declared as non static it can workout
		 
	

	public static void main(String[] args) {
		System.out.println(a);
			}
}
//output:compile time error

