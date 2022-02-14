package Generics;
/* A generic  class declaration looks like a non-generic class declaration,except that the class name is followed by a type parameter
 * section.
 * 
 * As with generic methods,the type parameters section of a generic class can have one or more type parameters separated by commas.these
 * classes are known as parameterized classes or parameterized types because they accept one or more parameters
 * 
 * 
 * Example
 * Following ,example illustrates how we can define a generic class-

*/

public class GenericClassesBox<T> {
	private T t;
	 
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}

	public static void main(String[] args) {
		
		GenericClassesBox<Integer>  integerBox=new  GenericClassesBox<Integer>();
		GenericClassesBox<String>   stringBox=new GenericClassesBox<String>();
		
		integerBox.add(new Integer(10));
		integerBox.add(new Integer(15));
		stringBox.add(new String("Hello world"));
		
		System.out.println("Integer value:"+integerBox.get());
		System.out.println("String value:"+stringBox.get());
		

		
	}

}
