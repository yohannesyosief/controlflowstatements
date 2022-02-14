package JavaRegex;

import java.util.regex.Pattern;

//Regex Quantifiers
//The quantity specify the number of occurrences of a character.
//1.X?-->X occurs once or not at all
//2.X+-->X occurs once or more times
//3.X*--> X occurs zero or more times
//4.X{n}-->X occurs n times only
//5.X{y,z}--> X occurs at least y times but less than z times
public class RegexQuantifiersEx4 {
	public static void main(String[]args)
	{
		System.out.println("?quantifier...");
		System.out.println(Pattern.matches("[amn]?", "a"));//true(a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));//False (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//False(a or m or n come more than one time)
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//False(a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "am"));//False(a or m or n must come more than time)
		
		System.out.println("+ quantifiers");
		System.out.println(Pattern.matches("[amn]+", "a"));//true(a or m or n comes once or more times)
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true(a comes more than one time)
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true(a or m or n comes more than once)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//False(z and t are not matching pattern))
		System.out.println(Pattern.matches("[amn]+", "am"));//False(a or m or n must come more than time)
		
		
		System.out.println("*quantifier...");
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true(a or m or n may come zero or more times)
			}

}
