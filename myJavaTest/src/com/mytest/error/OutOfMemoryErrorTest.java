package com.mytest.error;

import java.util.ArrayList;
import java.util.List;

/**
 * д����ʹ�÷ֱ����StackOverflowError��OutOfMemoryError
 * �ڴ����һ���ǳ����������˽϶���ڴ�ռ�û���ͷŵ����Ρ�����Ĵ���Ϳ��Գ��֣�
 * 
 * ջ�ռ����������쵫��ջ��С��ͨ�������Ķ����Ƿ��ڶѿռ䣬
 * ջ�ͶѵĴ�С������ͨ��JVM���������������е�����ջ�ռ��ù��˻�����StackOverflowError��
 * ���Ѻͳ����ؿռ䲻���������OutOfMemoryError
 *
 */
public class OutOfMemoryErrorTest {
	 public static void main(String[] args){
	        List list=new ArrayList();
	        for(;;){
	            int[] tmp=new int[1000000];
	            list.add(tmp);
	        }
	    }
}
