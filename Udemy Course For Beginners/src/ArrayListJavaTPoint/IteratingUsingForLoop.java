package ArrayListJavaTPoint;

import java.util.ArrayList;

public class IteratingUsingForLoop {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");//Adding object in arrayList
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		//traversing list through for-each loop
		for(String fruit:list)
			System.out.println(fruit);
		
	}

}
