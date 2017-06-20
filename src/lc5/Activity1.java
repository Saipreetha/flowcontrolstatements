package lc5;
import java.util.Scanner;
public class Activity1 {
	public static void main(String args[]){
		System.out.print("Enter ten numbers ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=scan.nextInt();
		}
		scan.close();
		int big[]=new int[10];
		big[0]=arr[0];
		for(int i=0;i<10;i++){
			for(int j=1;j<=i;j++){
		  if(big[i]<arr[j]){
				big[i]=arr[j];
			}
		}
		}
		System.out.print("Decending order:");
		for(int i=big.length-1;i>=0;i--){
			System.out.println(big[i]);
		}
	}

}
