package com.javaexamples;

import java.util.ArrayList;
import java.util.List;

public class Example_012_ArrayList2 {

	public static void main(String[] args) {
    List<String>words = new ArrayList<String>();
    words.add("school");//0
   // words.add(1.0);
	words.add(1, "at");
	//To access an element via index position
	String w = words.get(1);
	
	System.out.println(w);
	System.out.println("Update element via index");
	
	words.set(1, "Don Bosco");
	w = words.get(1);
	System.out.println(w);
	
	}
		 
    
 
    
}
