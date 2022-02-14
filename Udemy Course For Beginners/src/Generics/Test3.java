package Generics;
/*Generics work only with Reference types:
 * When we declare an instance of a generic type,the type argument passed to the type parameter must be a reference type.We cannot
 * re use primitive data type like int,char
 * Test<int> obj=new test<int>(20);..this will result in compile time error,that can be resolved by using type wrappers to encapsulate
 * a primitive type
 * 
 * but primitive array can be passed to the type parameter because arrays reference type
 * ArrayList<int[]> a=new ArrayList<>
 * 
 * 
 * A simple java program to show  working of user-defined Generic Classes
 * We use < > to specify parameter type
 */

public class Test3<T> {
	//An object of type t is declared
	T obj;
	

	public Test3(T obj) {
		super();
		this.obj = obj;
	}
	
	


	public T getObject() {
		return this.obj;
	}


//Driver class to test above

	public static void main(String[] args) {
		
		//Instance of Integer type
		Test3<Integer> iObj=new Test3<Integer>(15);
		//System.out.println(iObj.getObj());
		System.out.println(iObj.getObject());
		
		//Instance of String type
		Test3<String> sObj=new Test3<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		
		//iObj=sObj;
		
		//Even though iObj and sObj are of type test,they are the reference to different types because their type parameters differ.
	//	generics add type safety through this and prevent errors.
		
//Advantages of generics:
// Programs that use	Generics has got many benefits over non-generic code

//code reuse:
//We can write a method/class/interface once and use it for any type we want
		
//type Safety:
//Generics make  errors to appear at compile time than at run time(It's always better to know problems in your code at compile time rather
//than making your code fail at run time).Suppose you want to create an ArrayList that store name of students and if by mistake programmer adds
//an integer object instead of a string,the compiler allows it.but,when we retrieve this data from ArrayList,it causes problems at runtime.		
//		
		
	}

}
