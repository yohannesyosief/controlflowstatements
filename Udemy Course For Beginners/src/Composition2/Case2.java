package Composition2;

import Composition.Dimensions;

public class Case2 {
	
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;  //this means the case will have dimensions like width,depth and height
	public Case2(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	public void pressPowerButton() {
		System.out.println("power button pressed");
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	

}
