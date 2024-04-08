package com.app.fruits;

public class Orange extends fruit{
	
	
	public Orange(String colour, double weight, String name) {
		super("Orange", weight, "Orange");
	}
	public Orange(String colour,String name) {
	super(colour,name);
	}

	public Orange() {
		super();
	}


	@Override
	public String taste() {
		return "Sour";
	}
	@Override
	public String toString() {
		return "Orange [taste=" + taste() + ", Colour=" + getColour() + ", Weight=" + getWeight()
				+ ", Name=" + getName() +  "]";
	}
}
