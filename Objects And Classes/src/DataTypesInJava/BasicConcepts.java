package DataTypesInJava;
//Data types specify the different sizes and values that can be stored in the variable.There are two types of
//data types in Java.
//1..primitive data types:The primitive data types include boolean,char,byte,short,int,long,float and double.
//2..Non-primitive data types:The non-primitive data types include Classes,Interface and Arrays.

//Java Primitive Data Types
//In java language primitive data types are the building blocks of data manipulation.these are the most basic data types 
//available in java language

//note..Java is a statically-typed programming language.It means,all variables must be declared before its use.
//That is why we need to declare variables type and name.
//There are 8 types primitive data types
//1.Boolean data type,2.byte data type,3.char data type,4.short data type,5.int data type,6.long data type,
//7.float data type,8.double data type
//Boolean-boolean
//Numeric-Character and Integer
//Integer-integer and Floating point
//integer-,byte,short,int,long
//Floating -point,float,double
//Non-primitive ,String,array,classes,interfaces


//Boolean Data Type
//The Boolean data type is used to store only two possible values:true and false.This data type is used for simple 
//flags that track true/false conditions.

// The Boolean data type specifies one bit of information,but its "size" can't be defined precisely
//Example:boolean one=false

//Byte Data Type

//the byte data type is an example of primitive data type.It is an 8-bit signed two's complement integer.
//its value-range lies between -128 to 127(inclusive).Its minimum value is -128 and maximum value is 127.
//Its default value is 0

//The byte data type is used to save memory in largw arrays where the memory savings is most required .
//It saves space because a byte is 4 times smaller than an integer.It can also be used in place of "int" data type
//Example: byte a=10,byte b=-20


//Short Data Type
//The short data type is a 16-bit signed two's comlement integer.its value-range lies between -32,768 to 32,767(inclusive.
//Its minimum value is -32,768 and maximum value is 32,767.Its default value is 0.

//the short data type can also be used to save memory just like byte data type.A short data type is 2 times 
//smaller than an integer
//Example:short s=10000,short r=-5000

//Int Data Type
//The int data type is a 32-bit signed two's complement integer.Its value-range lies between -2,147,483,648(-2^31)
//to 2,147,483,647(2^31-1)(inclusive).Its minimum values is 2,147,483,648 and maximum value is 2,147,483,647.
//Its default value is 0.
//The int data type is generally used as a default data type for integral values unless if there is no problem
//about memory
//Example:int a=100000,int b=200000

//Long Data Type
//The long data type is a 64-bit two's complement integer.Its value-range lies between -9,223,372,036,854,775,807(-2^63)
//to -9,223,372,036,854,775,807(2^63-1)(inclusive).its minimum value is  -9,223,372,036,854,775,808 and maximum value is 
//9,223,372,036,854,775,807.Its default value is 0.The long data type is used when you need a range of values more than 
//those provided by int
//Example long a=100000L,long b=-200000L

//Float Data Type
//The float data type is a single-precission 32-bit IEEE 754 floating point.Its value range is unlimite.It is 
//recommended to use a float(instead of double) if you need to save memory in large arrays of floating point numbers.
//The float data type should never be used for precise values,such as currency.Its default value is 0.0F.
//Example:float f1=234.5f

//DOuble Data Type
//The double data type is a double-precission 64-bit IEEE 754 floating point.Its value range is unlimited.
//The double data type is generally used for decimal values just like float.The double data type also should never be used for precise
//values,such as currency.Its default value is 0.0d.
//Example:double d1=12.3


//Char Data Type
//The char type is a single 16-bit nicode character.Its value-range lies between' \u0000' (or 0) to\'ufff'(or 65,535 inclusive).
//The char dtat type is used to store characters.
//Example:char letterA='A'


//Why char uses 2 byte in java and what is\u0000?
//It is because java uses Unicode system not ASCII code system.The \u0000 is the lowest range of Unicode system.To get detail 
//expalnation about Unicode visit next page.


public class BasicConcepts {

}
