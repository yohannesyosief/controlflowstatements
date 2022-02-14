package DataTypesInJava;

public class DataTypes {
	public static void main(String[] args) {
		byte myNewByte=10;
		short myNewShort=20;
		int myNewInt=50;
		//Has 32(4 byte) space,has 7 precision numbers after the decimal point
		float myFloatValue=5f/2f;
		//Double is more precise,with 64 bits,used mostly in math like,sin cos,algorithm,has 16 numbers of precision after the 
		//the decimal point,so is more precise,and is faster in many functions
		double myDoubleValue=5l/2l;
		//int myTotal=myNewByte+myNewShort+myNewInt;
		//long myNewLong=(long)(50000+10*(myTotal));
		long myNewLong=50000l+10l*(myNewByte+myNewShort+myNewInt);
		short myTotal=(short)(1000+10*(myNewByte+myNewShort+myNewInt));
		System.out.println(myNewLong);
		System.out.println(myTotal);
		System.out.println(myFloatValue);
		System.out.println(myDoubleValue);
		
	
		double weightInPounds=100;
		double weightInKg=weightInPounds*0.45359237;
		System.out.println(weightInKg);
		
		
		float weightInPoundsF=100f;
		float weightInKgF=weightInPoundsF*0.45359237f;
		System.out.println(weightInKgF);
		
		//Char has a space of 16(2 bytes),used for one character only,but we can also put unicode character
		//we can get unicode for any character in the website unicodetables.com
		char myChar='\u00A9';
		char myRegisteredSymbol='\u00AE';
		System.out.println("Unicode output was"+myChar);
		System.out.println("Unicode output was"+myRegisteredSymbol);
		
		String myString="This is a string";
		System.out.println("my string equals to "+myString);
		myString=myString+" and this is more";
		System.out.println("my string equals to "+myString);
		myString=myString+"\u00A9 2015";
		System.out.println("my string equals to"+myString);
		String numString="250.55";
		numString=numString+"49.55";
		System.out.println("The result is"+numString);
		
		String lastString="10";
		int myInt=50;
		lastString=lastString+myInt;
		System.out.println("last string is equal to  "+lastString);
		double doubleNum=120.47;
		lastString=lastString+doubleNum;
		System.out.println("last string is equal to  "+lastString);
		
		
		int result=1+2;
		System.out.println("1+2="+result);
		//result=result-1;
		//System.out.println("previous result -1 is equal to "+result);
		int previousResult=result;
		result=result-1;
		System.out.println(previousResult+"-1 = "+result);
		 previousResult=result;
		result=result*10;
		System.out.println(previousResult+"*10 = "+result);
		
		previousResult=result;
		result=result/5;
		System.out.println(previousResult+"/5 = "+result);
		
		previousResult=result;
		result=result%3;
		System.out.println(previousResult+"%3 = "+result);
		
		previousResult=result;
		result=result+1;
		System.out.println("Now result is : "+result);
		result++;
		System.out.println("Now result is : "+result);
		result--;
		System.out.println("Now result is : "+result);
		result+=2;
		System.out.println("Now result is : "+result); 
		
		result*=10;
		System.out.println("Now result is : "+result);
		result-=10;
		System.out.println("Now result is : "+result);
		result/=10;
		System.out.println("Now result is : "+result);
		
boolean isAlien=false;
if(isAlien==false) //if(isAlien) .is the same as the previous expression
	System.out.println("It is not an alien");
int topScore=80;
if(topScore<=100)
	System.out.println("You got high score");
int secondTopScore=81;
if((topScore>secondTopScore)&&(topScore<100))
System.out.println("Greater than secondTopScore and less than 100");
if((topScore>90)||(topScore<90))
	System.out.println("One of this results is true");
int newValue=50;
if(newValue==50)
	System.out.println("this is true");
boolean isCar=true;
if(isCar==true)
	System.out.println("This is not supposed to happen");
isCar=true;
boolean wasCar=isCar?true:false;
if(wasCar)
	System.out.println("wasCar is true");

double num1=20;
double num2=80;
double result2=(num1+num2)*25;
System.out.println("Result is: "+result2);
double remainder=result2%40;
System.out.println("The remainder is:"+remainder);
//double previousResult2=result2;
//result2%=40;
//System.out.println("The remainder is: "+result2);
//if(result2<=20)
if(remainder<=20)
	System.out.println("Result was over the limit");
System.out.println("this is "+
	"another "+
		"still more");
boolean gameOver=true;
int score=10000;
int levelComplete=8;
int bonus=200;
if(gameOver)
{
	int finalScore=score+(levelComplete*bonus);
	System.out.println("the final score is "+finalScore);
}





		

		
		
		

		
		
		
		
				

		


		

		

		
		
	}

}
