package com.javaexamples;

import java.util.Scanner;

public class Example_010_Takinginputfromusers2_TemperatureCheck {

	public static void main(String[] args) {

		// input from user

		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperature in farenhite");
		while (in.hasNextDouble())//It is just checking Element exists or not ( True / false)
		
		{
			double temp = in.nextDouble();
		double cels =	5/9.0*(temp-32);
		System.out.println("Temperature in  Celsius"+ cels);
		
				}

		

	}
}