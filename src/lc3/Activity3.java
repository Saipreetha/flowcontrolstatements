package lc3;
import java.util.Scanner;
public class Activity3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int b=s.nextInt();
		int start=0,end=b-1;
		int temp=0;
		int[] arr=new int[b];
		System.out.print("Enter the number");
		for(int i=0;i<b;i++){
			arr[i]=s.nextInt();
		}
		s.close();
			while(arr[start]<arr[end]){
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				end--;
				start++;
			}
			System.out.print("Reverse order:");
			for(int i=0;i<b;i++){
				System.out.println(arr[i]);

            }
	}
}