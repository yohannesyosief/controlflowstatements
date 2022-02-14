package JavaRegex;

import java.util.regex.Pattern;

//The regular expression metacharacters work as shortcodes


//1  .-->any character(may or may not match terminator)
//\d-->Any digit,short of[0-9]
//\D-->Any non-digit,short for[^0-9]
//\s -->Any whitespace character ,short for[\t\n\xoB\f\r]
//\S-->Any non-whitespace character,short for[^\s]
//\w-->Any word character,short for[a-zA-Z_0-9]
//\W-->Any word character,short for[^\w]
//\b--> A word boundary
//\B-->A non boundary

public class MetaCharactersExample5 {

	public static void main(String[] args) {
		System.out.println("metacharacters d...");// \\d means digit
		
		
System.out.println(Pattern.matches("\\d, ","abc")); //false(non-digit)
System.out.println(Pattern.matches("\\d, ","1")); //true
System.out.println(Pattern.matches("\\d, ","4443")); //false(digit,but comes more than once)
System.out.println(Pattern.matches("\\d, ","323abc")); //false(digit and  char)

System.out.println("metacharacters D...");// \\D means non-digit


System.out.println(Pattern.matches("\\D, ","abc")); //false(non-digit,but comes more than once)
System.out.println(Pattern.matches("\\D, ","1")); //false(digit)
System.out.println(Pattern.matches("\\D, ","4443")); //false(digit)
System.out.println(Pattern.matches("\\D, ","323abc")); //false(digit and  char)
System.out.println("metacharacters D with quantifier...");// \\D means non-digit
System.out.println(Pattern.matches("\\D*," , "mak"));// true (non-digit and may come 0 or more times)








			}

}
