package lc2;
import java.util.Scanner;
public class Activity1 {
	public static void main(String args[]){
		int num;
		int count=0;
		System.out.print("Enter the number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		while(num!=0){
			num=num/10;
			count++;
		} 
        scan.close();
		System.out.print(count+" Digits");
	}

}
