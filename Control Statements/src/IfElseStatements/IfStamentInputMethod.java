package IfElseStatements;

import java.util.Scanner;

public class IfStamentInputMethod {

	public static void main(String[] args) {
		int age;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Age Of Student: ");
		age=input.nextInt();
		input.close();
		if(age>20)
		
			System.out.println("You can go to trip");
		
		else 
			System.out.println("Stay home: ");
		
			
			
		}
	
	}


