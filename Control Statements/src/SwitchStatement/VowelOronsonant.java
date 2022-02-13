package SwitchStatement;

import java.util.Scanner;

public class VowelOronsonant {

	public static void main(String[] args) {
		
		char ch;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an alphabet");
		ch=input.next().charAt(0);
		switch(ch) {
		case 'a':System.out.println("Vowel");
		break;
		case 'e':System.out.println("Vowel");
		break;
		case 'i':System.out.println("Vowel");
		break;
		case 'o':System.out.println("Vowel");
		break;
		case 'u':System.out.println("Vowel");
		break;
		default:System.out.println("Consonant");
		
		
		}
		
	}

}
