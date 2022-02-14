package AutoboxingAndunboxingJavaTpoiny;
//The automatic conversion of primitive data types into its equivalent Wrapper type,is known as autoboxing e.g byte to Byte,char toCharacter
//int to Integer,long to Long,float to Float,boolean to Boolean,double to Double,short to Short
//and opposite operation is known as unboxing.this is the new feature of Java.so java programmer doesn't need to write the conversion code.
//we don't need to use the intValue() method of wrapper classes to convert the wrapper type into primitive.


//Advantage..
//no need of conversion between primitives and Wrapper manually so less coding is required


//Wrapper classes
//Wrapper class provides the mechanism to convert primitive in to object and object in to primitive
//use of Wrapper classes in java
//Java is an object-oriented programming language so we need to deal with objects many times like in Collections,Serialization,
//Synchronization,etc.Let us see the different scenarios,where we need to use the wrapper classes.
//1.Change the value in method,2.Serialization,3.Synchronization,4.java.util package,5.Collection Framework
//The eight classes of the java.lang package are known as wrapper classes in Java.The list of eight wrapper classes are given below.
//primitive type and Wrapper class,
//boolean->Boolean,char->Character,byte->Byte,short->Short,int->Integer,long->Long,float->Float,double->Double
public class basicConcepts {
	public static void main(String []args) {
		int a=50;
		Integer a2=new Integer(a);//boxing
		//Integer a3=5;//boxing
		Integer a3=5;//boxing
		System.out.println(a2+" "+a3);
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		//Autoboxing :Converting primitive into objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		//Printing objects
		System.out.println("..Printitng objects values....");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Integer object"+intobj);
		System.out.println("Long object"+longobj);
		System.out.println("Float object"+floatobj);
		System.out.println("Double object"+doubleobj);
		System.out.println("Character object"+charobj);
		System.out.println("Boolean object"+boolobj);
		
		
		//Unboxing:Converting Objects to Primitive
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		Integer intvalue=intobj;
		long longvalue=longobj;
		Float floatvalue=floatobj;
		Double doublevalue=doubleobj;
		Character charvalue= charobj;
		Boolean boolvalue= boolobj;
		
		//Printing primitives
		
System.out.println("...Printing primitive values...");
System.out.println("Byte value:"+bytevalue);
System.out.println("Short value:"+shortvalue);
System.out.println("Integer value"+intvalue);
System.out.println("Long value"+longvalue);
System.out.println("Float value"+floatvalue);
System.out.println("Double value"+doublevalue);
System.out.println("Character value"+charvalue);
System.out.println("Boolean value"+boolvalue);

		
	}

}
