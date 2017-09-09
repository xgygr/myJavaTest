package com.mytest.basic;

/**
 * 
 10、Math.round(11.5) 等于多少？Math.round(-11.5)等于多少？ 
答：Math.round(11.5)的返回值是12，Math.round(-11.5)的返回值是-11。
四舍五入的原理是在参数上加0.5然后进行下取整(floor())。

Math.floor() : 
  “向下取整”，或者说“向下舍入”，即取不大于x的最大整数
  （与“四舍五入”不同，下取整是直接取按照数轴上最接近要求值的左边值，即不大于要求值的最大的那个值）。
 *
 */
public class MathTest {

	public static void main(String[] agrs){
		
		System.out.println("Math.round(-8.1):"+Math.round(-8.1));
		System.out.println("Math.round(-8.4):"+Math.round(-8.4));
		System.out.println("Math.round(-8.5):"+Math.round(-8.5));  //注意这个
		System.out.println("Math.round(-8.6):"+Math.round(-8.6));
		System.out.println("Math.round(-8.9):"+Math.round(-8.9));
		
		System.out.println("Math.round(8.1):"+Math.round(8.1));
		System.out.println("Math.round(8.4):"+Math.round(8.4));
		System.out.println("Math.round(8.5):"+Math.round(8.5));  //注意这个
		System.out.println("Math.round(8.6):"+Math.round(8.6));
		System.out.println("Math.round(8.9):"+Math.round(8.9));
		System.out.println("");
		
		System.out.println("Math.floor(8.1):"+Math.floor(8.1));
		System.out.println("Math.floor(8.5):"+Math.floor(8.5));
		System.out.println("Math.floor(8.9):"+Math.floor(8.9));
		
		System.out.println("Math.floor(-8.1):"+Math.floor(-8.1));
		System.out.println("Math.floor(-8.5):"+Math.floor(-8.5));
		System.out.println("Math.floor(-8.9):"+Math.floor(-8.9));
		
		/*
		12、用最有效率的方法计算2乘以8？ 
		答： 2 << 3（左移3位相当于乘以2的3次方，右移3位相当于除以2的3次方）。
		*/
		System.out.println(2<<3);
		System.out.println(80>>3);
	}
	
	
}
