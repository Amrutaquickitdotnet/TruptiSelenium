package com.runtimePolymorphism;

public class TestPArent {

	public static void main(String[] args) {
		Parent a = new Subclass1();
		a.print();
		
		Parent b = new SubClass2();
		b.print();

	}

}
