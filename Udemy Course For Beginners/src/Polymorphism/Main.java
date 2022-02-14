package Polymorphism;

class Movie{
	private String name;
	
	public Movie(String name) {
		this.name=name;
	}
	
	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
	
	}


class Jaws extends Movie{
	public Jaws() {
		super("Jaws");
	}
	
	public String plot() {
		return "A shark eats lots of people";
	}
}

class IndependenceDay extends Movie{
	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
				//return super.plot();
		return "Aliens attempt to take over planet earth";
	}
	
	}


class MazeRunner extends Movie{
	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
				//return super.plot();
		return "Kids try and escape a maze";
	}
	
	}

class StarWars extends Movie{

	public StarWars() {
		super("Star Wars");
		
	}

	@Override
	public String plot() {
		
		return "Imperial Forces try to take over the universe";
	}
	
}

class Forgetable extends Movie{

	public Forgetable( ) {
		super("Forgetable");
			}
	
	//since it is extending from movie class it will automatically override the method plot,that is main purpose of polymorphism
	//it will go back to movie class and find the method plot,and execute it
	//this is how polymorhism works,if we are inheriting from another class we got a method and override that method,that is what ploymorphism is
//	public String plot() {
//	return"No plot here";
//	}
}

public class Main {

	public static void main(String[] args) {
		
		//now let us look at the polymorphism method
		for(int i=1;i<11;i++) {
		Movie movie=randomMovie();
		System.out.println("Movie # "+i+ " : "+movie.getName()+ "\n"+
		"plot: "+movie.plot()+"\n");
		}
		
	}
//this method is going to be part of this main class,we r returning the super class Movie ,because all the other classes
	//inherit from the class Movie
	public static Movie randomMovie() {
	
	int randomNumber=(int)(Math.random() *5)+1;
	//int randomNumber=(int)(Math.random() *5);


System.out.println("Random number generated was" +randomNumber);

switch(randomNumber) {
     case 1:
	       return new Jaws();
case 2:
    	 return new IndependenceDay();
    	 
     case 3:
    	 return new MazeRunner();
    
     case 4:
    	 return new StarWars();
    	 
     case 5:
    	 return new Forgetable();
    	 
//    	 default:
//    		 return null;
//    	 
}
return null;
	
	
}
}

