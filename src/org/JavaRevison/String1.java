package org.JavaRevison;

public class String1 {
	static String s = "tihenmozhi", s1 = "san", s2 = "sanjhg", s4 = "SaNdeEp";
	private static Object StringUtils;

	public static void length()

	{

		int length = s.length();
		String s2 = "bai";
		System.out.println(s + "" + s1 + " " + length + " " + s2);
	}

	public static void charat() {
		char charAt = s.charAt(5);
		System.out.println(charAt);

	}

	public static void equals_Ignore_Contains() {
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		boolean equals1 = s1.equals(s4);
		System.out.println(equals1);
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s4);
		System.out.println(equalsIgnoreCase);
		boolean contains = s1.contains(s2);
		System.out.println(contains);
		String lowerCase = s1.toLowerCase();
		String upperCase = s1.toUpperCase();

	}

	public static void split1() {
		String a = "greenstechnology is a beyst center";
		// System.out.println(a.length());
		// String[] split = a.split(" ");
		// for (String string : split) {
		// System.out.println(string);
		String[] split2 = a.split("e", 6);
		for (String string2 : split2) {
			System.out.println(string2);

		}

	}
	
	public static void subString()
	{
		String b = "abcdefghijkl";
		String substring = b.substring(2,8);
		System.out.println(substring);
		
	}
	public static void replace()
	{
		String a = "greenstechnology is a beyst center";
		String replace = a.replace("is", "&");
		System.out.println(replace);
	}
	public static void compareTo()
	{
		String s = "th", s1 = "then";
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);
		
	}
	public static void indexOf()
	{
		int indexOf = s.indexOf("i");
		int lastIndexOf = s.lastIndexOf("i");
		System.out.println(lastIndexOf);
		
		System.out.println(indexOf);
	}
	
	

	public static void main(String[] args) {
		// charat();
		// length();
		//equals_Ignore_Contains();
		//split1();
		//subString();
		//replace();
		//compareTo();
		indexOf();
	}

}
