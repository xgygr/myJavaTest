package com.mytest.error;

/**
 * 写代码使得分别出现StackOverflowError、OutOfMemoryError
 * 堆栈溢出错误一般是递归调用嘛。下面的代码就可以出现：
 *
 */
public class StackOverflowTest {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        //for(;;)
            method();
    }
}