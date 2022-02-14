package Generics;
/*It would be nice if we could write a single sort method that could sort the elements in an Integer array,a String array,or an array of any
 * any type that supports ordering.
 * 
 * Java generic methods and generic classes enable programmers to specify,with a single method declaration,a set of related methods or with
 * a single class declaration,a set of related types respectively.
 * 
 * Generics also provide compile time type safety that allows programmers to catch invalid types at compile time
 * 
 * using java Generics concept,we might write a Generic method for sorting an array of objects,then invoke the generic method with Integer arrays
 * ,Double arrays,String arrays and so on,to sort the array elements
 * 
 * Generic Methods
 * You can write  a single generic method declaration that can be called with arguments of different types.based on the generic method,the compiler handles
 * each method call appropriately.Following are the rules to define Generic Methods-
 *     1..All Generic method declarations have a type parameter section delimited by angle brackets(<and>) that precedes the method's return type(<E> in the next example)
 *     2..Each type parameter section contains one or more type parameters separated by commas.A type parameter,also known as a type variable,is an identifier that
 *     ..specifies generic type name.
 *    3 ..The type parameter can be used to declare the return type and act as placeHolder for the types of the arguments passed to the generic method,which are known as actual
 *     ..type Argument
 *     4..A generic method's is declared like that of any other method.Note that type,Parameters can represent only reference types,not primitive types
 *     ..(like int,double and char)
 * 
 * 
 */
public class BasicConceptsGenericMethodTest {
	//generic method printArray
	public static <E> void printArray(E[] inputArray){
		//Display Array elements
		for(E element : inputArray) {
			System.out.println(element);
			
			
		}
System.out.println();
	}

	public static void main(String[] args) {
		//Create arrays of Integer,Double and  Character
		Integer[] intArray= {1,2,3,4,5};
		Double[]  doubleArray={1.1,2.2,3.3,4.4};
		Character[] charArray= {'H','E','L','L','O'};
		
		System.out.println("Array integerArray contains:");
		printArray(intArray); //pass an Integer Array
		
		System.out.println("Array doubleArray contains:");
		printArray(doubleArray); //pass a Double array
		

		System.out.println("Array characterArray contains:");
		printArray(charArray);   //pass Character array
		
	}

}


