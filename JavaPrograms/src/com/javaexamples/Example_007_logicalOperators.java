package com.javaexamples;

public class Example_007_logicalOperators {
// Widening TypeCasting
	public static void main(String[] args)
	{
		String a = "007";
		String type = "It\f's alright";
		String str = "\n";
	boolean result = str.isBlank();
	System.out.println(result);
	
	String str1 = "Hello";
	String str2 = "Hello  ";
	String str3 = "   Hello  ";
	
	System.out.println(str1.isBlank());
	System.out.println(str2.isBlank());
	System.out.println(str3.isBlank());
		String name = "JamesBond";
     String text = "Today is Monday and it is very sunny";
     String text1 = "TRUPTI IS LEARNING JAVA";
     // how to find length of string 
     System.out.println("The length of given string is:"+ text.length());
// toUpperCase and toLowercase
     System.out.println(text.toUpperCase());
     System.out.println(text1.toLowerCase());
	// FIND character in a string 
     
     // indexOf method returs the index  of the first occurance of a specified text
     System.out.println(text1.indexOf("LEARNING"));
     // Concatenation of 2 strings 
     System.out.println(text+" "+ text1);
     System.out.println(text.concat(text1));
     System.out.println(name.concat(a));
     System.out.println(type);
     System.out.println(text1.contains("JAVA"));
     System.out.println(text1.startsWith("N"));
     System.out.println(text.endsWith("y"));
     System.out.println(text1.endsWith("y"));
     System.out.println(text1.replace("JAVA", "PYTHON"));
     System.out.println(text1.charAt(12));
   //  System.out.println(b.isEmpty());
     System.out.println(" ".isBlank());
  
	}
}