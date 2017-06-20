package lc2;
import java.util.Scanner;
public class Activity2 {
	public static void main(String args[]){
		int num;
		int sum=0;
		int rem;
		System.out.print("Enter the number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		} 
        scan.close();
		System.out.print(sum);
	}

}
