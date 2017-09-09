package com.mytest.basic;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "ABCD";
		String b = new String("ABCD");//"AB"+"CD";	//new String("CD");
		//a += "ABC";
		
		System.out.println(a==b);
	}

}
