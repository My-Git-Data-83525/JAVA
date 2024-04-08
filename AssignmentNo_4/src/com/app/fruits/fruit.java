package com.app.fruits;

import java.util.Scanner;

/*a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
c) Add suitable constructors.
d) Override toString correctly to return state of all fruits (including : name ,color , weight )
e) Add a taste() method : public String taste()
For Fruit : it should return "no specific taste"
Apple : should return "sweet n sour"
Mango : should return "sweet"
Orange : should return "sour"
f) Add all of above classes under the package "com.app.fruits"
g) Create java application FruitBasket , with main method , as a tester
h) Prompt user for the basket size n create suitable data structure and give options*/
public class fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean isFresh = true;

	public boolean getFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public fruit(String colour, double weight, String name) {
		this.colour = colour;
		this.weight = weight;
		this.name = name;

	}
	
	public fruit(String colour, String name) {
		this.colour = colour;
		this.name = name;
	}

	public void acceptData(Scanner sc) {
		System.out.println("Enter the weight of Fruit :");
		weight=sc.nextDouble();
		System.out.println("Enter true if fruit is fresh else false :");
		isFresh=sc.nextBoolean();
	
	}
	public fruit() {
	}

	@Override
	public String toString() {
		return "fruit [colour=" + colour + ", weight=" + weight + ", name=" + name + ", taste()=" + taste() + "]";
	}

	public String taste() {
		return "No Specific taste";
	}

	
}
