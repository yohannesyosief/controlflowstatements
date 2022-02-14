package ArrayListJavaTPoint;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;
//1.By Iterator interface
//2.By for-each loop
//3.By Listeiterator interface
//4.By for loop
//5.By foeEach() method
//By forEachremaning() method.

public class IteratingCollection {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Yohannes");
		list.add("Ali");
		list.add("Thomas");
		list.add("Yemane");
		
		System.out.println("traversing list through List Iterator: ");
		//here elements iterates in reverse order

		
		ListIterator<String> list1=list.listIterator(list.size());
		
		while(list1.hasPrevious()) {
			String str=list1.previous();
			System.out.println(str);
		}
			
			
			
			System.out.println("Travesing list through for loop: ");
			
			for(int i=0;i<list.size();i++) 
			{
				System.out.println(list.get(i));
			}
			
			
			System.out.println("Traversing list through forEach() method: ");
			//The forEach() method is a new feature,introduced in Java 8
			list.forEach(a->{ //here we are using lambda expression
				System.out.println(a);});
			
		System.out.println("Travesing list through forEachRemaning() method:");
		Iterator<String> itr=list.iterator();
		itr.forEachRemaining(a-> //here,we are using lambda expression
		{
			System.out.println(a);
			
		});
		}
	}


