package org.JavaRevison;

public class MethodOverridingChild extends MethodOverridingParent {
	

@Override
	public void div() {
	System.out.println("bai");
		
		super.div();
	}
	

	

	public static void main(String[] args) {
		
		MethodOverridingChild mc=new MethodOverridingChild();//p c=c(overriding)
		mc.div();
	}
            //c c =c
	        // p c = c
	         //p p =p
}
