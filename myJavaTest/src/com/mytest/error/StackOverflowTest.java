package com.mytest.error;

/**
 * д����ʹ�÷ֱ����StackOverflowError��OutOfMemoryError
 * ��ջ�������һ���ǵݹ���������Ĵ���Ϳ��Գ��֣�
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