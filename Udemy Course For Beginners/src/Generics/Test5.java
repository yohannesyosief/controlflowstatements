package Generics;
//How generics solve his problem in test 4
//At the time of defining ArrayList ,we can specify that list can take only String objects
//using generics converts run time exceptions into compile time exception.

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
	//creating an ArrayList with String specified
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Samsom");
		al.add("Awet");
		//Now compiler doesn't allow  this
		//al.add(10);
//If we don't use generics,then in the above example every time we retrieve data from ArrayList,we have to typecast it.
//Typecasting at every retrieval operations is a big headache.if we already know that our list only holds string then we need not typecast 
//it every time.
//		String s1=(String)al.get(0);
//		String s2=(String)al.get(1);
//		//String s3=(String)al.get(2);
//		System.out.println(s1);
//		System.out.println(s2);
//		
		//we don't need to type cast individual members of ArrayList
		
		String s4=al.get(0);
		String s5=al.get(1);
		
		System.out.println(s4);
		System.out.println(s5);

		



		
		
			}

}
