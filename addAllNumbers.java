package flowcontrolstatements;
import java.util.Scanner;
public class addAllNumbers {
	public static void main(String args[]){
		int temp=0,sum=0;
		System.out.print("Enter the number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		for(int i=0;i<num;i+=0){
			temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.print(sum);
		
	}

}
