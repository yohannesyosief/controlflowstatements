package DataTypesInJava;

public class InterestHighScore {

	public static void main(String[] args) {
		int var1=5,var2=5;
		
		System.out.println(var1++);
		
		int highScoreposition=CalculateHighScorePosition(1500);
		displayHighScorePosition("Samsom",highScoreposition);
		
		 highScoreposition=CalculateHighScorePosition(900);
		displayHighScorePosition("John",highScoreposition);
		
		 highScoreposition=CalculateHighScorePosition(400);
		displayHighScorePosition("Ahmed",highScoreposition);
		
		highScoreposition=CalculateHighScorePosition(1500);
		displayHighScorePosition("Jossy",highScoreposition);
		
		highScoreposition=CalculateHighScorePosition(1000);
		displayHighScorePosition("Natu",highScoreposition);
		
		highScoreposition=CalculateHighScorePosition(50);
		displayHighScorePosition("Alat",highScoreposition);
//		System.out.println("10000 at interest rate 2% = "+calculateInterest(10000,2));
//
//		System.out.println("10000 at interest rate 3% = "+calculateInterest(10000,3));
//
//		System.out.println("10000 at interest rate 4% = "+calculateInterest(10000,4));
//
//		System.out.println("10000 at interest rate 5% = "+calculateInterest(10000,5));
		for (int i=2;i<=8;i+=2)
		{
			
			System.out.println("10000 at interest rate" +i+ "=" +String.format("%.2f",+calculateInterest(10000,i)));
			}
		for (int i=8;i>=2;i--)
		{
			
			System.out.println("10000 at interest rate" +i+ "=" +String.format("%.2f",+calculateInterest(10000,i)));
			}
		}

	
		public static void displayHighScorePosition( String name,int highScoreposition)
	{
		System.out.println(name+" managed to get in to position "+ highScoreposition+" in the high score table");
}
	public static int CalculateHighScorePosition(int score)
	{
//		if(score>=1000) {
//			return 1;}
//		else if(score>=500&&score<1000) {
//			return 2;}
//		else if(score>=100&&score<500) {
//			return 3;}
//		else {
//			return 4;}
		int position=4;//assuming position 4 will be returned
		if(score>=1000) {
			position=1;}
	else if(score>=500) {
			position=2;}
	else if(score>=100) {
		position= 3;}
		
		return position;
				
	}
	public static double calculateInterest(double amount, double interestRate)
	{
		return(amount*(interestRate/100));
	}
}
