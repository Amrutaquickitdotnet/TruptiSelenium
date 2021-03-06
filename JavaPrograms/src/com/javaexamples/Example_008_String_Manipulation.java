package com.javaexamples;

public class Example_008_String_Manipulation {
//String Objects are immutable in nature 

	// We can not change the value of string
	public static void main(String[] args) {
		// String name = "Trupti";// String Object as a literal
		// 1. ClassLoader String Object as an argument .
		// String Object are immutable we do not have to take care of the
		// synchronization that is
		// required while sharaing an object across multiple threads

		// Security: username and password can not modify by any
		// Heap Space : immutability mimise usage of heap memory .

		// SCP will going to check the value of String Object Already been exist
		// if it is exist same value being assigned to new Object
		// String class is final => noone can override the methods of string class

		String name = new String("Mokati");

		name.concat("Testing");// Trupti Testing
		System.out.println(name);

		String text = "Today day is Tuesday and it is very hot";
		String text3 = "hello";
		String text1 = "HELLO";
		System.out.println(text.charAt(14));
		System.out.println(text.toUpperCase());
		System.out.println(text1.toLowerCase());

		String date = " 22-02-2022";
		String[] newDate = date.split("-");
		System.out.println("Day of the year:" + newDate[0]);
		System.out.println("Month of the year:" + newDate[1]);
		System.out.println("year of the year:" + newDate[2]);

		String text2 = "    username   ";

		System.out.println("After trimming" + text2.trim());

		System.out.println(text3.equalsIgnoreCase(text1));
		System.out.println(text3.concat(text));
		System.out.println(text3.startsWith("u"));
		System.out.println(text3.indexOf(5));
		System.out.println(text3.endsWith("o"));
		System.out.println(text3.lastIndexOf("l"));
		System.out.println(text3.contains("ell"));
		System.out.println(text.replace("Tuesday", "WednesDay"));

		String a = "12";
		String b = "14";
		System.out.println(a + b);
		// coversion from string to int
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int result = c + d;
		System.out.println(result);
		// conversion from int to String

		int age = 18;

		String newAge = Integer.toString(age);
		System.out.println(newAge);

		int salary = 50000;
		String newSalary = String.valueOf(salary);
		System.out.println(newSalary);

	}
}