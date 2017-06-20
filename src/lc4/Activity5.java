package lc4;
import java.util.Scanner;
public class Activity5 {
	public static void main(String args[]){
		System.out.println("Enter two Strings");
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		scan.close();
		StringBuffer str3=new StringBuffer(str2);
		str3.reverse();
		System.out.println((str1+str3));
}
}
