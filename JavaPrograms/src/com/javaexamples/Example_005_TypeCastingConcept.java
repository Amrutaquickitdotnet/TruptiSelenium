package com.javaexamples;

public class Example_005_TypeCastingConcept {
// Widening TypeCasting
	public static void main(String[] args) {

		int myInt = 6;
		double myDouble = myInt;// Automatic casting conversion from int to double
		System.out.println(myDouble);
		System.out.println(myInt);
		System.out.println("learning concept of narrowing typecasting");
		/// Narrowing TypeCasting

		double myDouble1 = 9.78;
		// conversion from bigger data type to small one

		System.out.println(myDouble1);

		System.out.println("---After conversion-----");
		int myfloat = (int) myDouble1;
		System.out.println(myfloat);

	}

}
