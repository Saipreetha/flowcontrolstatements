package lc3;
import java.util.Scanner;
public class Activity2 {
	public static void main(String args[]){
		int num;
		int temp=0;
		System.out.print("Enter the number of elements in array");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=scan.nextInt();
		}
		scan.close();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
		for(int j=0;j<2;j++){
		System.out.println("Minimum "+(j+1)+":"+ arr[j]);	
	    }
	for(int j=arr.length-1;j>arr.length-3;j--){
		System.out.println("Maximum "+(arr.length-j)+":"+arr[j]);
	}

	}
}
