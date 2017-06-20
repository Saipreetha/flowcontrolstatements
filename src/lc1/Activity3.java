package lc1;
import java.util.Scanner;
public class Activity3 {
	public static void main(String args[]){
		int num[]=new int[5];
		int count=0;
		int count2=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++){
			num[i]=scan.nextInt();
			if(num[i]>=0){
				count++;
			}
			else{
				count2++;
			}
		}
			
		scan.close();
		System.out.println("the number of non-negative numbers in the list are:"+count);
		System.out.println("the number of negative numbers in the list are:"+count2);
	}

}
