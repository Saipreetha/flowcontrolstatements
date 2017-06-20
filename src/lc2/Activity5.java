package lc2;
import java.util.Scanner;
public class Activity5 {
	public static void main(String args[]){
		int num;
      	System.out.print("Enter the number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num;i++){
		   if(num%i==0){
			System.out.print("The smallest divisor of "+num+" is:"+i);
			break;
		   }
		}
	}

}
