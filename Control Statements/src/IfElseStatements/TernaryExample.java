package IfElseStatements;

import java.util.Scanner;

public class TernaryExample {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		number=input.nextInt();
		
		//using ternary operator
		String output=(number%2==0)?"even number":"odd number";
		System.out.println(output);
	
	
	}

}
