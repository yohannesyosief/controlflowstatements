package Polymorohism;
//Polymorphism in java is a concept by which we can perform a single action in defferent ways.
//Polymrphism is derived from two Greek words;poly and morphs.The word "poly" means many and 
//"morphs" means forms.So polymorphism means many forms
//There are two types of polymorphism in java;compile time polymorphism an run time polymorhism
//We can perform polymorphism in java by method overloading and method overriding


//if we overload static method in java ,it is compile time polymorphism.Here,we will focus on runtime
//polymorphism in java.


//Runtime Polymorphism in java
//Runtime polymorphism or Dynamic Method dispatch is a process in which a call to an overridden 
//method is resolved at runtime rather than compile-time.
//in this process,an overriden method is called through the reference variable of a superclass.
//The determination of the method to be called is based on the object being reffered to by the reference variable.
//let's first understand the upcasting before Runtime Polymorphism

//Upcasting
//if the reference variable of parent class refers to the object of Child class,it is known as upcasting.For example:
//Reference variable of parent class-->object of Child class
class A{}
class B extends A{}
A a=new B();//upcasting
//for upcasting, we can use the reference variable of class type or an interface type.For Example:
interface I{}
class A{}
class B extends A implements I{}//Here,he relationship of B class would be;
//B IS-A A
//B IS-A I
//B IS-A object
//Since Object is the root class of all classes in java,so we can write B IS-A Object
public class BasicConcepts {

}
