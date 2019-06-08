package org.JavaRevison;

public class JavaPrograms {

	public static void swapOfNumbers() {
		int a = 20, b = 1, c;
		c = a + b;// 15
		a = c - a;// 15-5
		b = c - a;// 15-10
		System.out.println(a);
		System.out.println(b);
		int h = 5, k = 1;
		k = h + k;// 15
		h = k - h;// 10
		k = k - h;
		System.out.println(h);
		System.out.println(k);
	}

	public static void reverseTheNumber() {
		int i, j = 0, a = 121, n = a;

		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
			System.out.println(j);

		}
		if (n == j) {
			System.out.println("it is p ");
		} else {
			System.out.println("it is not p");
		}
	}
	// System.out.println(j);

	public static void sumAndCountofNumber() {
		int i, j = 0, a = 143, count = 0;
		while (a > 0) {
			i = a % 10;
			j = j + i;
			a = a / 10;
			count = count + 1;
			// System.out.println(count);
		}
		System.out.println(j);
		System.out.println(count);

	}

	public static void armstrng() {
		int i, j = 0, a = 153, n = a;
		while (a > 0) {
			i = a % 10;
			j = (i * i * i) + j;

			a = a / 10;

		}
		System.out.println(j);
		if (n == j) {
			System.out.println("it is armstrong");
		} else {
			System.out.println("it is not a armstrong");
		}
	}

	public static void primeNoSingle() {
		int a = 23;
		int count = 0;
		for (int i = 2; i < 23; i++) {
			if (a % i == 0) {
				count = count + 1;
			}
		}
		if (count ==0) {
			System.out.println("it is prime no");
		} else {
			System.out.println("its is not prime");
		}
	}

	public static void primeNoGroup() {
		for (int n = 1; n <= 100; n++) {//from 1 to 100 numbers find 1,2,3

			int count = 0;
			for (int i = 2; i < n; i++) {//
				if (n % i == 0) {  
					count = count + 1;
				}
			}
			if (count == 0) {
				System.out.println(n + " is prime");
			} else {
				System.out.println(n + " is not prime");
			}
		}

	}

	public static void maximumNo() {
		int a[] = { 2, 3, 8, 1 };
		int i = 0;
		for (int j = 1; j < a.length; j++) {
			if (a[i] > a[j]) {
				a[i] = a[i];
			} else {
				a[i] = a[j];
			}
		}
		System.out.println(a[i]);

	}

	public static void MinimumNo() {
		int a[] = { 2, 3, 8, 1 };
		int i = 0;
		for (int j = 1; j < a.length; j++) {
			if (a[i] < a[j]) {
				a[i] = a[i];
				
			} else {
				a[i] = a[j];
			}
		}
		System.out.println(a[i]);

	}
	
	public static void DescendingNo()
	{
		int a[]= {2,7,1,1,2};
	
		for(int i=0;i<a.length;i++)
		{	
			for(int j=i+1;j<a.length;j++)
			{
				int temp;
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				
			}
				
		}System.out.print(a[i]);
		}}
		//for(int i=0;i<a.length;i++)
		//{
			//System.out.print(a[i]);
		public static void duplicate()
		{
			int a[]= {2,7,1,1,2,3,4,5,3,4};
		
			for(int i=0;i<a.length;i++)
			{	
				for(int j=i+1;j<a.length;j++)
				{
					int temp;
					if(a[i]==a[j])
					{
						temp=a[i];
						System.out.print (temp);
						
						
					
				}
					
			}//System.out.print(a[i]);
				
			}
			
	
	}
		
		public static void butterfly()
		{
			int a[]= {1,2,3,4,5,6,7,8,9,10};
			int b=a.length/2;
			for(int i=b-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
			for(int j=a.length-1; j>=b; j--) 
			{
				System.out.println(a[j]);
			}
			}
		
		public static void stringReverse()
		{
			String s="sas";
			String s1="";
			for(int i=s.length()-1;i>=0;i--)
			{
				char c = s.charAt(i);
				//System.out.print(c);
				 s=c+s1;
				 //s1=Character.toString(c);
			}
	
	if(s.equals(s1))
	{
		System.out.println("it is pali");
	}
	else
	{
		System.out.println("it is not pali");
	}
			}
			
		public static void swap_string()
		{
			String a="sandeep",b="bai",c="h",d="";
			//String a[]= {"sandeep","bai","h"};
			//a=c,b=a,c=b
			
			d=a;
			a=c;
			c=b;
			b=d;
			
			
			System.out.println(a+b+c);
			
			
			
		}
	
	public static void main(String[] args) {
		// swap numbers

		// reverseTheNumber();
		// sumAndCountofNumber();
		// armstrng();
		// primeNoSingle();
		// primeNoGroup();
		//maximumNo();
		//MinimumNo();
		//DescendingNo();
		//duplicate();
		//butterfly();
		//stringReverse();
		swap_string();

	}

}
