package com.javaexamples;

public class Example_010_TwoDimensionalArray {

	public static void main(String[] args) {
 //int[][] a = new int [3][4];
    int [][] a = {
    		{1,2,3,5},
    		{3,5,7,8},
    		{7}
    		
    		
    };
   /* for(int i =0; i<a.length; i++) {
    	
    	for(int j=0;j <a[i].length;j++ ) {
    		System.out.print(a[i][j]);
    		
    	}
    	System.out.println(" ");*/
    
    for(int[]rows:a) 
    {
    	for(int columns: rows) 
    	{
    		System.out.print(columns);
    	}
    	System.out.println(" ");
    }
    }
		 
    
 
    
}
