package com.mytest.baseDataType;

/**
7��int��Integer��ʲô���� 
��Java��һ�����������������������ԣ�����Ϊ�˱�̵ķ��㻹�������˻����������ͣ�
����Ϊ���ܹ�����Щ�����������͵��ɶ��������JavaΪÿһ�������������Ͷ������˶�Ӧ��
��װ���ͣ�wrapper class����int�İ�װ�����Integer����Java1.5��ʼ�������Զ�װ��/������ƣ�
ʹ�ö��߿����໥ת���� 
Java Ϊÿ��ԭʼ�����ṩ�˰�װ���ͣ� 
- ԭʼ����: boolean��char��byte��short��int��long��float��double 
- ��װ���ͣ�Boolean��Character��Byte��Short��Integer��Long��Float��Double
*/
public class AutoUnboxingTest {

	public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;                  // ��3�Զ�װ���Integer����
        int c = 3;
        System.out.println(a == b);     // false ��������û������ͬһ����
        System.out.println(a == c);     // true a�Զ������int�����ٺ�c�Ƚ�
        
        //=======================
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        
        System.out.println(f1 == f2);	//true
        System.out.println(f3 == f4);	//false
        //���������������ֵ��-128��127֮�䣬��ô����new�µ�Integer����
        //����ֱ�����ó������е�Integer���������������������f1==f2�Ľ����true����f3==f4�Ľ����false��
    
	
	}
	
}
