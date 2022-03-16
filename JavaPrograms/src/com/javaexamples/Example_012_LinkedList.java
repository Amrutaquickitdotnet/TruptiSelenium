package com.javaexamples;

import java.util.LinkedList;
import java.util.List;

public class Example_012_LinkedList {

	public static void main(String[] args) {
   LinkedList<String> b = new LinkedList<String>();
   b.add("Madras");//0
   b.add("Delhi");//1
   b.add("Calcutta");
   b.add("Madurai");
  
	b.addLast("Japan");
	b.addFirst("Test");
   System.out.println("List of states are :");
	for(String stateList :b) {
		System.out.println(stateList);
	}

	//b.remove(1);
	/**/
	b.removeFirst();
	b.removeLast();
	b.remove(1);
	b.remove("Calcutta");
	System.out.println("After removing**************");
	for(String stateList :b) {
		System.out.println(stateList);
	}
	}
}
		 
    
 
    

