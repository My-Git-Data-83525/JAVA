package com.app.fruits;

import java.util.Scanner;

public class Apple extends fruit {
	
	@Override
	public String taste() {
		return "Sweet And Sour";
	}

	public Apple() {
		super();
	}
	
	public Apple(String colour, String name) {
		super(colour, name);
	}
	public void accpetData(Scanner sc) {
		super.acceptData(sc);
		this.setColour("Red");
		this.setName("Apple");
	}
	
	@Override
	public String toString() {
		return "Apple [taste=" + taste() + ", Colour=" + getColour() + ", Weight=" + getWeight()
				+ ", Name=" + getName() +  "]";
	}
	
}
