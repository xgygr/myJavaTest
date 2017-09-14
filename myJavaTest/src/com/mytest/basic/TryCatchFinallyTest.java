package com.mytest.basic;

public class TryCatchFinallyTest {
	
	public static int foo(int a, int b){
		
		try{
			return a+b;
		}
		catch(Exception e){
			System.out.println("catch语句");
		}
		finally{
			System.out.println("finally语句");
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("和是："+foo(2,7));
	}
	

}
