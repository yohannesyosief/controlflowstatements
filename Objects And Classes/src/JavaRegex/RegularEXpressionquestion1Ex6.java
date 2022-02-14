package JavaRegex;

import java.util.regex.Pattern;

//Create a regular expression that accepts alphanumeric characters only.It's length must be six characters long only

public class RegularEXpressionquestion1Ex6 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2UK2"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false($ is not matched)
		
		
			}

}
