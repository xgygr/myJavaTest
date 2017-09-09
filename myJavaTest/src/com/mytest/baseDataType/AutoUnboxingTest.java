package com.mytest.baseDataType;

/**
7、int和Integer有什么区别？ 
答：Java是一个近乎纯洁的面向对象编程语言，但是为了编程的方便还是引入了基本数据类型，
但是为了能够将这些基本数据类型当成对象操作，Java为每一个基本数据类型都引入了对应的
包装类型（wrapper class），int的包装类就是Integer，从Java1.5开始引入了自动装箱/拆箱机制，
使得二者可以相互转换。 
Java 为每个原始类型提供了包装类型： 
- 原始类型: boolean，char，byte，short，int，long，float，double 
- 包装类型：Boolean，Character，Byte，Short，Integer，Long，Float，Double
*/
public class AutoUnboxingTest {

	public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
        
        //=======================
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        
        System.out.println(f1 == f2);	//true
        System.out.println(f3 == f4);	//false
        //如果整型字面量的值在-128到127之间，那么不会new新的Integer对象，
        //而是直接引用常量池中的Integer对象，所以上面的面试题中f1==f2的结果是true，而f3==f4的结果是false。
    
	
	}
	
}
