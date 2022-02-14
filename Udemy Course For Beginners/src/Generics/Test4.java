package Generics;
//A simple java program to demonstrate that NOT using generics can cause run time exception

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		//Creating an ArrayListwithout type specified
		
		ArrayList al=new ArrayList();
		
		al.add("Sachin");
		al.add("Rahul");
		al.add(10); //compiler allows this
		
		String s1=(String)al.get(0);
		String s2=(String)al.get(1);
		
		System.out.println(s1);
		System.out.println(s2);
		//String s4=al.get(0) unless we add a casted  String
		Object s3=al.get(0);
		System.out.println(s3);
		
		String s5=(String)al.get(2);


		
	}

}
