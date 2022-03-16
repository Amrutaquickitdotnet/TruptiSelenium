package com.javaexamples;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.management.ValueExp;

public class Example_014_HashMap {

	public static void main(String[] args) {
		/*
		 * Hashmap is not synchronized not following sequential
		 * 
		 * Only one null key are allowed . But value you can keep more than null value
		 */

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Trupti", 12);// 0
		map.put("Trupti", 12);// LIFO
		map.put("Amruta", 39);// 1
		map.put("Selenium", 45);// 2
		map.put("Tester", 12);// 3
		map.put(null, 12);
		map.put("Selenium", null);
		map.put("Selenium1", null);
		map.put("Selenium2", null);

		map.remove("Amruta");
		map.remove("Selenium", 45);

		map.replace("Selenium1", null, 35);
		map.replace("Selenium2", 45);
		for (Entry<String, Integer> mapList : map.entrySet()) {
			System.out.println(mapList.getKey() + mapList.getValue());

		}
		System.out.println("********");

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// Adding element in hashmap
		map1.put(1, "Java");
		map1.put(2, "C#");
		map1.put(3, "Python");
		map1.put(4, "C++");
		map1.replace(2, "C#", "Perform");
		
		for (Entry<Integer, String> mapList : map1.entrySet()) {
			System.out.println(mapList.getKey() + " "+mapList.getValue());
			
			

		}
		System.out.println("*********change value to uppercase********");
		map1.replaceAll((key,value) -> value.toUpperCase());
		System.out.println(map1);
		
	}
}
