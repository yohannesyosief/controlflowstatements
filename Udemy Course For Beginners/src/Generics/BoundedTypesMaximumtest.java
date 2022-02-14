package Generics;
/* Bounded Type Parameters
 * There may be times when you'll want to restrict the kinds that are allowed to be passed to a type parameter.for example.a method that operates on numbers might
 * only want to accept instance of Number or its subclasses.this is what bounded type parameters are for.
 * 
 * To declare a bounded type parameter,list the type parameter's name,followed by the extends keyword,followed by its upper bound.
 * 
 * Example
 * following example illustrates how extends is used in a general sense to mean either "extends" (as in  classes) or "implements"(as in interface).This example is Generic
 * method to return the largest of three Comparable objects-

*/
public class BoundedTypesMaximumtest {
	//determine the largest of three Comparable objects
	
	public static<T extends Comparable<T>> T maximum(T x,T y,T z) {
		T max=x; //assume x is initially the largest
		if(y.compareTo(max) > 0) {
			max=y;  //y is the largest
		}
		if(z.compareTo(max) > 0) {
			max=z;  //z is the largest now
		}
		
		return max;  //returns the largest object
	}

	public static void main(String[] args) {
		
		System.out.println("Max of  ,3, 4 , 5 ,  is ,"  +maximum(3,4,5));
		
		System.out.println("Max of  ,6.6, 8.8, 7.7,  is ,"  +maximum(6.6,8.8,7.7));
		
		System.out.println("Max of  ,pear, apple, orange,  is ,"  +maximum("pear","apple","orange"));
		
	}

}
