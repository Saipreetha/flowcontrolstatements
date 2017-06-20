package lc1;

public class Activity1 {
	public static void main(String args[]){
		int a=10;
		int b=20;
		int c=30;
		a = a + b + c;  
		b = a - (b+c);
		c = a - (b+c);  	 
	    a = a - (b+c);
		System.out.println("num1="+a);
		System.out.println("num2="+b);
		System.out.println("num3="+c);
	}

}
