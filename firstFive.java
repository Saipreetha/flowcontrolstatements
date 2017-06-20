package flowcontrolstatements;

public class firstFive {
	public static void main(String args[]){
		int num=1;
		int num2=1;
		int num3=1;
		System.out.println("Numbers divisible by 2");
		while(num<=5){
				System.out.println(num*2);
		        num++;
		}
		System.out.println("Numbers divisible by 3");
		while(num2<=5){
		        System.out.println(num2*3);
		        num2++;
		}
		System.out.println("Numbers divisible by 5");
		while(num3<=5){
		   System.out.println(num3*5);
		   num3++;
	    } 
}
}

