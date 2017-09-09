package com.mytest.baseDataType;

public class BaseDataType {
	
	//float f = 3.2;  //���� 
	float f = 3.2f; 
	
	double d = 3.2;
	
	long l = 200;
	int i = 200;
	
	//s1 = s1 + 1	//����  
	//����short s1 = 1; s1 = s1 + 1;����1��int���ͣ����s1+1������Ҳ��int �ͣ���Ҫǿ��ת�����Ͳ��ܸ�ֵ��short��
	
	{
		short s1 = 1; 
		//s1 = s1 + 1; //����  
		//����short s1 = 1; s1 = s1 + 1;����1��int���ͣ����s1+1������Ҳ��int �ͣ���Ҫǿ��ת�����Ͳ��ܸ�ֵ��short��
		
		s1 += 1;
		
	}
	
    public static void main(String[] args) {  
    	
    	
    	
        // byte  
        System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Byte");  
        //��Сֵ�� -128��-2^7���� ���ֵ�� 127��2^7-1����
        System.out.println("��Сֵ��-2^7����Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("���ֵ��2^7-1����Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("�������ͣ�short ������λ����" + Short.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Short");  
        //��Сֵ�� -32768��-2^15�������ֵ�� 32767��2^15 - 1����
        System.out.println("��Сֵ��-2^15����Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("���ֵ��2^15-1����Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Integer");  
        //��Сֵ�� -2,147,483,648��-2^31�������ֵ�� 2,147,483,647��2^31 - 1����
        System.out.println("��Сֵ��-2^31����Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("���ֵ��2^31-1����Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("�������ͣ�long ������λ����" + Long.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Long");  
      //��Сֵ�� -9,223,372,036,854,775,808��-2^63���� ���ֵ�� 9,223,372,036,854,775,807��2^63 -1����
        System.out.println("��Сֵ��-2^63����Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("���ֵ��2^63-1����Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("�������ͣ�float ������λ����" + Float.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Float");  
        //-3.403E38 - 3.403E38
        System.out.println("��Сֵ��-3.403E38����Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("���ֵ��3.403E38����Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("�������ͣ�double ������λ����" + Double.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Double");  
        //-1.798E308 - 1.798E308
        System.out.println("��Сֵ��-1.798E308����Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("���ֵ��1.798E308����Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("�������ͣ�char ������λ����" + Character.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Character");  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨  
        System.out.println("��Сֵ��Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨  
        System.out.println("���ֵ��Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }  

}
