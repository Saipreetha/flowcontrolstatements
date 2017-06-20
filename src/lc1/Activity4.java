package lc1;
import java.util.Scanner;
public class Activity4 {
	public static void main(String args[]){
	int num;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number:");
    num = scan.nextInt();
    if(num==0){
    	System.out.print("Zero");
    }
    else if(num%2==0){
    	System.out.print("Even number");
	}
    
    else{
    	System.out.print("Odd Number");
    }
    scan.close();
}
}