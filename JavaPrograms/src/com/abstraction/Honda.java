package com.abstraction;

public class Honda extends Bike {

	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run();
		obj.changGear();
	}

	@Override
	void run() {
		System.out.println("Honda speed is fast");
		
	}

	

}
