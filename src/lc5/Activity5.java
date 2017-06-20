package lc5;
import java.util.Scanner;
import java.util.Arrays;
public class Activity5 {
	public static void main(String args[]){
    System.out.print("Enter number of elements in array 1 & array 2 ");
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println("Enter number in array 1 & array 2 ");
	int arr1[]=new int[num1];
	int arr2[]=new int[num2];
	for(int i=0;i<num1;i++){
		arr1[i]=scan.nextInt();
	}
	for(int i=0;i<num2;i++){
		arr2[i]=scan.nextInt();
	}
	scan.close();
	int count=0;
	int[]arr3 = new int[arr1.length+arr2.length];
	for(int i=0;i<num1;i++){
		arr3[i]=arr1[i];
		count++;
	}
	for(int i=0;i<num2;i++){
		arr3[count++]=arr2[i];
	}
	Arrays.sort(arr3);
	System.out.println("the merged descending order array:");
	for(int i=arr3.length-1;i>0;i--){
		System.out.println(arr3[i]);
	}
	}
	}
