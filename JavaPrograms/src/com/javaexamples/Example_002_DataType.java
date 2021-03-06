package com.javaexamples;

public class Example_002_DataType {

	// Data Type
	
	/*
	 * There are 2 major Data types in java
	 * 
	 * 1. Primitive 2. Non primitive
	 * Primitive is system -defined built in data type 
	 * Non Primitive user defined data type 
	 * Primitive ==> 
	 * Integer =>(Wrapper) int, long 
	 *  Float=> float, double
	 *   byte 
	 *   short 
	 *   char
	 *   boolean
	 *   Non Primitive ===> Array, String, Collections
	 */
	public static void main(String[] args) {
		
    System.out.println("Size of my integer:"+ Integer.SIZE);
    System.out.println("The maximum value of integer:"+Integer.MAX_VALUE);
    System.out.println("The minimum value of integer:"+Integer.MIN_VALUE);
    System.out.println("================================================");
    System.out.println("The maximum value of float:"+Float.MAX_VALUE);
    System.out.println("The minimum value of float:"+Float.MIN_VALUE);
    System.out.println("The Size  of Float:"+Float.SIZE);
    System.out.println("================================================");
    System.out.println("The maximum value of Long:"+Long.MAX_VALUE);
    System.out.println("The minimum value of Long:"+Long.MIN_VALUE);
    System.out.println("The size of Long:"+Long.SIZE);
    
    System.out.println("================================================");
    System.out.println("The maximum value of double:"+Double.MAX_VALUE);
    System.out.println("The minimum value of double:"+Double.MIN_VALUE);
    System.out.println("The size of Long:"+Double.SIZE);
    
    
    System.out.println("================================================");
    System.out.println("The maximum value of byte:"+Byte.MAX_VALUE);
    System.out.println("The minimum value of byte:"+Byte.MIN_VALUE);
    System.out.println("The size of byte:"+Byte.SIZE);
    
    System.out.println("================================================");
    System.out.println("The maximum value of short:"+Short.MAX_VALUE);
    System.out.println("The minimum value of short:"+Short.MIN_VALUE);
    System.out.println("The size of short:"+Short.SIZE);
    
	}

}
