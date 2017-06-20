package flowcontrolstatements;
import java.util.Scanner;
public class primeNumber {
	public static void main(String args[]){
		int flag=0;
		System.out.print("Enter the number:");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		for(int num1=2;num1<=(num/2);num1+=2){
			if(num%num1==0){
				System.out.print("not a prime");
				flag=1;
				break;
			}
		}
			if(flag==0){
				System.out.print("prime number");
			}
		}
	}


