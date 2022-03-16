package com.inheritance;

public class Bicycle {
	
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	
	public void speedUp(int increment) {
		
		speed = ++increment;
		
	}
	
	public String toString() {
		return ("No of gears are: "+ gear +" "+" Speed of Bicycle "+ speed);
		
	}
}
