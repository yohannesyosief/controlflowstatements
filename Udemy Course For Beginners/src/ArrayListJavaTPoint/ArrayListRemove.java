package ArrayListJavaTPoint;
//Here ,we see different ways to remove an element

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<Integer> num=new ArrayList<Integer>();
		al.add("Sam");
		al.add("Yon");
		al.add("Habtish");
		al.add("Nebi");
		al.add("Senay");
		al.add("Esrom");
		num.add(89);
		 num.add(60);
		System.out.println("An initial list of elements:"+al);
		System.out.println("An initial list of elements:"+num);
		//num.remove(60);
		 //System.out.println("After removing method:"+num);
		

		
		//Removing specific elements from arraylist
		//al.remove("Habtish");
		al.remove("Habtish");
		System.out.println("After invoking remove(object)method:"+al);
		
		//removing specific element on the basis of specific position
		al.remove(2);
		System.out.println("After invoking remove(index)method:"+al);
		
		//Creating another arraylist
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("Abigail");
		al2.add("Eden");
		//Adding new elements to arraylist
		al.addAll(al2);
		System.out.println("updated list "+al);
		
		//removing all new elements from arraylist
		
		al.removeAll(al2);
		
		System.out.println("After invoking removeAll() method:"+al);
		//removing all elements on the basis specified condition
		al.removeIf(str->str.contains("Sam"));//Here we are using lambda expression
		System.out.println("After invoking removeif() method: "+al);
		//removing all the elements available in the list
		al.clear();
		System.out.println("After invoking clear() method: "+al);
//
		
		
			}

}
