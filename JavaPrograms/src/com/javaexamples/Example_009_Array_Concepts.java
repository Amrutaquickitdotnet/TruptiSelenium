package com.javaexamples;

public class Example_009_Array_Concepts {

	public static void main(String[] args) {
    int[] number  = new  int[5];// Declaration of Array 
    
    // Assign a value to each array 
    
    number[0]= 12;
    number[1]= 13;
    number[2]= 14;
    number[3]= 15;
    number[4]= 16; 
    
    // print array 
    
    System.out.println("0th element of array is "+ number[0]);
    
	/*
	 * for(int i =0; i<number.length; i++) { System.out.println(number[i]); }
	 */
    
    
    
    for(int b:number) {
    	System.out.println(b);
    }
    
    
    
}
}