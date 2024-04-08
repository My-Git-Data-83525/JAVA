package com.app.fruits;

public class Mango extends fruit{
	
	public Mango() {
		super();
	}

	public Mango(String colour, double weight, String name) {
		super(colour, weight, name);
	}
	public Mango(String colour, String name) {
		super("colour", "name");
	}

	@Override
	public String taste() {
		return "Sweet";
	}
	
	public String toString() {
		return "Mango [taste=" + taste() + ", Colour=" + getColour() + ", Weight=" + getWeight()
				+ ", Name=" + getName() +  "]";
	} 
}
