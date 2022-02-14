package Arrays;

import java.util.ArrayList;

public class GrocerryList {
	private int[] myNumber=new int[50];
	private  ArrayList<String> groceryList=new ArrayList<String>();
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	public void printGroceryList() {
		System.out.println("You have "+groceryList.size()+ "items in your grocerry lis");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+ ". "+groceryList.get(i));
		}
	}
	public void modifyGroceryItem(int position, String newitem) {
		groceryList.set(position, newitem);
		System.out.println("Grocery item "+(position+1)+ "has been modified. ");
	}
public void removeGroceryItem(int position) {
	String theItem=groceryList.get(position);
	groceryList.remove(position);
	//Milk
	//Cheese
	//Bread
}
public String findItem(String searchItem) {
	//boolean exists=groceryList.contains(searchItem);
	int position=groceryList.indexOf(searchItem);
	if(position>=0) {
		return groceryList.get(position);
	}
	return null;
	
}
}
