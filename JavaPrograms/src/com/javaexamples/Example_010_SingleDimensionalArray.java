package com.javaexamples;

public class Example_010_SingleDimensionalArray {

	public static void main(String[] args) {
    String[] name  = new  String[3];// Declaration of Array 
    
    // Assign a value to each array 
    
    name[0]= "Test";//0
    name[1]= "Test1";//1
    name[2]= "Test2";//2
    
System.out.println("Length of String Array is"+ name.length);
    		
    // print array 
    
    System.out.println(" Third  element of array is "+ name[2]);
    
	/*
	 * for(int i =0; i<number.length; i++) { System.out.println(number[i]); }
	 */
    
    
    
    for(String b:name) {
    	System.out.println(b);
    }
    
    
    
}
}