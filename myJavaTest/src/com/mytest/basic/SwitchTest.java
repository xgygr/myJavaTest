package com.mytest.basic;

/**
 * 
11��switch �Ƿ���������byte �ϣ��Ƿ���������long �ϣ��Ƿ���������String�ϣ� 
����Java 5��ǰ��switch(expr)�У�exprֻ����byte��short��char��int��
��Java 5��ʼ��Java��������ö�����ͣ�exprҲ������enum���ͣ�
��Java 7��ʼ��expr���������ַ�����String�������ǳ����ͣ�long����Ŀǰ���еİ汾�ж��ǲ����Եġ�
 *
 */
public class SwitchTest {

	public static void main(String[] a){
		byte b = 1;
		char c = 'a';
		short s = 2;
		int i =3;
		long l = 4;
		String str="sss";
		
		switch(b){
			case 1 :
				System.out.println("b=1");
				break;
		}
		
		switch(c){
			case 'a' :
				System.out.println("char a");
				break;
		}
		
		switch(s){
			case 2 :
				System.out.println("short");
				break;
		}
		
		//1.7��ʼ֧��string
		switch(str){
			case "sss" :
				System.out.println("String");
				break;
		}
		
		//ע���break����Ȼ���������Ľ��
		byte aa = 3;

		switch(aa){
			case 1 : System.out.println(" A ");
			case 2 : System.out.println(" B ");
			case 3 : System.out.println(" C ");
			case 4 : System.out.println(" D "); 
			default : System.out.println(" default ");
		  }
		
		
		a:for(i=0;i<3;i++){
			   System.out.println("i="+i);
			   for(int j=0;j<3;j++){
			    System.out.println("j="+j);
			    if(j==2)
			     break a;
			   }
			  } 
	}
}
