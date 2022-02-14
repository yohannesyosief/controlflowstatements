package Composition2;

public class Motherboard2 {
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	public Motherboard2(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
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
