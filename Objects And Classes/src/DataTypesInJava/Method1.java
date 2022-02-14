package DataTypesInJava;

public class Method1 {

	public static void main(String[] args) {
		boolean gameOver=true;
		int score=800;
		int levelComplete=5;
		int bonus=100;
		int highScore=scoreCalculator(gameOver,score,levelComplete,bonus);
		
		//int highScore=scoreCalculator(true,800,5,100);
		System.out.println("The high score is: "+highScore);
		highScore=scoreCalculator(true,10000,8,200);
		System.out.println("The high score is: "+highScore);
		int newScore=calculateScore("John",50);
		System.out.println("The new score is "+newScore);

		
			}
	
		public static int scoreCalculator(boolean gameOver,int score, int levelComplete,int bonus) {
	if(gameOver)
	{
		int finalScore=score+(levelComplete*bonus);
		finalScore+=2000;
		//System.out.println("the final score is "+finalScore);
		return finalScore;
	}
	return -1;
	
	
	
	}
		public static int calculateScore(String playerName,int score)
		{
			System.out.println("player "+playerName+ " had scored "+score );
			return score*1000;
		}
		}
