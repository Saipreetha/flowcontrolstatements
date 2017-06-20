package lc5;
import java.util.Scanner;
import java.util.Arrays;
public class Activity2 {
	public static void main(String args[]){
		System.out.print("Enter ten numbers ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=scan.nextInt();
		}
		scan.close();
	    Arrays.sort(arr);
		
		System.out.print("After deletion the numbers are ");
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]&&arr[i]!=arr[arr.length-1]){
				System.out.println(arr[i]);
						}
			}
		System.out.println(arr[arr.length-1]);
	}
	
}

