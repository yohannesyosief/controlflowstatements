package ArrayListJavaTPoint;
//The get() method returns the element at the specified index,whereas the set() method changes the element

import java.util.ArrayList;

public class GetAndSet {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mangus");
		al.add("Aranshi");
		al.add("Zetibun");
		al.add("Weini");
		
		//AccesingThe element
		System.out.println("Returning element :"+al.get(1));
		//changing the element 
		al.set(1, "Zebib");
		for(String fruit:al)
			System.out.println(fruit);
		
		
	}

}
