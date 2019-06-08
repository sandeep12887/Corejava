package org.JavaRevison;

public class MethodOverLoadingChild extends MethodOverloading {
	public void div(float a) {
		System.out.println(a);

	}

	public  void div1(String sup) {
		System.out.println(sup);

	}
	public void div(char c) {
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		MethodOverLoadingChild mc=new MethodOverLoadingChild();//p c
		mc.div(23);
		mc.div("abdul");
		mc.div('b');
		mc.div(2.3f);//c
		mc.div("df");


	}

}
