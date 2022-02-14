package ArrayListJavaTPoint;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); //Creating arraylist
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		//printing the arraylist object
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		list.get(2);
		System.out.println(list.get(2));
		//traversing list through Iterator
		Iterator itr=list.iterator();//getting the iterator
		
		while(itr.hasNext()) {  //check iterator has the elements
			System.out.println("Using iterator Loop ");

			System.out.println(itr.next());}
			//Iterating using For-each loop
			for(String fruit:list) {
				//System.out.println("Using For each Loop ");
				System.out.println(fruit);}
		}
		}
