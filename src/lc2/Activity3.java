package lc2;
import java.util.Scanner;
public class Activity3 {
	public static void main(String args[]){
		int num;
		int sum[]=new int[6];
      	System.out.print("Enter the number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		scan.close();
		for(int i=0;num>0;i++){
			sum[i]=num%2;
			num=num/2;
		}
		for(int j=sum.length-1;j>=0;j--){
			System.out.print(sum[j]);
		}
}
}
