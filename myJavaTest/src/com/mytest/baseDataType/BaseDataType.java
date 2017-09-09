package com.mytest.baseDataType;

public class BaseDataType {
	
	//float f = 3.2;  //报错 
	float f = 3.2f; 
	
	double d = 3.2;
	
	long l = 200;
	int i = 200;
	
	//s1 = s1 + 1	//报错  
	//对于short s1 = 1; s1 = s1 + 1;由于1是int类型，因此s1+1运算结果也是int 型，需要强制转换类型才能赋值给short型
	
	{
		short s1 = 1; 
		//s1 = s1 + 1; //报错  
		//对于short s1 = 1; s1 = s1 + 1;由于1是int类型，因此s1+1运算结果也是int 型，需要强制转换类型才能赋值给short型
		
		s1 += 1;
		
	}
	
    public static void main(String[] args) {  
    	
    	
    	
        // byte  
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("包装类：java.lang.Byte");  
        //最小值是 -128（-2^7）； 最大值是 127（2^7-1）；
        System.out.println("最小值（-2^7）：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值（2^7-1）：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("包装类：java.lang.Short");  
        //最小值是 -32768（-2^15）；最大值是 32767（2^15 - 1）；
        System.out.println("最小值（-2^15）：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值（2^15-1）：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        //最小值是 -2,147,483,648（-2^31）；最大值是 2,147,483,647（2^31 - 1）；
        System.out.println("最小值（-2^31）：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值（2^31-1）：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
      //最小值是 -9,223,372,036,854,775,808（-2^63）； 最大值是 9,223,372,036,854,775,807（2^63 -1）；
        System.out.println("最小值（-2^63）：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值（2^63-1）：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("包装类：java.lang.Float");  
        //-3.403E38 - 3.403E38
        System.out.println("最小值（-3.403E38）：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值（3.403E38）：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        //-1.798E308 - 1.798E308
        System.out.println("最小值（-1.798E308）：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值（1.798E308）：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }  

}
