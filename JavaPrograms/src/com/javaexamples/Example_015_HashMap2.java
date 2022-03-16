package com.javaexamples;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.management.ValueExp;

public class Example_015_HashMap2 {

	public static void main(String[] args) {
		/*
		 * Hashmap is not synchronized not following sequential
		 * 
		 * Only one null key are allowed . But value you can keep more than null value
		 */

		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		numbers.put(5, 12);
		numbers.put(4, 23);
		numbers.put(2, 102);
		System.out.println("Hashmap "+ numbers);
		// replace all the values with the square of the keys 
		numbers.replaceAll((key, value) ->(key*key));
		System.out.println("updated Hashmap" +numbers);
}
}
