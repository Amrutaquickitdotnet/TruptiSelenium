package com.javaexamples;

import java.util.Scanner;

public class Example_010_Takinginputfromusers {

	public static void main(String[] args) {

		// input from user

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice for cofee");

		String choices = s.next();
		switch (choices) {
		case "1": {

			System.out.println("Thanks for taking cold Cofee");
			break;
		}
		case "2": {
			System.out.println("Thanks for taking Hot Cofee");
			break;

		}
		case "3": {
			System.out.println("Thanks for taking capppachino");
			break;

		}
		case "4": {
			System.out.println("Thanks for taking Cofee Latte");
			break;

		}
		case "5": {
			System.out.println("Thanks for taking Escpresso");
			break;

		}
		default:
			System.out.println("Invalid Choice");
		}
		s.close();

	}
}