package lc2;
import java.util.Scanner;
public class Activity4 {
	public static void main(String args[]){
		String num;
	    System.out.print("Enter the number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextLine();
		scan.close();
        System.out.println(Integer.parseInt(num,2));
	}
		
		
}

