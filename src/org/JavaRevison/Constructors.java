package org.JavaRevison;

public class Constructors extends ConstructorBase1 {
	Constructors() {
		
      this(20);
		System.out.println("fgfd");

	}

	Constructors(int a) {
        this("bai");
		System.out.println(super.a);

	}

	Constructors(String s) {
       this(2.2f);
		System.out.println(super.s);
	}

	Constructors(char s) {
		this();

		System.out.println(s);
	}

	Constructors(Float j) {
        
		System.out.println(j);

	}
	

	public static void main(String[] args) {

		Constructors c = new Constructors('n');
		// Constructors c1=new Constructors(10);
		// Constructors c3=new Constructors("sandeep");

	}

}
