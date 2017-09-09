package com.mytest.baseDataType;

/**
 * 
 * 9、解释内存中的栈(stack)、堆(heap)和方法区(method area)的用法。 
答：通常我们定义一个基本数据类型的变量，一个对象的引用，还有就是函数调用的现场保存都使用JVM中的栈空间；
而通过new关键字和构造器创建的对象则放在堆空间，堆是垃圾收集器管理的主要区域，由于现在的垃圾收集器都
采用分代收集算法，所以堆空间还可以细分为新生代和老生代，再具体一点可以分为Eden、Survivor（又可分为
From Survivor和To Survivor）、Tenured；方法区和堆都是各个线程共享的内存区域，用于存储已经被JVM
加载的类信息、常量、静态变量、JIT编译器编译后的代码等数据；程序中的字面量（literal）如直接书写的
100、"hello"和常量都是放在常量池中，常量池是方法区的一部分，。栈空间操作起来最快但是栈很小，通常
大量的对象都是放在堆空间，栈和堆的大小都可以通过JVM的启动参数来进行调整，栈空间用光了会引发
StackOverflowError，而堆和常量池空间不足则会引发OutOfMemoryError。
 String str = new String("hello");
上面的语句中变量str放在栈上，用new创建出来的字符串对象放在堆上，而"hello"这个字面量是放在方法区的。

补充1：较新版本的Java（从Java 6的某个更新开始）中，由于JIT编译器的发展和"逃逸分析"技术的逐渐成熟，
	栈上分配、标量替换等优化技术使得对象一定分配在堆上这件事情已经变得不那么绝对了。

补充2：运行时常量池相当于Class文件常量池具有动态性，Java语言并不要求常量一定只有编译期间才能产生，
	运行期间也可以将新的常量放入池中，String类的intern()方法就是这样的。
	
 看看下面代码的执行结果是什么并且比较一下Java 7以前和以后的运行结果是否一致。 why?
 */
public class StackHeapMethodAreaTest {
	
	//看看下面代码的执行结果是什么并且比较一下Java 7以前和以后的运行结果是否一致。
	public static void main(String [] args){ 
		//TODO:为什么？
		String s1 = new StringBuilder("go").append("od").toString();
		System.out.println(s1.intern() == s1);	//1.8 true 	1.5:false
		
		String s2 = new StringBuilder("ja").append("va").toString();
		System.out.println(s2.intern() == s2);	//1.8 false 	1.5:false
		
		
	}

}
