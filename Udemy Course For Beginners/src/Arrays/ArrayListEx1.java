package Arrays;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> shapes=new ArrayList<String>(); //Creating an arrayList with String data  type
		shapes.add(" square"); //add square  at index
		shapes.add(" triangle");//add triangle  at index
		shapes.add(" hexagon");//add hexagon at index
		shapes.add("rhombus ");//add rhombus at index
		shapes.add(" octagon");//add octagon  at index
		shapes.add("rectangle ");//add rectangle  at index
		shapes.add(" pentagon");//add pentagon  at index
		
		 System.out.println(shapes); //prints all elements of array list shapes
		
		System.out.println(shapes.get(4)); //print element at index 4
		shapes.remove(2);//remove element at index 2
		shapes.remove(5);//remove element at index 5
		
		System.out.println(shapes); //prints all elements of array list shapes
		shapes.set(4, "circle"); //replace elements index 4 with circle
		System.out.println(shapes);//prints all elements of array list shapes
		System.out.println(shapes.size());//prints the number of elements in the array
		shapes.clear(); //remove all the elements in the array list
		System.out.println(shapes);
	}

}
