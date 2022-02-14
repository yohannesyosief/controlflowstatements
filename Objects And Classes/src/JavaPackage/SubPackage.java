package JavaPackage;
////If you import a package,sub package will not be imported
//If you import a package ,all the classes and interface of that package will be imported excluding the 
//classes and interface of the subpackages.Hence,you need to import the sub package as well
//Note Sequence of the program must be package then import then class
//package->import->class
//...Subpackage in java
//package inside the package is called the subpackage.it should be created to categorize the package further
//Let's take an example,Sun Microsystem has definded a package named java that contains many classes like,
//System,String,Reader,Writer,Socket,etc.These classes represents a particular group e.g.Reader and Writer classes
//are for Input/Output operation,Socket and ServerSocket classes are for networking etc and so on.So,Sun has
//subcategorized the java package into subpackages such as lang,net,io etc.and put the Input/Output related 
//classes in Io package,Server and ServerSocket classes in net packages and so on.
//The standard of defining packages is>domain.company.package 
//E.g>com.javatpoint.bean or org.sssit.dao

//package com.Javatpoint.core;

public class SubPackage {

	public static void main(String[] args) {
		System.out.println("hello Subpackage");
		
}}
//To compile:javac-d.Subpackage.java
//To Run:java com.javatpoint.core.simple
//How to send the class file to another directory or drive?
//There is a scenario,I want to put the class file of A.java source file in classes folder of c:drive.For e.g
//c:\->classes->E:\->source->a.java
//package mypack;
//public class Simple{
//public sttic void main(String[]args){
//System.out.println("welcome to package");
//}}
//To Compile
//e:\sources>javac-d c:\classes Simple.java
//To Run:
//To run this program frome:\source directory,we need to set classpath of the directory where
//the classes file resides
//e:\sources>set classpath=c:\classes;.;
//e:\sources>java mypack.Simple
//Another way to to run this package by classpath switch of java
//The -classpath switch can be used with javac and java tool.
//to run this program from e:\source directory,you can use-classpath switch of java that tells where to look
//for class file.For example
//e:\sources>java  -classpath c:classes mypack.Simple
//Ways to load the class files or jar files


//ther are two ways to load the class files temporarly and permament
//   ..temporary 
//......1.By setting the classpath in the command prompt
// .....2.By-classpath switch
//....Permament 
//....1.By setting the classpath in the enviroment variables
//....2.By creating the jar file,that contains all the class,and copying the jar file in the jre/;ib/ext folder
//Note:There can be only one public class in a java sources file and it must be saved by the public class name


//How to put two public classes in a package
//..if you want to put two public classes in a package,have two java sources containing one public class,
//bu keep the package name same.For example;

//save as A.java
//package javatpoint;
//public class B{}

//save as B.java
//package javatpoint;
//public class b{}

