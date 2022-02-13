package SwitchStatement;

import java.util.Scanner;

public class UsingStringCase {

	public static void main(String[] args) {
		
		String levelString;
		int level=0;
		Scanner input=new Scanner(System.in);
		System.out.println(" please enter the level");
		levelString=input.nextLine();
		
		
		switch(levelString) {
		case "Beginner": level =1;
		break;
		case "Intermediate": level=2;
		break;
		case "Expert": level=3;
		break;
		default: level=0;
		break;
		
	}
		System.out.println("Your Level is:"+level);

}
}
