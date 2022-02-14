package CompositionJavaTpoint;

public class Car {
	private String color;
	private int noOfTyres;
	private Engine engine;
	public Car(String color, int noOfTyres,String engineType,String engineName,String enginePower) {
		super();
		this.color = color;
		this.noOfTyres = noOfTyres;
		this.engine=new Engine();
		engine.setEngineName(engineName);
		engine.setEnginePower(enginePower);
		engine.setEngineType(engineType);
			}
	public String getColor() {
		return color;
	}
		public int getNoOfTyres() {
		return noOfTyres;
	}
		public String getEnginetype() {
			return engine.getEngineType();
		}
		public String getEngineName() {
			return engine.getEngineName();
		}
		public String getEnginePower() {
			return engine.getEnginePower();
		}
		
	

public static void main(String[]args) {
	Car c=new Car("Red", 4,"V8","Chevy","320 Hp");
	System.out.println("color of the car is "+c.color+" and has "+c.noOfTyres+"tyres,and the engine types is"
	+c.getEnginetype()+" and engine  name is "+c.getEngineName()+"and engine power is "+c.getEnginePower());
	
	
	
}}
