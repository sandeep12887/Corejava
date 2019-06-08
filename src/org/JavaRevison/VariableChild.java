package org.JavaRevison;

public class VariableChild extends VariableParent {
	
	public  void add() {
		int a = 6, b = 8,f=1, c;
		c = a + b;

		System.out.println(a + b +f);

	}
	public static void main(String[] args) {
		VariableChild vc=new VariableChild();
		vc.add();
		
	}

}
