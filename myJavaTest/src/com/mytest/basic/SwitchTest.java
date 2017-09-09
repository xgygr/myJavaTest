package com.mytest.basic;

/**
 * 
11、switch 是否能作用在byte 上，是否能作用在long 上，是否能作用在String上？ 
答：在Java 5以前，switch(expr)中，expr只能是byte、short、char、int。
从Java 5开始，Java中引入了枚举类型，expr也可以是enum类型，
从Java 7开始，expr还可以是字符串（String），但是长整型（long）在目前所有的版本中都是不可以的。
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
		
		//1.7开始支持string
		switch(str){
			case "sss" :
				System.out.println("String");
				break;
		}
		
		//注意加break，不然会出现下面的结果
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
