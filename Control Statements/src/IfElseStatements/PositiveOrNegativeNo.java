package IfElseStatements;

import java.util.Scanner;

public class PositiveOrNegativeNo {

	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=input.nextInt();
		input.close();
		if(num>0)
		{
			System.out.println("Number is positive");
			
		}
		else if(num<0)
		{
			System.out.println("Number is negative");
			
			
		}
		else
		{
			System.out.println("Number is zero");
		}

		}

}
