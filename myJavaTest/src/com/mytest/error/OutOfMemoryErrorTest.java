package com.mytest.error;

import java.util.ArrayList;
import java.util.List;

/**
 * 写代码使得分别出现StackOverflowError、OutOfMemoryError
 * 内存溢出一般是出现在申请了较多的内存空间没有释放的情形。下面的代码就可以出现：
 * 
 * 栈空间操作起来最快但是栈很小，通常大量的对象都是放在堆空间，
 * 栈和堆的大小都可以通过JVM的启动参数来进行调整，栈空间用光了会引发StackOverflowError，
 * 而堆和常量池空间不足则会引发OutOfMemoryError
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
