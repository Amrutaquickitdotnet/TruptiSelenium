package com.inheritance;
// has a relationship
public class Car  {
private String colour;
private int maxSpeed;


public static void main(String[] args) {
	Car nano = new Car();
	nano.setColour("Red");
	
	nano.setMaxSpeed(300);
	
	
	nano.carinfo();
	
	
	MarutiCar m = new MarutiCar();
	m.marutiDemo();
	
	
}

public String getColour() {
	return colour;
}


public void setColour(String colour) {
	this.colour = colour;
}


public int getMaxSpeed() {
	return maxSpeed;
}


public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}

public void carinfo() {
	System.out.println("Car colour: "+ colour +"Max Speed of car :"+ maxSpeed);
}
}
