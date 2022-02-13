package IfElseStatements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		
		int age,weight;
		Scanner input=new Scanner(System.in);
		System.out.println("Plz enter age:");
		age=input.nextInt();
		System.out.println("Plz enter weight");
		weight=input.nextInt();
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("Can donate blood");
			}
			
		}
		
	}

}
