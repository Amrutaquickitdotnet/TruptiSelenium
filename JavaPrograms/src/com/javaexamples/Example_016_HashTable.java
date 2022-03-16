package com.javaexamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

import javax.management.ValueExp;

public class Example_016_HashTable {

	public static void main(String[] args) {
		/*
		 * Hashtable is  synchronized.
		 * Hashtable he can not accept key as null 
		 * 
		 * Only one null key are allowed . But value you can keep more than null value
		 */

		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(1,"one" );
		table.put(2,"two" );
		table.put(3,"three" );
		// LIFO
		
		System.out.println(table);
		
		if(table.containsKey(3)) {
			
		String data =	table.get(3);
		System.out.println(data);
		}
		
		for(Map.Entry<Integer, String> e :table.entrySet()) {
			System.out.println(e.getKey()+ e.getValue());
			
		}
}
}
