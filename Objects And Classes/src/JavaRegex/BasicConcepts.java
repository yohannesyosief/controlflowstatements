package JavaRegex;
//The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.

//It is widely used to define the constraint on string such as password and email validation.After learning Java
//regex tutorial,you will be able to test your regular expressions by the java Regex tester Tool.

//java Regex API provides 1 interface and 3 classes in java.util.regex package

//java.util.regex package

//The Matcher and Pattern classes provide the facility of java regular expression.The java.util.regex package provides
//following classes and interfaces for regular expressions.

//1.MatchResult interface
//2.Matcher class
//3.Pattern class
//4.PatternSyntaxException class

//Matcher class
//It implements the MatchResult interface.it is a regex which is used to perform match operation on a
//character sequence
//1.boolean matches():-test whether the regular expression matches the pattern
//2.boolean find():-find the next expression that matches the pattern.
//3.boolean find(int start):-finds the next expression that matches the pattern from the given start number
//4.String group():-returns the matched subsequence.
//5. int start():-returns the starting index of the matched subsequence.
//6. int end() :-returns the ending index of the matched subsequence.
//7.int groupCount():-returns the total number of the matched subsequence.

//Pattern class
//It is the compiled version of a regular expression.It is used to define a pattern for the regex engine.

//1.static pattern compile(String regex):-compile the given regex and returns the instance of the pattern
//2.Matcher matcher(CharSequence input):-Creates a matcher that matches the given input with the pattern.
//3.static boolean matches(String regex,CharSequence input):-It works as the combination of compile and matcher methods.
//It compiles the regular expression and matches the given input with the pattern
//4.String[] split(CharSequence input):-splits the given input string around matches of a given patterns
//5.String pattern():-returns the regex pattern


//Regex character classes
//N0.1:-[abc]-->a,b,c(simple class)
//2. [^abc]--> Any character except a,b,or c(negation)
//3.[a-zA-Z]--> a through z or A through Z,inclusive (range)
//4.[a-d[m-p]]-->a through d,or m through p:[a-dm-p](union)
//5.[a-z&&[def]]-->d,e,f(intersection)
//6.[a-z&&[^bc]]-->a through z,except for b and c:[ad-z](subtraction)
//7.[a-z&&[^m-p]]-->a through z,and not m through p:[a-lq-z](subtraction)


//Regex Quantifiers
//The quantity specify the number of occurrences of a character.
//1.X?-->X occurs once or not at all
//2.X+-->X occurs once or more times
//3.X*--> X occurs zero or more times
//4.X{n}-->X occurs n times only
//5.X{y,z}--> X occurs at least y times but less than z times

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


public class BasicConcepts {

}
