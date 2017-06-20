package lc5;
import java.util.Scanner;
public class Activity4 {
	public static void main(String args[]){
		System.out.print("Enter 15 numbers ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[15];
		for(int i=0;i<15;i++){
			arr[i]=scan.nextInt();
		}
		System.out.print("Enter the element to find:");
		int num=scan.nextInt();
		scan.close();
		for(int i=0;i<15;i++){
			if(num==arr[i]){
				System.out.println("the position of the number :"+i);
			}
		}
	}
}
