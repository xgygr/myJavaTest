package com.mytest.basic;

/**
 * 
 10��Math.round(11.5) ���ڶ��٣�Math.round(-11.5)���ڶ��٣� 
��Math.round(11.5)�ķ���ֵ��12��Math.round(-11.5)�ķ���ֵ��-11��
���������ԭ�����ڲ����ϼ�0.5Ȼ�������ȡ��(floor())��

Math.floor() : 
  ������ȡ����������˵���������롱����ȡ������x���������
  ���롰�������롱��ͬ����ȡ����ֱ��ȡ������������ӽ�Ҫ��ֵ�����ֵ����������Ҫ��ֵ�������Ǹ�ֵ����
 *
 */
public class MathTest {

	public static void main(String[] agrs){
		
		System.out.println("Math.round(-8.1):"+Math.round(-8.1));
		System.out.println("Math.round(-8.4):"+Math.round(-8.4));
		System.out.println("Math.round(-8.5):"+Math.round(-8.5));  //ע�����
		System.out.println("Math.round(-8.6):"+Math.round(-8.6));
		System.out.println("Math.round(-8.9):"+Math.round(-8.9));
		
		System.out.println("Math.round(8.1):"+Math.round(8.1));
		System.out.println("Math.round(8.4):"+Math.round(8.4));
		System.out.println("Math.round(8.5):"+Math.round(8.5));  //ע�����
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
		12��������Ч�ʵķ�������2����8�� 
		�� 2 << 3������3λ�൱�ڳ���2��3�η�������3λ�൱�ڳ���2��3�η�����
		*/
		System.out.println(2<<3);
		System.out.println(80>>3);
	}
	
	
}
