package Composition;
//Now since the car is extending the vehicle,this means the car is " is a vehicle",so has an is a relationship,
//Let's see the scenario of a computer,a computer has ,a mother board,a case and a monitor,the motherboard ,
//case and monitor are not computer in the same sense a car is a vehicle, 
//but a computer has a motherboard, a computer has a case, a computer has a monitor so they have "Has a relationship"

public class MotherBoard {
	
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgrma(String programName) {
		System.out.println("program "+programName+" is now loading... ");
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}
	public String getBios() {
		return bios;
	}
	public void setBios(String bios) {
		this.bios = bios;
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getRamSlots() {
		return ramSlots;
	}

}
