package com.javaexamples;

public class Example_004_variables {

	public static void main(String[] args) {
     
		String name = "Trupti";
		System.out.println(name);
		
		int myNum = 15;
		myNum = 25;
		System.out.println(myNum);
		final int mynum1 = 23;// read-only

		System.out.println(mynum1);
		
		
		char myletter = 'D';
		System.out.println(myletter);
		
		boolean mybool = false;
		if(mybool== true) {
			System.out.println("I am in true");// true
		}else {
			System.out.println("I am in false");
			
			String name1 = "Amruta";
			System.out.println("Hello"+" "+ name1);
			
			int x = 45;
			int y =34;
			System.out.println(x+y);
			int a = 12, b=23, c = 34;
			System.out.println(a+b+c);
			
		}
		
	}

}
