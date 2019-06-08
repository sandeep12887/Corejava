package org.JavaRevison;

import java.util.Scanner;

public class UserDefined {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if(age>60) {
			throw new TooYoung("You are not eligible");
		}else if(age<18) {
			throw new TooOld("You are eligible");
		}else {
			System.out.println("Thanks for registration");
		}
	}
	
		 
		}


