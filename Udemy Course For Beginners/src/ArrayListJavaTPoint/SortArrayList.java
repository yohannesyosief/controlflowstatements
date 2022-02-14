package ArrayListJavaTPoint;
//The java.util package provides a utility class Collections which has the method sort().using the Collections.sort() method,
//we can easily sort the ArrayList.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		//Creating a list of fruits
		List<String> list1=new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		 //Sorting the list
		Collections.sort(list1);
		//Traversing list through the for-each loop
		for(String fruit:list1)
			System.out.println(fruit);
		
		
		System.out.println("Sorting numbers....");

		//Creating a list of numbers
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(5);
		list2.add(7);
		
		//Sorting the list
		Collections.sort(list2);
		
		for(Integer number:list2)
			System.out.println(number);
		
		}}
