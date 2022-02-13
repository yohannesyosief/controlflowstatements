package IfElseStatements;

import java.util.Scanner;

public class IfElseUsingScanner {

	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Plz enter the number");
		num=input.nextInt();
		if(num%2==0)
			System.out.println("The number is even number");
		else
			System.out.println("The number is odd number");


			
		
	
	}

}
