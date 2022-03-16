package com.javaexamples;

import java.util.ArrayList;
import java.util.List;

public class Example_011_ArrayList {

	public static void main(String[] args) {
    //List is interface 
		
		//ArrayList 
		// LinkedList
		//DoubleLinkedList 
		// Vector 
		
		// Classes always implement by my interface
		// ArrayList implements List
	// we can not create object of interface 
		
		List<String> a = new ArrayList<String>();
		// append value inside  variable 
		a.add("Trupti");//0
		a.add("Trupti1");//1
		a.add("Trupti Mokati");//2
		a.add("Trupti2");//3
		a.add("Trupti");//4

		System.out.println("Added element inside ArrayList are ");
		for(String dataList :a) {
			
			System.out.println(dataList);
			
		}
		
		
		
	}
		 
    
 
    
}
