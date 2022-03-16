package com.javaexamples;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example_013_Vectors {

	public static void main(String[] args) {
  
	Vector v1 = new Vector();
	v1.add(1);
	v1.add(12);
	v1.add("Test");
	v1.add("Selenium");
	v1.add(3.4);
	System.out.println(v1);
	
	Vector<Integer>v2 = new Vector<Integer>();
	v2.add(12);
	
	v2.add(12);
	v2.add(12);
	v2.add(12);
	v2.set(2, 14);
	v2.remove(1);
	System.out.println(v2);
	for(int i =0; i<v2.size(); i++) {
		System.out.println(v2.get(i));
	}
	System.out.println("using for each loop");
	for(Integer str: v2) {
		System.out.println(str);
	}
	}
}
		 
    
 
    

