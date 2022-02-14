package MethodOverRidding;
//Consider a scenario where bank is a class that provides functionality to get the rate of interest
//However the rate of interest varies according to banks,for example,SBI,ICICI and AXIS banks could
//provide 8% and 9% rate of interest
//Java Method Overriding is mostly used in Runtime Polymorphism which we will learn in next pages
//Java Program to demonstrate the real scenario of  java Method Overriding
//Where the classes are overriding the  method of parent class
    

     //Creating a parent class
class Bank{
	int getRateOfInterest() {return 0;}
}
//Creating child class
class SBI extends Bank{
	int getRateOfInterset() {return 8;}
}
class ICICI extends Bank{
	int getRateOfInterest() {return 7;}
}
class AXIS extends Bank{
	int getRateOfInterest() {return 9;}
	
}

public class BanksInterest {

	public static void main(String[] args) {
		//Bank b;
		//b=new SBI();
		SBI s=new SBI();
	ICICI   c=new ICICI();
	AXIS a=new AXIS();
	//s.getRateOfInterset();
	c.getRateOfInterest();
	a.getRateOfInterest();
	System.out.println("SBI   rate of interest: "+s.getRateOfInterset());
	System.out.println("ICICI rate of interest: "+c.getRateOfInterest());
	System.out.println("AXIS  rate of interes : "+a.getRateOfInterest());
	
			}

}
