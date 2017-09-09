package com.mytest.basic;

/**
 * 
19��String��StringBuilder��StringBuffer������ 
��Javaƽ̨�ṩ���������͵��ַ�����String��StringBuffer/StringBuilder�����ǿ��Դ���Ͳ����ַ�����
����String��ֻ���ַ�����Ҳ����ζ��String���õ��ַ��������ǲ��ܱ��ı�ġ���StringBuffer/StringBuilder��
��ʾ���ַ����������ֱ�ӽ����޸ġ�StringBuilder��Java 5������ģ�����StringBuffer�ķ�����ȫ��ͬ��
�������������ڵ��̻߳�����ʹ�õģ���Ϊ�������з��涼û�б�synchronized���Σ��������Ч��Ҳ��StringBufferҪ�ߡ�

������1 - ʲô�������+����������ַ������ӱȵ���StringBuffer/StringBuilder�����append���������ַ������ܸ��ã�

������2 - ��˵���������������

���䣺����������������Ҫ������㣺
1. String�����intern������õ��ַ��������ڳ������ж�Ӧ�İ汾�����ã��������������һ���ַ�����String�����
equals�����true���������������û�ж�Ӧ���ַ���������ַ���������ӵ��������У�Ȼ�󷵻س��������ַ��������ã�
2. �ַ�����+�����䱾���Ǵ�����StringBuilder�������append������Ȼ��ƴ�Ӻ��StringBuilder������toString
���������String������һ�������javap -c StringEqualTest.class������class�ļ���Ӧ��JVM�ֽ���ָ��Ϳ��Կ�������
 *
 */
public class StringEqualTest {

	public static void main(String[] args) {
		//TODO: ҪŪ���
		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program";
		String s4 = "ming";
		String s5 = "Program" + "ming";
		String s6 = s3 + s4;
		System.out.println(s1 == s2);
		System.out.println(s1 == s5);
		System.out.println(s1 == s6);
		System.out.println(s1 == s6.intern());
		System.out.println(s2 == s2.intern());

	}

}
