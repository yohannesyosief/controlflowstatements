package OopsPart1ClassesObjectsConstructors;

public class FirstCar {
	private  int doors;
	private int wheels;
	private  String model;
	private String engine;
	private String color;
	
	
	 public void setModel(String model)
	 {
		 String validModel= model.toLowerCase();
		 
		 if(validModel.equals("carrera")|| validModel.equals("commodore"))
		 {
		 this.model = model;
		 }
		 else {
			 this.model="Unkown";
		 }
	 }
	 public  String getModel()
	 {
		 return this.model;
	 }

}
