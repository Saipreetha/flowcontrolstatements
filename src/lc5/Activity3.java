package lc5;
import java.util.Scanner;
public class Activity3 {
	public static void main(String args[]){
		System.out.print("Enter 25 numbers ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[25];
		for(int i=0;i<25;i++){
			arr[i]=scan.nextInt();
		}
		scan.close();
		int big=arr[0];
		int start=0;
		int end=0;
		for(int i=0;i<25;i++){
                if(big<=arr[i]){
					big=arr[i];
					start=i;
				}
                if(start<=end){
                	end=i;
                }
			}
		System.out.println("maximum value");
		System.out.println(big);
		System.out.println("maximum value's position:");
		System.out.println(start);
		System.out.print(end);
	}
}
